/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.c;
import java.lang.reflect.Field;
import java.util.Locale;

/*
 * Renamed from com.google.gson.j
 */
final class j_0
extends c {
    public static final int[][] a;
    private static /* synthetic */ int field52;
    private static /* synthetic */ int field53;

    @Override
    public String a(Field field) {
        return j_0.a(field.getName(), ".").toLowerCase(Locale.ENGLISH);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field52 = 0x73B8 ^ 0xFFFFFAB4;
        field53 = 0xFFFFE0E7 ^ 0xFFFFFAB4;
        a = new int[2][3];
    }
}

