/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.JsonSyntaxException;
import com.google.gson.aT;
import com.google.gson.ag_0;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

/*
 * Renamed from com.google.gson.aq
 */
class aq_0
implements aT {
    final /* synthetic */ Type a;
    final /* synthetic */ ag_0 b;
    private static final String[] c;
    private static final String[] d;
    public static final int[][] e;
    private static /* synthetic */ int field150;
    private static /* synthetic */ int field151;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    aq_0(ag_0 ag_02, Type type) {
        this.b = ag_02;
        this.a = type;
    }

    @Override
    public Object a() {
        if (this.a instanceof ParameterizedType) {
            Type type = ((ParameterizedType)this.a).getActualTypeArguments()[0];
            if (type instanceof Class) {
                return EnumSet.noneOf((Class)type);
            }
            throw new JsonSyntaxException("Invalid EnumSet type: " + this.a.toString());
        }
        throw new JsonSyntaxException("Invalid EnumSet type: " + this.a.toString());
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
        aq_0.field150 = 19534 ^ -17141;
        aq_0.field151 = -2983 ^ -17141;
        aq_0.e = new int[3][1];
        var5 = new String[2];
        var3_1 = 0;
        var2_2 = "Yz\u00e5\u00b3m\u00d7\u00b0S\u0093\u00f8\u00d4\u00d4\u0097\u00a7r5\u0018\u00c5\u008c\u000eM\u00e5\u0016\u0088V\u00df6*gXE\u008e:w\u008c\u00e3\u00ac\u00fcT\u00c9\u00e9\u00b6\u008b\nU";
        var4_3 = "Yz\u00e5\u00b3m\u00d7\u00b0S\u0093\u00f8\u00d4\u00d4\u0097\u00a7r5\u0018\u00c5\u008c\u000eM\u00e5\u0016\u0088V\u00df6*gXE\u008e:w\u008c\u00e3\u00ac\u00fcT\u00c9\u00e9\u00b6\u008b\nU".length();
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
            aq_0.c = var5;
            aq_0.d = new String[2];
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
                        v10 = 4;
                        break;
                    }
                    case 1: {
                        v10 = 3;
                        break;
                    }
                    case 2: {
                        v10 = 88;
                        break;
                    }
                    case 3: {
                        v10 = 94;
                        break;
                    }
                    case 4: {
                        v10 = 14;
                        break;
                    }
                    case 5: {
                        v10 = 78;
                        break;
                    }
                    default: {
                        v10 = 89;
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

