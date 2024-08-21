/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import me.mioclient.loader.gson.GSONBuilder;
import me.mioclient.loader.gson.T;
import me.mioclient.loader.gson.V;
import me.mioclient.loader.gson.cJ;

/*
 * Renamed from me.mioclient.loader.gson.ci
 */
class ci_0
implements V {
    final /* synthetic */ Class a;
    final /* synthetic */ T b;
    private static final String[] c;
    private static final String[] d;
    public static final int[][] e;
    private static /* synthetic */ int field100;
    private static /* synthetic */ int field101;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    ci_0(Class clazz, T t) {
        this.a = clazz;
        this.b = t;
    }

    @Override
    public T a(GSONBuilder gSONBuilder, cJ cJ2) {
        return cJ2.a() == this.a ? this.b : null;
    }

    public String toString() {
        return "Factory[type=" + this.a.getName() + ",adapter=" + this.b + "]";
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
        ci_0.field100 = 23308 ^ -29128;
        ci_0.field101 = -19523 ^ -29128;
        ci_0.e = new int[4][4];
        var5 = new String[2];
        var3_1 = 0;
        var2_2 = ":\u00e1V}_(\u0092\u00d3\u00f1\r\n\u0083p$c\u00b2\u00f5o\u00cbx\u009e1.";
        var4_3 = ":\u00e1V}_(\u0092\u00d3\u00f1\r\n\u0083p$c\u00b2\u00f5o\u00cbx\u009e1.".length();
        var1_4 = 9;
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
            ci_0.c = var5;
            ci_0.d = new String[2];
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
                        v10 = 18;
                        break;
                    }
                    case 2: {
                        v10 = 122;
                        break;
                    }
                    case 3: {
                        v10 = 47;
                        break;
                    }
                    case 4: {
                        v10 = 66;
                        break;
                    }
                    case 5: {
                        v10 = 91;
                        break;
                    }
                    default: {
                        v10 = 42;
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

