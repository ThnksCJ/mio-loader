/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.util.Date;
import me.mioclient.loader.gson.GSONBuilder;
import me.mioclient.loader.gson.T;
import me.mioclient.loader.gson.V;
import me.mioclient.loader.gson.bi_0;
import me.mioclient.loader.gson.cJ;

/*
 * Renamed from me.mioclient.loader.gson.bj
 */
class bj_0
implements V {
    public static final int[][] a;
    private static /* synthetic */ int field110;
    private static /* synthetic */ int field111;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    bj_0() {
    }

    @Override
    public T a(GSONBuilder gSONBuilder, cJ cJ2) {
        return cJ2.a() == Date.class ? new bi_0() : null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field110 = 0x3BEC ^ 0xFFFFC422;
        field111 = 0xFFFFBB8D ^ 0xFFFFC422;
        a = new int[1][3];
    }
}

