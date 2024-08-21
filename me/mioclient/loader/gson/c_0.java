/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import me.mioclient.loader.gson.d;
import me.mioclient.loader.gson.e;
import me.mioclient.loader.gson.f_0;
import me.mioclient.loader.gson.g_0;
import me.mioclient.loader.gson.i_0;
import me.mioclient.loader.gson.j_0;
import me.mioclient.loader.gson.l_0;

/*
 * Renamed from me.mioclient.loader.gson.c
 */
public abstract class c_0
extends Enum
implements l_0 {
    public static final /* enum */ c_0 a;
    public static final /* enum */ c_0 b;
    public static final /* enum */ c_0 c;
    public static final /* enum */ c_0 d;
    public static final /* enum */ c_0 e;
    public static final /* enum */ c_0 f;
    private static final /* synthetic */ c_0[] g;
    public static final int[][] h;
    private static /* synthetic */ int field52;
    private static /* synthetic */ int field53;

    public static c_0[] a() {
        return (c_0[])g.clone();
    }

    public static c_0 a(String string) {
        return Enum.valueOf(c_0.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private c_0() {
        void var2_-1;
        void var1_-1;
    }

    static String a(String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        int n = string.length();
        for (int i = 0; i < n; ++i) {
            char c = string.charAt(i);
            if (Character.isUpperCase(c) && stringBuilder.length() != 0) {
                stringBuilder.append(string2);
            }
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    static String b(String string) {
        int n;
        int n2 = string.length() - 1;
        for (n = 0; !Character.isLetter(string.charAt(n)) && n < n2; ++n) {
        }
        char c = string.charAt(n);
        if (Character.isUpperCase(c)) {
            return string;
        }
        char c2 = Character.toUpperCase(c);
        if (n == 0) {
            return c2 + string.substring(1);
        }
        return string.substring(0, n) + c2 + string.substring(n + 1);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    /* synthetic */ c_0(d d2) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block23: {
                    break block23;
lbl1:
                    // 1 sources

                    return;
                }
                c_0.field52 = 30925 ^ -20650;
                c_0.field53 = -3191 ^ -20650;
                c_0.h = new int[4][4];
                var4 = new String[6];
                var8_1 = 0;
                var7_2 = "B/6]\u0004m5V2#T\tq7D:9O\u001ff>H,6Y\u0015w%\b^;#V\u0002{\"N\u0016[01]\u0004m5V,#G\u0001{\"_ \"Y\u0005z3D\u0014[01]\u0004m5V,#G\u0001{\"_ \"W\u0002a";
                var9_3 = "B/6]\u0004m5V2#T\tq7D:9O\u001ff>H,6Y\u0015w%\b^;#V\u0002{\"N\u0016[01]\u0004m5V,#G\u0001{\"_ \"Y\u0005z3D\u0014[01]\u0004m5V,#G\u0001{\"_ \"W\u0002a".length();
                var6_4 = 28;
                var5_5 = -1;
lbl15:
                // 2 sources

                while (true) {
                    v0 = ++var5_5;
                    v1 = var7_2.substring(v0, v0 + var6_4);
                    v2 = -1;
                    break block21;
                    break;
                }
lbl21:
                // 1 sources

                while (true) {
                    var4[var8_1++] = v3.intern();
                    if ((var5_5 += var6_4) < var9_3) {
                        var6_4 = var7_2.charAt(var5_5);
                        ** continue;
                    }
                    var7_2 = "[01]\u0004m5V,#G\u0001{\"_ 3V\u0012w$D<)J\u0013a\u0010B/6]\u0004m5V2#T\tq7D:";
                    var9_3 = "[01]\u0004m5V,#G\u0001{\"_ 3V\u0012w$D<)J\u0013a\u0010B/6]\u0004m5V2#T\tq7D:".length();
                    var6_4 = 27;
                    var5_5 = -1;
lbl31:
                    // 2 sources

                    while (true) {
                        v4 = ++var5_5;
                        v1 = var7_2.substring(v4, v4 + var6_4);
                        v2 = 0;
                        break block21;
                        break;
                    }
                    break;
                }
lbl36:
                // 1 sources

                while (true) {
                    var4[var8_1++] = v3.intern();
                    if ((var5_5 += var6_4) < var9_3) {
                        var6_4 = var7_2.charAt(var5_5);
                        ** continue;
                    }
                    break block22;
                    break;
                }
            }
            v5 = v1.toCharArray();
            var10_6 = 0;
            v6 = v5.length;
            v7 = v5;
            v8 = v6;
            if (v6 > 1) ** GOTO lbl86
            do {
                v9 = v7;
                v10 = v7;
                v11 = var10_6;
                while (true) {
                    v12 = v9[v11];
                    switch (var10_6 % 7) {
                        case 0: {
                            v13 = 23;
                            break;
                        }
                        case 1: {
                            v13 = 127;
                            break;
                        }
                        case 2: {
                            v13 = 102;
                            break;
                        }
                        case 3: {
                            v13 = 24;
                            break;
                        }
                        case 4: {
                            v13 = 86;
                            break;
                        }
                        case 5: {
                            v13 = 50;
                            break;
                        }
                        default: {
                            v13 = 118;
                        }
                    }
                    v9[v11] = (char)(v12 ^ v13);
                    ++var10_6;
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
            } while (v8 > var10_6);
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
lbl96:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var2_7 = 2132478535412601786L;
        ** while (true)
        var0_8 = -294004126551256132L ^ var2_7;
        c_0.a = new d();
        c_0.b = new e();
        c_0.c = new f_0();
        c_0.d = new g_0();
        c_0.e = new i_0();
        c_0.f = new j_0();
        v16 = new c_0[(int)var0_8];
        v16[0] = c_0.a;
        v16[1] = c_0.b;
        v16[2] = c_0.c;
        v16[3] = c_0.d;
        v16[4] = c_0.e;
        v16[5] = c_0.f;
        c_0.g = v16;
        ** while (true)
    }
}

