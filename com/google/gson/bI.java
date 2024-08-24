/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.Gson;
import com.google.gson.H;
import com.google.gson.T;
import com.google.gson.V;
import com.google.gson.ab_0;
import com.google.gson.bF;
import com.google.gson.cJ;
import com.google.gson.y_0;

final class bI
implements V {
    private final cJ a;
    private final boolean b;
    private final Class c;
    private final H d;
    private final y_0 e;
    public static final int[][] f;
    private static /* synthetic */ int field98;
    private static /* synthetic */ int field99;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    bI(Object object, cJ cJ2, boolean bl, Class clazz) {
        this.d = object instanceof H ? (H)object : null;
        this.e = object instanceof y_0 ? (y_0)object : null;
        ab_0.a(this.d != null || this.e != null);
        this.a = cJ2;
        this.b = bl;
        this.c = clazz;
    }

    @Override
    public T a(Gson gson, cJ cJ2) {
        boolean bl = this.a != null ? this.a.equals(cJ2) || this.b && this.a.b() == cJ2.a() : this.c.isAssignableFrom(cJ2.a());
        return bl ? new bF(this.d, this.e, gson, cJ2, this) : null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field98 = 0x20F8 ^ 0xFFFFB8EE;
        field99 = 0xFFFFF87E ^ 0xFFFFB8EE;
        f = new int[4][4];
    }
}

