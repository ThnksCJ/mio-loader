/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package deobf.remapped.meteordevelopment.discordipc.connection;

import deobf.remapped.meteordevelopment.discordipc.connection.UnixConnection$State;

class UnixConnection$1 {
    static final /* synthetic */ int[] a;
    public static final int[][] b;
    private static /* synthetic */ int field284;
    private static /* synthetic */ int field285;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field284 = 0x6E57 ^ 0xFFFF9138;
        field285 = 0xFFFFDE47 ^ 0xFFFF9138;
        b = new int[3][2];
        a = new int[UnixConnection$State.a().length];
        UnixConnection$1.a[UnixConnection$State.a.ordinal()] = 1;
        UnixConnection$1.a[UnixConnection$State.b.ordinal()] = 2;
        UnixConnection$1.a[UnixConnection$State.c.ordinal()] = 3;
    }
}

