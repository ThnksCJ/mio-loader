/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

public class eq
extends RuntimeException {
    private static final long a;
    public static final int[][] b;
    private static /* synthetic */ int field16;
    private static /* synthetic */ int field17;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public eq(String string) {
        super(string);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public eq(String string, Throwable throwable) {
        super(string, throwable);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public eq(Throwable throwable) {
        super(throwable.getMessage(), throwable);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field16 = 0x6FEF ^ 0xFFFFCBEA;
        field17 = 0xFFFF91B4 ^ 0xFFFFCBEA;
        b = new int[3][3];
        a = 0L;
    }
}

