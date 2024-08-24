/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.JsonReader;
import com.google.gson.T;
import com.google.gson.cO;
import java.util.concurrent.atomic.AtomicLong;

/*
 * Renamed from com.google.gson.q
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

