/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package deobf.remapped.meteordevelopment.starscript.utils;

import deobf.remapped.meteordevelopment.starscript.compiler.Expr;

public class Error {
    public final int line;
    public final int character;
    public final char ch;
    public final String message;
    public Expr expr;

    public Error(int line, int character, char ch, String message, Expr expr) {
        this.line = line;
        this.character = character;
        this.ch = ch;
        this.message = message;
        this.expr = expr;
    }

    public String toString() {
        return String.format("[line %d, character %d] at '%s': %s", this.line, this.character, Character.valueOf(this.ch), this.message);
    }
}

