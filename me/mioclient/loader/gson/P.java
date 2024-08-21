/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import me.mioclient.loader.gson.JsonReader;
import me.mioclient.loader.gson.N;
import me.mioclient.loader.gson.aA;

final class P
extends N {
    public static final int[][] a;
    private static /* synthetic */ int field58;
    private static /* synthetic */ int field59;

    @Override
    public Number b(JsonReader jsonReader) {
        return new aA(jsonReader.h());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field58 = 0x28E7 ^ 0xFFFFC767;
        field59 = 0xFFFFE28B ^ 0xFFFFC767;
        a = new int[2][1];
    }
}

