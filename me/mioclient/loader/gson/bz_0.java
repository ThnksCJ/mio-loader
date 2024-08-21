/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import me.mioclient.loader.gson.GSONBuilder;
import me.mioclient.loader.gson.S;
import me.mioclient.loader.gson.T;
import me.mioclient.loader.gson.V;
import me.mioclient.loader.gson.by_0;
import me.mioclient.loader.gson.cJ;

/*
 * Renamed from me.mioclient.loader.gson.bz
 */
class bz_0
implements V {
    final /* synthetic */ S a;
    public static final int[][] b;
    private static /* synthetic */ int field84;
    private static /* synthetic */ int field85;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    bz_0(S s) {
        this.a = s;
    }

    @Override
    public T a(GSONBuilder gSONBuilder, cJ cJ2) {
        if (cJ2.a() == Object.class) {
            return new by_0(gSONBuilder, this.a, null);
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field84 = 0x56A ^ 0xFFFF8E59;
        field85 = 0xFFFF81F6 ^ 0xFFFF8E59;
        b = new int[2][2];
    }
}

