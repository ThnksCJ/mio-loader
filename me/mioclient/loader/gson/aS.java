/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.util.Map;

final class aS
implements Map.Entry {
    aS a;
    aS b;
    aS c;
    aS d;
    aS e;
    final Object f;
    Object g;
    int h;
    public static final int[][] i;
    private static /* synthetic */ int field134;
    private static /* synthetic */ int field135;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    aS() {
        this.f = null;
        this.d = this.e = this;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    aS(aS aS2, Object object, aS aS3, aS aS4) {
        this.a = aS2;
        this.f = object;
        this.h = 1;
        this.d = aS3;
        this.e = aS4;
        aS4.d = this;
        aS3.e = this;
    }

    public Object getKey() {
        return this.f;
    }

    public Object getValue() {
        return this.g;
    }

    public Object setValue(Object object) {
        Object object2 = this.g;
        this.g = object;
        return object2;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry)object;
            return (this.f == null ? entry.getKey() == null : this.f.equals(entry.getKey())) && (this.g == null ? entry.getValue() == null : this.g.equals(entry.getValue()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (this.f == null ? 0 : this.f.hashCode()) ^ (this.g == null ? 0 : this.g.hashCode());
    }

    public String toString() {
        return this.f + "=" + this.g;
    }

    public aS a() {
        aS aS2 = this;
        aS aS3 = aS2.b;
        while (aS3 != null) {
            aS2 = aS3;
            aS3 = aS2.b;
        }
        return aS2;
    }

    public aS b() {
        aS aS2 = this;
        aS aS3 = aS2.c;
        while (aS3 != null) {
            aS2 = aS3;
            aS3 = aS2.c;
        }
        return aS2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field134 = 0x5819 ^ 0xFFFFA536;
        field135 = 0xFFFFC775 ^ 0xFFFFA536;
        i = new int[4][3];
    }
}

