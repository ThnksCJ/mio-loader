/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.JsonReader;
import com.google.gson.cO;

abstract class bE {
    final String h;
    final boolean i;
    final boolean j;
    public static final int[][] a;
    private static /* synthetic */ int field200;
    private static /* synthetic */ int field201;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected bE(String string, boolean bl, boolean bl2) {
        this.h = string;
        this.i = bl;
        this.j = bl2;
    }

    abstract boolean a(Object var1);

    abstract void a(cO var1, Object var2);

    abstract void a(JsonReader var1, Object var2);

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field200 = 0x42DC ^ 0xFFFF8FA4;
        field201 = 0xFFFFF053 ^ 0xFFFF8FA4;
        a = new int[2][2];
    }
}

