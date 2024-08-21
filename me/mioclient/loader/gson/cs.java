/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.util.concurrent.atomic.AtomicInteger;
import me.mioclient.loader.gson.JsonReader;
import me.mioclient.loader.gson.T;
import me.mioclient.loader.gson.cO;

class cs
extends T {
    public static final int[][] a;
    private static /* synthetic */ int field74;
    private static /* synthetic */ int field75;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    cs() {
    }

    public AtomicInteger a(JsonReader jsonReader) {
        return new AtomicInteger(jsonReader.m());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(cO cO2, AtomicInteger atomicInteger) {
        cO2.a((long)atomicInteger.get());
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
        field74 = 0x235 ^ 0xFFFFEF25;
        field75 = 0xFFFFBB8A ^ 0xFFFFEF25;
        a = new int[2][4];
    }
}

