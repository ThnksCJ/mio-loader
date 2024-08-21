/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;
import me.mioclient.loader.gson.JsonReader;
import me.mioclient.loader.gson.T;
import me.mioclient.loader.gson.cO;

class bM
extends T {
    public static final int[][] a;
    private static /* synthetic */ int field74;
    private static /* synthetic */ int field75;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    bM() {
    }

    public AtomicIntegerArray a(JsonReader jsonReader) {
        int n;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            n = jsonReader.m();
            arrayList.add(n);
        }
        jsonReader.endArray();
        n = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(n);
        for (int i = 0; i < n; ++i) {
            atomicIntegerArray.set(i, (Integer)arrayList.get(i));
        }
        return atomicIntegerArray;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(cO cO2, AtomicIntegerArray atomicIntegerArray) {
        cO2.b();
        int n = atomicIntegerArray.length();
        for (int i = 0; i < n; ++i) {
            cO2.a((long)atomicIntegerArray.get(i));
        }
        cO2.c();
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
        field74 = 0x1077 ^ 0xFFFFF998;
        field75 = 0xFFFFF1EB ^ 0xFFFFF998;
        a = new int[1][1];
    }
}

