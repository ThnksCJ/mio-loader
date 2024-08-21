/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.discordipc;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import me.mioclient.loader.discordipc.dg;
import me.mioclient.loader.gson.C;

public record dh(dg a, C b) {
    public static final int[][] c;
    private static /* synthetic */ int field274;
    private static /* synthetic */ int field275;

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dh.class, "opcode;data", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dh.class, "opcode;data", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dh.class, "opcode;data", "a", "b"}, this, object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field274 = 0x6BED ^ 0xFFFFBF3D;
        field275 = 0xFFFF9CD0 ^ 0xFFFFBF3D;
        c = new int[3][3];
    }
}

