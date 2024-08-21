/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import me.mioclient.loader.gson.JsonReader;
import me.mioclient.loader.gson.N;

final class O
extends N {
    public static final int[][] a;
    private static /* synthetic */ int field58;
    private static /* synthetic */ int field59;

    public Double a(JsonReader jsonReader) {
        return jsonReader.k();
    }

    @Override
    public /* synthetic */ Number b(JsonReader jsonReader) {
        return this.a(jsonReader);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field58 = 0x7018 ^ 0xFFFFF3A8;
        field59 = 0xFFFFB354 ^ 0xFFFFF3A8;
        a = new int[1][1];
    }
}

