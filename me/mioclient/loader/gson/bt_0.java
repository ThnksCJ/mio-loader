/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.lang.reflect.Type;
import java.util.Map;
import me.mioclient.loader.gson.GSONBuilder;
import me.mioclient.loader.gson.T;
import me.mioclient.loader.gson.V;
import me.mioclient.loader.gson.aT;
import me.mioclient.loader.gson.ac_0;
import me.mioclient.loader.gson.ag_0;
import me.mioclient.loader.gson.bK;
import me.mioclient.loader.gson.bu_0;
import me.mioclient.loader.gson.cJ;

/*
 * Renamed from me.mioclient.loader.gson.bt
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
    public T a(GSONBuilder gSONBuilder, cJ cJ2) {
        Type type = cJ2.b();
        Class clazz = cJ2.a();
        if (!Map.class.isAssignableFrom(clazz)) {
            return null;
        }
        Class clazz2 = ac_0.e(type);
        Type[] typeArray = ac_0.b(type, clazz2);
        T t = this.a(gSONBuilder, typeArray[0]);
        T t2 = gSONBuilder.a(cJ.b(typeArray[1]));
        aT aT2 = this.b.a(cJ2);
        bu_0 bu_02 = new bu_0(this, gSONBuilder, typeArray[0], t, typeArray[1], t2, aT2);
        return bu_02;
    }

    private T a(GSONBuilder gSONBuilder, Type type) {
        return type == Boolean.TYPE || type == Boolean.class ? bK.f : gSONBuilder.a(cJ.b(type));
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

