/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader;

import me.mioclient.loader.honestlyidfk.dX;

class dS
extends RuntimeException {
    public final dX a;
    public static final int[][] b;
    private static /* synthetic */ int field14;
    private static /* synthetic */ int field15;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public dS(dX dX2) {
        this.a = dX2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field14 = 0x356 ^ 0xFFFFAF8D;
        field15 = 0xFFFFB760 ^ 0xFFFFAF8D;
        b = new int[4][1];
    }
}

