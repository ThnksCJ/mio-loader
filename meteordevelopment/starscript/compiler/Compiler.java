/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package meteordevelopment.starscript.compiler;

import meteordevelopment.starscript.Instruction;
import meteordevelopment.starscript.Script;
import meteordevelopment.starscript.compiler.Expr;
import meteordevelopment.starscript.compiler.Parser;
import meteordevelopment.starscript.compiler.Token;
import meteordevelopment.starscript.value.Value;

public class Compiler
implements Expr.Visitor {
    private final Script script = new Script();
    private int blockDepth;
    private boolean constantAppend;
    private boolean variableAppend;
    private boolean getAppend;
    private boolean callAppend;

    private Compiler() {
    }

    public static Script compile(Parser.Result result) {
        Compiler compiler = new Compiler();
        for (Expr expr : result.exprs) {
            compiler.compile(expr);
        }
        compiler.script.write(Instruction.End);
        return compiler.script;
    }

    @Override
    public void visitNull(Expr.Null expr) {
        this.script.write(Instruction.Null);
    }

    @Override
    public void visitString(Expr.String expr) {
        this.script.write(this.blockDepth == 0 || this.constantAppend ? Instruction.ConstantAppend : Instruction.Constant, Value.string(expr.string));
    }

    @Override
    public void visitNumber(Expr.Number expr) {
        this.script.write(Instruction.Constant, Value.number(expr.number));
    }

    @Override
    public void visitBool(Expr.Bool expr) {
        this.script.write(expr.bool ? Instruction.True : Instruction.False);
    }

    @Override
    public void visitBlock(Expr.Block expr) {
        ++this.blockDepth;
        if (expr.expr instanceof Expr.String) {
            this.constantAppend = true;
        } else if (expr.expr instanceof Expr.Variable) {
            this.variableAppend = true;
        } else if (expr.expr instanceof Expr.Get) {
            this.getAppend = true;
        } else if (expr.expr instanceof Expr.Call) {
            this.callAppend = true;
        }
        this.compile(expr.expr);
        if (!(this.constantAppend || this.variableAppend || this.getAppend || this.callAppend)) {
            this.script.write(Instruction.Append);
        } else {
            this.constantAppend = false;
            this.variableAppend = false;
            this.getAppend = false;
            this.callAppend = false;
        }
        --this.blockDepth;
    }

    @Override
    public void visitGroup(Expr.Group expr) {
        this.compile(expr.expr);
    }

    @Override
    public void visitBinary(Expr.Binary expr) {
        this.compile(expr.left);
        if (expr.op == Token.Plus && (expr.right instanceof Expr.String || expr.right instanceof Expr.Number)) {
            this.script.write(Instruction.AddConstant, expr.right instanceof Expr.String ? Value.string(((Expr.String)expr.right).string) : Value.number(((Expr.Number)expr.right).number));
            return;
        }
        this.compile(expr.right);
        switch (expr.op) {
            case Plus: {
                this.script.write(Instruction.Add);
                break;
            }
            case Minus: {
                this.script.write(Instruction.Subtract);
                break;
            }
            case Star: {
                this.script.write(Instruction.Multiply);
                break;
            }
            case Slash: {
                this.script.write(Instruction.Divide);
                break;
            }
            case Percentage: {
                this.script.write(Instruction.Modulo);
                break;
            }
            case UpArrow: {
                this.script.write(Instruction.Power);
                break;
            }
            case EqualEqual: {
                this.script.write(Instruction.Equals);
                break;
            }
            case BangEqual: {
                this.script.write(Instruction.NotEquals);
                break;
            }
            case Greater: {
                this.script.write(Instruction.Greater);
                break;
            }
            case GreaterEqual: {
                this.script.write(Instruction.GreaterEqual);
                break;
            }
            case Less: {
                this.script.write(Instruction.Less);
                break;
            }
            case LessEqual: {
                this.script.write(Instruction.LessEqual);
            }
        }
    }

    @Override
    public void visitUnary(Expr.Unary expr) {
        this.compile(expr.right);
        if (expr.op == Token.Bang) {
            this.script.write(Instruction.Not);
        } else if (expr.op == Token.Minus) {
            this.script.write(Instruction.Negate);
        }
    }

    @Override
    public void visitVariable(Expr.Variable expr) {
        this.script.write(this.variableAppend ? Instruction.VariableAppend : Instruction.Variable, Value.string(expr.name));
    }

    @Override
    public void visitGet(Expr.Get expr) {
        boolean prevGetAppend = this.getAppend;
        this.getAppend = false;
        boolean variableGet = expr.object instanceof Expr.Variable;
        if (!variableGet) {
            this.compile(expr.object);
        }
        this.getAppend = prevGetAppend;
        if (variableGet) {
            this.script.write(this.getAppend ? Instruction.VariableGetAppend : Instruction.VariableGet, Value.string(((Expr.Variable)expr.object).name));
            this.script.writeConstant(Value.string(expr.name));
        } else {
            this.script.write(this.getAppend ? Instruction.GetAppend : Instruction.Get, Value.string(expr.name));
        }
    }

    @Override
    public void visitCall(Expr.Call expr) {
        boolean prevCallAppend = this.callAppend;
        this.compile(expr.callee);
        this.callAppend = false;
        for (Expr e2 : expr.args) {
            this.compile(e2);
        }
        this.callAppend = prevCallAppend;
        this.script.write(this.callAppend ? Instruction.CallAppend : Instruction.Call, expr.args.size());
    }

    @Override
    public void visitLogical(Expr.Logical expr) {
        this.compile(expr.left);
        int endJump = this.script.writeJump(expr.op == Token.And ? Instruction.JumpIfFalse : Instruction.JumpIfTrue);
        this.script.write(Instruction.Pop);
        this.compile(expr.right);
        this.script.patchJump(endJump);
    }

    @Override
    public void visitConditional(Expr.Conditional expr) {
        this.compile(expr.condition);
        int falseJump = this.script.writeJump(Instruction.JumpIfFalse);
        this.script.write(Instruction.Pop);
        this.compile(expr.trueExpr);
        int endJump = this.script.writeJump(Instruction.Jump);
        this.script.patchJump(falseJump);
        this.script.write(Instruction.Pop);
        this.compile(expr.falseExpr);
        this.script.patchJump(endJump);
    }

    @Override
    public void visitSection(Expr.Section expr) {
        this.script.write(Instruction.Section, expr.index);
        this.compile(expr.expr);
    }

    private void compile(Expr expr) {
        if (expr != null) {
            expr.accept(this);
        }
    }
}

