/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.util.Date;
import me.mioclient.loader.gson.bm_0;

/*
 * Renamed from me.mioclient.loader.gson.bn
 */
class bn_0
extends bm_0 {
    public static final int[][] a;
    private static /* synthetic */ int field208;
    private static /* synthetic */ int field209;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    bn_0(Class clazz) {
        super(clazz);
    }

    @Override
    protected Date a(Date date) {
        return date;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field208 = 0x1DD4 ^ 0xFFFFD2A1;
        field209 = 0xFFFFEF09 ^ 0xFFFFD2A1;
        a = new int[2][1];
    }
}

