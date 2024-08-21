/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.lang.reflect.Field;
import me.mioclient.loader.gson.c_0;

final class e
extends c_0 {
    public static final int[][] a;
    private static /* synthetic */ int field52;
    private static /* synthetic */ int field53;

    @Override
    public String a(Field field) {
        return me.mioclient.loader.gson.e.b(field.getName());
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

