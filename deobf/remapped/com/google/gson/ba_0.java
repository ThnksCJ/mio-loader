/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.UnsafeAllocator;
import java.lang.reflect.Method;

/*
 * Renamed from com.google.gson.ba
 */
class ba_0
extends UnsafeAllocator {
    final /* synthetic */ Method a;
    final /* synthetic */ Object b;
    public static final int[][] c;
    private static /* synthetic */ int field180;
    private static /* synthetic */ int field181;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    ba_0(Method method, Object object) {
        this.a = method;
        this.b = object;
    }

    @Override
    public Object a(Class clazz) {
        ba_0.b(clazz);
        return this.a.invoke(this.b, clazz);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field180 = 0x4A3E ^ 0xFFFFB40A;
        field181 = 0xFFFFFEC8 ^ 0xFFFFB40A;
        c = new int[4][4];
    }
}

