/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.cy;
import java.lang.reflect.AccessibleObject;

final class cx
extends cy {
    public static final int[][] a;
    private static /* synthetic */ int field238;
    private static /* synthetic */ int field239;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    cx() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(AccessibleObject accessibleObject) {
        accessibleObject.setAccessible(true);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field238 = 0x379C ^ 0xFFFFA601;
        field239 = 0xFFFF9DAC ^ 0xFFFFA601;
        a = new int[3][1];
    }
}

