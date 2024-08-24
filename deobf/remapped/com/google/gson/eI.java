/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.eH;
import java.util.Iterator;

class eI
implements Iterator {
    private int b = 0;
    private int c;
    final /* synthetic */ eH a;
    public static final int[][] d;
    private static /* synthetic */ int field48;
    private static /* synthetic */ int field49;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    eI(eH eH2) {
        this.a = eH2;
        this.c = this.a.a.length();
    }

    @Override
    public boolean hasNext() {
        return this.b < this.c;
    }

    public Integer a() {
        int n = this.a.a.codePointAt(this.b);
        this.b += Character.charCount(n);
        return n;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ Object next() {
        return this.a();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field48 = 0x74BD ^ 0xFFFFB352;
        field49 = 0xFFFFD808 ^ 0xFFFFB352;
        d = new int[4][2];
    }
}

