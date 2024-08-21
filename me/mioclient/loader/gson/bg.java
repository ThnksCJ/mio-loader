/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.lang.reflect.Type;
import java.util.Collection;
import me.mioclient.loader.gson.GSONBuilder;
import me.mioclient.loader.gson.T;
import me.mioclient.loader.gson.V;
import me.mioclient.loader.gson.aT;
import me.mioclient.loader.gson.ac_0;
import me.mioclient.loader.gson.ag_0;
import me.mioclient.loader.gson.bh_0;
import me.mioclient.loader.gson.cJ;

public final class bg
implements V {
    private final ag_0 a;
    public static final int[][] b;
    private static /* synthetic */ int field102;
    private static /* synthetic */ int field103;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public bg(ag_0 ag_02) {
        this.a = ag_02;
    }

    @Override
    public T a(GSONBuilder gSONBuilder, cJ cJ2) {
        Type type = cJ2.b();
        Class clazz = cJ2.a();
        if (!Collection.class.isAssignableFrom(clazz)) {
            return null;
        }
        Type type2 = ac_0.a(type, clazz);
        T t = gSONBuilder.a(cJ.b(type2));
        aT aT2 = this.a.a(cJ2);
        bh_0 bh_02 = new bh_0(gSONBuilder, type2, t, aT2);
        return bh_02;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field102 = 0x53BD ^ 0xFFFFF74B;
        field103 = 0xFFFFA38F ^ 0xFFFFF74B;
        b = new int[1][1];
    }
}

