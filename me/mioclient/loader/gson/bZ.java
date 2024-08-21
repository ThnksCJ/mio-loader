/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.net.InetAddress;
import me.mioclient.loader.gson.JsonReader;
import me.mioclient.loader.gson.JsonToken;
import me.mioclient.loader.gson.T;
import me.mioclient.loader.gson.cO;

class bZ
extends T {
    public static final int[][] a;
    private static /* synthetic */ int field74;
    private static /* synthetic */ int field75;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    bZ() {
    }

    public InetAddress a(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.i) {
            jsonReader.j();
            return null;
        }
        return InetAddress.getByName(jsonReader.h());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(cO cO2, InetAddress inetAddress) {
        cO2.b(inetAddress == null ? null : inetAddress.getHostAddress());
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
        field74 = 0x2B6D ^ 0xFFFFD99D;
        field75 = 0xFFFFB5A5 ^ 0xFFFFD99D;
        a = new int[4][3];
    }
}

