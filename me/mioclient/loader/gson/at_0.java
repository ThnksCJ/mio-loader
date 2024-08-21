/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.util.ArrayList;
import me.mioclient.loader.gson.aT;
import me.mioclient.loader.gson.ag_0;

/*
 * Renamed from me.mioclient.loader.gson.at
 */
class at_0
implements aT {
    final /* synthetic */ ag_0 a;
    public static final int[][] b;
    private static /* synthetic */ int field144;
    private static /* synthetic */ int field145;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    at_0(ag_0 ag_02) {
        this.a = ag_02;
    }

    @Override
    public Object a() {
        return new ArrayList();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field144 = 0x7FDB ^ 0xFFFFD397;
        field145 = 0xFFFFE647 ^ 0xFFFFD397;
        b = new int[3][3];
    }
}

