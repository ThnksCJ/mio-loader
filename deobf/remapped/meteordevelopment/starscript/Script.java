/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package deobf.remapped.meteordevelopment.starscript;

import java.util.ArrayList;
import java.util.List;
import deobf.remapped.meteordevelopment.starscript.Instruction;
import deobf.remapped.meteordevelopment.starscript.value.Value;

public class Script {
    public byte[] code = new byte[8];
    private int size;
    public final List<Value> constants = new ArrayList<Value>();

    private void write(int b) {
        if (this.size >= this.code.length) {
            byte[] newCode = new byte[this.code.length * 2];
            System.arraycopy(this.code, 0, newCode, 0, this.code.length);
            this.code = newCode;
        }
        this.code[this.size++] = (byte)b;
    }

    public void write(Instruction insn) {
        this.write(insn.ordinal());
    }

    public void write(Instruction insn, int b) {
        this.write(insn.ordinal());
        this.write(b);
    }

    public void write(Instruction insn, Value constant) {
        this.write(insn.ordinal());
        this.writeConstant(constant);
    }

    public void writeConstant(Value constant) {
        int constantI = -1;
        for (int i = 0; i < this.constants.size(); ++i) {
            if (!this.constants.get(i).equals(constant)) continue;
            constantI = i;
            break;
        }
        if (constantI == -1) {
            constantI = this.constants.size();
            this.constants.add(constant);
        }
        this.write(constantI);
    }

    public int writeJump(Instruction insn) {
        this.write(insn);
        this.write(0);
        this.write(0);
        return this.size - 2;
    }

    public void patchJump(int offset) {
        int jump = this.size - offset - 2;
        this.code[offset] = (byte)(jump >> 8 & 0xFF);
        this.code[offset + 1] = (byte)(jump & 0xFF);
    }

    public void decompile() {
        for (int i = 0; i < this.size; ++i) {
            Instruction insn = Instruction.valueOf(this.code[i]);
            System.out.format("%3d %-18s", new Object[]{i, insn});
            switch (insn) {
                case AddConstant: 
                case Variable: 
                case VariableAppend: 
                case Get: 
                case GetAppend: 
                case Constant: 
                case ConstantAppend: {
                    System.out.format("%3d '%s'", this.code[++i], this.constants.get(this.code[i]));
                    break;
                }
                case Call: 
                case CallAppend: {
                    System.out.format("%3d %s", this.code[++i], this.code[i] == 1 ? "argument" : "arguments");
                    break;
                }
                case Jump: 
                case JumpIfTrue: 
                case JumpIfFalse: {
                    System.out.format("%3d -> %d", (i += 2) - 2, i + 1 + (this.code[i - 1] << 8 & 0xFF | this.code[i] & 0xFF));
                    break;
                }
                case Section: {
                    System.out.format("%3d", this.code[++i]);
                    break;
                }
                case VariableGet: 
                case VariableGetAppend: {
                    System.out.format("%3d.%-3d '%s.%s'", this.code[(i += 2) - 1], this.code[i], this.constants.get(this.code[i - 1]), this.constants.get(this.code[i]));
                }
            }
            System.out.println();
        }
    }
}

