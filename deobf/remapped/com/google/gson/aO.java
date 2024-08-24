/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.aN;
import com.google.gson.aR;
import java.util.Map;

class aO
extends aR {
    final /* synthetic */ aN a;
    public static final int[][] b;
    private static /* synthetic */ int field46;
    private static /* synthetic */ int field47;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    aO(aN aN2) {
        this.a = aN2;
        super(aN2.a);
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
        field46 = 0x5F49 ^ 0xFFFFDA77;
        field47 = 0xFFFFB115 ^ 0xFFFFDA77;
        b = new int[2][1];
    }
}

