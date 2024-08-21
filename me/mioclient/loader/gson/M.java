/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import me.mioclient.loader.gson.B;
import me.mioclient.loader.gson.F;
import me.mioclient.loader.gson.JsonElement;
import me.mioclient.loader.gson.K;

final class M
extends K {
    public static final int[][] a;
    private static /* synthetic */ int field62;
    private static /* synthetic */ int field63;

    @Override
    public JsonElement a(Long l) {
        if (l == null) {
            return B.a;
        }
        return new F(l.toString());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field62 = 0x1393 ^ 0xFFFFD84F;
        field63 = 0xFFFFAFF7 ^ 0xFFFFD84F;
        a = new int[2][1];
    }
}

