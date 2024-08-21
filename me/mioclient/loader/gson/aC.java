/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.util.Comparator;

class aC
implements Comparator {
    public static final int[][] a;
    private static /* synthetic */ int field116;
    private static /* synthetic */ int field117;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    aC() {
    }

    public int a(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((Comparable)object, (Comparable)object2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field116 = 0x42BD ^ 0xFFFF85A6;
        field117 = 0xFFFFFB9C ^ 0xFFFF85A6;
        a = new int[4][4];
    }
}

