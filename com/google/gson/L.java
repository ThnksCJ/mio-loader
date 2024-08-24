/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.B;
import com.google.gson.F;
import com.google.gson.JsonElement;
import com.google.gson.K;

final class L
extends K {
    public static final int[][] a;
    private static /* synthetic */ int field64;
    private static /* synthetic */ int field65;

    @Override
    public JsonElement a(Long l) {
        if (l == null) {
            return B.a;
        }
        return new F(l);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field64 = 0x7FEB ^ 0xFFFFA2CF;
        field65 = 0xFFFFB2A4 ^ 0xFFFFA2CF;
        a = new int[4][1];
    }
}

