/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.Gson;
import com.google.gson.JsonReader;
import com.google.gson.JsonToken;
import com.google.gson.N;
import com.google.gson.S;
import com.google.gson.T;
import com.google.gson.V;
import com.google.gson.aL;
import com.google.gson.bA;
import com.google.gson.bz_0;
import com.google.gson.cO;
import java.util.ArrayList;

/*
 * Renamed from com.google.gson.by
 */
public final class by_0
extends T {
    private static final V a;
    private final Gson b;
    private final S c;
    public static final int[][] d;
    private static /* synthetic */ int field74;
    private static /* synthetic */ int field75;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private by_0(Gson gson, S s) {
        this.b = gson;
        this.c = s;
    }

    private static V b(S s) {
        return new bz_0(s);
    }

    public static V a(S s) {
        if (s == N.a) {
            return a;
        }
        return by_0.b(s);
    }

    @Override
    public Object b(JsonReader jsonReader) {
        JsonToken jsonToken = jsonReader.peek();
        switch (bA.a[jsonToken.ordinal()]) {
            case 1: {
                ArrayList<Object> arrayList = new ArrayList<Object>();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(this.b(jsonReader));
                }
                jsonReader.endArray();
                return arrayList;
            }
            case 2: {
                aL aL2 = new aL();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    aL2.put(jsonReader.g(), this.b(jsonReader));
                }
                jsonReader.endObject();
                return aL2;
            }
            case 3: {
                return jsonReader.h();
            }
            case 4: {
                return this.c.b(jsonReader);
            }
            case 5: {
                return jsonReader.i();
            }
            case 6: {
                jsonReader.j();
                return null;
            }
        }
        throw new IllegalStateException();
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
        T t = this.b.a(object.getClass());
        if (t instanceof by_0) {
            cO2.d();
            cO2.e();
            return;
        }
        t.a(cO2, object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    /* synthetic */ by_0(Gson gson, S s, bz_0 bz_02) {
        this(gson, s);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field74 = 0xE91 ^ 0xFFFFE111;
        field75 = 0xFFFFD08B ^ 0xFFFFE111;
        d = new int[3][2];
        a = by_0.b(N.a);
    }
}

