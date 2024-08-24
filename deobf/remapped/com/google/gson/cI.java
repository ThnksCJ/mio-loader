/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.bm_0;
import java.sql.Timestamp;
import java.util.Date;

class cI
extends bm_0 {
    public static final int[][] a;
    private static /* synthetic */ int field208;
    private static /* synthetic */ int field209;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    cI(Class clazz) {
        super(clazz);
    }

    protected Timestamp b(Date date) {
        return new Timestamp(date.getTime());
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
        field208 = 0x7402 ^ 0xFFFFC526;
        field209 = 0xFFFFDBE4 ^ 0xFFFFC526;
        a = new int[4][1];
    }
}

