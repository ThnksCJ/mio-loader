/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.Gson;
import com.google.gson.T;
import com.google.gson.V;
import com.google.gson.ac_0;
import com.google.gson.be_0;
import com.google.gson.cJ;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/*
 * Renamed from com.google.gson.bf
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
    public T a(Gson gson, cJ cJ2) {
        Type type = cJ2.b();
        if (!(type instanceof GenericArrayType || type instanceof Class && ((Class)type).isArray())) {
            return null;
        }
        Type type2 = ac_0.g(type);
        T t = gson.a(cJ.b(type2));
        return new be_0(gson, t, ac_0.e(type2));
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

