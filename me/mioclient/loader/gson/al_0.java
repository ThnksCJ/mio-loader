/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import me.mioclient.loader.gson.aL;
import me.mioclient.loader.gson.aT;
import me.mioclient.loader.gson.ag_0;

/*
 * Renamed from me.mioclient.loader.gson.al
 */
class al_0
implements aT {
    final /* synthetic */ ag_0 a;
    public static final int[][] b;
    private static /* synthetic */ int field156;
    private static /* synthetic */ int field157;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    al_0(ag_0 ag_02) {
        this.a = ag_02;
    }

    @Override
    public Object a() {
        return new aL();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field156 = 0x1BD9 ^ 0xFFFFB6A8;
        field157 = 0xFFFF87AD ^ 0xFFFFB6A8;
        b = new int[2][4];
    }
}

