/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import me.mioclient.loader.gson.JsonToken;

class cn {
    static final /* synthetic */ int[] a;
    public static final int[][] b;
    private static /* synthetic */ int field232;
    private static /* synthetic */ int field233;

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                block10: {
                    break block10;
lbl1:
                    // 1 sources

                    return;
                }
                cn.field232 = 9750 ^ -15756;
                cn.field233 = -18243 ^ -15756;
                cn.b = new int[2][2];
                var1 = 4326416163169785319L;
                var0_1 = new long[5];
                var4_2 = 0;
                var5_3 = ";\u00069\u00a4\u00fc>U\u00ef\u0018\u00f7\u00c1\u001a\u00fc>U\u00e0\u00bc\u00aaE\u00d0\u00fc>U\u00ed";
                var6_4 = ";\u00069\u00a4\u00fc>U\u00ef\u0018\u00f7\u00c1\u001a\u00fc>U\u00e0\u00bc\u00aaE\u00d0\u00fc>U\u00ed".length();
                var3_5 = 0;
                while (true) {
                    var7_6 = var5_3.substring(var3_5, var3_5 += 8).getBytes("ISO-8859-1");
                    v0 = var0_1;
                    v1 = var4_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block8;
                    break;
                }
lbl22:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var3_5 < var6_4) ** continue;
                    var5_3 = "\u00889\u00ea\u00be\u00fc>U\u00ee\u008eeu\u00d6\u00fc>U\u00e1";
                    var6_4 = "\u00889\u00ea\u00be\u00fc>U\u00ee\u008eeu\u00d6\u00fc>U\u00e1".length();
                    var3_5 = 0;
                    while (true) {
                        var7_6 = var5_3.substring(var3_5, var3_5 += 8).getBytes("ISO-8859-1");
                        v0 = var0_1;
                        v1 = var4_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl35:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var3_5 < var6_4) ** continue;
                    break block9;
                    break;
                }
            }
            v4 = v2 ^ var1;
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl46:
                // 1 sources

                ** continue;
            }
        }
        cn.a = new int[JsonToken.a().length];
        cn.a[JsonToken.g.ordinal()] = 1;
        cn.a[JsonToken.h.ordinal()] = 2;
        cn.a[JsonToken.f.ordinal()] = 3;
        cn.a[JsonToken.i.ordinal()] = 4;
        cn.a[JsonToken.BEGIN_ARRAY.ordinal()] = 5;
        cn.a[JsonToken.c.ordinal()] = (int)var0_1[4];
        cn.a[JsonToken.END_DOCUMENT.ordinal()] = (int)var0_1[1];
        cn.a[JsonToken.e.ordinal()] = (int)var0_1[0];
        cn.a[JsonToken.d.ordinal()] = (int)var0_1[3];
        cn.a[JsonToken.b.ordinal()] = (int)var0_1[2];
        ** while (true)
    }
}

