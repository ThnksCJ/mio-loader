/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.Gson;
import com.google.gson.JsonReader;
import com.google.gson.JsonToken;
import com.google.gson.T;
import com.google.gson.cO;

/*
 * Renamed from com.google.gson.o
 */
class o_0
extends T {
    final /* synthetic */ Gson a;
    public static final int[][] b;
    private static /* synthetic */ int field74;
    private static /* synthetic */ int field75;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    o_0(Gson gson) {
        this.a = gson;
    }

    public Float a(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.i) {
            jsonReader.j();
            return null;
        }
        return Float.valueOf((float)jsonReader.k());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(cO cO2, Number number) {
        if (number == null) {
            cO2.f();
            return;
        }
        float f = number.floatValue();
        Gson.a(f);
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
        field74 = 0x498A ^ 0xFFFFE0BC;
        field75 = 0xFFFFB2F9 ^ 0xFFFFE0BC;
        b = new int[2][4];
    }
}

