/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.sql.Time;
import me.mioclient.loader.gson.GSONBuilder;
import me.mioclient.loader.gson.T;
import me.mioclient.loader.gson.V;
import me.mioclient.loader.gson.cC;
import me.mioclient.loader.gson.cJ;

class cD
implements V {
    public static final int[][] a;
    private static /* synthetic */ int field92;
    private static /* synthetic */ int field93;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    cD() {
    }

    @Override
    public T a(GSONBuilder gSONBuilder, cJ cJ2) {
        return cJ2.a() == Time.class ? new cC(null) : null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field92 = 0x3A58 ^ 0xFFFFDB34;
        field93 = 0xFFFFC293 ^ 0xFFFFDB34;
        a = new int[4][4];
    }
}

