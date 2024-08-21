/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.honestlyidfk;

import me.mioclient.loader.honestlyidfk.ej;

class ec {
    static final /* synthetic */ int[] a;
    public static final int[][] b;
    private static /* synthetic */ int field314;
    private static /* synthetic */ int field315;

    /*
     * Enabled aggressive block sorting
     */
    static {
        field314 = 0x621C ^ 0xFFFFE485;
        field315 = 0xFFFFF21D ^ 0xFFFFE485;
        b = new int[3][3];
        long l = 7772425431356034875L;
        long l2 = 0x360EF5E3EF304F3DL ^ l;
        a = new int[ej.a().length];
        ec.a[ej.a.ordinal()] = 1;
        ec.a[ej.b.ordinal()] = 2;
        ec.a[ej.c.ordinal()] = 3;
        ec.a[ej.d.ordinal()] = 4;
        ec.a[ej.e.ordinal()] = 5;
        ec.a[ej.f.ordinal()] = (int)l2;
    }
}

