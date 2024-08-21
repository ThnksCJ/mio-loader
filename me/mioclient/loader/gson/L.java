/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import me.mioclient.loader.gson.B;
import me.mioclient.loader.gson.F;
import me.mioclient.loader.gson.JsonElement;
import me.mioclient.loader.gson.K;

final class L
extends K {
    public static final int[][] a;
    private static /* synthetic */ int field64;
    private static /* synthetic */ int field65;

    @Override
    public JsonElement a(Long l) {
        if (l == null) {
            return B.a;
        }
        return new F(l);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field64 = 0x7FEB ^ 0xFFFFA2CF;
        field65 = 0xFFFFB2A4 ^ 0xFFFFA2CF;
        a = new int[4][1];
    }
}

