/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package meteordevelopment.starscript;

import java.util.function.Supplier;
import meteordevelopment.starscript.Instruction;
import meteordevelopment.starscript.Script;
import meteordevelopment.starscript.Section;
import meteordevelopment.starscript.compiler.Expr;
import meteordevelopment.starscript.compiler.Parser;
import meteordevelopment.starscript.utils.CompletionCallback;
import meteordevelopment.starscript.utils.Error;
import meteordevelopment.starscript.utils.SFunction;
import meteordevelopment.starscript.utils.Stack;
import meteordevelopment.starscript.utils.StarscriptError;
import meteordevelopment.starscript.value.Value;
import meteordevelopment.starscript.value.ValueMap;

public class Starscript {
    private final ValueMap globals = new ValueMap();
    private final Stack<Value> stack = new Stack();

    public Section run(Script script, StringBuilder sb) {
        this.stack.clear();
        sb.setLength(0);
        int ip = 0;
        Section firstSection = null;
        Section section = null;
        int index = 0;
        block37: while (true) {
            switch (Instruction.valueOf(script.code[ip++])) {
                case Constant: {
                    this.push(script.constants.get(script.code[ip++]));
                    continue block37;
                }
                case Null: {
                    this.push(Value.null_());
                    continue block37;
                }
                case True: {
                    this.push(Value.bool(true));
                    continue block37;
                }
                case False: {
                    this.push(Value.bool(false));
                    continue block37;
                }
                case Add: {
                    Value b = this.pop();
                    Value a2 = this.pop();
                    if (a2.isNumber() && b.isNumber()) {
                        this.push(Value.number(a2.getNumber() + b.getNumber()));
                        continue block37;
                    }
                    if (a2.isString()) {
                        this.push(Value.string(a2.getString() + b.toString()));
                        continue block37;
                    }
                    this.error("Can only add 2 numbers or 1 string and other value.", new Object[0]);
                    continue block37;
                }
                case Subtract: {
                    Value b = this.pop();
                    Value a2 = this.pop();
                    if (a2.isNumber() && b.isNumber()) {
                        this.push(Value.number(a2.getNumber() - b.getNumber()));
                        continue block37;
                    }
                    this.error("Can only subtract 2 numbers.", new Object[0]);
                    continue block37;
                }
                case Multiply: {
                    Value b = this.pop();
                    Value a2 = this.pop();
                    if (a2.isNumber() && b.isNumber()) {
                        this.push(Value.number(a2.getNumber() * b.getNumber()));
                        continue block37;
                    }
                    this.error("Can only multiply 2 numbers.", new Object[0]);
                    continue block37;
                }
                case Divide: {
                    Value b = this.pop();
                    Value a2 = this.pop();
                    if (a2.isNumber() && b.isNumber()) {
                        this.push(Value.number(a2.getNumber() / b.getNumber()));
                        continue block37;
                    }
                    this.error("Can only divide 2 numbers.", new Object[0]);
                    continue block37;
                }
                case Modulo: {
                    Value b = this.pop();
                    Value a2 = this.pop();
                    if (a2.isNumber() && b.isNumber()) {
                        this.push(Value.number(a2.getNumber() % b.getNumber()));
                        continue block37;
                    }
                    this.error("Can only modulo 2 numbers.", new Object[0]);
                    continue block37;
                }
                case Power: {
                    Value b = this.pop();
                    Value a2 = this.pop();
                    if (a2.isNumber() && b.isNumber()) {
                        this.push(Value.number(Math.pow(a2.getNumber(), b.getNumber())));
                        continue block37;
                    }
                    this.error("Can only power 2 numbers.", new Object[0]);
                    continue block37;
                }
                case AddConstant: {
                    Value b = script.constants.get(script.code[ip++]);
                    Value a2 = this.pop();
                    if (a2.isNumber() && b.isNumber()) {
                        this.push(Value.number(a2.getNumber() + b.getNumber()));
                        continue block37;
                    }
                    if (a2.isString()) {
                        this.push(Value.string(a2.getString() + b.toString()));
                        continue block37;
                    }
                    this.error("Can only add 2 numbers or 1 string and other value.", new Object[0]);
                    continue block37;
                }
                case Pop: {
                    this.pop();
                    continue block37;
                }
                case Not: {
                    this.push(Value.bool(!this.pop().isTruthy()));
                    continue block37;
                }
                case Negate: {
                    Value a3 = this.pop();
                    if (a3.isNumber()) {
                        this.push(Value.number(-a3.getNumber()));
                        continue block37;
                    }
                    this.error("This operation requires a number.", new Object[0]);
                    continue block37;
                }
                case Equals: {
                    this.push(Value.bool(this.pop().equals(this.pop())));
                    continue block37;
                }
                case NotEquals: {
                    this.push(Value.bool(!this.pop().equals(this.pop())));
                    continue block37;
                }
                case Greater: {
                    Value b = this.pop();
                    Value a2 = this.pop();
                    if (a2.isNumber() && b.isNumber()) {
                        this.push(Value.bool(a2.getNumber() > b.getNumber()));
                        continue block37;
                    }
                    this.error("This operation requires 2 number.", new Object[0]);
                    continue block37;
                }
                case GreaterEqual: {
                    Value b = this.pop();
                    Value a2 = this.pop();
                    if (a2.isNumber() && b.isNumber()) {
                        this.push(Value.bool(a2.getNumber() >= b.getNumber()));
                        continue block37;
                    }
                    this.error("This operation requires 2 number.", new Object[0]);
                    continue block37;
                }
                case Less: {
                    Value b = this.pop();
                    Value a2 = this.pop();
                    if (a2.isNumber() && b.isNumber()) {
                        this.push(Value.bool(a2.getNumber() < b.getNumber()));
                        continue block37;
                    }
                    this.error("This operation requires 2 number.", new Object[0]);
                    continue block37;
                }
                case LessEqual: {
                    Value b = this.pop();
                    Value a2 = this.pop();
                    if (a2.isNumber() && b.isNumber()) {
                        this.push(Value.bool(a2.getNumber() <= b.getNumber()));
                        continue block37;
                    }
                    this.error("This operation requires 2 number.", new Object[0]);
                    continue block37;
                }
                case Variable: {
                    String name = script.constants.get(script.code[ip++]).getString();
                    Supplier<Value> s = this.globals.get(name);
                    this.push(s != null ? s.get() : Value.null_());
                    continue block37;
                }
                case Get: {
                    String name = script.constants.get(script.code[ip++]).getString();
                    Value v = this.pop();
                    if (!v.isMap()) {
                        this.push(Value.null_());
                        continue block37;
                    }
                    Supplier<Value> s = v.getMap().get(name);
                    this.push(s != null ? s.get() : Value.null_());
                    continue block37;
                }
                case Call: {
                    Value r;
                    byte argCount = script.code[ip++];
                    Value a2 = this.peek(argCount);
                    if (a2.isFunction()) {
                        r = a2.getFunction().run(this, argCount);
                        this.pop();
                        this.push(r);
                        continue block37;
                    }
                    this.error("Tried to call a %s, can only call functions.", new Object[]{a2.type});
                    continue block37;
                }
                case Jump: {
                    int jump = script.code[ip++] << 8 & 0xFF | script.code[ip++] & 0xFF;
                    ip += jump;
                    continue block37;
                }
                case JumpIfTrue: {
                    int jump = script.code[ip++] << 8 & 0xFF | script.code[ip++] & 0xFF;
                    if (!this.peek().isTruthy()) continue block37;
                    ip += jump;
                    continue block37;
                }
                case JumpIfFalse: {
                    int jump = script.code[ip++] << 8 & 0xFF | script.code[ip++] & 0xFF;
                    if (this.peek().isTruthy()) continue block37;
                    ip += jump;
                    continue block37;
                }
                case Section: {
                    section = firstSection == null ? (firstSection = new Section(index, sb.toString())) : (section.next = new Section(index, sb.toString()));
                    sb.setLength(0);
                    index = script.code[ip++];
                    continue block37;
                }
                case Append: {
                    sb.append(this.pop().toString());
                    continue block37;
                }
                case ConstantAppend: {
                    sb.append(script.constants.get(script.code[ip++]).toString());
                    continue block37;
                }
                case VariableAppend: {
                    Supplier<Value> s = this.globals.get(script.constants.get(script.code[ip++]).getString());
                    sb.append((s == null ? Value.null_() : s.get()).toString());
                    continue block37;
                }
                case GetAppend: {
                    String name = script.constants.get(script.code[ip++]).getString();
                    Value v = this.pop();
                    if (!v.isMap()) {
                        sb.append(Value.null_());
                        continue block37;
                    }
                    Supplier<Value> s = v.getMap().get(name);
                    sb.append((s != null ? s.get() : Value.null_()).toString());
                    continue block37;
                }
                case CallAppend: {
                    Value r;
                    byte argCount = script.code[ip++];
                    Value a2 = this.peek(argCount);
                    if (a2.isFunction()) {
                        r = a2.getFunction().run(this, argCount);
                        this.pop();
                        sb.append(r.toString());
                        continue block37;
                    }
                    this.error("Tried to call a %s, can only call functions.", new Object[]{a2.type});
                    continue block37;
                }
                case VariableGet: {
                    String name = script.constants.get(script.code[ip++]).getString();
                    Supplier<Value> s = this.globals.get(name);
                    Value v = s != null ? s.get() : Value.null_();
                    name = script.constants.get(script.code[ip++]).getString();
                    if (!v.isMap()) {
                        this.push(Value.null_());
                        continue block37;
                    }
                    s = v.getMap().get(name);
                    this.push(s != null ? s.get() : Value.null_());
                    continue block37;
                }
                case VariableGetAppend: {
                    String name = script.constants.get(script.code[ip++]).getString();
                    Supplier<Value> s = this.globals.get(name);
                    Value v = s != null ? s.get() : Value.null_();
                    name = script.constants.get(script.code[ip++]).getString();
                    if (!v.isMap()) {
                        this.push(Value.null_());
                        continue block37;
                    }
                    s = v.getMap().get(name);
                    v = s != null ? s.get() : Value.null_();
                    sb.append(v.toString());
                    continue block37;
                }
                case End: {
                    break block37;
                }
                default: {
                    throw new UnsupportedOperationException("Unknown instruction '" + (Object)((Object)Instruction.valueOf(script.code[ip])) + "'");
                }
            }
            break;
        }
        if (firstSection != null) {
            section.next = new Section(index, sb.toString());
            return firstSection;
        }
        return new Section(index, sb.toString());
    }

