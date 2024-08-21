/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import me.mioclient.loader.gson.JsonReader;
import me.mioclient.loader.gson.T;
import me.mioclient.loader.gson.cO;

/*
 * Renamed from me.mioclient.loader.gson.s
 */
class s_0
extends T {
    private T a;
    public static final int[][] b;
    private static /* synthetic */ int field74;
    private static /* synthetic */ int field75;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    s_0() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(T t) {
        if (this.a != null) {
            throw new AssertionError();
        }
        this.a = t;
    }

    @Override
    public Object b(JsonReader jsonReader) {
        if (this.a == null) {
            throw new IllegalStateException();
        }
        return this.a.b(jsonReader);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(cO cO2, Object object) {
        if (this.a == null) {
            throw new IllegalStateException();
        }
        this.a.a(cO2, object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field74 = 0x72C8 ^ 0xFFFFAF9A;
        field75 = 0xFFFF847C ^ 0xFFFFAF9A;
        b = new int[2][4];
    }
}

