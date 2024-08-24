/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.UnsafeAllocator;
import com.google.gson.aT;
import com.google.gson.ag_0;
import java.lang.reflect.Type;

/*
 * Renamed from com.google.gson.am
 */
class am_0
implements aT {
    private final UnsafeAllocator d = UnsafeAllocator.a();
    final /* synthetic */ Class a;
    final /* synthetic */ Type b;
    final /* synthetic */ ag_0 c;
    private static final String[] e;
    private static final String[] f;
    public static final int[][] g;
    private static /* synthetic */ int field142;
    private static /* synthetic */ int field143;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    am_0(ag_0 ag_02, Class clazz, Type type) {
        this.c = ag_02;
        this.a = clazz;
        this.b = type;
    }

    @Override
    public Object a() {
        Object object = this.d.a(this.a);
        return object;
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
        am_0.field142 = 4958 ^ -19571;
        am_0.field143 = -26062 ^ -19571;
        am_0.g = new int[2][3];
        var5 = new String[2];
        var3_1 = 0;
        var2_2 = "5Q\u00afK\u0011\u00ab\u00ec\u00ba#\u001a/\u00cc^ZjY\u00fc,\u0011\u0082\u00ce\u00d8\u0006\u00c3\u00cb\u00c3\u00bb\u0016\u00f4\u00e0f3V@\u00a5\u00f2\u00e3\u0093\u0097o\u00d9N\u00af\u00f2\u00db\u00bf\u00c1\u00de\u00cf\u0099t,\u008e\u0012{\u00ce\u00f7f\u0004\u0086\u000fJ9GFQ\u00ae\u00a3\u00e75\u00d3\u00ee\u00cf\u00f5\u009e|\u0091\u0010\u00ebO\u00ff{\u00b6\u0013\u0006R\u001c2\u00e4\u0087\u00df\u0011\u0018\u00d1\u00ca\u00a2Zhg\\>\u0092o\u00eb\u00af\u00ddd/`\u00b3\u0093\u001dm\u0000+\u00feN\u001dJ6";
        var4_3 = "5Q\u00afK\u0011\u00ab\u00ec\u00ba#\u001a/\u00cc^ZjY\u00fc,\u0011\u0082\u00ce\u00d8\u0006\u00c3\u00cb\u00c3\u00bb\u0016\u00f4\u00e0f3V@\u00a5\u00f2\u00e3\u0093\u0097o\u00d9N\u00af\u00f2\u00db\u00bf\u00c1\u00de\u00cf\u0099t,\u008e\u0012{\u00ce\u00f7f\u0004\u0086\u000fJ9GFQ\u00ae\u00a3\u00e75\u00d3\u00ee\u00cf\u00f5\u009e|\u0091\u0010\u00ebO\u00ff{\u00b6\u0013\u0006R\u001c2\u00e4\u0087\u00df\u0011\u0018\u00d1\u00ca\u00a2Zhg\\>\u0092o\u00eb\u00af\u00ddd/`\u00b3\u0093\u001dm\u0000+\u00feN\u001dJ6".length();
        var1_4 = 41;
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
            am_0.e = var5;
            am_0.f = new String[2];
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
                        v10 = 95;
                        break;
                    }
                    case 1: {
                        v10 = 61;
                        break;
                    }
                    case 2: {
                        v10 = 124;
                        break;
                    }
                    case 3: {
                        v10 = 7;
                        break;
                    }
                    case 4: {
                        v10 = 74;
                        break;
                    }
                    case 5: {
                        v10 = 105;
                        break;
                    }
                    default: {
                        v10 = 70;
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

