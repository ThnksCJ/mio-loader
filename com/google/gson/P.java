/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.JsonReader;
import com.google.gson.N;
import com.google.gson.aA;

final class P
extends N {
    public static final int[][] a;
    private static /* synthetic */ int field58;
    private static /* synthetic */ int field59;

    @Override
    public Number b(JsonReader jsonReader) {
        return new aA(jsonReader.h());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field58 = 0x28E7 ^ 0xFFFFC767;
        field59 = 0xFFFFE28B ^ 0xFFFFC767;
        a = new int[2][1];
    }
}