    public Section run(Script script) {
        return this.run(script, new StringBuilder());
    }

    public void push(Value value) {
        this.stack.push(value);
    }

    public Value pop() {
        return this.stack.pop();
    }

    public Value peek() {
        return this.stack.peek();
    }

    public Value peek(int offset) {
        return this.stack.peek(offset);
    }

    public boolean popBool(String errorMsg) {
        Value a2 = this.pop();
        if (!a2.isBool()) {
            this.error(errorMsg, new Object[0]);
        }
        return a2.getBool();
    }

    public double popNumber(String errorMsg) {
        Value a2 = this.pop();
        if (!a2.isNumber()) {
            this.error(errorMsg, new Object[0]);
        }
        return a2.getNumber();
    }

    public String popString(String errorMsg) {
        Value a2 = this.pop();
        if (!a2.isString()) {
            this.error(errorMsg, new Object[0]);
        }
        return a2.getString();
    }

    public void error(String format, Object ... args) {
        throw new StarscriptError(String.format(format, args));
    }

    public ValueMap set(String name, Supplier<Value> supplier) {
        return this.globals.set(name, supplier);
    }

    public ValueMap set(String name, Value value) {
        return this.globals.set(name, value);
    }

    public ValueMap set(String name, boolean bool) {
        return this.globals.set(name, bool);
    }

