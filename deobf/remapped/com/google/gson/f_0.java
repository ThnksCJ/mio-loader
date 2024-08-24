/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.c;
import java.lang.reflect.Field;

/*
 * Renamed from com.google.gson.f
 */
final class f_0
extends c {
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

