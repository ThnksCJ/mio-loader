/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.aB;
import com.google.gson.aK;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class aJ
implements Iterator {
    aK b;
    aK c;
    int d;
    final /* synthetic */ aB e;
    public static final int[][] a;
    private static /* synthetic */ int field50;
    private static /* synthetic */ int field51;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    aJ(aB aB2) {
        this.e = aB2;
        this.b = this.e.c.d;
        this.c = null;
        this.d = this.e.e;
    }

    @Override
    public final boolean hasNext() {
        return this.b != this.e.c;
    }

    final aK b() {
        aK aK2 = this.b;
        if (aK2 == this.e.c) {
            throw new NoSuchElementException();
        }
        if (this.e.e != this.d) {
            throw new ConcurrentModificationException();
        }
        this.b = aK2.d;
        this.c = aK2;
        return this.c;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void remove() {
        if (this.c == null) {
            throw new IllegalStateException();
        }
        this.e.a(this.c, true);
        this.c = null;
        this.d = this.e.e;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field50 = 0x46E5 ^ 0xFFFFC7AA;
        field51 = 0xFFFFCD28 ^ 0xFFFFC7AA;
        a = new int[4][3];
    }
}

