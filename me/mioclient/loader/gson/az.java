/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import me.mioclient.loader.gson.JsonReader;

public abstract class az {
    public static az a;
    public static final int[][] b;
    private static /* synthetic */ int field192;
    private static /* synthetic */ int field193;

    public abstract void a(JsonReader var1);

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field192 = 0x31F4 ^ 0xFFFF8E63;
        field193 = 0xFFFFF9C3 ^ 0xFFFF8E63;
        b = new int[4][4];
    }
}

