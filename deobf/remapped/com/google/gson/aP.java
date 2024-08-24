/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.aL;
import com.google.gson.aQ;
import java.util.AbstractSet;
import java.util.Iterator;

final class aP
extends AbstractSet {
    final /* synthetic */ aL a;
    public static final int[][] b;
    private static /* synthetic */ int field126;
    private static /* synthetic */ int field127;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    aP(aL aL2) {
        this.a = aL2;
    }

    @Override
    public int size() {
        return this.a.c;
    }

    @Override
    public Iterator iterator() {
        return new aQ(this);
    }

    @Override
    public boolean contains(Object object) {
        return this.a.containsKey(object);
    }

    @Override
    public boolean remove(Object object) {
        return this.a.b(object) != null;
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
        field126 = 0x462F ^ 0xFFFFAD7B;
        field127 = 0xFFFFA16C ^ 0xFFFFAD7B;
        b = new int[2][3];
    }
}

