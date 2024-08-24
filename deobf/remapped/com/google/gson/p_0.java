/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.JsonReader;
import com.google.gson.JsonToken;
import com.google.gson.T;
import com.google.gson.cO;

/*
 * Renamed from com.google.gson.p
 */
class p_0
extends T {
    public static final int[][] a;
    private static /* synthetic */ int field74;
    private static /* synthetic */ int field75;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    p_0() {
    }

    public Number a(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.i) {
            jsonReader.j();
            return null;
        }
        return jsonReader.l();
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
        cO2.b(number.toString());
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
        field74 = 0x7D92 ^ 0xFFFFE98F;
        field75 = 0xFFFFE0AE ^ 0xFFFFE98F;
        a = new int[4][1];
    }
}

