/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.honestlyidfk;

public final class ej
extends Enum {
    public static final /* enum */ ej a;
    public static final /* enum */ ej b;
    public static final /* enum */ ej c;
    public static final /* enum */ ej d;
    public static final /* enum */ ej e;
    public static final /* enum */ ej f;
    private static final /* synthetic */ ej[] g;
    private static final long h;
    public static final int[][] i;
    private static /* synthetic */ int field66;
    private static /* synthetic */ int field67;

    public static ej[] a() {
        return (ej[])g.clone();
    }

    public static ej a(String string) {
        return Enum.valueOf(ej.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private ej() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ ej[] b() {
        ej[] ejArray = new ej[(int)h];
        ejArray[0] = a;
        ejArray[1] = b;
        ejArray[2] = c;
        ejArray[3] = d;
        ejArray[4] = e;
        ejArray[5] = f;
        return ejArray;
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
                ej.field66 = 24423 ^ -15476;
                ej.field67 = -32281 ^ -15476;
                ej.i = new int[3][3];
                var2 = new String[6];
                var6_1 = 0;
                var5_2 = "7W2+&X\u001b\u0006&L/.-^\b3M3$7P\u001a\u001b\u00038Y-";
                var7_3 = "7W2+&X\u001b\u0006&L/.-^\b3M3$7P\u001a\u001b\u00038Y-".length();
                var4_4 = 7;
                var3_5 = -1;
lbl15:
                // 2 sources

                while (true) {
                    v0 = ++var3_5;
                    v1 = var5_2.substring(v0, v0 + var4_4);
                    v2 = -1;
                    break block21;
                    break;
                }
lbl21:
                // 1 sources

                while (true) {
                    var2[var6_1++] = v3.intern();
                    if ((var3_5 += var4_4) < var7_3) {
                        var4_4 = var5_2.charAt(var3_5);
                        ** continue;
                    }
                    var5_2 = ";M0%&K\u0004;M1+";
                    var7_3 = ";M0%&K\u0004;M1+".length();
                    var4_4 = 6;
                    var3_5 = -1;
lbl31:
                    // 2 sources

                    while (true) {
                        v4 = ++var3_5;
                        v1 = var5_2.substring(v4, v4 + var4_4);
                        v2 = 0;
                        break block21;
                        break;
                    }
                    break;
                }
lbl36:
                // 1 sources

                while (true) {
                    var2[var6_1++] = v3.intern();
                    if ((var3_5 += var4_4) < var7_3) {
                        var4_4 = var5_2.charAt(var3_5);
                        ** continue;
                    }
                    break block22;
                    break;
                }
            }
            v5 = v1.toCharArray();
            var8_6 = 0;
            v6 = v5.length;
            v7 = v5;
            v8 = v6;
            if (v6 > 1) ** GOTO lbl86
            do {
                v9 = v7;
                v10 = v7;
                v11 = var8_6;
                while (true) {
                    v12 = v9[v11];
                    switch (var8_6 % 7) {
                        case 0: {
                            v13 = 117;
                            break;
                        }
                        case 1: {
                            v13 = 56;
                            break;
                        }
                        case 2: {
                            v13 = 93;
                            break;
                        }
                        case 3: {
                            v13 = 71;
                            break;
                        }
                        case 4: {
                            v13 = 67;
                            break;
                        }
                        case 5: {
                            v13 = 57;
                            break;
                        }
                        default: {
                            v13 = 117;
                        }
                    }
                    v9[v11] = (char)(v12 ^ v13);
                    ++var8_6;
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
            } while (v8 > var8_6);
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
        var0_7 = 2355904735619270066L;
        ** while (true)
        ej.h = 4734823078616319412L ^ var0_7;
        ej.a = new ej(var2[5], 0);
        ej.b = new ej(var2[0], 1);
        ej.c = new ej(var2[4], 2);
        ej.d = new ej(var2[1], 3);
        ej.e = new ej(var2[2], 4);
        ej.f = new ej(var2[3], 5);
        ej.g = ej.b();
        ** while (true)
    }
}

