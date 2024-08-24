/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.aT;
import com.google.gson.ag_0;
import com.google.gson.u_0;
import java.lang.reflect.Type;

/*
 * Renamed from com.google.gson.ah
 */
class ah_0
implements aT {
    final /* synthetic */ u_0 a;
    final /* synthetic */ Type b;
    final /* synthetic */ ag_0 c;
    public static final int[][] d;
    private static /* synthetic */ int field154;
    private static /* synthetic */ int field155;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    ah_0(ag_0 ag_02, u_0 u_02, Type type) {
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
        field154 = 0x3BF3 ^ 0xFFFFC4E6;
        field155 = 0xFFFFFF2F ^ 0xFFFFC4E6;
        d = new int[2][3];
    }
}

