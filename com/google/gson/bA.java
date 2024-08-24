/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.JsonToken;

class bA {
    static final /* synthetic */ int[] a;
    public static final int[][] b;
    private static /* synthetic */ int field196;
    private static /* synthetic */ int field197;

    /*
     * Enabled aggressive block sorting
     */
    static {
        field196 = 0x4CA7 ^ 0xFFFF9C28;
        field197 = 0xFFFFB84A ^ 0xFFFF9C28;
        b = new int[2][1];
        long l = 4486586951487283761L;
        long l2 = 0xF7DF59B1B94D6237L ^ l;
        a = new int[JsonToken.a().length];
        bA.a[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
        bA.a[JsonToken.c.ordinal()] = 2;
        bA.a[JsonToken.f.ordinal()] = 3;
        bA.a[JsonToken.g.ordinal()] = 4;
        bA.a[JsonToken.h.ordinal()] = 5;
        bA.a[JsonToken.i.ordinal()] = (int)l2;
    }
}

