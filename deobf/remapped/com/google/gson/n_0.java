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
 * Renamed from com.google.gson.n
 */
class n_0
extends T {
    final /* synthetic */ Gson a;
    public static final int[][] b;
    private static /* synthetic */ int field74;
    private static /* synthetic */ int field75;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    n_0(Gson gson) {
        this.a = gson;
    }

    public Double a(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.i) {
            jsonReader.j();
            return null;
        }
        return jsonReader.k();
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
        double d2 = number.doubleValue();
        Gson.a(d2);
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
        field74 = 0x4050 ^ 0xFFFFD280;
        field75 = 0xFFFFBBE6 ^ 0xFFFFD280;
        b = new int[4][2];
    }
}

