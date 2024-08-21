/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import me.mioclient.loader.gson.eq;

public class ey
extends eq {
    private static final long a;
    public static final int[][] b;
    private static /* synthetic */ int field16;
    private static /* synthetic */ int field17;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public ey(String string) {
        super(string);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public ey(String string, Throwable throwable) {
        super(string, throwable);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l;
        field16 = 0x11AD ^ 0xFFFFA220;
        field17 = 0xFFFFDA84 ^ 0xFFFFA220;
        b = new int[1][4];
        long l2 = 5999388181017566889L;
        a = l = 0x286113E9BA821046L ^ l2;
    }
}

