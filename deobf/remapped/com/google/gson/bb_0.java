/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.UnsafeAllocator;
import java.lang.reflect.Method;

/*
 * Renamed from com.google.gson.bb
 */
class bb_0
extends UnsafeAllocator {
    final /* synthetic */ Method a;
    final /* synthetic */ int b;
    public static final int[][] c;
    private static /* synthetic */ int field180;
    private static /* synthetic */ int field181;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    bb_0(Method method, int n) {
        this.a = method;
        this.b = n;
    }

    @Override
    public Object a(Class clazz) {
        bb_0.b(clazz);
        return this.a.invoke(null, clazz, this.b);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field180 = 0x71FB ^ 0xFFFFBC06;
        field181 = 0xFFFF92C9 ^ 0xFFFFBC06;
        c = new int[4][4];
    }
}

