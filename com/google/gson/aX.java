/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.aY;
import java.io.Writer;

final class aX
extends Writer {
    private final Appendable a;
    private final aY b = new aY();
    public static final int[][] c;
    private static /* synthetic */ int field170;
    private static /* synthetic */ int field171;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    aX(Appendable appendable) {
        this.a = appendable;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void write(char[] cArray, int n, int n2) {
        this.b.a = cArray;
        this.a.append(this.b, n, n + n2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void write(int n) {
        this.a.append((char)n);
    }

    @Override
    public void flush() {
    }

    @Override
    public void close() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field170 = 0x4286 ^ 0xFFFFF3F4;
        field171 = 0xFFFFE343 ^ 0xFFFFF3F4;
        c = new int[2][4];
    }
}

