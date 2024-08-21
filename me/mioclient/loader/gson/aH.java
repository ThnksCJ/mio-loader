/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.util.AbstractSet;
import java.util.Iterator;
import me.mioclient.loader.gson.aB;
import me.mioclient.loader.gson.aI;

final class aH
extends AbstractSet {
    final /* synthetic */ aB a;
    public static final int[][] b;
    private static /* synthetic */ int field130;
    private static /* synthetic */ int field131;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    aH(aB aB2) {
        this.a = aB2;
    }

    @Override
    public int size() {
        return this.a.d;
    }

    @Override
    public Iterator iterator() {
        return new aI(this);
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
        field130 = 0x674A ^ 0xFFFFDEDA;
        field131 = 0xFFFF8F02 ^ 0xFFFFDEDA;
        b = new int[4][1];
    }
}

