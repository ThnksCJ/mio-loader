/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.Gson;
import com.google.gson.T;
import com.google.gson.V;
import com.google.gson.bi_0;
import com.google.gson.cJ;
import java.util.Date;

/*
 * Renamed from com.google.gson.bj
 */
class bj_0
implements V {
    public static final int[][] a;
    private static /* synthetic */ int field110;
    private static /* synthetic */ int field111;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    bj_0() {
    }

    @Override
    public T a(Gson gson, cJ cJ2) {
        return cJ2.a() == Date.class ? new bi_0() : null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field110 = 0x3BEC ^ 0xFFFFC422;
        field111 = 0xFFFFBB8D ^ 0xFFFFC422;
        a = new int[1][3];
    }
}

