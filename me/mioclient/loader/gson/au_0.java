/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.util.concurrent.ConcurrentSkipListMap;
import me.mioclient.loader.gson.aT;
import me.mioclient.loader.gson.ag_0;

/*
 * Renamed from me.mioclient.loader.gson.au
 */
class au_0
implements aT {
    final /* synthetic */ ag_0 a;
    public static final int[][] b;
    private static /* synthetic */ int field152;
    private static /* synthetic */ int field153;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    au_0(ag_0 ag_02) {
        this.a = ag_02;
    }

    @Override
    public Object a() {
        return new ConcurrentSkipListMap();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field152 = 0x49DD ^ 0xFFFFC256;
        field153 = 0xFFFFD2D7 ^ 0xFFFFC256;
        b = new int[3][4];
    }
}

