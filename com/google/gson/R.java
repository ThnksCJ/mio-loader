/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.JsonReader;
import com.google.gson.N;
import java.math.BigDecimal;

final class R
extends N {
    private static final String[] f;
    private static final String[] g;
    public static final int[][] a;
    private static /* synthetic */ int field58;
    private static /* synthetic */ int field59;

    public BigDecimal a(JsonReader jsonReader) {
        String string = jsonReader.h();
        return new BigDecimal(string);
    }

    @Override
    public /* synthetic */ Number b(JsonReader jsonReader) {
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
        R.field58 = 24243 ^ -1450;
        R.field59 = -21904 ^ -1450;
        R.a = new int[2][3];
        var5 = new String[2];
        var3_1 = 0;
        var2_2 = "\u00bc\u00cbz\u00e2\u00caH\u00db}Q\u00a5\r\u00ect\bf%\u0085\u00c1DrT\u00bb;\u00d4";
        var4_3 = "\u00bc\u00cbz\u00e2\u00caH\u00db}Q\u00a5\r\u00ect\bf%\u0085\u00c1DrT\u00bb;\u00d4".length();
        var1_4 = 10;
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
            R.f = var5;
            R.g = new String[2];
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
                        v10 = 53;
                        break;
                    }
                    case 1: {
                        v10 = 111;
                        break;
                    }
                    case 2: {
                        v10 = 118;
                        break;
                    }
                    case 3: {
                        v10 = 38;
                        break;
                    }
                    case 4: {
                        v10 = 38;
                        break;
                    }
                    case 5: {
                        v10 = 90;
                        break;
                    }
                    default: {
                        v10 = 3;
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

