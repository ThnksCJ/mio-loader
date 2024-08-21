/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.io.StringWriter;
import me.mioclient.loader.gson.eE;

public class eC
extends eE {
    private static final long k;
    public static final int[][] a;
    private static /* synthetic */ int field300;
    private static /* synthetic */ int field301;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public eC() {
        super(new StringWriter());
    }

    public String toString() {
        return ((eE)this).a == (int)k ? this.b.toString() : null;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        field300 = 0xDB2 ^ 0xFFFFFD01;
        field301 = 0xFFFFBDCE ^ 0xFFFFFD01;
        a = new int[3][2];
        long l = 4239170123326352730L;
        k = 0xBFE052D15F50ED3EL ^ l;
    }
}

