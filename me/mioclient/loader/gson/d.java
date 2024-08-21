/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.lang.reflect.Field;
import me.mioclient.loader.gson.c_0;

final class d
extends c_0 {
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

