/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.lang.reflect.Constructor;
import me.mioclient.loader.gson.aT;
import me.mioclient.loader.gson.ag_0;

/*
 * Renamed from me.mioclient.loader.gson.ao
 */
class ao_0
implements aT {
    final /* synthetic */ Constructor a;
    final /* synthetic */ ag_0 b;
    private static final String[] c;
    private static final String[] d;
    public static final int[][] e;
    private static /* synthetic */ int field138;
    private static /* synthetic */ int field139;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    ao_0(ag_0 ag_02, Constructor constructor) {
        this.b = ag_02;
        this.a = constructor;
    }

    @Override
    public Object a() {
        Object[] objectArray = null;
        return this.a.newInstance(objectArray);
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
            ao_0.field138 = 2459 ^ -31180;
            ao_0.field139 = -3277 ^ -31180;
            ao_0.e = new int[2][2];
            var5 = new String[4];
            var3_1 = 0;
            var2_2 = "K\u00d1G\u008c\u00c0<r\u00ccc\u0019a\r\u0014\u0011\u00c1\u0093\u00bc\b\u00b2\u00f3\u00de\u00e2>\u00e5w\u00f2\u00ab\u00f3\u00a67\u0091";
            var4_3 = "K\u00d1G\u008c\u00c0<r\u00ccc\u0019a\r\u0014\u0011\u00c1\u0093\u00bc\b\u00b2\u00f3\u00de\u00e2>\u00e5w\u00f2\u00ab\u00f3\u00a67\u0091".length();
            var1_4 = 13;
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
                var2_2 = "\u000f\u00e5e\u00c6\u0089*\u00b9\u00d9\u00d2\u0082\u00ea\u001e\u0018n\u00d0\u0084_\r\u00c6\u0088\u00f6\u00a7\u00f6Y\u00b4`\u00bb\u008cz\u00bfw";
                var4_3 = "\u000f\u00e5e\u00c6\u0089*\u00b9\u00d9\u00d2\u0082\u00ea\u001e\u0018n\u00d0\u0084_\r\u00c6\u0088\u00f6\u00a7\u00f6Y\u00b4`\u00bb\u008cz\u00bfw".length();
                var1_4 = 17;
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
                ao_0.c = var5;
                ao_0.d = new String[4];
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
                        v13 = 2;
                        break;
                    }
                    case 1: {
                        v13 = 3;
                        break;
                    }
                    case 2: {
                        v13 = 35;
                        break;
                    }
                    case 3: {
                        v13 = 59;
                        break;
                    }
                    case 4: {
                        v13 = 96;
                        break;
                    }
                    case 5: {
                        v13 = 16;
                        break;
                    }
                    default: {
                        v13 = 109;
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

