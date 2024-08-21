/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.lang.reflect.Type;
import java.util.Collection;
import me.mioclient.loader.gson.GSONBuilder;
import me.mioclient.loader.gson.JsonReader;
import me.mioclient.loader.gson.JsonToken;
import me.mioclient.loader.gson.T;
import me.mioclient.loader.gson.aT;
import me.mioclient.loader.gson.bJ;
import me.mioclient.loader.gson.cO;

/*
 * Renamed from me.mioclient.loader.gson.bh
 */
final class bh_0
extends T {
    private final T a;
    private final aT b;
    public static final int[][] c;
    private static /* synthetic */ int field74;
    private static /* synthetic */ int field75;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public bh_0(GSONBuilder gSONBuilder, Type type, T t, aT aT2) {
        this.a = new bJ(gSONBuilder, t, type);
        this.b = aT2;
    }

    public Collection a(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.i) {
            jsonReader.j();
            return null;
        }
        Collection collection = (Collection)this.b.a();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            Object object = this.a.b(jsonReader);
            collection.add(object);
        }
        jsonReader.endArray();
        return collection;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(cO cO2, Collection collection) {
        if (collection == null) {
            cO2.f();
            return;
        }
        cO2.b();
        for (Object e2 : collection) {
            this.a.a(cO2, e2);
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
        field74 = 0x5DAD ^ 0xFFFFE450;
        field75 = 0xFFFFDD8C ^ 0xFFFFE450;
        c = new int[3][4];
    }
}

