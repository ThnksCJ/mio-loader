/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import me.mioclient.loader.gson.F;
import me.mioclient.loader.gson.GSONBuilder;
import me.mioclient.loader.gson.J;
import me.mioclient.loader.gson.JsonElement;
import me.mioclient.loader.gson.JsonReader;
import me.mioclient.loader.gson.JsonToken;
import me.mioclient.loader.gson.T;
import me.mioclient.loader.gson.aT;
import me.mioclient.loader.gson.aW;
import me.mioclient.loader.gson.az;
import me.mioclient.loader.gson.bJ;
import me.mioclient.loader.gson.bt_0;
import me.mioclient.loader.gson.cO;

/*
 * Renamed from me.mioclient.loader.gson.bu
 */
final class bu_0
extends T {
    private final T b;
    private final T c;
    private final aT d;
    final /* synthetic */ bt_0 a;
    private static final String[] e;
    private static final String[] f;
    public static final int[][] g;
    private static /* synthetic */ int field74;
    private static /* synthetic */ int field75;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public bu_0(bt_0 bt_02, GSONBuilder gSONBuilder, Type type, T t, Type type2, T t2, aT aT2) {
        this.a = bt_02;
        this.b = new bJ(gSONBuilder, t, type);
        this.c = new bJ(gSONBuilder, t2, type2);
        this.d = aT2;
    }

    public Map a(JsonReader jsonReader) {
        JsonToken jsonToken = jsonReader.peek();
        if (jsonToken == JsonToken.i) {
            jsonReader.j();
            return null;
        }
        Map map = (Map)this.d.a();
        if (jsonToken == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                jsonReader.beginArray();
                Object object = this.b.b(jsonReader);
                Object object2 = this.c.b(jsonReader);
                Object object3 = map.put(object, object2);
                if (object3 != null) {
                    throw new J("duplicate key: " + object);
                }
                jsonReader.endArray();
            }
            jsonReader.endArray();
        } else {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                Object object;
                az.a.a(jsonReader);
                Object object4 = this.b.b(jsonReader);
                Object object5 = map.put(object4, object = this.c.b(jsonReader));
                if (object5 == null) continue;
                throw new J("duplicate key: " + object4);
            }
            jsonReader.endObject();
        }
        return map;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(cO cO2, Map map) {
        JsonElement jsonElement;
        if (map == null) {
            cO2.f();
            return;
        }
        if (!this.a.a) {
            cO2.d();
            for (Map.Entry entry : map.entrySet()) {
                cO2.a(String.valueOf(entry.getKey()));
                this.c.a(cO2, entry.getValue());
            }
            cO2.e();
            return;
        }
        boolean bl2 = false;
        ArrayList<JsonElement> arrayList = new ArrayList<JsonElement>(map.size());
        ArrayList arrayList2 = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            jsonElement = this.b.b(entry.getKey());
            arrayList.add(jsonElement);
            arrayList2.add(entry.getValue());
            bl2 |= jsonElement.q() || jsonElement.r();
        }
        if (bl2) {
            cO2.b();
            int n = arrayList.size();
            for (int i = 0; i < n; ++i) {
                cO2.b();
                aW.a((JsonElement)arrayList.get(i), cO2);
                this.c.a(cO2, arrayList2.get(i));
                cO2.c();
            }
            cO2.c();
            return;
        }
        cO2.d();
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            jsonElement = (JsonElement)arrayList.get(i);
            cO2.a(this.b(jsonElement));
            this.c.a(cO2, arrayList2.get(i));
        }
        cO2.e();
    }

    private String b(JsonElement jsonElement) {
        if (jsonElement.s()) {
            F f = jsonElement.w();
            if (f.c()) {
                return String.valueOf(f.d());
            }
            if (f.b()) {
                return Boolean.toString(f.o());
            }
            if (f.y()) {
                return f.e();
            }
            throw new AssertionError();
        }
        if (jsonElement.t()) {
            return "null";
        }
        throw new AssertionError();
    }

    @Override
    public /* synthetic */ Object b(JsonReader jsonReader) {
        return this.a(jsonReader);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            break block14;
lbl1:
            // 1 sources

            return;
        }
        bu_0.field74 = 2284 ^ -28979;
        bu_0.field75 = -29467 ^ -28979;
        bu_0.g = new int[2][3];
        var5 = new String[3];
        var3_1 = 0;
        var2_2 = ")\u00cc\u00bdX\u000f\u00d8\u00e4\u00d4]I\u00bda\u0087\u0003}\u00b4*}\u00db\u0092\u000f\u0095^}\n|W\u00c7\u00da\u00d7\u00d6._.u\u00f8";
        var4_3 = ")\u00cc\u00bdX\u000f\u00d8\u00e4\u00d4]I\u00bda\u0087\u0003}\u00b4*}\u00db\u0092\u000f\u0095^}\n|W\u00c7\u00da\u00d7\u00d6._.u\u00f8".length();
        var1_4 = 4;
        var0_5 = -1;
lbl15:
        // 2 sources

        while (true) {
            continue;
            break;
        }
lbl17:
        // 1 sources

        while (true) {
            var5[var3_1++] = new String(v0).intern();
            if ((var0_5 += var1_4) < var4_3) {
                var1_4 = var2_2.charAt(var0_5);
                ** continue;
            }
            bu_0.e = var5;
            bu_0.f = new String[3];
            ** continue;
            break;
        }
        v1 = ++var0_5;
        v2 = var2_2.substring(v1, v1 + var1_4).toCharArray();
        var6_6 = 0;
        v3 = v2.length;
        v4 = v2;
        v5 = v3;
        if (v3 > 1) ** GOTO lbl70
        do {
            v6 = v4;
            v7 = v4;
            v8 = var6_6;
            while (true) {
                v9 = v6[v8];
                switch (var6_6 % 7) {
                    case 0: {
                        v10 = 1;
                        break;
                    }
                    case 1: {
                        v10 = 2;
                        break;
                    }
                    case 2: {
                        v10 = 119;
                        break;
                    }
                    case 3: {
                        v10 = 54;
                        break;
                    }
                    case 4: {
                        v10 = 42;
                        break;
                    }
                    case 5: {
                        v10 = 82;
                        break;
                    }
                    default: {
                        v10 = 40;
                    }
                }
                v6[v8] = (char)(v9 ^ v10);
                ++var6_6;
                v4 = v7;
                v5 = v5;
                if (v5 != 0) break;
                v7 = v4;
                v11 = v5;
                v8 = v5;
                v6 = v4;
            }
lbl70:
            // 2 sources

            v0 = v4;
            v11 = v5;
        } while (v5 > var6_6);
        ** while (true)
    }
}

