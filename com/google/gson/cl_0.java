/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.Gson;
import com.google.gson.T;
import com.google.gson.V;
import com.google.gson.cJ;
import com.google.gson.cm;

/*
 * Renamed from com.google.gson.cl
 */
class cl_0
implements V {
    final /* synthetic */ Class a;
    final /* synthetic */ T b;
    private static final String[] c;
    private static final String[] d;
    public static final int[][] e;
    private static /* synthetic */ int field108;
    private static /* synthetic */ int field109;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    cl_0(Class clazz, T t) {
        this.a = clazz;
        this.b = t;
    }

    @Override
    public T a(Gson gson, cJ cJ2) {
        Class clazz = cJ2.a();
        if (!this.a.isAssignableFrom(clazz)) {
            return null;
        }
        return new cm(this, clazz);
    }

    public String toString() {
        return "Factory[typeHierarchy=" + this.a.getName() + ",adapter=" + this.b + "]";
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
        cl_0.field108 = 17641 ^ -8251;
        cl_0.field109 = -13527 ^ -8251;
        cl_0.e = new int[2][2];
        var5 = new String[2];
        var3_1 = 0;
        var2_2 = "\u0099\u00fa\u00a7\"\u00acJ=\u00c3iH\u00e3\u0002\u00cc\u00b3P\u00ac\u00db\u009fm!\u0088\u0091\tN)}M\u000f\u0016\u00a9\u00a7-";
        var4_3 = "\u0099\u00fa\u00a7\"\u00acJ=\u00c3iH\u00e3\u0002\u00cc\u00b3P\u00ac\u00db\u009fm!\u0088\u0091\tN)}M\u000f\u0016\u00a9\u00a7-".length();
        var1_4 = 22;
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
            cl_0.c = var5;
            cl_0.d = new String[2];
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
                        v10 = 74;
                        break;
                    }
                    case 2: {
                        v10 = 88;
                        break;
                    }
                    case 3: {
                        v10 = 13;
                        break;
                    }
                    case 4: {
                        v10 = 51;
                        break;
                    }
                    case 5: {
                        v10 = 39;
                        break;
                    }
                    default: {
                        v10 = 53;
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

