/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.honestlyidfk;

import me.mioclient.loader.gson.eD;
import me.mioclient.loader.gson.ep;
import me.mioclient.loader.gson.et;

public class ek {
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;
    public static final int[][] e;
    private static /* synthetic */ int field318;
    private static /* synthetic */ int field319;

    private static String c(eD eD2) {
        char c;
        while ((c = eD2.e()) == ' ' || c == '\t') {
        }
        switch (c) {
            case '\u0000': {
                return null;
            }
            case '\"': 
            case '\'': {
                char c2 = c;
                StringBuilder stringBuilder = new StringBuilder();
                while (true) {
                    char c3;
                    if ((c = eD2.e()) == c2 && (c3 = eD2.e()) != '\"') {
                        if (c3 <= '\u0000') break;
                        eD2.b();
                        break;
                    }
                    if (c == '\u0000' || c == '\n' || c == '\r') {
                        throw eD2.b("Missing close quote '" + c2 + "'.");
                    }
                    stringBuilder.append(c);
                }
                return stringBuilder.toString();
            }
            case ',': {
                eD2.b();
                return "";
            }
        }
        eD2.b();
        return eD2.d(',');
    }

    public static ep a(eD eD2) {
        ep ep2 = new ep();
        block0: while (true) {
            String string = ek.c(eD2);
            char c = eD2.e();
            if (string == null || ep2.a() == 0 && string.length() == 0 && c != ',') {
                return null;
            }
            ep2.a((Object)string);
            while (true) {
                if (c == ',') continue block0;
                if (c != ' ') {
                    if (c == '\n' || c == '\r' || c == '\u0000') {
                        return ep2;
                    }
                    throw eD2.b("Bad character '" + c + "' (" + c + ").");
                }
                c = eD2.e();
            }
            break;
        }
    }

    public static et a(ep ep2, eD eD2) {
        ep ep3 = ek.a(eD2);
        return ep3 != null ? ep3.b(ep2) : null;
    }

    public static String a(ep ep2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < ep2.a(); ++i) {
            Object object;
            if (i > 0) {
                stringBuilder.append(',');
            }
            if ((object = ep2.n(i)) == null) continue;
            String string = object.toString();
            if (string.length() > 0 && (string.indexOf(44) >= 0 || string.indexOf(10) >= 0 || string.indexOf(13) >= 0 || string.indexOf(0) >= 0 || string.charAt(0) == '\"')) {
                stringBuilder.append('\"');
                int n = string.length();
                for (int j = 0; j < n; ++j) {
                    char c = string.charAt(j);
                    if (c < ' ' || c == '\"') continue;
                    stringBuilder.append(c);
                }
                stringBuilder.append('\"');
                continue;
            }
            stringBuilder.append(string);
        }
        stringBuilder.append('\n');
        return stringBuilder.toString();
    }

    public static ep a(String string) {
        return ek.b(new eD(string));
    }

    public static ep b(eD eD2) {
        return ek.b(ek.a(eD2), eD2);
    }

    public static ep a(ep ep2, String string) {
        return ek.b(ep2, new eD(string));
    }

    public static ep b(ep ep2, eD eD2) {
        et et2;
        if (ep2 == null || ep2.a() == 0) {
            return null;
        }
        ep ep3 = new ep();
        while ((et2 = ek.a(ep2, eD2)) != null) {
            ep3.a(et2);
        }
        if (ep3.a() == 0) {
            return null;
        }
        return ep3;
    }

    public static String b(ep ep2) {
        ep ep3;
        et et2 = ep2.t(0);
        if (et2 != null && (ep3 = et2.h()) != null) {
            return ek.a(ep3) + ek.a(ep3, ep2);
        }
        return null;
    }

    public static String a(ep ep2, ep ep3) {
        if (ep2 == null || ep2.a() == 0) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < ep3.a(); ++i) {
            et et2 = ep3.t(i);
            if (et2 == null) continue;
            stringBuilder.append(ek.a(et2.a(ep2)));
        }
        return stringBuilder.toString();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block30: {
                        break block30;
lbl1:
                        // 1 sources

                        return;
                    }
                    ek.field318 = 9616 ^ -22387;
                    ek.field319 = -27317 ^ -22387;
                    ek.e = new int[1][1];
                    var13 = new String[5];
                    var11_1 = 0;
                    var10_2 = "\u00921\u000fqdC\u00a4C\u00ec\u0082\r\u0007\u00fd\u009cu/\u00c3y\u0003\u00c8\n\u00f1";
                    var12_3 = "\u00921\u000fqdC\u00a4C\u00ec\u0082\r\u0007\u00fd\u009cu/\u00c3y\u0003\u00c8\n\u00f1".length();
                    var9_4 = 2;
                    var8_5 = -1;
lbl15:
                    // 2 sources

                    while (true) {
                        v0 = ++var8_5;
                        v1 = var10_2.substring(v0, v0 + var9_4);
                        v2 = -1;
                        break block27;
                        break;
                    }
