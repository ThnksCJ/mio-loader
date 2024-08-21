/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import me.mioclient.loader.gson.GSONBuilder;
import me.mioclient.loader.gson.T;
import me.mioclient.loader.gson.V;
import me.mioclient.loader.gson.bv_0;
import me.mioclient.loader.gson.cJ;

/*
 * Renamed from me.mioclient.loader.gson.bw
 */
class bw_0
implements V {
    final /* synthetic */ bv_0 a;
    public static final int[][] b;
    private static /* synthetic */ int field82;
    private static /* synthetic */ int field83;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    bw_0(bv_0 bv_02) {
        this.a = bv_02;
    }

    @Override
    public T a(GSONBuilder gSONBuilder, cJ cJ2) {
        return cJ2.a() == Number.class ? this.a : null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field82 = 0x4730 ^ 0xFFFFA0F5;
        field83 = 0xFFFF8D70 ^ 0xFFFFA0F5;
        b = new int[4][4];
    }
}

