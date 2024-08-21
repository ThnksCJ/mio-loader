/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.lang.reflect.Field;
import java.util.Locale;
import me.mioclient.loader.gson.c_0;

/*
 * Renamed from me.mioclient.loader.gson.i
 */
final class i_0
extends c_0 {
    public static final int[][] a;
    private static /* synthetic */ int field52;
    private static /* synthetic */ int field53;

    @Override
    public String a(Field field) {
        return i_0.a(field.getName(), "-").toLowerCase(Locale.ENGLISH);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field52 = 0x3C9D ^ 0xFFFFE35B;
        field53 = 0xFFFFCA34 ^ 0xFFFFE35B;
        a = new int[4][3];
    }
}

