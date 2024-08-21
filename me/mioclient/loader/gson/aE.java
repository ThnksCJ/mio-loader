/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import me.mioclient.loader.gson.aK;

class aE {
    private aK a;
    public static final int[][] b;
    private static /* synthetic */ int field122;
    private static /* synthetic */ int field123;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    aE() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    void a(aK aK2) {
        aK aK3 = null;
        aK aK4 = aK2;
        while (aK4 != null) {
            aK4.a = aK3;
            aK3 = aK4;
            aK4 = aK4.b;
        }
        this.a = aK3;
    }

    public aK a() {
        aK aK2 = this.a;
        if (aK2 == null) {
            return null;
        }
        aK aK3 = aK2;
        aK2 = aK3.a;
        aK3.a = null;
        aK aK4 = aK3.c;
        while (aK4 != null) {
            aK4.a = aK2;
            aK2 = aK4;
            aK4 = aK4.b;
        }
        this.a = aK2;
        return aK3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field122 = 0x7BE9 ^ 0xFFFFE8EE;
        field123 = 0xFFFFFFB3 ^ 0xFFFFE8EE;
        b = new int[1][4];
    }
}

