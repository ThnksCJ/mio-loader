/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.aP;
import com.google.gson.aR;

class aQ
extends aR {
    final /* synthetic */ aP a;
    public static final int[][] b;
    private static /* synthetic */ int field46;
    private static /* synthetic */ int field47;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    aQ(aP aP2) {
        this.a = aP2;
        super(aP2.a);
    }

    public Object next() {
        return this.b().f;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field46 = 0x2CF6 ^ 0xFFFFAA84;
        field47 = 0xFFFFA950 ^ 0xFFFFAA84;
        b = new int[2][2];
    }
}

