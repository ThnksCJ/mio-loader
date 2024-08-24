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
import com.google.gson.bK;
import com.google.gson.bu_0;
import com.google.gson.cJ;
import java.lang.reflect.Type;
import java.util.Map;

/*
 * Renamed from com.google.gson.bt
 */
public final class bt_0
implements V {
    private final ag_0 b;
    final boolean a;
    public static final int[][] c;
    private static /* synthetic */ int field78;
    private static /* synthetic */ int field79;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public bt_0(ag_0 ag_02, boolean bl2) {
        this.b = ag_02;
        this.a = bl2;
    }

    @Override
    public T a(Gson gson, cJ cJ2) {
        Type type = cJ2.b();
        Class clazz = cJ2.a();
        if (!Map.class.isAssignableFrom(clazz)) {
            return null;
        }
        Class clazz2 = ac_0.e(type);
        Type[] typeArray = ac_0.b(type, clazz2);
        T t = this.a(gson, typeArray[0]);
        T t2 = gson.a(cJ.b(typeArray[1]));
        aT aT2 = this.b.a(cJ2);
        bu_0 bu_02 = new bu_0(this, gson, typeArray[0], t, typeArray[1], t2, aT2);
        return bu_02;
    }

    private T a(Gson gson, Type type) {
        return type == Boolean.TYPE || type == Boolean.class ? bK.f : gson.a(cJ.b(type));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field78 = 0x735B ^ 0xFFFFA140;
        field79 = 0xFFFFAEF2 ^ 0xFFFFA140;
        c = new int[1][1];
    }
}

