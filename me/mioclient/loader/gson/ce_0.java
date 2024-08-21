/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.util.Map;
import me.mioclient.loader.gson.B;
import me.mioclient.loader.gson.C;
import me.mioclient.loader.gson.F;
import me.mioclient.loader.gson.JsonArray;
import me.mioclient.loader.gson.JsonElement;
import me.mioclient.loader.gson.JsonReader;
import me.mioclient.loader.gson.JsonTreeReader;
import me.mioclient.loader.gson.T;
import me.mioclient.loader.gson.aA;
import me.mioclient.loader.gson.cO;
import me.mioclient.loader.gson.cn;

/*
 * Renamed from me.mioclient.loader.gson.ce
 */
class ce_0
extends T {
    private static final String a;
    public static final int[][] b;
    private static /* synthetic */ int field74;
    private static /* synthetic */ int field75;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    ce_0() {
    }

    public JsonElement a(JsonReader jsonReader) {
        if (jsonReader instanceof JsonTreeReader) {
            return ((JsonTreeReader)jsonReader).n();
        }
        switch (cn.a[jsonReader.peek().ordinal()]) {
            case 3: {
                return new F(jsonReader.h());
            }
            case 1: {
                String string = jsonReader.h();
                return new F(new aA(string));
            }
            case 2: {
                return new F(jsonReader.i());
            }
            case 4: {
                jsonReader.j();
                return B.a;
            }
            case 5: {
                JsonArray jsonArray = new JsonArray();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonArray.a(this.a(jsonReader));
                }
                jsonReader.endArray();
                return jsonArray;
            }
            case 6: {
                C c = new C();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    c.a(jsonReader.g(), this.a(jsonReader));
                }
                jsonReader.endObject();
                return c;
            }
        }
        throw new IllegalArgumentException();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(cO cO2, JsonElement jsonElement) {
        if (jsonElement == null || jsonElement.t()) {
            cO2.f();
            return;
        }
        if (jsonElement.s()) {
            F f = jsonElement.w();
            if (f.c()) {
                cO2.a(f.d());
                return;
            }
            if (f.b()) {
                cO2.a(f.o());
                return;
            }
            cO2.b(f.e());
            return;
        }
        if (jsonElement.q()) {
            cO2.b();
            for (JsonElement jsonElement2 : jsonElement.v()) {
                this.a(cO2, jsonElement2);
            }
            cO2.c();
            return;
        }
        if (!jsonElement.r()) throw new IllegalArgumentException(a + jsonElement.getClass());
        cO2.d();
        for (Map.Entry entry : jsonElement.u().b()) {
            cO2.a((String)entry.getKey());
            this.a(cO2, (JsonElement)entry.getValue());
        }
        cO2.e();
    }

    @Override
    public /* synthetic */ Object b(JsonReader jsonReader) {
        return this.a(jsonReader);
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n;
            int n2;
            char[] cArray2;
            int n3;
            block11: {
                field74 = 0x701 ^ 0xFFFFA722;
                field75 = 0xFFFF8309 ^ 0xFFFFA722;
                b = new int[3][2];
                char[] cArray3 = "\u001ea\b'#%%).\n9.?g}".toCharArray();
                n3 = 0;
                int n4 = cArray3.length;
                cArray2 = cArray3;
                n2 = n4;
                if (n4 <= 1) break block11;
                cArray = cArray2;
                n = n2;
                if (n2 <= n3) break block12;
            }
            do {
                char[] cArray4 = cArray2;
                char[] cArray5 = cArray2;
                int n5 = n3;
                while (true) {
                    char c = cArray4[n5];
                    cArray4[n5] = (char)(c ^ (switch (n3 % 7) {
                        case 0 -> 93;
                        case 1 -> 14;
                        case 2 -> 125;
                        case 3 -> 75;
                        case 4 -> 71;
                        case 5 -> 75;
                        default -> 2;
                    }));
                    ++n3;
                    cArray2 = cArray5;
                    n2 = n2;
                    if (n2 != 0) break;
                    cArray5 = cArray2;
                    n = n2;
                    n5 = n2;
                    cArray4 = cArray2;
                }
                cArray = cArray2;
                n = n2;
            } while (n2 > n3);
        }
        a = new String(cArray).intern();
    }
}

