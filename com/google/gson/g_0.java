/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.c;
import java.lang.reflect.Field;
import java.util.Locale;

/*
 * Renamed from com.google.gson.g
 */
final class g_0
extends c {
    public static final int[][] a;
    private static /* synthetic */ int field52;
    private static /* synthetic */ int field53;

    @Override
    public String a(Field field) {
        return g_0.a(field.getName(), "_").toLowerCase(Locale.ENGLISH);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field52 = 0x74E3 ^ 0xFFFFD111;
        field53 = 0xFFFFEB1D ^ 0xFFFFD111;
        a = new int[2][1];
    }
}

