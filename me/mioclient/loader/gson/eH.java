/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.util.Iterator;
import me.mioclient.loader.gson.eI;

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

