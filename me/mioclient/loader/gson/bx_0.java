/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import me.mioclient.loader.gson.JsonToken;

/*
 * Renamed from me.mioclient.loader.gson.bx
 */
class bx_0 {
    static final /* synthetic */ int[] a;
    public static final int[][] b;
    private static /* synthetic */ int field212;
    private static /* synthetic */ int field213;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field212 = 0x7C23 ^ 0xFFFFDE80;
        field213 = 0xFFFFA2EB ^ 0xFFFFDE80;
        b = new int[4][2];
        a = new int[JsonToken.a().length];
        bx_0.a[JsonToken.i.ordinal()] = 1;
        bx_0.a[JsonToken.g.ordinal()] = 2;
        bx_0.a[JsonToken.f.ordinal()] = 3;
    }
}

