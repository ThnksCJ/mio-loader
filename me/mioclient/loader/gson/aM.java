/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.util.Comparator;

class aM
implements Comparator {
    public static final int[][] a;
    private static /* synthetic */ int field118;
    private static /* synthetic */ int field119;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    aM() {
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
        field118 = 0x16BA ^ 0xFFFFCD3C;
        field119 = 0xFFFFBCE8 ^ 0xFFFFCD3C;
        a = new int[3][4];
    }
}

