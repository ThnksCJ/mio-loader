/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader;

import java.util.function.Consumer;
import me.mioclient.loader.dO;
import me.mioclient.loader.honestlyidfk.dz_0;

public class dE
extends dz_0 {
    public final dz_0 c;
    public final dz_0 d;
    public final dz_0 e;
    public static final int[][] a;
    private static /* synthetic */ int field244;
    private static /* synthetic */ int field245;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public dE(int n, int n2, dz_0 dz_02, dz_0 dz_03, dz_0 dz_04) {
        super(n, n2);
        this.c = dz_02;
        this.d = dz_03;
        this.e = dz_04;
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
        consumer.accept(this.d);
        consumer.accept(this.e);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field244 = 0x51A4 ^ 0xFFFF939F;
        field245 = 0xFFFFBCD9 ^ 0xFFFF939F;
        a = new int[1][1];
    }
}

