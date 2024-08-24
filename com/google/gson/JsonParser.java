/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.J;
import com.google.gson.JsonElement;
import com.google.gson.JsonReader;
import com.google.gson.JsonToken;
import com.google.gson.aW;
import java.io.Reader;
import java.io.StringReader;

public final class JsonParser {
    private static final String[] a;
    private static final String[] b;
    public static final int[][] c;
    private static /* synthetic */ int field36;
    private static /* synthetic */ int field37;

    public static JsonElement a(String string) {
        return JsonParser.a(new StringReader(string));
    }

    public static JsonElement a(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        JsonElement jsonElement = JsonParser.a(jsonReader);
        if (!jsonElement.t() && jsonReader.peek() != JsonToken.END_DOCUMENT) {
            throw new J("Did not consume the entire document.");
        }
        return jsonElement;
    }

    public static JsonElement a(JsonReader jsonReader) {
        boolean bl = jsonReader.isLenient();
        jsonReader.a(true);
        JsonElement jsonElement = aW.a(jsonReader);
        jsonReader.a(bl);
        return jsonElement;
    }

    public JsonElement b(String string) {
        return JsonParser.a(string);
    }

    public JsonElement b(Reader reader) {
        return JsonParser.a(reader);
    }

    public JsonElement b(JsonReader jsonReader) {
        return JsonParser.a(jsonReader);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block21: {
                break block21;
lbl1:
                // 1 sources

                return;
            }
            JsonParser.field36 = 17590 ^ -2730;
            JsonParser.field37 = -22524 ^ -2730;
            JsonParser.c = new int[3][1];
            var5 = new String[5];
            var3_1 = 0;
            var2_2 = "G\u0085\u00cc\u00d2q\u00c36\u00ae\u00f6\u001a\u00a3\u00df\u001b)\u00ae\u0091a=\u0092=W\u00a2\u00f7g\u0005|\u0089\u0097\b\u00dd\u00ad3,g\u00ceq\u00e4$\u0094:\u00f9`p[(\u0087\u00e9x\u001f7)g\u00d5y\u00c4 \u00ce]\u0084\u00afX\u00fc\u00c0w\u0018\u00b2\u0006\u00a8\u00f44\u00e94qE";
            var4_3 = "G\u0085\u00cc\u00d2q\u00c36\u00ae\u00f6\u001a\u00a3\u00df\u001b)\u00ae\u0091a=\u0092=W\u00a2\u00f7g\u0005|\u0089\u0097\b\u00dd\u00ad3,g\u00ceq\u00e4$\u0094:\u00f9`p[(\u0087\u00e9x\u001f7)g\u00d5y\u00c4 \u00ce]\u0084\u00afX\u00fc\u00c0w\u0018\u00b2\u0006\u00a8\u00f44\u00e94qE".length();
            var1_4 = 28;
            var0_5 = -1;
lbl15:
            // 2 sources

            while (true) {
                v0 = ++var0_5;
                v1 = var2_2.substring(v0, v0 + var1_4);
                v2 = -1;
                break block20;
                break;
            }
lbl21:
            // 1 sources

            while (true) {
                var5[var3_1++] = v3.intern();
                if ((var0_5 += var1_4) < var4_3) {
                    var1_4 = var2_2.charAt(var0_5);
                    ** continue;
                }
                var2_2 = "^\u00c7Caig\u00b0\u00d1\u001cQ\u009d\u000e\u00d1)\u00a3=\u00a2\u0097\u009b\u008f\u00ef\u009e/\u001eQw%P>\u000f\u00c2\u00fckd\u00fd\u00a5\u00a7";
                var4_3 = "^\u00c7Caig\u00b0\u00d1\u001cQ\u009d\u000e\u00d1)\u00a3=\u00a2\u0097\u009b\u008f\u00ef\u009e/\u001eQw%P>\u000f\u00c2\u00fckd\u00fd\u00a5\u00a7".length();
                var1_4 = 8;
                var0_5 = -1;
lbl31:
                // 2 sources

                while (true) {
                    v4 = ++var0_5;
                    v1 = var2_2.substring(v4, v4 + var1_4);
                    v2 = 0;
                    break block20;
                    break;
                }
                break;
            }
lbl36:
            // 1 sources

            while (true) {
                var5[var3_1++] = v3.intern();
                if ((var0_5 += var1_4) < var4_3) {
                    var1_4 = var2_2.charAt(var0_5);
                    ** continue;
                }
                JsonParser.a = var5;
                JsonParser.b = new String[5];
                ** continue;
                break;
            }
        }
        v5 = v1.toCharArray();
        var6_6 = 0;
        v6 = v5.length;
        v7 = v5;
        v8 = v6;
        if (v6 > 1) ** GOTO lbl88
        do {
            v9 = v7;
            v10 = v7;
            v11 = var6_6;
            while (true) {
                v12 = v9[v11];
                switch (var6_6 % 7) {
                    case 0: {
                        v13 = 109;
                        break;
                    }
                    case 1: {
                        v13 = 91;
                        break;
                    }
                    case 2: {
                        v13 = 110;
                        break;
                    }
                    case 3: {
                        v13 = 40;
                        break;
                    }
                    case 4: {
                        v13 = 4;
                        break;
                    }
                    case 5: {
                        v13 = 25;
                        break;
                    }
                    default: {
                        v13 = 113;
                    }
                }
                v9[v11] = (char)(v12 ^ v13);
                ++var6_6;
                v7 = v10;
                v8 = v8;
                if (v8 != 0) break;
                v10 = v7;
                v14 = v8;
                v11 = v8;
                v9 = v7;
            }
lbl88:
            // 2 sources

            v15 = v7;
            v14 = v8;
        } while (v8 > var6_6);
        v3 = new String(v15);
        switch (v2) {
            default: {
                ** continue;
            }
            ** case 0:
lbl97:
            // 1 sources

            ** continue;
        }
    }
}

