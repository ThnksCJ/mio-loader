/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import me.mioclient.loader.gson.GSONBuilder;
import me.mioclient.loader.gson.T;
import me.mioclient.loader.gson.V;
import me.mioclient.loader.gson.ac_0;
import me.mioclient.loader.gson.be_0;
import me.mioclient.loader.gson.cJ;

/*
 * Renamed from me.mioclient.loader.gson.bf
 */
class bf_0
implements V {
    public static final int[][] a;
    private static /* synthetic */ int field104;
    private static /* synthetic */ int field105;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    bf_0() {
    }

    @Override
    public T a(GSONBuilder gSONBuilder, cJ cJ2) {
        Type type = cJ2.b();
        if (!(type instanceof GenericArrayType || type instanceof Class && ((Class)type).isArray())) {
            return null;
        }
        Type type2 = ac_0.g(type);
        T t = gSONBuilder.a(cJ.b(type2));
        return new be_0(gSONBuilder, t, ac_0.e(type2));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field104 = 0x3E55 ^ 0xFFFFDA18;
        field105 = 0xFFFFE848 ^ 0xFFFFDA18;
        a = new int[4][3];
    }
}

