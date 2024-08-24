/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.eI;
import java.util.Iterator;

final class eH
implements Iterable {
    final /* synthetic */ String a;
    public static final int[][] b;
    private static /* synthetic */ int field32;
    private static /* synthetic */ int field33;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    eH(String string) {
        this.a = string;
    }

    public Iterator iterator() {
        return new eI(this);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field32 = 0x65A8 ^ 0xFFFFD4D4;
        field33 = 0xFFFF94B5 ^ 0xFFFFD4D4;
        b = new int[2][4];
    }
}

