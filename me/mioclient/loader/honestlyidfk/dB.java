/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.honestlyidfk;

import java.util.function.Consumer;
import me.mioclient.loader.dO;
import me.mioclient.loader.honestlyidfk.dz_0;

public class dB
extends dz_0 {
    public final dz_0 c;
    public static final int[][] a;
    private static /* synthetic */ int field244;
    private static /* synthetic */ int field245;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public dB(int n, int n2, dz_0 dz_02) {
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
        if (this.c == null) {
            return;
        }
        consumer.accept(this.c);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field244 = 0x185 ^ 0xFFFFAD55;
        field245 = 0xFFFFFDE8 ^ 0xFFFFAD55;
        a = new int[1][3];
    }
}

