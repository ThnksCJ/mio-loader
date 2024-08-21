/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import me.mioclient.loader.gson.aL;
import me.mioclient.loader.gson.aS;

abstract class aR
implements Iterator {
    aS b;
    aS c;
    int d;
    final /* synthetic */ aL e;
    public static final int[][] a;
    private static /* synthetic */ int field46;
    private static /* synthetic */ int field47;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    aR(aL aL2) {
        this.e = aL2;
        this.b = this.e.e.d;
        this.c = null;
        this.d = this.e.d;
    }

    @Override
    public final boolean hasNext() {
        return this.b != this.e.e;
    }

    final aS b() {
        aS aS2 = this.b;
        if (aS2 == this.e.e) {
            throw new NoSuchElementException();
        }
        if (this.e.d != this.d) {
            throw new ConcurrentModificationException();
        }
        this.b = aS2.d;
        this.c = aS2;
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
        this.d = this.e.d;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field46 = 0x6DD3 ^ 0xFFFFD971;
        field47 = 0xFFFFC750 ^ 0xFFFFD971;
        a = new int[2][3];
    }
}

