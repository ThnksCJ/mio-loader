/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.c;
import java.lang.reflect.Field;

final class e
extends c {
    public static final int[][] a;
    private static /* synthetic */ int field52;
    private static /* synthetic */ int field53;

    @Override
    public String a(Field field) {
        return com.google.gson.e.b(field.getName());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field52 = 0x451F ^ 0xFFFFB62F;
        field53 = 0xFFFFEADA ^ 0xFFFFB62F;
        a = new int[2][2];
    }
}

