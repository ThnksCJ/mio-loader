/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.Gson;
import com.google.gson.T;
import com.google.gson.V;
import com.google.gson.cJ;
import com.google.gson.cu;

/*
 * Renamed from com.google.gson.cf
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
    public T a(Gson gson, cJ cJ2) {
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

