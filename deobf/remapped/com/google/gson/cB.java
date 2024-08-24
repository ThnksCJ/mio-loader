/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.Gson;
import com.google.gson.T;
import com.google.gson.V;
import com.google.gson.cA;
import com.google.gson.cJ;
import java.sql.Date;

class cB
implements V {
    public static final int[][] a;
    private static /* synthetic */ int field86;
    private static /* synthetic */ int field87;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    cB() {
    }

    @Override
    public T a(Gson gson, cJ cJ2) {
        return cJ2.a() == Date.class ? new cA(null) : null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field86 = 0x23A9 ^ 0xFFFF9E98;
        field87 = 0xFFFF96F9 ^ 0xFFFF9E98;
        a = new int[2][3];
    }
}

