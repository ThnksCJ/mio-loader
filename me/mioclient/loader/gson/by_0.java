/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.util.ArrayList;
import me.mioclient.loader.gson.GSONBuilder;
import me.mioclient.loader.gson.JsonReader;
import me.mioclient.loader.gson.JsonToken;
import me.mioclient.loader.gson.N;
import me.mioclient.loader.gson.S;
import me.mioclient.loader.gson.T;
import me.mioclient.loader.gson.V;
import me.mioclient.loader.gson.aL;
import me.mioclient.loader.gson.bA;
import me.mioclient.loader.gson.bz_0;
import me.mioclient.loader.gson.cO;

/*
 * Renamed from me.mioclient.loader.gson.by
 */
public final class by_0
extends T {
    private static final V a;
    private final GSONBuilder b;
    private final S c;
    public static final int[][] d;
    private static /* synthetic */ int field74;
    private static /* synthetic */ int field75;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private by_0(GSONBuilder gSONBuilder, S s) {
        this.b = gSONBuilder;
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
    /* synthetic */ by_0(GSONBuilder gSONBuilder, S s, bz_0 bz_02) {
        this(gSONBuilder, s);
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

