/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.Gson;
import com.google.gson.T;
import com.google.gson.V;
import com.google.gson.cJ;

/*
 * Renamed from com.google.gson.cj
 */
class cj_0
implements V {
    final /* synthetic */ Class a;
    final /* synthetic */ Class b;
    final /* synthetic */ T c;
    private static final String[] d;
    private static final String[] e;
    public static final int[][] f;
    private static /* synthetic */ int field96;
    private static /* synthetic */ int field97;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    cj_0(Class clazz, Class clazz2, T t) {
        this.a = clazz;
        this.b = clazz2;
        this.c = t;
    }

    @Override
    public T a(Gson gson, cJ cJ2) {
        Class clazz = cJ2.a();
        return clazz == this.a || clazz == this.b ? this.c : null;
    }

    public String toString() {
        return "Factory[type=" + this.b.getName() + "+" + this.a.getName() + ",adapter=" + this.c + "]";
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
        cj_0.field96 = 20597 ^ -6914;
        cj_0.field97 = -27476 ^ -6914;
        cj_0.f = new int[1][2];
        var5 = new String[2];
        var3_1 = 0;
        var2_2 = "3L\u0084YT\u00cb\f\u001b\u00c4%\u00fb3T\t\u00b8\u00f3\u00d5\u00bb\u0086&\u00b6IE";
        var4_3 = "3L\u0084YT\u00cb\f\u001b\u00c4%\u00fb3T\t\u00b8\u00f3\u00d5\u00bb\u0086&\u00b6IE".length();
        var1_4 = 13;
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
            cj_0.d = var5;
            cj_0.e = new String[2];
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
                        v10 = 9;
                        break;
                    }
                    case 1: {
                        v10 = 77;
                        break;
                    }
                    case 2: {
                        v10 = 46;
                        break;
                    }
                    case 3: {
                        v10 = 64;
                        break;
                    }
                    case 4: {
                        v10 = 97;
                        break;
                    }
                    case 5: {
                        v10 = 96;
                        break;
                    }
                    default: {
                        v10 = 81;
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

