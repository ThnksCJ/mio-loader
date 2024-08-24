/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.JsonReader;
import com.google.gson.JsonTreeReader;
import com.google.gson.az;

class cL
extends az {
    private static final String b;
    private static final long[] c;
    private static final Integer[] d;
    public static final int[][] a;
    private static /* synthetic */ int field192;
    private static /* synthetic */ int field193;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    cL() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(JsonReader jsonReader) {
        if (jsonReader instanceof JsonTreeReader) {
            ((JsonTreeReader)jsonReader).p();
            return;
        }
        int n = jsonReader.a;
        if (n == 0) {
            n = jsonReader.s();
        }
        if (n == 13) {
            jsonReader.a = 9;
            return;
        }
        if (n == 12) {
            jsonReader.a = 8;
            return;
        }
        if (n != 14) throw new IllegalStateException(b + (Object)((Object)jsonReader.peek()) + jsonReader.t());
        jsonReader.a = 10;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block21: {
                block20: {
                    break block20;
lbl1:
                    // 1 sources

                    return;
                }
                cL.field192 = 8992 ^ -1990;
                cL.field193 = -32039 ^ -1990;
                break block21;
lbl7:
                // 1 sources

                while (true) {
                    continue;
                    break;
                }
            }
            cL.a = new int[1][3];
            v0 = "\u0006\u0015v\u0011QG\u0016'MgT\\R\u001e&Md\u0001F\u0013\u0004\"\u001e&".toCharArray();
            var8 = 0;
            v1 = v0.length;
            v2 = v0;
            v3 = v1;
            if (v1 > 1) ** GOTO lbl56
            do {
                v4 = v2;
                v5 = v2;
                v6 = var8;
                while (true) {
                    v7 = v4[v6];
                    switch (var8 % 7) {
                        case 0: {
                            v8 = 67;
                            break;
                        }
                        case 1: {
                            v8 = 109;
                            break;
                        }
                        case 2: {
                            v8 = 6;
                            break;
                        }
                        case 3: {
                            v8 = 116;
                            break;
                        }
                        case 4: {
                            v8 = 50;
                            break;
                        }
                        case 5: {
                            v8 = 51;
                            break;
                        }
                        default: {
                            v8 = 115;
                        }
                    }
                    v4[v6] = (char)(v7 ^ v8);
                    ++var8;
                    v2 = v5;
                    v3 = v3;
                    if (v3 != 0) break;
                    v5 = v2;
                    v9 = v3;
                    v6 = v3;
                    v4 = v2;
                }
lbl56:
                // 2 sources

                v10 = v2;
                v9 = v3;
            } while (v3 > var8);
            ** while (true)
            cL.b = new String(v10).intern();
            var0_1 = 5918017733663063142L;
            var6_2 = new long[6];
            var3_3 = 0;
            var4_4 = "O\u00e7\u00a4%\u0091\u001cK\u0017\u00a5\u0099O\u00cd\u00e7\u0015\u0088\u00c8\u00b4f\u009cKf2\u001f\u00f6z\u00b9\u00ee\u0084\u00eb\u00d40\u00b2";
            var5_5 = "O\u00e7\u00a4%\u0091\u001cK\u0017\u00a5\u0099O\u00cd\u00e7\u0015\u0088\u00c8\u00b4f\u009cKf2\u001f\u00f6z\u00b9\u00ee\u0084\u00eb\u00d40\u00b2".length();
            var2_6 = 0;
            while (true) {
                var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                v11 = var6_2;
                v12 = var3_3++;
                v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                v14 = -1;
                break block19;
                break;
            }
lbl77:
            // 1 sources

            while (true) {
                v11[v12] = v15;
                if (var2_6 < var5_5) ** continue;
                var4_4 = "\u0096(\u00fa>\u00a3vpp-\u009f\u00da7\u001e\u00d1f\u0011";
                var5_5 = "\u0096(\u00fa>\u00a3vpp-\u009f\u00da7\u001e\u00d1f\u0011".length();
                var2_6 = 0;
                while (true) {
                    var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                    v11 = var6_2;
                    v12 = var3_3++;
                    v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                    v14 = 0;
                    break block19;
                    break;
                }
                break;
            }
lbl90:
            // 1 sources

            while (true) {
                v11[v12] = v15;
                if (var2_6 < var5_5) ** continue;
                cL.c = var6_2;
                cL.d = new Integer[6];
                ** continue;
                break;
            }
        }
        v15 = v13 ^ var0_1;
        switch (v14) {
            default: {
                ** continue;
            }
            ** case 0:
lbl103:
            // 1 sources

            ** continue;
        }
    }
}