lbl21:
                    // 1 sources

                    while (true) {
                        var13[var11_1++] = v3.intern();
                        if ((var8_5 += var9_4) < var12_3) {
                            var9_4 = var10_2.charAt(var8_5);
                            ** continue;
                        }
                        var10_2 = "j\u00d8\u0015\u0003V\u00f4\u00b8JP\u00ee\u000eN\u008a\u00eccN\u00d5\u00f6\u0090\u00ed\u00f8\u00fa\u00f15";
                        var12_3 = "j\u00d8\u0015\u0003V\u00f4\u00b8JP\u00ee\u000eN\u008a\u00eccN\u00d5\u00f6\u0090\u00ed\u00f8\u00fa\u00f15".length();
                        var9_4 = 2;
                        var8_5 = -1;
lbl31:
                        // 2 sources

                        while (true) {
                            v4 = ++var8_5;
                            v1 = var10_2.substring(v4, v4 + var9_4);
                            v2 = 0;
                            break block27;
                            break;
                        }
                        break;
                    }
lbl36:
                    // 1 sources

                    while (true) {
                        var13[var11_1++] = v3.intern();
                        if ((var8_5 += var9_4) < var12_3) {
                            var9_4 = var10_2.charAt(var8_5);
                            ** continue;
                        }
                        break block28;
                        break;
                    }
                }
                v5 = v1.toCharArray();
                var14_6 = 0;
                v6 = v5.length;
                v7 = v5;
                v8 = v6;
                if (v6 > 1) ** GOTO lbl86
                do {
                    v9 = v7;
                    v10 = v7;
                    v11 = var14_6;
                    while (true) {
                        v12 = v9[v11];
                        switch (var14_6 % 7) {
                            case 0: {
                                v13 = 41;
                                break;
                            }
                            case 1: {
                                v13 = 122;
                                break;
                            }
                            case 2: {
                                v13 = 38;
                                break;
                            }
                            case 3: {
                                v13 = 10;
                                break;
                            }
                            case 4: {
                                v13 = 100;
                                break;
                            }
                            case 5: {
                                v13 = 117;
                                break;
                            }
                            default: {
                                v13 = 8;
                            }
                        }
                        v9[v11] = (char)(v12 ^ v13);
                        ++var14_6;
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
                } while (v8 > var14_6);
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
            ek.a = var13;
            ek.b = new String[5];
            var0_7 = 3261364728109288338L;
            var6_8 = new long[11];
            var3_9 = 0;
            var4_10 = "\u0089\u00cd\u0081\u0090\u000b\u00ac\u0014\u009265{(_n\u00d9V{\u0004\u000b\u0018\u00b1\u00c87\u000eO\u00cd\u00d4\u00a1\u000f\u0018\u0001\u00dd\u00a7\u00c3=\r\u00b0\u0003\u00fe\u0012\u00f1\u00faO\u00cc\n\u00ec0&\u00cb\u009e\u00afl\u00d0\u00ab\u000e\u00bc\u001a\u00cdw\u00dd\u0089\u0083\u00c1M\u00aer\u0091SX\f\u00ba\u00d3";
            var5_11 = "\u0089\u00cd\u0081\u0090\u000b\u00ac\u0014\u009265{(_n\u00d9V{\u0004\u000b\u0018\u00b1\u00c87\u000eO\u00cd\u00d4\u00a1\u000f\u0018\u0001\u00dd\u00a7\u00c3=\r\u00b0\u0003\u00fe\u0012\u00f1\u00faO\u00cc\n\u00ec0&\u00cb\u009e\u00afl\u00d0\u00ab\u000e\u00bc\u001a\u00cdw\u00dd\u0089\u0083\u00c1M\u00aer\u0091SX\f\u00ba\u00d3".length();
            var2_12 = 0;
            while (true) {
                var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                v16 = var6_8;
                v17 = var3_9++;
                v18 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                v19 = -1;
                break block29;
                break;
            }
lbl113:
            // 1 sources

            while (true) {
                v16[v17] = v20;
                if (var2_12 < var5_11) ** continue;
                var4_10 = "\u00c1\u00057l\u00f7\u0000\u00f1c\u0088\u0011_\u0094D\u00d8\u0003\u00b3";
                var5_11 = "\u00c1\u00057l\u00f7\u0000\u00f1c\u0088\u0011_\u0094D\u00d8\u0003\u00b3".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v16 = var6_8;
                    v17 = var3_9++;
                    v18 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v19 = 0;
                    break block29;
                    break;
                }
                break;
            }
lbl126:
            // 1 sources

            while (true) {
                v16[v17] = v20;
                if (var2_12 < var5_11) ** continue;
                ek.c = var6_8;
                ek.d = new Integer[11];
                ** continue;
                break;
            }
        }
        v20 = v18 ^ var0_7;
        switch (v19) {
            default: {
                ** continue;
            }
            ** case 0:
lbl139:
            // 1 sources

            ** continue;
        }
    }
}

