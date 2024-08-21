/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.honestlyidfk;

import me.mioclient.loader.honestlyidfk.eb;
import me.mioclient.loader.honestlyidfk.ec;
import me.mioclient.loader.honestlyidfk.ej;

class ed
extends eb {
    private final boolean b;
    public static final int[][] a;
    private static /* synthetic */ int field312;
    private static /* synthetic */ int field313;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private ed(boolean bl2) {
        super(ej.b, null);
        this.b = bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    /* synthetic */ ed(boolean bl2, ec ec2) {
        this(bl2);
    }

    static /* synthetic */ boolean a(ed ed2) {
        return ed2.b;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field312 = 0xFE7 ^ 0xFFFFEBD4;
        field313 = 0xFFFFCD14 ^ 0xFFFFEBD4;
        a = new int[3][2];
    }
}

