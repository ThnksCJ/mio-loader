/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.Gson;
import com.google.gson.T;
import com.google.gson.V;
import com.google.gson.aT;
import com.google.gson.ac_0;
import com.google.gson.ag_0;
import com.google.gson.bh_0;
import com.google.gson.cJ;
import java.lang.reflect.Type;
import java.util.Collection;

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
    public T a(Gson gson, cJ cJ2) {
        Type type = cJ2.b();
        Class clazz = cJ2.a();
        if (!Collection.class.isAssignableFrom(clazz)) {
            return null;
        }
        Type type2 = ac_0.a(type, clazz);
        T t = gson.a(cJ.b(type2));
        aT aT2 = this.a.a(cJ2);
        bh_0 bh_02 = new bh_0(gson, type2, t, aT2);
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

