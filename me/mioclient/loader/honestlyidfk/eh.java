/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.honestlyidfk;

import me.mioclient.loader.honestlyidfk.eb;
import me.mioclient.loader.honestlyidfk.ec;
import me.mioclient.loader.honestlyidfk.ej;

class eh
extends eb {
    private final String b;
    public static final int[][] a;
    private static /* synthetic */ int field312;
    private static /* synthetic */ int field313;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private eh(String string) {
        super(ej.d, null);
        this.b = string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    /* synthetic */ eh(String string, ec ec2) {
        this(string);
    }

    static /* synthetic */ String a(eh eh2) {
        return eh2.b;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field312 = 0x7010 ^ 0xFFFFF885;
        field313 = 0xFFFFF291 ^ 0xFFFFF885;
        a = new int[1][4];
    }
}

