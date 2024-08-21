/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.util.Date;
import me.mioclient.loader.gson.T;
import me.mioclient.loader.gson.V;
import me.mioclient.loader.gson.bK;
import me.mioclient.loader.gson.bk_0;
import me.mioclient.loader.gson.bn_0;

/*
 * Renamed from me.mioclient.loader.gson.bm
 */
public abstract class bm_0 {
    public static final bm_0 a;
    private final Class b;
    public static final int[][] c;
    private static /* synthetic */ int field208;
    private static /* synthetic */ int field209;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected bm_0(Class clazz) {
        this.b = clazz;
    }

    protected abstract Date a(Date var1);

    private final V a(bk_0 bk_02) {
        return bK.a(this.b, (T)bk_02);
    }

    public final V a(String string) {
        return this.a(new bk_0(this, string, null));
    }

    public final V a(int n) {
        return this.a(new bk_0(this, n, null));
    }

    public final V a(int n, int n2) {
        return this.a(new bk_0(this, n, n2, null));
    }

    public final V a() {
        return this.a(new bk_0(this, 2, 2, null));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field208 = 0x2440 ^ 0xFFFFF4FC;
        field209 = 0xFFFF9AC6 ^ 0xFFFFF4FC;
        c = new int[4][3];
        a = new bn_0(Date.class);
    }
}

