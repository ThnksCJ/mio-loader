/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.lang.reflect.Array;
import java.util.ArrayList;
import me.mioclient.loader.gson.GSONBuilder;
import me.mioclient.loader.gson.JsonReader;
import me.mioclient.loader.gson.JsonToken;
import me.mioclient.loader.gson.T;
import me.mioclient.loader.gson.V;
import me.mioclient.loader.gson.bJ;
import me.mioclient.loader.gson.bf_0;
import me.mioclient.loader.gson.cO;

/*
 * Renamed from me.mioclient.loader.gson.be
 */
public final class be_0
extends T {
    public static final V a;
    private final Class b;
    private final T c;
    public static final int[][] d;
    private static /* synthetic */ int field74;
    private static /* synthetic */ int field75;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public be_0(GSONBuilder gSONBuilder, T t, Class clazz) {
        this.c = new bJ(gSONBuilder, t, clazz);
        this.b = clazz;
    }

    @Override
    public Object b(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.i) {
            jsonReader.j();
            return null;
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            Object object = this.c.b(jsonReader);
            arrayList.add(object);
        }
        jsonReader.endArray();
        int n = arrayList.size();
        Object object = Array.newInstance(this.b, n);
        for (int i = 0; i < n; ++i) {
            Array.set(object, i, arrayList.get(i));
        }
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(cO cO2, Object object) {
        if (object == null) {
            cO2.f();
            return;
        }
        cO2.b();
        int n = Array.getLength(object);
        for (int i = 0; i < n; ++i) {
            Object object2 = Array.get(object, i);
            this.c.a(cO2, object2);
        }
        cO2.c();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field74 = 0x1C52 ^ 0xFFFFB492;
        field75 = 0xFFFF954F ^ 0xFFFFB492;
        d = new int[3][3];
        a = new bf_0();
    }
}

