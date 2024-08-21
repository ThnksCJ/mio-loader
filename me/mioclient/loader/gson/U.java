/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import me.mioclient.loader.gson.JsonReader;
import me.mioclient.loader.gson.JsonToken;
import me.mioclient.loader.gson.T;
import me.mioclient.loader.gson.cO;

class U
extends T {
    final /* synthetic */ T a;
    public static final int[][] b;
    private static /* synthetic */ int field74;
    private static /* synthetic */ int field75;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    U(T t) {
        this.a = t;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(cO cO2, Object object) {
        if (object == null) {
            cO2.f();
            return;
        }
        this.a.a(cO2, object);
    }

    @Override
    public Object b(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.i) {
            jsonReader.j();
            return null;
        }
        return this.a.b(jsonReader);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field74 = 0x1A72 ^ 0xFFFFC4D7;
        field75 = 0xFFFFE279 ^ 0xFFFFC4D7;
        b = new int[3][3];
    }
}

