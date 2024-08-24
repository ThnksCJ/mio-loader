/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.UnsafeAllocator;
import java.lang.reflect.Method;

/*
 * Renamed from com.google.gson.bc
 */
class bc_0
extends UnsafeAllocator {
    final /* synthetic */ Method a;
    public static final int[][] b;
    private static /* synthetic */ int field180;
    private static /* synthetic */ int field181;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    bc_0(Method method) {
        this.a = method;
    }

    @Override
    public Object a(Class clazz) {
        bc_0.b(clazz);
        return this.a.invoke(null, clazz, Object.class);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field180 = 0x62F2 ^ 0xFFFFC206;
        field181 = 0xFFFFA260 ^ 0xFFFFC206;
        b = new int[3][1];
    }
}

