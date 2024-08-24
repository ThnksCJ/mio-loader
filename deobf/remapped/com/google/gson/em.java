/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.eD;
import com.google.gson.el_0;
import com.google.gson.et;

public class em {
    private static final long[] a;
    private static final Integer[] b;
    public static final int[][] c;
    private static /* synthetic */ int field322;
    private static /* synthetic */ int field323;

    public static et a(String string) {
        et et2 = new et();
        eD eD2 = new eD(string);
        while (eD2.d()) {
            String string2 = el_0.c(eD2.d('='));
            eD2.b('=');
            et2.c(string2, el_0.c(eD2.d(';')));
            eD2.e();
        }
        return et2;
    }

    public static String a(et et2) {
        boolean bl2 = false;
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : et2.c()) {
            Object object = et2.p(string);
            if (et.b.equals(object)) continue;
            if (bl2) {
                stringBuilder.append(';');
            }
            stringBuilder.append(el_0.a(string));
            stringBuilder.append("=");
            stringBuilder.append(el_0.a(object.toString()));
            bl2 = true;
        }
        return stringBuilder.toString();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block9: {
                break block9;
lbl1:
                // 1 sources

                return;
            }
            em.field322 = 17423 ^ -29893;
            em.field323 = -4760 ^ -29893;
            em.c = new int[2][2];
            var0 = 7792488550617536128L;
            var6_1 = new long[4];
            var3_2 = 0;
            var4_3 = "{'\u00ec\u00a1c=:x|\u00bd\u00da@Y\u00bd0\u00a8";
            var5_4 = "{'\u00ec\u00a1c=:x|\u00bd\u00da@Y\u00bd0\u00a8".length();
            var2_5 = 0;
            while (true) {
                var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                v0 = var6_1;
                v1 = var3_2++;
                v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                v3 = -1;
                break block8;
                break;
            }
lbl22:
            // 1 sources

            while (true) {
                v0[v1] = v4;
                if (var2_5 < var5_4) ** continue;
                var4_3 = "\u0013\u00bc/K%\u0088\u009e\u00c3\u0006\u00d5\u00ff\u00d5@\u00a5s6";
                var5_4 = "\u0013\u00bc/K%\u0088\u009e\u00c3\u0006\u00d5\u00ff\u00d5@\u00a5s6".length();
                var2_5 = 0;
                while (true) {
                    var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                    v0 = var6_1;
                    v1 = var3_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = 0;
                    break block8;
                    break;
                }
                break;
            }
lbl35:
            // 1 sources

            while (true) {
                v0[v1] = v4;
                if (var2_5 < var5_4) ** continue;
                em.a = var6_1;
                em.b = new Integer[4];
                ** continue;
                break;
            }
        }
        v4 = v2 ^ var0;
        switch (v3) {
            default: {
                ** continue;
            }
            ** case 0:
lbl48:
            // 1 sources

            ** continue;
        }
    }
}

