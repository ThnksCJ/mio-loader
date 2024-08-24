/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.JsonReader;
import com.google.gson.T;
import com.google.gson.cO;

class bL
extends T {
    private static final String[] a;
    private static final String[] b;
    public static final int[][] c;
    private static /* synthetic */ int field74;
    private static /* synthetic */ int field75;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    bL() {
    }

    public void a(cO cO2, Class clazz) {
        throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + clazz.getName() + ". Forgot to register a type adapter?");
    }

    public Class a(JsonReader jsonReader) {
        throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
    }

    @Override
    public /* synthetic */ Object b(JsonReader jsonReader) {
        return this.a(jsonReader);
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
        bL.field74 = 2023 ^ -18242;
        bL.field75 = -28757 ^ -18242;
        bL.c = new int[2][1];
        var5 = new String[3];
        var3_1 = 0;
        var2_2 = "\u0018%\u00a3\u00913\u00e4\u00bfel\u00f8\u00bb\u0084\u00c2\f\u00fb\u00ebb\u008a\u00b4\u001a`\u0080\u001c\u000el@\u00ce\u00f3\u001a\u00f1q\u00besp\u0084\u00a6\u0007Wm\u0007$8\u00e8\u0017\u00fc\u00ce\u0015\u00e7\u00bf[\u00c4\u008a\u0092\u00ce~`jI\u00d7\u0081\u001d\u00b4\u001c\u0097\u0007\u0005\u00ba\u00fcd\u00d5\u00c9+\u000b\u008c\u0015t\u00b6N\u00fbu\u00df\u009b\u00bc\u00a5NMR\u00fd|$:\u000f\u00e4\u007f\u008d*\u00c1w}(1\u0099\u0099KX#\u00ac0\u0004:q\u00a2\u00cc\u009c\u0011\u00e6\u000fF\u001c\u009bRKZ\u0088g\u009b\u00d2n\u00fd\u00fe^\u00d5T\u00963w#t\u00cci\u001d\u0092\u00a2\u00d6\u00a3\u0080(#O!x\u0016\u00e6\u00b69\u00c2";
        var4_3 = "\u0018%\u00a3\u00913\u00e4\u00bfel\u00f8\u00bb\u0084\u00c2\f\u00fb\u00ebb\u008a\u00b4\u001a`\u0080\u001c\u000el@\u00ce\u00f3\u001a\u00f1q\u00besp\u0084\u00a6\u0007Wm\u0007$8\u00e8\u0017\u00fc\u00ce\u0015\u00e7\u00bf[\u00c4\u008a\u0092\u00ce~`jI\u00d7\u0081\u001d\u00b4\u001c\u0097\u0007\u0005\u00ba\u00fcd\u00d5\u00c9+\u000b\u008c\u0015t\u00b6N\u00fbu\u00df\u009b\u00bc\u00a5NMR\u00fd|$:\u000f\u00e4\u007f\u008d*\u00c1w}(1\u0099\u0099KX#\u00ac0\u0004:q\u00a2\u00cc\u009c\u0011\u00e6\u000fF\u001c\u009bRKZ\u0088g\u009b\u00d2n\u00fd\u00fe^\u00d5T\u00963w#t\u00cci\u001d\u0092\u00a2\u00d6\u00a3\u0080(#O!x\u0016\u00e6\u00b69\u00c2".length();
        var1_4 = 40;
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
            bL.a = var5;
            bL.b = new String[3];
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
                        v10 = 7;
                        break;
                    }
                    case 1: {
                        v10 = 69;
                        break;
                    }
                    case 2: {
                        v10 = 93;
                        break;
                    }
                    case 3: {
                        v10 = 2;
                        break;
                    }
                    case 4: {
                        v10 = 123;
                        break;
                    }
                    case 5: {
                        v10 = 47;
                        break;
                    }
                    default: {
                        v10 = 2;
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

