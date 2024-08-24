/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.JsonReader;
import com.google.gson.T;
import com.google.gson.cO;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

/*
 * Renamed from com.google.gson.r
 */
class r_0
extends T {
    final /* synthetic */ T a;
    public static final int[][] b;
    private static /* synthetic */ int field74;
    private static /* synthetic */ int field75;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    r_0(T t) {
        this.a = t;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(cO cO2, AtomicLongArray atomicLongArray) {
        cO2.b();
        int n = atomicLongArray.length();
        for (int i = 0; i < n; ++i) {
            this.a.a(cO2, (Object)atomicLongArray.get(i));
        }
        cO2.c();
    }

    public AtomicLongArray a(JsonReader jsonReader) {
        ArrayList<Long> arrayList = new ArrayList<Long>();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            long l = ((Number)this.a.b(jsonReader)).longValue();
            arrayList.add(l);
        }
        jsonReader.endArray();
        int n = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(n);
        for (int i = 0; i < n; ++i) {
            atomicLongArray.set(i, (Long)arrayList.get(i));
        }
        return atomicLongArray;
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
        field74 = 0x1DCE ^ 0xFFFFF056;
        field75 = 0xFFFFB418 ^ 0xFFFFF056;
        b = new int[1][3];
    }
}

