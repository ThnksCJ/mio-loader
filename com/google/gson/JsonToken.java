/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

public final class JsonToken
extends Enum {
    public static final /* enum */ JsonToken BEGIN_ARRAY;
    public static final /* enum */ JsonToken b;
    public static final /* enum */ JsonToken c;
    public static final /* enum */ JsonToken d;
    public static final /* enum */ JsonToken e;
    public static final /* enum */ JsonToken f;
    public static final /* enum */ JsonToken g;
    public static final /* enum */ JsonToken h;
    public static final /* enum */ JsonToken i;
    public static final /* enum */ JsonToken END_DOCUMENT;
    private static final /* synthetic */ JsonToken[] k;
    public static final int[][] l;
    private static /* synthetic */ int field68;
    private static /* synthetic */ int field69;

    public static JsonToken[] a() {
        return (JsonToken[])k.clone();
    }

    public static JsonToken a(String string) {
        return Enum.valueOf(JsonToken.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private JsonToken() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block30: {
            block29: {
                block28: {
                    block27: {
                        block31: {
                            break block31;
lbl1:
                            // 1 sources

                            return;
                        }
                        JsonToken.field68 = 28625 ^ -30360;
                        JsonToken.field69 = -22407 ^ -30360;
                        JsonToken.l = new int[3][2];
                        var8 = new String[10];
                        var12_1 = 0;
                        var11_2 = "|b)>\\\u0006\tjx?(S\u0013$no\u0004ac7;\u0004aw62\u0006ac65W\u0013\fms<>\\\u001e9m|>4F\njx?(]\u0003<ju/\u0007my4;W\u00008";
                        var13_3 = "|b)>\\\u0006\tjx?(S\u0013$no\u0004ac7;\u0004aw62\u0006ac65W\u0013\fms<>\\\u001e9m|>4F\njx?(]\u0003<ju/\u0007my4;W\u00008".length();
                        var10_4 = 6;
                        var9_5 = -1;
lbl15:
                        // 2 sources

                        while (true) {
                            v0 = ++var9_5;
                            v1 = var11_2.substring(v0, v0 + var10_4);
                            v2 = -1;
                            break block27;
                            break;
                        }
lbl21:
                        // 1 sources

                        while (true) {
                            var8[var12_1++] = v3.intern();
                            if ((var9_5 += var10_4) < var13_3) {
                                var10_4 = var11_2.charAt(var9_5);
                                ** continue;
                            }
                            var11_2 = "ms<>\\\u001e7}d:.\fjx?(V\u000e5z{>9F";
                            var13_3 = "ms<>\\\u001e7}d:.\fjx?(V\u000e5z{>9F".length();
                            var10_4 = 11;
                            var9_5 = -1;
lbl31:
                            // 2 sources

                            while (true) {
                                v4 = ++var9_5;
                                v1 = var11_2.substring(v4, v4 + var10_4);
                                v2 = 0;
                                break block27;
                                break;
                            }
                            break;
                        }
lbl36:
                        // 1 sources

                        while (true) {
                            var8[var12_1++] = v3.intern();
                            if ((var9_5 += var10_4) < var13_3) {
                                var10_4 = var11_2.charAt(var9_5);
                                ** continue;
                            }
                            break block28;
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
                                    v13 = 47;
                                    break;
                                }
                                case 1: {
                                    v13 = 54;
                                    break;
                                }
                                case 2: {
                                    v13 = 123;
                                    break;
                                }
                                case 3: {
                                    v13 = 119;
                                    break;
                                }
                                case 4: {
                                    v13 = 18;
                                    break;
                                }
                                case 5: {
                                    v13 = 65;
                                    break;
                                }
                                default: {
                                    v13 = 118;
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
                var1_7 = 7541793561219118750L;
                var0_8 = new long[9];
                var4_9 = 0;
                var5_10 = "|\u00f4\u0091\u00b5)\u00cb6\u0099\u0086\u007f\u00eb\u00f6)\u00cb6\u0097\u00a4\u00e0/<)\u00cb6\u0094w\u0001\u0091W)\u00cb6\u0096\u00ce\u00c2\u00fb\u00fe)\u00cb6\u0099\u0083\u00c6\u00ac\u008f)\u00cb6\u0096>\u00a3\u00dep)\u00cb6\u0097";
                var6_11 = "|\u00f4\u0091\u00b5)\u00cb6\u0099\u0086\u007f\u00eb\u00f6)\u00cb6\u0097\u00a4\u00e0/<)\u00cb6\u0094w\u0001\u0091W)\u00cb6\u0096\u00ce\u00c2\u00fb\u00fe)\u00cb6\u0099\u0083\u00c6\u00ac\u008f)\u00cb6\u0096>\u00a3\u00dep)\u00cb6\u0097".length();
                var3_12 = 0;
                while (true) {
                    var7_13 = var5_10.substring(var3_12, var3_12 += 8).getBytes("ISO-8859-1");
                    v16 = var0_8;
                    v17 = var4_9++;
                    v18 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v19 = -1;
                    break block29;
                    break;
                }
lbl111:
                // 1 sources

                while (true) {
                    v16[v17] = v20;
                    if (var3_12 < var6_11) ** continue;
                    var5_10 = "\u001b\u00a4\u008e&)\u00cb6\u0098\u00d2\u00de\u00a7\u0095)\u00cb6\u0098";
                    var6_11 = "\u001b\u00a4\u008e&)\u00cb6\u0098\u00d2\u00de\u00a7\u0095)\u00cb6\u0098".length();
                    var3_12 = 0;
                    while (true) {
                        var7_13 = var5_10.substring(var3_12, var3_12 += 8).getBytes("ISO-8859-1");
                        v16 = var0_8;
                        v17 = var4_9++;
                        v18 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v19 = 0;
                        break block29;
                        break;
                    }
                    break;
                }
lbl124:
                // 1 sources

                while (true) {
                    v16[v17] = v20;
                    if (var3_12 < var6_11) ** continue;
                    break block30;
                    break;
                }
            }
            v20 = v18 ^ var1_7;
            switch (v19) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl135:
                // 1 sources

                ** continue;
            }
        }
        JsonToken.BEGIN_ARRAY = new JsonToken(var8[8], 0);
        JsonToken.b = new JsonToken(var8[1], 1);
        JsonToken.c = new JsonToken(var8[5], 2);
        JsonToken.d = new JsonToken(var8[6], 3);
        JsonToken.e = new JsonToken(var8[3], 4);
        JsonToken.f = new JsonToken(var8[0], 5);
        JsonToken.g = new JsonToken(var8[4], (int)var0_8[8]);
        JsonToken.h = new JsonToken(var8[7], (int)var0_8[4]);
        JsonToken.i = new JsonToken(var8[2], (int)var0_8[3]);
        JsonToken.END_DOCUMENT = new JsonToken(var8[9], (int)var0_8[6]);
        v21 = new JsonToken[(int)var0_8[2]];
        v21[0] = JsonToken.BEGIN_ARRAY;
        v21[1] = JsonToken.b;
        v21[2] = JsonToken.c;
        v21[3] = JsonToken.d;
        v21[4] = JsonToken.e;
        v21[5] = JsonToken.f;
        v21[(int)var0_8[7]] = JsonToken.g;
        v21[(int)var0_8[0]] = JsonToken.h;
        v21[(int)var0_8[5]] = JsonToken.i;
        v21[(int)var0_8[1]] = JsonToken.END_DOCUMENT;
        JsonToken.k = v21;
        ** while (true)
    }
}

