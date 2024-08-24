/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.Gson;
import com.google.gson.S;
import com.google.gson.T;
import com.google.gson.V;
import com.google.gson.by_0;
import com.google.gson.cJ;

/*
 * Renamed from com.google.gson.bz
 */
class bz_0
implements V {
    final /* synthetic */ S a;
    public static final int[][] b;
    private static /* synthetic */ int field84;
    private static /* synthetic */ int field85;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    bz_0(S s) {
        this.a = s;
    }

    @Override
    public T a(Gson gson, cJ cJ2) {
        if (cJ2.a() == Object.class) {
            return new by_0(gson, this.a, null);
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field84 = 0x56A ^ 0xFFFF8E59;
        field85 = 0xFFFF81F6 ^ 0xFFFF8E59;
        b = new int[2][2];
    }
}

