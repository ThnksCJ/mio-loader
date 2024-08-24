/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.bm_0;
import java.util.Date;

class cH
extends bm_0 {
    public static final int[][] a;
    private static /* synthetic */ int field208;
    private static /* synthetic */ int field209;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    cH(Class clazz) {
        super(clazz);
    }

    protected java.sql.Date b(Date date) {
        return new java.sql.Date(date.getTime());
    }

    @Override
    protected /* synthetic */ Date a(Date date) {
        return this.b(date);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field208 = 0x2974 ^ 0xFFFFCBDD;
        field209 = 0xFFFFE2E5 ^ 0xFFFFCBDD;
        a = new int[4][2];
    }
}

