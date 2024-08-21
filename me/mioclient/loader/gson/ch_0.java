/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import me.mioclient.loader.gson.JsonReader;
import me.mioclient.loader.gson.JsonToken;
import me.mioclient.loader.gson.T;
import me.mioclient.loader.gson.cO;

/*
 * Renamed from me.mioclient.loader.gson.ch
 */
class ch_0
extends T {
    public static final int[][] a;
    private static /* synthetic */ int field74;
    private static /* synthetic */ int field75;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    ch_0() {
    }

    public Boolean a(JsonReader jsonReader) {
        JsonToken jsonToken = jsonReader.peek();
        if (jsonToken == JsonToken.i) {
            jsonReader.j();
            return null;
        }
        if (jsonToken == JsonToken.f) {
            return Boolean.parseBoolean(jsonReader.h());
        }
        return jsonReader.i();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(cO cO2, Boolean bl2) {
        cO2.a(bl2);
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
        field74 = 0x700D ^ 0xFFFF8B2B;
        field75 = 0xFFFFCB38 ^ 0xFFFF8B2B;
        a = new int[1][3];
    }
}

