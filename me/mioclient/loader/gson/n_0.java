/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import me.mioclient.loader.gson.GSONBuilder;
import me.mioclient.loader.gson.JsonReader;
import me.mioclient.loader.gson.JsonToken;
import me.mioclient.loader.gson.T;
import me.mioclient.loader.gson.cO;

/*
 * Renamed from me.mioclient.loader.gson.n
 */
class n_0
extends T {
    final /* synthetic */ GSONBuilder a;
    public static final int[][] b;
    private static /* synthetic */ int field74;
    private static /* synthetic */ int field75;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    n_0(GSONBuilder gSONBuilder) {
        this.a = gSONBuilder;
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
        GSONBuilder.a(d2);
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

