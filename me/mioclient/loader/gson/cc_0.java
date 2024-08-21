/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.util.Calendar;
import java.util.GregorianCalendar;
import me.mioclient.loader.gson.JsonReader;
import me.mioclient.loader.gson.JsonToken;
import me.mioclient.loader.gson.T;
import me.mioclient.loader.gson.cO;

/*
 * Renamed from me.mioclient.loader.gson.cc
 */
class cc_0
extends T {
    private static final String a;
    private static final String b;
    private static final String c;
    private static final String d;
    private static final String e;
    private static final String f;
    private static final String[] g;
    private static final String[] h;
    private static final long[] i;
    private static final Integer[] j;
    public static final int[][] k;
    private static /* synthetic */ int field74;
    private static /* synthetic */ int field75;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    cc_0() {
    }

    public Calendar a(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.i) {
            jsonReader.j();
            return null;
        }
        jsonReader.beginObject();
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        while (jsonReader.peek() != JsonToken.d) {
            String string = jsonReader.g();
            int n7 = jsonReader.m();
            if (cc_0.a((int)14120, (int)13609).equals(string)) {
                n = n7;
                continue;
            }
            if ("month".equals(string)) {
                n2 = n7;
                continue;
            }
            if ("dayOfMonth".equals(string)) {
                n3 = n7;
                continue;
            }
            if ("hourOfDay".equals(string)) {
                n4 = n7;
                continue;
            }
            if ("minute".equals(string)) {
                n5 = n7;
                continue;
            }
            if (!"second".equals(string)) continue;
            n6 = n7;
        }
        jsonReader.endObject();
        return new GregorianCalendar(n, n2, n3, n4, n5, n6);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(cO cO2, Calendar calendar) {
        if (calendar == null) {
            cO2.f();
            return;
        }
        cO2.d();
        cO2.a("year");
        cO2.a((long)calendar.get(1));
        cO2.a("month");
        cO2.a((long)calendar.get(2));
        cO2.a("dayOfMonth");
        cO2.a((long)calendar.get(5));
        cO2.a("hourOfDay");
        cO2.a((long)calendar.get(11));
        cO2.a("minute");
        cO2.a((long)calendar.get(12));
        cO2.a("second");
        cO2.a((long)calendar.get(13));
        cO2.e();
    }

    @Override
    public /* synthetic */ Object b(JsonReader jsonReader) {
        return this.a(jsonReader);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block25: {
                        break block25;
lbl1:
                        // 1 sources

                        return;
                    }
                    cc_0.field74 = 26646 ^ -2753;
                    cc_0.field75 = -1444 ^ -2753;
                    cc_0.k = new int[4][2];
                    var13 = new String[18];
                    var11_1 = 0;
                    var10_2 = "\u00a29B\u00f9i\u0006\u00f1\u0018\u00f8\u008d\u0094C\u0006\u00d6?\u001ci\b\u00df\u0006\u00e4\u00d1\u008a#l\u00ce\t\u00b2w\u00fe6\u00a1\u0088s\u00c6\u00eb\tT\u0092\"\u008a:\u001f\u00004\u0085\t\u00cb\u0000\u00d1\u00d8DU\u00cf}|\u0005\u00cd$\u00afZ\u00d4\u0005l\u00d9\u009b\u00e5R\u0006~\u00fa\u00d9F\u0006b\u000489\u0088\u00b4\n\u00137K\u00cc\u00b3f\u0016Z\u00048\n\u00d0L3\u00a3\u00bc\u008b\u00f7\u00e78\u008f\u0004\u0087\u00a1\u007f\u00a7\u0004\u009a\u007f\u00dc|\u0006\u00b1\u00a0\u00f0\u009a\u0095\u00a1";
                    var12_3 = "\u00a29B\u00f9i\u0006\u00f1\u0018\u00f8\u008d\u0094C\u0006\u00d6?\u001ci\b\u00df\u0006\u00e4\u00d1\u008a#l\u00ce\t\u00b2w\u00fe6\u00a1\u0088s\u00c6\u00eb\tT\u0092\"\u008a:\u001f\u00004\u0085\t\u00cb\u0000\u00d1\u00d8DU\u00cf}|\u0005\u00cd$\u00afZ\u00d4\u0005l\u00d9\u009b\u00e5R\u0006~\u00fa\u00d9F\u0006b\u000489\u0088\u00b4\n\u00137K\u00cc\u00b3f\u0016Z\u00048\n\u00d0L3\u00a3\u00bc\u008b\u00f7\u00e78\u008f\u0004\u0087\u00a1\u007f\u00a7\u0004\u009a\u007f\u00dc|\u0006\u00b1\u00a0\u00f0\u009a\u0095\u00a1".length();
                    var9_4 = 5;
                    var8_5 = -1;
lbl15:
                    // 2 sources

                    while (true) {
                        v0 = ++var8_5;
                        v1 = var10_2.substring(v0, v0 + var9_4);
                        v2 = -1;
                        break block22;
                        break;
                    }
lbl21:
                    // 1 sources

                    while (true) {
                        var13[var11_1++] = v3.intern();
                        if ((var8_5 += var9_4) < var12_3) {
                            var9_4 = var10_2.charAt(var8_5);
                            ** continue;
                        }
                        var10_2 = "Q\u00f0\u00034\u00bay7\u00b9 D\u0006\u001e\u00e7\u00d5\u00e5\u0087\u0016";
                        var12_3 = "Q\u00f0\u00034\u00bay7\u00b9 D\u0006\u001e\u00e7\u00d5\u00e5\u0087\u0016".length();
                        var9_4 = 10;
                        var8_5 = -1;
lbl31:
                        // 2 sources

                        while (true) {
                            v4 = ++var8_5;
                            v1 = var10_2.substring(v4, v4 + var9_4);
                            v2 = 0;
                            break block22;
                            break;
                        }
                        break;
                    }
lbl36:
                    // 1 sources

                    while (true) {
                        var13[var11_1++] = v3.intern();
                        if ((var8_5 += var9_4) < var12_3) {
                            var9_4 = var10_2.charAt(var8_5);
                            ** continue;
                        }
                        break block23;
                        break;
                    }
                }
                v5 = v1.toCharArray();
                var14_6 = 0;
                v6 = v5.length;
                v7 = v5;
                v8 = v6;
                if (v6 > 1) ** GOTO lbl86
                do {
                    v9 = v7;
                    v10 = v7;
                    v11 = var14_6;
                    while (true) {
                        v12 = v9[v11];
                        switch (var14_6 % 7) {
                            case 0: {
                                v13 = 54;
                                break;
                            }
                            case 1: {
                                v13 = 16;
                                break;
                            }
                            case 2: {
                                v13 = 126;
                                break;
                            }
                            case 3: {
                                v13 = 42;
                                break;
                            }
                            case 4: {
                                v13 = 37;
                                break;
                            }
                            case 5: {
                                v13 = 81;
                                break;
                            }
                            default: {
                                v13 = 1;
                            }
                        }
                        v9[v11] = (char)(v12 ^ v13);
                        ++var14_6;
                        v7 = v10;
                        v8 = v8;
                        if (v8 != 0) break;
                        v10 = v7;
                        v14 = v8;
                        v11 = v8;
                        v9 = v7;
                    }
lbl86:
                    // 2 sources

                    v15 = v7;
                    v14 = v8;
                } while (v8 > var14_6);
                v3 = new String(v15);
                switch (v2) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl95:
                    // 1 sources

                    ** continue;
                }
            }
            cc_0.g = var13;
            cc_0.h = new String[18];
            cc_0.e = "minute";
            cc_0.c = "dayOfMonth";
            cc_0.a = "year";
            cc_0.f = "second";
            cc_0.d = "hourOfDay";
            cc_0.b = "month";
            var0_7 = 3409788490978179563L;
            var6_8 = new long[3];
            var3_9 = 0;
            var4_10 = "\u00db`O\u00f0)TB\u00a5\u00f0S\u0014\u00c8\u00f8\u00f0\u008c\u00b0\u00d8\u00d9\u00e87\u008b\u0011\u0018\u00a2";
            var5_11 = "\u00db`O\u00f0)TB\u00a5\u00f0S\u0014\u00c8\u00f8\u00f0\u008c\u00b0\u00d8\u00d9\u00e87\u008b\u0011\u0018\u00a2".length();
            var2_12 = 0;
            while (true) {
                break block24;
                break;
            }
lbl113:
            // 1 sources

            while (true) {
                var6_8[v16] = (((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L) ^ var0_7;
                if (var2_12 < var5_11) ** continue;
                cc_0.i = var6_8;
                cc_0.j = new Integer[3];
                ** continue;
                break;
            }
        }
        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
        v16 = var3_9++;
        ** while (true)
    }
}

