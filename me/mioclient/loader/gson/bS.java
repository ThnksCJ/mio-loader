/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.math.BigDecimal;
import me.mioclient.loader.gson.JsonReader;
import me.mioclient.loader.gson.JsonToken;
import me.mioclient.loader.gson.T;
import me.mioclient.loader.gson.cO;

class bS
extends T {
    public static final int[][] a;
    private static /* synthetic */ int field74;
    private static /* synthetic */ int field75;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    bS() {
    }

    public BigDecimal a(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.i) {
            jsonReader.j();
            return null;
        }
        return new BigDecimal(jsonReader.h());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(cO cO2, BigDecimal bigDecimal) {
        cO2.a(bigDecimal);
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
        field74 = 0x3164 ^ 0xFFFF9C7E;
        field75 = 0xFFFFEEE6 ^ 0xFFFF9C7E;
        a = new int[3][1];
    }
}

