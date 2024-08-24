/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.JsonParseException;

public final class J
extends JsonParseException {
    private static final long b;
    public static final int[][] a;
    private static /* synthetic */ int field2;
    private static /* synthetic */ int field3;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public J(String string) {
        super(string);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public J(String string, Throwable throwable) {
        super(string, throwable);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public J(Throwable throwable) {
        super(throwable);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field2 = 0x2187 ^ 0xFFFFF8D5;
        field3 = 0xFFFFF9AA ^ 0xFFFFF8D5;
        a = new int[4][2];
        b = 1L;
    }
}

