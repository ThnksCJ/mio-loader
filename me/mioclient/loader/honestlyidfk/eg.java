/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.honestlyidfk;

import me.mioclient.loader.honestlyidfk.eb;
import me.mioclient.loader.honestlyidfk.ec;
import me.mioclient.loader.honestlyidfk.ej;

class eg
extends eb {
    private final double b;
    public static final int[][] a;
    private static /* synthetic */ int field312;
    private static /* synthetic */ int field313;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private eg(double d2) {
        super(ej.c, null);
        this.b = d2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    /* synthetic */ eg(double d2, ec ec2) {
        this(d2);
    }

    static /* synthetic */ double a(eg eg2) {
        return eg2.b;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field312 = 0x2E06 ^ 0xFFFFF4A1;
        field313 = 0xFFFFB827 ^ 0xFFFFF4A1;
        a = new int[3][1];
    }
}

