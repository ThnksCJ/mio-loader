/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import me.mioclient.loader.gson.GSONBuilder;
import me.mioclient.loader.gson.T;
import me.mioclient.loader.gson.V;
import me.mioclient.loader.gson.cJ;
import me.mioclient.loader.gson.cu;

/*
 * Renamed from me.mioclient.loader.gson.cf
 */
class cf_0
implements V {
    public static final int[][] a;
    private static /* synthetic */ int field90;
    private static /* synthetic */ int field91;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    cf_0() {
    }

    @Override
    public T a(GSONBuilder gSONBuilder, cJ cJ2) {
        Class clazz = cJ2.a();
        if (!Enum.class.isAssignableFrom(clazz) || clazz == Enum.class) {
            return null;
        }
        if (!clazz.isEnum()) {
            clazz = clazz.getSuperclass();
        }
        return new cu(clazz);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field90 = 0x3C5B ^ 0xFFFFBCBA;
        field91 = 0xFFFFBC0F ^ 0xFFFFBCBA;
        a = new int[2][3];
    }
}

