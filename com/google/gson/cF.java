/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.Gson;
import com.google.gson.T;
import com.google.gson.V;
import com.google.gson.cE;
import com.google.gson.cJ;
import java.sql.Timestamp;
import java.util.Date;

class cF
implements V {
    public static final int[][] a;
    private static /* synthetic */ int field88;
    private static /* synthetic */ int field89;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    cF() {
    }

    @Override
    public T a(Gson gson, cJ cJ2) {
        if (cJ2.a() == Timestamp.class) {
            T t = gson.a(Date.class);
            return new cE(t, null);
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field88 = 0x4AAE ^ 0xFFFFD125;
        field89 = 0xFFFFE8C9 ^ 0xFFFFD125;
        a = new int[3][4];
    }
}

