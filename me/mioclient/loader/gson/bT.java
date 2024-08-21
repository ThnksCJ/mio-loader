/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.math.BigInteger;
import me.mioclient.loader.gson.JsonReader;
import me.mioclient.loader.gson.JsonToken;
import me.mioclient.loader.gson.T;
import me.mioclient.loader.gson.cO;

class bT
extends T {
    public static final int[][] a;
    private static /* synthetic */ int field74;
    private static /* synthetic */ int field75;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    bT() {
    }

    public BigInteger a(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.i) {
            jsonReader.j();
            return null;
        }
        return new BigInteger(jsonReader.h());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(cO cO2, BigInteger bigInteger) {
        cO2.a(bigInteger);
    }

    @Override
    public /* synthetic */ Object b(JsonReader jsonReader) {
        return this.a(jsonReader);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field74 = 0x6689 ^ 0xFFFF8EBB;
        field75 = 0xFFFFE1E1 ^ 0xFFFF8EBB;
        a = new int[4][4];
    }
}

