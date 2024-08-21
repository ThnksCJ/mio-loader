/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.util.TreeMap;
import me.mioclient.loader.gson.aT;
import me.mioclient.loader.gson.ag_0;

/*
 * Renamed from me.mioclient.loader.gson.aj
 */
class aj_0
implements aT {
    final /* synthetic */ ag_0 a;
    public static final int[][] b;
    private static /* synthetic */ int field160;
    private static /* synthetic */ int field161;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    aj_0(ag_0 ag_02) {
        this.a = ag_02;
    }

    @Override
    public Object a() {
        return new TreeMap();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field160 = 0x29C ^ 0xFFFFFBE9;
        field161 = 0xFFFF8C3F ^ 0xFFFFFBE9;
        b = new int[2][2];
    }
}

