/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.aT;
import com.google.gson.ag_0;
import java.util.ArrayDeque;

/*
 * Renamed from com.google.gson.as
 */
class as_0
implements aT {
    final /* synthetic */ ag_0 a;
    public static final int[][] b;
    private static /* synthetic */ int field146;
    private static /* synthetic */ int field147;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    as_0(ag_0 ag_02) {
        this.a = ag_02;
    }

    @Override
    public Object a() {
        return new ArrayDeque();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field146 = 0x4EF0 ^ 0xFFFF9060;
        field147 = 0xFFFFFCEC ^ 0xFFFF9060;
        b = new int[1][3];
    }
}

