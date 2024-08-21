/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.util.LinkedHashSet;
import me.mioclient.loader.gson.aT;
import me.mioclient.loader.gson.ag_0;

/*
 * Renamed from me.mioclient.loader.gson.ar
 */
class ar_0
implements aT {
    final /* synthetic */ ag_0 a;
    public static final int[][] b;
    private static /* synthetic */ int field148;
    private static /* synthetic */ int field149;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    ar_0(ag_0 ag_02) {
        this.a = ag_02;
    }

    @Override
    public Object a() {
        return new LinkedHashSet();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field148 = 0x3424 ^ 0xFFFFF546;
        field149 = 0xFFFFA703 ^ 0xFFFFF546;
        b = new int[3][1];
    }
}

