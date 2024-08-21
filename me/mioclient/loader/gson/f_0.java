/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.lang.reflect.Field;
import me.mioclient.loader.gson.c_0;

/*
 * Renamed from me.mioclient.loader.gson.f
 */
final class f_0
extends c_0 {
    public static final int[][] a;
    private static /* synthetic */ int field52;
    private static /* synthetic */ int field53;

    @Override
    public String a(Field field) {
        return f_0.b(f_0.a(field.getName(), " "));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field52 = 0x3AC6 ^ 0xFFFFFDA4;
        field53 = 0xFFFFD114 ^ 0xFFFFFDA4;
        a = new int[2][3];
    }
}

