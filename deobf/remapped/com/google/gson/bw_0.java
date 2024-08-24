/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.Gson;
import com.google.gson.T;
import com.google.gson.V;
import com.google.gson.bv_0;
import com.google.gson.cJ;

/*
 * Renamed from com.google.gson.bw
 */
class bw_0
implements V {
    final /* synthetic */ bv_0 a;
    public static final int[][] b;
    private static /* synthetic */ int field82;
    private static /* synthetic */ int field83;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    bw_0(bv_0 bv_02) {
        this.a = bv_02;
    }

    @Override
    public T a(Gson gson, cJ cJ2) {
        return cJ2.a() == Number.class ? this.a : null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field82 = 0x4730 ^ 0xFFFFA0F5;
        field83 = 0xFFFF8D70 ^ 0xFFFFA0F5;
        b = new int[4][4];
    }
}

