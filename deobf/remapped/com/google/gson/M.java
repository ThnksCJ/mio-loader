/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.B;
import com.google.gson.F;
import com.google.gson.JsonElement;
import com.google.gson.K;

final class M
extends K {
    public static final int[][] a;
    private static /* synthetic */ int field62;
    private static /* synthetic */ int field63;

    @Override
    public JsonElement a(Long l) {
        if (l == null) {
            return B.a;
        }
        return new F(l.toString());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field62 = 0x1393 ^ 0xFFFFD84F;
        field63 = 0xFFFFAFF7 ^ 0xFFFFD84F;
        a = new int[2][1];
    }
}

