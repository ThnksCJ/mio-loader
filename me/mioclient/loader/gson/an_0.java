/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.lang.reflect.Type;
import me.mioclient.loader.gson.aT;
import me.mioclient.loader.gson.ag_0;
import me.mioclient.loader.gson.u_0;

/*
 * Renamed from me.mioclient.loader.gson.an
 */
class an_0
implements aT {
    final /* synthetic */ u_0 a;
    final /* synthetic */ Type b;
    final /* synthetic */ ag_0 c;
    public static final int[][] d;
    private static /* synthetic */ int field140;
    private static /* synthetic */ int field141;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    an_0(ag_0 ag_02, u_0 u_02, Type type) {
        this.c = ag_02;
        this.a = u_02;
        this.b = type;
    }

    @Override
    public Object a() {
        return this.a.a(this.b);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field140 = 0x6A6B ^ 0xFFFF9420;
        field141 = 0xFFFFBD80 ^ 0xFFFF9420;
        d = new int[1][4];
    }
}

