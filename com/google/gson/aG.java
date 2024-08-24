/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.aF;
import com.google.gson.aJ;
import java.util.Map;

class aG
extends aJ {
    final /* synthetic */ aF a;
    public static final int[][] b;
    private static /* synthetic */ int field50;
    private static /* synthetic */ int field51;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    aG(aF aF2) {
        this.a = aF2;
        super(aF2.a);
    }

    public Map.Entry a() {
        return this.b();
    }

    public /* synthetic */ Object next() {
        return this.a();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field50 = 0x2A47 ^ 0xFFFFD3B8;
        field51 = 0xFFFFCA5D ^ 0xFFFFD3B8;
        b = new int[2][1];
    }
}

