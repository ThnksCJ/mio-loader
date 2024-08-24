/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import java.io.IOException;

public final class cP
extends IOException {
    private static final long a;
    public static final int[][] b;
    private static /* synthetic */ int field220;
    private static /* synthetic */ int field221;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public cP(String string) {
        super(string);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public cP(String string, Throwable throwable) {
        super(string);
        this.initCause(throwable);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public cP(Throwable throwable) {
        this.initCause(throwable);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field220 = 0x2725 ^ 0xFFFFC333;
        field221 = 0xFFFF960A ^ 0xFFFFC333;
        b = new int[2][1];
        a = 1L;
    }
}

