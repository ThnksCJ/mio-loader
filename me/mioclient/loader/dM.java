/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader;

import java.util.function.Consumer;
import me.mioclient.loader.dO;
import me.mioclient.loader.dV;
import me.mioclient.loader.honestlyidfk.dz_0;

public class dM
extends dz_0 {
    public final dV c;
    public final dz_0 d;
    public static final int[][] a;
    private static /* synthetic */ int field244;
    private static /* synthetic */ int field245;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public dM(int n, int n2, dV dV2, dz_0 dz_02) {
        super(n, n2);
        this.c = dV2;
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
        field244 = 0x47D9 ^ 0xFFFFC13D;
        field245 = 0xFFFFD31E ^ 0xFFFFC13D;
        a = new int[1][2];
    }
}

