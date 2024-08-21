/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.honestlyidfk;

import java.util.ArrayList;
import java.util.List;

public class dT {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public static final int[][] c;
    private static /* synthetic */ int field254;
    private static /* synthetic */ int field255;

    public boolean a() {
        return this.b.size() > 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field254 = 0x6A39 ^ 0xFFFF9AE5;
        field255 = 0xFFFFDFDF ^ 0xFFFF9AE5;
        c = new int[4][3];
    }
}

