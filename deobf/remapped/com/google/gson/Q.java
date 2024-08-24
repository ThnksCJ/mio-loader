/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.JsonReader;
import com.google.gson.N;

final class Q
extends N {
    private static final String[] f;
    private static final String[] g;
    public static final int[][] a;
    private static /* synthetic */ int field58;
    private static /* synthetic */ int field59;

    @Override
    public Number b(JsonReader jsonReader) {
        String string = jsonReader.h();
        return Long.parseLong(string);
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
            Q.field58 = 18125 ^ -232;
            Q.field59 = -18789 ^ -232;
            Q.a = new int[2][3];
            var5 = new String[4];
            var3_1 = 0;
            var2_2 = "\u00c2\u00a1\u00caY\u00d7]h_\u00c8\u009e\r\u0085pZ\u0010d)\u00f9Q\u009a\u0089P\u008b\u00cb";
            var4_3 = "\u00c2\u00a1\u00caY\u00d7]h_\u00c8\u009e\r\u0085pZ\u0010d)\u00f9Q\u009a\u0089P\u008b\u00cb".length();
            var1_4 = 10;
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
                var2_2 = "\u00e0\u00ff\u008e\u0092_$yp\u00ea{!\u0014\u0000aJIT\u00b5\u00ac\u00b6o\u00a19\u0000\u00a3\u00bb]\u00b5p\u001f\u00db\u00b7\u0004\\\r|\u0086^\u00d0\u0018e\u009bb\u00ad";
                var4_3 = "\u00e0\u00ff\u008e\u0092_$yp\u00ea{!\u0014\u0000aJIT\u00b5\u00ac\u00b6o\u00a19\u0000\u00a3\u00bb]\u00b5p\u001f\u00db\u00b7\u0004\\\r|\u0086^\u00d0\u0018e\u009bb\u00ad".length();
                var1_4 = 10;
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
                Q.f = var5;
                Q.g = new String[4];
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
                        v13 = 20;
                        break;
                    }
                    case 1: {
                        v13 = 3;
                        break;
                    }
                    case 2: {
                        v13 = 45;
                        break;
                    }
                    case 3: {
                        v13 = 93;
                        break;
                    }
                    case 4: {
                        v13 = 70;
                        break;
                    }
                    case 5: {
                        v13 = 87;
                        break;
                    }
                    default: {
                        v13 = 31;
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

