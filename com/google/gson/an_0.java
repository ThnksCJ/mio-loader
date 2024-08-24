/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.aT;
import com.google.gson.ag_0;
import com.google.gson.u_0;
import java.lang.reflect.Type;

/*
 * Renamed from com.google.gson.an
 */
class an_0
implements aT {
    final /* synthetic */ u_0 a;
    final /* synthetic */ Type b;
    final /* synthetic */ ag_0 c;
    public static final int[][] d;
    private static /* synthetic */ int field140;
    private static /* synthetic */ int field141;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    an_0(ag_0 ag_02, u_0 u_02, Type type) {
        this.c = ag_02;
        this.a = u_02;
        this.b = type;
    }

    @Override
    public Object a() {
        return this.a.a(this.b);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field140 = 0x6A6B ^ 0xFFFF9420;
        field141 = 0xFFFFBD80 ^ 0xFFFF9420;
        d = new int[1][4];
    }
}

