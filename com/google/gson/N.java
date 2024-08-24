/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.O;
import com.google.gson.P;
import com.google.gson.Q;
import com.google.gson.R;
import com.google.gson.S;

public abstract class N
extends Enum
implements S {
    public static final /* enum */ N a;
    public static final /* enum */ N b;
    public static final /* enum */ N c;
    public static final /* enum */ N d;
    private static final /* synthetic */ N[] e;
    public static final int[][] f;
    private static /* synthetic */ int field58;
    private static /* synthetic */ int field59;

    public static N[] a() {
        return (N[])e.clone();
    }

    public static N a(String string) {
        return Enum.valueOf(N.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private N() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    /* synthetic */ N(O o) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
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
                N.field58 = 32349 ^ -31944;
                N.field59 = -27284 ^ -31944;
                N.f = new int[2][4];
                var0 = new String[4];
                var4_1 = 0;
                var3_2 = "wG\u0015S\"}\u000bdL\u0014A?~\u001c\u0006\u007fG\u000eV1w";
                var5_3 = "wG\u0015S\"}\u000bdL\u0014A?~\u001c\u0006\u007fG\u000eV1w".length();
                var2_4 = 14;
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
                    var3_2 = "yA\u001cK9w\u001arE\u001aX\u0014wI\u0001]1k\u0006kI\tG8v\u0006u]\u0016V8`";
                    var5_3 = "yA\u001cK9w\u001arE\u001aX\u0014wI\u0001]1k\u0006kI\tG8v\u0006u]\u0016V8`".length();
                    var2_4 = 11;
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
                            v13 = 59;
                            break;
                        }
                        case 1: {
                            v13 = 8;
                            break;
                        }
                        case 2: {
                            v13 = 91;
                            break;
                        }
                        case 3: {
                            v13 = 20;
                            break;
                        }
                        case 4: {
                            v13 = 125;
                            break;
                        }
                        case 5: {
                            v13 = 50;
                            break;
                        }
                        default: {
                            v13 = 89;
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
        N.a = new O();
        N.b = new P();
        N.c = new Q();
        N.d = new R();
        N.e = new N[]{N.a, N.b, N.c, N.d};
        ** while (true)
    }
}

