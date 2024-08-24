/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.JsonReader;
import com.google.gson.T;
import com.google.gson.cO;
import java.util.concurrent.atomic.AtomicBoolean;

class ct
extends T {
    public static final int[][] a;
    private static /* synthetic */ int field74;
    private static /* synthetic */ int field75;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    ct() {
    }

    public AtomicBoolean a(JsonReader jsonReader) {
        return new AtomicBoolean(jsonReader.i());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(cO cO2, AtomicBoolean atomicBoolean) {
        cO2.a(atomicBoolean.get());
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
        field74 = 0x6C9F ^ 0xFFFFD5D1;
        field75 = 0xFFFFC01D ^ 0xFFFFD5D1;
        a = new int[4][1];
    }
}

