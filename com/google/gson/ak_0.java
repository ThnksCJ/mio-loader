/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.aT;
import com.google.gson.ag_0;
import java.util.LinkedHashMap;

/*
 * Renamed from com.google.gson.ak
 */
class ak_0
implements aT {
    final /* synthetic */ ag_0 a;
    public static final int[][] b;
    private static /* synthetic */ int field158;
    private static /* synthetic */ int field159;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    ak_0(ag_0 ag_02) {
        this.a = ag_02;
    }

    @Override
    public Object a() {
        return new LinkedHashMap();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field158 = 0x264A ^ 0xFFFFA123;
        field159 = 0xFFFF949A ^ 0xFFFFA123;
        b = new int[3][3];
    }
}

