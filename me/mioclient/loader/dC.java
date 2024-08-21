/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader;

import me.mioclient.loader.dO;
import me.mioclient.loader.honestlyidfk.dz_0;

public class dC
extends dz_0 {
    public final boolean c;
    public static final int[][] a;
    private static /* synthetic */ int field244;
    private static /* synthetic */ int field245;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public dC(int n, int n2, boolean bl) {
        super(n, n2);
        this.c = bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(dO dO2) {
        dO2.a(this);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field244 = 0x5E40 ^ 0xFFFFB751;
        field245 = 0xFFFFDC0A ^ 0xFFFFB751;
        a = new int[2][4];
    }
}

