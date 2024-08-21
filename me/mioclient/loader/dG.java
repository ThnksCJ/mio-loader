/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader;

import java.util.function.Consumer;
import me.mioclient.loader.dO;
import me.mioclient.loader.honestlyidfk.dz_0;

public class dG
extends dz_0 {
    public final dz_0 c;
    public static final int[][] a;
    private static /* synthetic */ int field244;
    private static /* synthetic */ int field245;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public dG(int n, int n2, dz_0 dz_02) {
        super(n, n2);
        this.c = dz_02;
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
    @Override
    public void a(Consumer consumer) {
        consumer.accept(this.c);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field244 = 0x3B47 ^ 0xFFFF898C;
        field245 = 0xFFFF9F14 ^ 0xFFFF898C;
        a = new int[1][3];
    }
}

