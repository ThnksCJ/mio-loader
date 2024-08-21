/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader;

import java.util.function.Consumer;
import me.mioclient.loader.dO;
import me.mioclient.loader.honestlyidfk.dz_0;

public class dK
extends dz_0 {
    public final int c;
    public final dz_0 d;
    public static final int[][] a;
    private static /* synthetic */ int field244;
    private static /* synthetic */ int field245;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public dK(int n, int n2, int n3, dz_0 dz_02) {
        super(n, n2);
        this.c = n3;
        this.d = dz_02;
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
        consumer.accept(this.d);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field244 = 0x4021 ^ 0xFFFFD318;
        field245 = 0xFFFF82D6 ^ 0xFFFFD318;
        a = new int[2][1];
    }
}

