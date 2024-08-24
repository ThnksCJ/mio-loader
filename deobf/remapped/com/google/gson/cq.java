/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.JsonReader;
import com.google.gson.JsonToken;
import com.google.gson.T;
import com.google.gson.cO;

class cq
extends T {
    public static final int[][] a;
    private static /* synthetic */ int field74;
    private static /* synthetic */ int field75;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    cq() {
    }

    public Number a(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.i) {
            jsonReader.j();
            return null;
        }
        return (short)jsonReader.m();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(cO cO2, Number number) {
        cO2.a(number);
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
        field74 = 0x1D22 ^ 0xFFFF9913;
        field75 = 0xFFFFCE57 ^ 0xFFFF9913;
        a = new int[2][4];
    }
}

