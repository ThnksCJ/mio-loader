/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import me.mioclient.loader.gson.JsonReader;
import me.mioclient.loader.gson.JsonToken;
import me.mioclient.loader.gson.T;
import me.mioclient.loader.gson.cO;

class bR
extends T {
    public static final int[][] a;
    private static /* synthetic */ int field74;
    private static /* synthetic */ int field75;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    bR() {
    }

    public String a(JsonReader jsonReader) {
        JsonToken jsonToken = jsonReader.peek();
        if (jsonToken == JsonToken.i) {
            jsonReader.j();
            return null;
        }
        if (jsonToken == JsonToken.h) {
            return Boolean.toString(jsonReader.i());
        }
        return jsonReader.h();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(cO cO2, String string) {
        cO2.b(string);
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
        field74 = 0x7A80 ^ 0xFFFFED45;
        field75 = 0xFFFF6D50 ^ 0xFFFFED45;
        a = new int[1][3];
    }
}

