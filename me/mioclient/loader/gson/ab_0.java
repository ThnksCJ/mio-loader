/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

/*
 * Renamed from me.mioclient.loader.gson.ab
 */
public final class ab_0 {
    public static final int[][] a;
    private static /* synthetic */ int field182;
    private static /* synthetic */ int field183;

    private ab_0() {
        throw new UnsupportedOperationException();
    }

    public static Object a(Object object) {
        if (object == null) {
            throw new NullPointerException();
        }
        return object;
    }

    public static void a(boolean bl) {
        if (bl) {
            return;
        }
        throw new IllegalArgumentException();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field182 = 0x7CC8 ^ 0xFFFF8ED8;
        field183 = 0xFFFF86C7 ^ 0xFFFF8ED8;
        a = new int[2][4];
    }
}

