/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.ay_0;
import com.google.gson.cx;
import com.google.gson.cz;
import java.lang.reflect.AccessibleObject;

public abstract class cy {
    private static final cy a;
    public static final int[][] b;
    private static /* synthetic */ int field240;
    private static /* synthetic */ int field241;

    public abstract void a(AccessibleObject var1);

    public static cy a() {
        return a;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        field240 = 0x7E79 ^ 0xFFFFFC19;
        field241 = 0xFFFFB972 ^ 0xFFFFFC19;
        b = new int[3][1];
        long l = 3832690249229879163L;
        long l2 = 0x7B0F1B00A7734772L ^ l;
        a = ay_0.a() < (int)l2 ? new cx() : new cz();
    }
}

