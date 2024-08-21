/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.sql.Date;
import me.mioclient.loader.gson.GSONBuilder;
import me.mioclient.loader.gson.T;
import me.mioclient.loader.gson.V;
import me.mioclient.loader.gson.cA;
import me.mioclient.loader.gson.cJ;

class cB
implements V {
    public static final int[][] a;
    private static /* synthetic */ int field86;
    private static /* synthetic */ int field87;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    cB() {
    }

    @Override
    public T a(GSONBuilder gSONBuilder, cJ cJ2) {
        return cJ2.a() == Date.class ? new cA(null) : null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field86 = 0x23A9 ^ 0xFFFF9E98;
        field87 = 0xFFFF96F9 ^ 0xFFFF9E98;
        a = new int[2][3];
    }
}

