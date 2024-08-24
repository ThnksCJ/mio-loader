/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.JsonReader;
import com.google.gson.JsonToken;
import com.google.gson.T;
import com.google.gson.cO;

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

