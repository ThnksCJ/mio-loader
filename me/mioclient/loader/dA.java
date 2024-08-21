/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader;

import java.util.function.Consumer;
import me.mioclient.loader.dO;
import me.mioclient.loader.dV;
import me.mioclient.loader.honestlyidfk.dz_0;

public class dA
extends dz_0 {
    public final dz_0 c;
    public final dV d;
    public final dz_0 e;
    public static final int[][] a;
    private static /* synthetic */ int field242;
    private static /* synthetic */ int field243;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public dA(int n, int n2, dz_0 dz_02, dV dV2, dz_0 dz_03) {
        super(n, n2);
        this.c = dz_02;
        this.d = dV2;
        this.e = dz_03;
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
        consumer.accept(this.e);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field242 = 0x44CF ^ 0xFFFFE363;
        field243 = 0xFFFFA3C5 ^ 0xFFFFE363;
        a = new int[3][4];
    }
}

