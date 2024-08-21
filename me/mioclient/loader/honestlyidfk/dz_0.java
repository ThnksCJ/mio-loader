/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.honestlyidfk;

import java.util.function.Consumer;
import me.mioclient.loader.dO;

/*
 * Renamed from me.mioclient.loader.honestlyidfk.dz
 */
public abstract class dz_0 {
    public final int a;
    public final int b;
    public static final int[][] c;
    private static /* synthetic */ int field244;
    private static /* synthetic */ int field245;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public dz_0(int n, int n2) {
        this.a = n;
        this.b = n2;
    }

    public abstract void a(dO var1);

    public String a(String string) {
        return string.substring(this.a, this.b);
    }

    public void a(Consumer consumer) {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field244 = 0x6F10 ^ 0xFFFF92F8;
        field245 = 0xFFFF8F13 ^ 0xFFFF92F8;
        c = new int[3][2];
    }
}

