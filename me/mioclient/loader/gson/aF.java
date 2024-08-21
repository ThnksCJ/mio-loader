/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import me.mioclient.loader.gson.aB;
import me.mioclient.loader.gson.aG;
import me.mioclient.loader.gson.aK;

final class aF
extends AbstractSet {
    final /* synthetic */ aB a;
    public static final int[][] b;
    private static /* synthetic */ int field124;
    private static /* synthetic */ int field125;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    aF(aB aB2) {
        this.a = aB2;
    }

    @Override
    public int size() {
        return this.a.d;
    }

    @Override
    public Iterator iterator() {
        return new aG(this);
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
        aK aK2 = this.a.a((Map.Entry)object);
        if (aK2 == null) {
            return false;
        }
        this.a.a(aK2, true);
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
        field124 = 0x258A ^ 0xFFFF9E3A;
        field125 = 0xFFFFBA2F ^ 0xFFFF9E3A;
        b = new int[1][2];
    }
}

