/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import me.mioclient.loader.gson.GSONBuilder;
import me.mioclient.loader.gson.T;
import me.mioclient.loader.gson.V;
import me.mioclient.loader.gson.cJ;

class ck
implements V {
    final /* synthetic */ Class a;
    final /* synthetic */ Class b;
    final /* synthetic */ T c;
    private static final String[] d;
    private static final String[] e;
    public static final int[][] f;
    private static /* synthetic */ int field112;
    private static /* synthetic */ int field113;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    ck(Class clazz, Class clazz2, T t) {
        this.a = clazz;
        this.b = clazz2;
        this.c = t;
    }

    @Override
    public T a(GSONBuilder gSONBuilder, cJ cJ2) {
        Class clazz = cJ2.a();
        return clazz == this.a || clazz == this.b ? this.c : null;
    }

    public String toString() {
        return "Factory[type=" + this.a.getName() + "+" + this.b.getName() + ",adapter=" + this.c + "]";
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
        ck.field112 = 12684 ^ -16546;
        ck.field113 = -21713 ^ -16546;
        ck.f = new int[1][3];
        var5 = new String[2];
        var3_1 = 0;
        var2_2 = "\u00ce\u0019\u009e8\u00c0\u00a6N\u00d7\u0099\u0019\u009bc\u0019\t`\u0095k\u00bc\u0086\u0087f\u001cJ";
        var4_3 = "\u00ce\u0019\u009e8\u00c0\u00a6N\u00d7\u0099\u0019\u009bc\u0019\t`\u0095k\u00bc\u0086\u0087f\u001cJ".length();
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
            ck.d = var5;
            ck.e = new String[2];
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
                        v10 = 68;
                        break;
                    }
                    case 1: {
                        v10 = 27;
                        break;
                    }
                    case 2: {
                        v10 = 34;
                        break;
                    }
                    case 3: {
                        v10 = 65;
                        break;
                    }
                    case 4: {
                        v10 = 55;
                        break;
                    }
                    case 5: {
                        v10 = 1;
                        break;
                    }
                    default: {
                        v10 = 75;
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

