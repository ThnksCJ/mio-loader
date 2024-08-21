/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.lang.reflect.Method;
import me.mioclient.loader.gson.UnsafeAllocator;

/*
 * Renamed from me.mioclient.loader.gson.bc
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

