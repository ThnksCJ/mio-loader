/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.discordipc;

public final class dg
extends Enum {
    public static final /* enum */ dg a;
    public static final /* enum */ dg b;
    public static final /* enum */ dg c;
    public static final /* enum */ dg d;
    public static final /* enum */ dg e;
    private static final dg[] f;
    private static final /* synthetic */ dg[] g;
    public static final int[][] h;
    private static /* synthetic */ int field56;
    private static /* synthetic */ int field57;

    public static dg[] a() {
        return (dg[])g.clone();
    }

    public static dg a(String string) {
        return Enum.valueOf(dg.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private dg() {
        void var2_-1;
        void var1_-1;
    }

    public static dg a(int n) {
        return f[n];
    }

    private static /* synthetic */ dg[] b() {
        return new dg[]{a, b, c, d, e};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block22: {
                    break block22;
lbl1:
                    // 1 sources

                    return;
                }
                dg.field56 = 6318 ^ -1890;
                dg.field57 = -21542 ^ -1890;
                dg.h = new int[3][2];
                var0 = new String[5];
                var4_1 = 0;
                var3_2 = "K3&jJ\u0004X0'~\t@>'}\\p\u0012c:";
                var5_3 = "K3&jJ\u0004X0'~\t@>'}\\p\u0012c:".length();
                var2_4 = 5;
                var1_5 = -1;
lbl15:
                // 2 sources

                while (true) {
                    v0 = ++var1_5;
                    v1 = var3_2.substring(v0, v0 + var2_4);
                    v2 = -1;
                    break block20;
                    break;
                }
lbl21:
                // 1 sources

                while (true) {
                    var0[var4_1++] = v3.intern();
                    if ((var1_5 += var2_4) < var5_3) {
                        var2_4 = var3_2.charAt(var1_5);
                        ** continue;
                    }
                    var3_2 = "X6'~\u0005N-(tJ";
                    var5_3 = "X6'~\u0005N-(tJ".length();
                    var2_4 = 4;
                    var1_5 = -1;
lbl31:
                    // 2 sources

                    while (true) {
                        v4 = ++var1_5;
                        v1 = var3_2.substring(v4, v4 + var2_4);
                        v2 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl36:
                // 1 sources

                while (true) {
                    var0[var4_1++] = v3.intern();
                    if ((var1_5 += var2_4) < var5_3) {
                        var2_4 = var3_2.charAt(var1_5);
                        ** continue;
                    }
                    break block21;
                    break;
                }
            }
            v5 = v1.toCharArray();
            var6_6 = 0;
            v6 = v5.length;
            v7 = v5;
            v8 = v6;
            if (v6 > 1) ** GOTO lbl86
            do {
                v9 = v7;
                v10 = v7;
                v11 = var6_6;
                while (true) {
                    v12 = v9[v11];
                    switch (var6_6 % 7) {
                        case 0: {
                            v13 = 8;
                            break;
                        }
                        case 1: {
                            v13 = 95;
                            break;
                        }
                        case 2: {
                            v13 = 73;
                            break;
                        }
                        case 3: {
                            v13 = 25;
                            break;
                        }
                        case 4: {
                            v13 = 47;
                            break;
                        }
                        case 5: {
                            v13 = 24;
                            break;
                        }
                        default: {
                            v13 = 115;
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
lbl86:
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
lbl95:
                // 1 sources

                ** continue;
            }
        }
        dg.a = new dg(var0[2], 0);
        dg.b = new dg(var0[4], 1);
        dg.c = new dg(var0[0], 2);
        dg.d = new dg(var0[3], 3);
        dg.e = new dg(var0[1], 4);
        dg.g = dg.b();
        dg.f = dg.a();
        ** while (true)
    }
}

