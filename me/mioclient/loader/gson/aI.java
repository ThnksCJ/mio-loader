/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import me.mioclient.loader.gson.aH;
import me.mioclient.loader.gson.aJ;

class aI
extends aJ {
    final /* synthetic */ aH a;
    public static final int[][] b;
    private static /* synthetic */ int field50;
    private static /* synthetic */ int field51;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    aI(aH aH2) {
        this.a = aH2;
        super(aH2.a);
    }

    public Object next() {
        return this.b().f;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field50 = 0x775A ^ 0xFFFFE181;
        field51 = 0xFFFFE138 ^ 0xFFFFE181;
        b = new int[2][4];
    }
}

