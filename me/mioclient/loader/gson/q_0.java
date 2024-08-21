/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.util.concurrent.atomic.AtomicLong;
import me.mioclient.loader.gson.JsonReader;
import me.mioclient.loader.gson.T;
import me.mioclient.loader.gson.cO;

/*
 * Renamed from me.mioclient.loader.gson.q
 */
class q_0
extends T {
    final /* synthetic */ T a;
    public static final int[][] b;
    private static /* synthetic */ int field74;
    private static /* synthetic */ int field75;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    q_0(T t) {
        this.a = t;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(cO cO2, AtomicLong atomicLong) {
        this.a.a(cO2, (Object)atomicLong.get());
    }

    public AtomicLong a(JsonReader jsonReader) {
        Number number = (Number)this.a.b(jsonReader);
        return new AtomicLong(number.longValue());
    }

    @Override
    public /* synthetic */ Object b(JsonReader jsonReader) {
        return this.a(jsonReader);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field74 = 0x1710 ^ 0xFFFF892B;
        field75 = 0xFFFF9551 ^ 0xFFFF892B;
        b = new int[2][3];
    }
}

