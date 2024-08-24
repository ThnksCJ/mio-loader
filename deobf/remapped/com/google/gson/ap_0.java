/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.aT;
import com.google.gson.ag_0;
import java.util.TreeSet;

/*
 * Renamed from com.google.gson.ap
 */
class ap_0
implements aT {
    final /* synthetic */ ag_0 a;
    public static final int[][] b;
    private static /* synthetic */ int field136;
    private static /* synthetic */ int field137;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    ap_0(ag_0 ag_02) {
        this.a = ag_02;
    }

    @Override
    public Object a() {
        return new TreeSet();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field136 = 0x1920 ^ 0xFFFF892D;
        field137 = 0xFFFFEA3F ^ 0xFFFF892D;
        b = new int[4][1];
    }
}

