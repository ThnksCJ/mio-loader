/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.sql.Timestamp;
import java.util.Date;
import me.mioclient.loader.gson.GSONBuilder;
import me.mioclient.loader.gson.T;
import me.mioclient.loader.gson.V;
import me.mioclient.loader.gson.cE;
import me.mioclient.loader.gson.cJ;

class cF
implements V {
    public static final int[][] a;
    private static /* synthetic */ int field88;
    private static /* synthetic */ int field89;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    cF() {
    }

    @Override
    public T a(GSONBuilder gSONBuilder, cJ cJ2) {
        if (cJ2.a() == Timestamp.class) {
            T t = gSONBuilder.a(Date.class);
            return new cE(t, null);
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field88 = 0x4AAE ^ 0xFFFFD125;
        field89 = 0xFFFFE8C9 ^ 0xFFFFD125;
        a = new int[3][4];
    }
}

