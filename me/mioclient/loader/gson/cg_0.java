/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import me.mioclient.loader.gson.GSONBuilder;
import me.mioclient.loader.gson.T;
import me.mioclient.loader.gson.V;
import me.mioclient.loader.gson.cJ;

/*
 * Renamed from me.mioclient.loader.gson.cg
 */
class cg_0
implements V {
    final /* synthetic */ cJ a;
    final /* synthetic */ T b;
    public static final int[][] c;
    private static /* synthetic */ int field106;
    private static /* synthetic */ int field107;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    cg_0(cJ cJ2, T t) {
        this.a = cJ2;
        this.b = t;
    }

    @Override
    public T a(GSONBuilder gSONBuilder, cJ cJ2) {
        return cJ2.equals(this.a) ? this.b : null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field106 = 0x24C0 ^ 0xFFFFF4E8;
        field107 = 0xFFFFFD5C ^ 0xFFFFF4E8;
        c = new int[4][3];
    }
}

