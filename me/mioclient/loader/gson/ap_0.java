/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.util.TreeSet;
import me.mioclient.loader.gson.aT;
import me.mioclient.loader.gson.ag_0;

/*
 * Renamed from me.mioclient.loader.gson.ap
 */
class ap_0
implements aT {
    final /* synthetic */ ag_0 a;
    public static final int[][] b;
    private static /* synthetic */ int field136;
    private static /* synthetic */ int field137;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    ap_0(ag_0 ag_02) {
        this.a = ag_02;
    }

    @Override
    public Object a() {
        return new TreeSet();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field136 = 0x1920 ^ 0xFFFF892D;
        field137 = 0xFFFFEA3F ^ 0xFFFF892D;
        b = new int[4][1];
    }
}

