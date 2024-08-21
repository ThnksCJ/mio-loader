/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import me.mioclient.loader.gson.JsonElement;
import me.mioclient.loader.gson.L;
import me.mioclient.loader.gson.M;

public abstract class K
extends Enum {
    public static final /* enum */ K a;
    public static final /* enum */ K b;
    private static final /* synthetic */ K[] c;
    public static final int[][] d;
    private static /* synthetic */ int asdasda;
    private static /* synthetic */ int asdasdasdadasd;

    public static K[] a() {
        return (K[])c.clone();
    }

    public static K a(String string) {
        return Enum.valueOf(K.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private K() {
        void var2_-1;
        void var1_-1;
    }

    public abstract JsonElement a(Long var1);

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    /* synthetic */ K(L l) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block15: {
                break block15;
lbl1:
                // 1 sources

                return;
            }
            K.asdasda = 30965 ^ -8266;
            K.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               = -14749 ^ -8266;
            K.d = new int[4][3];
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "}ZR\"_\u0000I\u0006jKF*D\u000b";
            var5_3 = "}ZR\"_\u0000I\u0006jKF*D\u000b".length();
            var2_4 = 7;
            var1_5 = -1;
lbl15:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl17:
            // 1 sources

            while (true) {
                var0[var4_1++] = new String(v0).intern();
                if ((var1_5 += var2_4) < var5_3) {
                    var2_4 = var3_2.charAt(var1_5);
                    ** continue;
                }
                break block14;
                break;
            }
            v1 = ++var1_5;
            v2 = var3_2.substring(v1, v1 + var2_4).toCharArray();
            var6_6 = 0;
            v3 = v2.length;
            v4 = v2;
            v5 = v3;
            if (v3 > 1) ** GOTO lbl68
            do {
                v6 = v4;
                v7 = v4;
                v8 = var6_6;
                while (true) {
                    v9 = v6[v8];
                    switch (var6_6 % 7) {
                        case 0: {
                            v10 = 57;
                            break;
                        }
                        case 1: {
                            v10 = 31;
                            break;
                        }
                        case 2: {
                            v10 = 20;
                            break;
                        }
                        case 3: {
                            v10 = 99;
                            break;
                        }
                        case 4: {
                            v10 = 10;
                            break;
                        }
                        case 5: {
                            v10 = 76;
                            break;
                        }
                        default: {
                            v10 = 29;
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
lbl68:
                // 2 sources

                v0 = v4;
                v11 = v5;
            } while (v5 > var6_6);
            ** while (true)
        }
        K.a = new L();
        K.b = new M();
        K.c = new K[]{K.a, K.b};
        ** while (true)
    }
}

