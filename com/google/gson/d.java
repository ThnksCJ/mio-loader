/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.c;
import java.lang.reflect.Field;

final class d
extends c {
    public static final int[][] a;
    private static /* synthetic */ int field52;
    private static /* synthetic */ int field53;

    @Override
    public String a(Field field) {
        return field.getName();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field52 = 0x33E2 ^ 0xFFFFB959;
        field53 = 0xFFFFE719 ^ 0xFFFFB959;
        a = new int[4][3];
    }
}

