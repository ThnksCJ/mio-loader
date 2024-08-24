/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.cu;
import java.lang.reflect.Field;
import java.security.PrivilegedAction;

class cv
implements PrivilegedAction {
    final /* synthetic */ Field a;
    final /* synthetic */ cu b;
    public static final int[][] c;
    private static /* synthetic */ int field234;
    private static /* synthetic */ int field235;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    cv(cu cu2, Field field) {
        this.b = cu2;
        this.a = field;
    }

    public Void a() {
        this.a.setAccessible(true);
        return null;
    }

    public /* synthetic */ Object run() {
        return this.a();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field234 = 0x95E ^ 0xFFFFDC1F;
        field235 = 0xFFFFD085 ^ 0xFFFFDC1F;
        c = new int[1][4];
    }
}

