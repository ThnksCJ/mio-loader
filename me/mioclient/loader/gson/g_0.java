/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.lang.reflect.Field;
import java.util.Locale;
import me.mioclient.loader.gson.c_0;

/*
 * Renamed from me.mioclient.loader.gson.g
 */
final class g_0
extends c_0 {
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

