/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.util.LinkedHashMap;
import me.mioclient.loader.gson.aT;
import me.mioclient.loader.gson.ag_0;

/*
 * Renamed from me.mioclient.loader.gson.ak
 */
class ak_0
implements aT {
    final /* synthetic */ ag_0 a;
    public static final int[][] b;
    private static /* synthetic */ int field158;
    private static /* synthetic */ int field159;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    ak_0(ag_0 ag_02) {
        this.a = ag_02;
    }

    @Override
    public Object a() {
        return new LinkedHashMap();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field158 = 0x264A ^ 0xFFFFA123;
        field159 = 0xFFFF949A ^ 0xFFFFA123;
        b = new int[3][3];
    }
}

