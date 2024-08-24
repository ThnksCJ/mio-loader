/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.aL;
import com.google.gson.aO;
import com.google.gson.aS;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

class aN
extends AbstractSet {
    final /* synthetic */ aL a;
    public static final int[][] b;
    private static /* synthetic */ int field128;
    private static /* synthetic */ int field129;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    aN(aL aL2) {
        this.a = aL2;
    }

    @Override
    public int size() {
        return this.a.c;
    }

    @Override
    public Iterator iterator() {
        return new aO(this);
    }

    @Override
    public boolean contains(Object object) {
        return object instanceof Map.Entry && this.a.a((Map.Entry)object) != null;
    }

    @Override
    public boolean remove(Object object) {
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        aS aS2 = this.a.a((Map.Entry)object);
        if (aS2 == null) {
            return false;
        }
        this.a.a(aS2, true);
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void clear() {
        this.a.clear();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field128 = 0x48A9 ^ 0xFFFF9731;
        field129 = 0xFFFFC005 ^ 0xFFFF9731;
        b = new int[1][2];
    }
}

