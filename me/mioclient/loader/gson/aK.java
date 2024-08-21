/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.util.Map;

final class aK
implements Map.Entry {
    aK a;
    aK b;
    aK c;
    aK d;
    aK e;
    final Object f;
    final int g;
    Object h;
    int i;
    public static final int[][] j;
    private static /* synthetic */ int field132;
    private static /* synthetic */ int field133;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    aK() {
        this.f = null;
        this.g = -1;
        this.d = this.e = this;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    aK(aK aK2, Object object, int n, aK aK3, aK aK4) {
        this.a = aK2;
        this.f = object;
        this.g = n;
        this.i = 1;
        this.d = aK3;
        this.e = aK4;
        aK4.d = this;
        aK3.e = this;
    }

    public Object getKey() {
        return this.f;
    }

    public Object getValue() {
        return this.h;
    }

    public Object setValue(Object object) {
        Object object2 = this.h;
        this.h = object;
        return object2;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry)object;
            return (this.f == null ? entry.getKey() == null : this.f.equals(entry.getKey())) && (this.h == null ? entry.getValue() == null : this.h.equals(entry.getValue()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (this.f == null ? 0 : this.f.hashCode()) ^ (this.h == null ? 0 : this.h.hashCode());
    }

    public String toString() {
        return this.f + "=" + this.h;
    }

    public aK a() {
        aK aK2 = this;
        aK aK3 = aK2.b;
        while (aK3 != null) {
            aK2 = aK3;
            aK3 = aK2.b;
        }
        return aK2;
    }

    public aK b() {
        aK aK2 = this;
        aK aK3 = aK2.c;
        while (aK3 != null) {
            aK2 = aK3;
            aK3 = aK2.c;
        }
        return aK2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field132 = 0xD69 ^ 0xFFFFB7C3;
        field133 = 0xFFFFCB0A ^ 0xFFFFB7C3;
        j = new int[2][1];
    }
}

