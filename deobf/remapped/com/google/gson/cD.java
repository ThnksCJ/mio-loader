/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.Gson;
import com.google.gson.T;
import com.google.gson.V;
import com.google.gson.cC;
import com.google.gson.cJ;
import java.sql.Time;

class cD
implements V {
    public static final int[][] a;
    private static /* synthetic */ int field92;
    private static /* synthetic */ int field93;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    cD() {
    }

    @Override
    public T a(Gson gson, cJ cJ2) {
        return cJ2.a() == Time.class ? new cC(null) : null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field92 = 0x3A58 ^ 0xFFFFDB34;
        field93 = 0xFFFFC293 ^ 0xFFFFDB34;
        a = new int[4][4];
    }
}

