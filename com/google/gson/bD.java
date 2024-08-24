/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.JsonReader;
import com.google.gson.JsonToken;
import com.google.gson.T;
import com.google.gson.aT;
import com.google.gson.bE;
import com.google.gson.cO;
import java.util.Map;

public final class bD
extends T {
    private final aT a;
    private final Map b;
    public static final int[][] c;
    private static /* synthetic */ int field74;
    private static /* synthetic */ int field75;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    bD(aT aT2, Map map) {
        this.a = aT2;
        this.b = map;
    }

    @Override
    public Object b(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.i) {
            jsonReader.j();
            return null;
        }
        Object object = this.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String string = jsonReader.g();
            bE bE2 = (bE)this.b.get(string);
            if (bE2 == null || !bE2.j) {
                jsonReader.o();
                continue;
            }
            bE2.a(jsonReader, object);
        }
        jsonReader.endObject();
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
        cO2.d();
        for (bE bE2 : this.b.values()) {
            if (!bE2.a(object)) continue;
            cO2.a(bE2.h);
            bE2.a(cO2, object);
        }
        cO2.e();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field74 = 0x343A ^ 0xFFFFF818;
        field75 = 0xFFFF9D54 ^ 0xFFFFF818;
        c = new int[1][4];
    }
}

