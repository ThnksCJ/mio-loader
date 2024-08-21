/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.honestlyidfk;

public class ea
extends RuntimeException {
    public static final int[][] a;
    private static /* synthetic */ int field18;
    private static /* synthetic */ int field19;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public ea(String string) {
        super(string);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field18 = 0x63CA ^ 0xFFFFC52B;
        field19 = 0xFFFF95AF ^ 0xFFFFC52B;
        a = new int[2][1];
    }
}

