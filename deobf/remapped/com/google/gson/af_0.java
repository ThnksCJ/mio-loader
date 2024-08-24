/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.ab_0;
import com.google.gson.ac_0;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/*
 * Renamed from com.google.gson.af
 */
final class af_0
implements Serializable,
WildcardType {
    private final Type a;
    private final Type b;
    private static final long c;
    private static final String[] d;
    private static final String[] e;
    private static final long[] f;
    private static final Integer[] g;
    public static final int[][] h;
    private static /* synthetic */ int field10;
    private static /* synthetic */ int field11;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public af_0(Type[] typeArray, Type[] typeArray2) {
        ab_0.a(typeArray2.length <= 1);
        ab_0.a(typeArray.length == 1);
        if (typeArray2.length == 1) {
            ab_0.a(typeArray2[0]);
            ac_0.h(typeArray2[0]);
            ab_0.a(typeArray[0] == Object.class);
            this.b = ac_0.d(typeArray2[0]);
            this.a = Object.class;
            return;
        }
        ab_0.a(typeArray[0]);
        ac_0.h(typeArray[0]);
        this.b = null;
        this.a = ac_0.d(typeArray[0]);
    }

    @Override
    public Type[] getUpperBounds() {
        return new Type[]{this.a};
    }

    @Override
    public Type[] getLowerBounds() {
        Type[] typeArray;
        if (this.b != null) {
            Type[] typeArray2 = new Type[1];
            typeArray = typeArray2;
            typeArray2[0] = this.b;
        } else {
            typeArray = ac_0.a;
        }
        return typeArray;
    }

    public boolean equals(Object object) {
        return object instanceof WildcardType && ac_0.a((Type)this, (WildcardType)object);
    }

    public int hashCode() {
        return (this.b != null ? 31 + this.b.hashCode() : 1) ^ 31 + this.a.hashCode();
    }

    public String toString() {
        if (this.b != null) {
            return "? super " + ac_0.f(this.b);
        }
        if (this.a == Object.class) {
            return "?";
        }
        return "? extends " + ac_0.f(this.a);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block17: {
            block16: {
                block18: {
                    break block18;
lbl1:
                    // 1 sources

                    return;
                }
                af_0.field10 = 16120 ^ -31765;
                af_0.field11 = -29194 ^ -31765;
                af_0.h = new int[4][1];
                af_0.c = 0L;
                var13 = new String[2];
                var11_1 = 0;
                var10_2 = "cM\u0015\r *\u00c5z\u00f5C\bP\u0014e+\u00feB\u00863";
                var12_3 = "cM\u0015\r *\u00c5z\u00f5C\bP\u0014e+\u00feB\u00863".length();
                var9_4 = 10;
                var8_5 = -1;
lbl16:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
lbl18:
                // 1 sources

                while (true) {
                    var13[var11_1++] = new String(v0).intern();
                    if ((var8_5 += var9_4) < var12_3) {
                        var9_4 = var10_2.charAt(var8_5);
                        ** continue;
                    }
                    break block16;
                    break;
                }
                v1 = ++var8_5;
                v2 = var10_2.substring(v1, v1 + var9_4).toCharArray();
                var14_6 = 0;
                v3 = v2.length;
                v4 = v2;
                v5 = v3;
                if (v3 > 1) ** GOTO lbl69
                do {
                    v6 = v4;
                    v7 = v4;
                    v8 = var14_6;
                    while (true) {
                        v9 = v6[v8];
                        switch (var14_6 % 7) {
                            case 0: {
                                v10 = 125;
                                break;
                            }
                            case 1: {
                                v10 = 126;
                                break;
                            }
                            case 2: {
                                v10 = 107;
                                break;
                            }
                            case 3: {
                                v10 = 55;
                                break;
                            }
                            case 4: {
                                v10 = 82;
                                break;
                            }
                            case 5: {
                                v10 = 127;
                                break;
                            }
                            default: {
                                v10 = 31;
                            }
                        }
                        v6[v8] = (char)(v9 ^ v10);
                        ++var14_6;
                        v4 = v7;
                        v5 = v5;
                        if (v5 != 0) break;
                        v7 = v4;
                        v11 = v5;
                        v8 = v5;
                        v6 = v4;
                    }
lbl69:
                    // 2 sources

                    v0 = v4;
                    v11 = v5;
                } while (v5 > var14_6);
                ** while (true)
            }
            af_0.d = var13;
            af_0.e = new String[2];
            var0_7 = 5033623624320893992L;
            var6_8 = new long[2];
            var3_9 = 0;
            var4_10 = "P5\u00c5\u009dDn\u00a0\u007f<\u0088\u00c1\u00cf\u008f\u009bJ)";
            var5_11 = "P5\u00c5\u009dDn\u00a0\u007f<\u0088\u00c1\u00cf\u008f\u009bJ)".length();
            var2_12 = 0;
            while (true) {
                break block17;
                break;
            }
lbl86:
            // 1 sources

            while (true) {
                var6_8[v12] = (((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L) ^ var0_7;
                if (var2_12 < var5_11) ** continue;
                af_0.f = var6_8;
                af_0.g = new Integer[2];
                ** continue;
                break;
            }
        }
        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
        v12 = var3_9++;
        ** while (true)
    }
}

