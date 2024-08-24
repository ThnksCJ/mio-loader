/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.JsonElement;

public final class B
extends JsonElement {
    public static final B a;
    public static final int[][] b;
    private static /* synthetic */ int field28;
    private static /* synthetic */ int field29;

    public B a() {
        return a;
    }

    public int hashCode() {
        return B.class.hashCode();
    }

    public boolean equals(Object object) {
        return this == object || object instanceof B;
    }

    @Override
    public /* synthetic */ JsonElement p() {
        return this.a();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field28 = 0x78A3 ^ 0xFFFF8E6B;
        field29 = 0xFFFFFC09 ^ 0xFFFF8E6B;
        b = new int[2][1];
        a = new B();
    }
}

