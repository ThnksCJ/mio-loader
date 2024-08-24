/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

class aY
implements CharSequence {
    char[] a;
    public static final int[][] b;
    private static /* synthetic */ int field178;
    private static /* synthetic */ int field179;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    aY() {
    }

    @Override
    public int length() {
        return this.a.length;
    }

    @Override
    public char charAt(int n) {
        return this.a[n];
    }

    @Override
    public CharSequence subSequence(int n, int n2) {
        return new String(this.a, n, n2 - n);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field178 = 0x2CF0 ^ 0xFFFF8504;
        field179 = 0xFFFFE40B ^ 0xFFFF8504;
        b = new int[1][1];
    }
}