    public ValueMap set(String name, double number) {
        return this.globals.set(name, number);
    }

    public ValueMap set(String name, String string) {
        return this.globals.set(name, string);
    }

    public ValueMap set(String name, SFunction function) {
        return this.globals.set(name, function);
    }

    public ValueMap set(String name, ValueMap map) {
        return this.globals.set(name, map);
    }

    public ValueMap getGlobals() {
        return this.globals;
    }

    public void getCompletions(String source, int position, CompletionCallback callback) {
        Parser.Result result = Parser.parse(source);
        for (Expr expr : result.exprs) {
            this.completionsExpr(source, position, expr, callback);
        }
        for (Error error : result.errors) {
            if (error.expr == null) continue;
            this.completionsExpr(source, position, error.expr, callback);
        }
    }

    private void completionsExpr(String source, int position, Expr expr, CompletionCallback callback) {
        if (position < expr.start || position > expr.end && position != source.length()) {
            return;
        }
        if (expr instanceof Expr.Variable) {
            Expr.Variable var = (Expr.Variable)expr;
            String start = source.substring(var.start, position);
            for (String key : this.globals.keys()) {
                if (key.startsWith("_") || !key.startsWith(start)) continue;
                callback.onCompletion(key, this.globals.get(key).get().isFunction());
            }
        } else if (expr instanceof Expr.Get) {
            Expr.Get get = (Expr.Get)expr;
            if (position >= get.end - get.name.length()) {
                Value value = this.resolveExpr(get.object);
                if (value != null && value.isMap()) {
                    String start = source.substring(get.object.end + 1, position);
                    for (String key : value.getMap().keys()) {
                        if (key.startsWith("_") || !key.startsWith(start)) continue;
                        callback.onCompletion(key, value.getMap().get(key).get().isFunction());
                    }
                }
            } else {
                expr.forEach(child -> this.completionsExpr(source, position, (Expr)child, callback));
            }
        } else if (expr instanceof Expr.Block) {
            if (((Expr.Block)expr).expr == null) {
                for (String key : this.globals.keys()) {
                    if (key.startsWith("_")) continue;
                    callback.onCompletion(key, this.globals.get(key).get().isFunction());
                }
            } else {
                expr.forEach(child -> this.completionsExpr(source, position, (Expr)child, callback));
            }
        } else {
            expr.forEach(child -> this.completionsExpr(source, position, (Expr)child, callback));
        }
    }

    private Value resolveExpr(Expr expr) {
        if (expr instanceof Expr.Variable) {
            Supplier<Value> supplier = this.globals.get(((Expr.Variable)expr).name);
            return supplier != null ? supplier.get() : null;
        }
        if (expr instanceof Expr.Get) {
            Value value = this.resolveExpr(((Expr.Get)expr).object);
            if (value == null || !value.isMap()) {
                return null;
            }
            Supplier<Value> supplier = value.getMap().get(((Expr.Get)expr).name);
            return supplier != null ? supplier.get() : null;
        }
        return null;
    }
}

