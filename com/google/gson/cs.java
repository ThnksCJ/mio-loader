/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.JsonReader;
import com.google.gson.T;
import com.google.gson.cO;
import java.util.concurrent.atomic.AtomicInteger;

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

