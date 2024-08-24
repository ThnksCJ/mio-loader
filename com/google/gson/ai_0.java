/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.aT;
import com.google.gson.ag_0;
import java.util.concurrent.ConcurrentHashMap;

/*
 * Renamed from com.google.gson.ai
 */
class ai_0
implements aT {
    final /* synthetic */ ag_0 a;
    public static final int[][] b;
    private static /* synthetic */ int field162;
    private static /* synthetic */ int field163;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    ai_0(ag_0 ag_02) {
        this.a = ag_02;
    }

    @Override
    public Object a() {
        return new ConcurrentHashMap();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field162 = 0x25B4 ^ 0xFFFF9708;
        field163 = 0xFFFFDA19 ^ 0xFFFF9708;
        b = new int[1][2];
    }
}

