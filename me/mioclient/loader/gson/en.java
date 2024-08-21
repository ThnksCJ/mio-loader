/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.util.Locale;
import me.mioclient.loader.gson.eo;
import me.mioclient.loader.gson.eq;
import me.mioclient.loader.gson.et;

public class en {
    public static final String a;
    private static final String[] b;
    private static final String[] c;
    private static final long[] d;
    private static final Integer[] e;
    public static final int[][] f;
    private static /* synthetic */ int field324;
    private static /* synthetic */ int field325;

    public static et a(String string) {
        et et2 = new et();
        eo eo2 = new eo(string);
        String string2 = eo2.a();
        if (string2.toUpperCase(Locale.ROOT).startsWith("HTTP")) {
            et2.c("HTTP-Version", string2);
            et2.c("Status-Code", eo2.a());
            et2.c("Reason-Phrase", eo2.d('\u0000'));
            eo2.e();
        } else {
            et2.c("Method", string2);
            et2.c("Request-URI", eo2.a());
            et2.c("HTTP-Version", eo2.a());
        }
        while (eo2.d()) {
            String string3 = eo2.d(':');
            eo2.b(':');
            et2.c(string3, eo2.d('\u0000'));
            eo2.e();
        }
        return et2;
    }

    public static String a(et et2) {
        StringBuilder stringBuilder = new StringBuilder();
        if (et2.m("Status-Code") && et2.m("Reason-Phrase")) {
            stringBuilder.append(et2.l("HTTP-Version"));
            stringBuilder.append(' ');
            stringBuilder.append(et2.l("Status-Code"));
            stringBuilder.append(' ');
            stringBuilder.append(et2.l("Reason-Phrase"));
        } else if (et2.m("Method") && et2.m("Request-URI")) {
            stringBuilder.append(et2.l("Method"));
            stringBuilder.append(' ');
            stringBuilder.append('\"');
            stringBuilder.append(et2.l("Request-URI"));
            stringBuilder.append('\"');
            stringBuilder.append(' ');
            stringBuilder.append(et2.l("HTTP-Version"));
        } else {
            throw new eq("Not enough material for an HTTP header.");
        }
        stringBuilder.append("\r\n");
        for (String string : et2.c()) {
            String string2 = et2.y(string);
            if ("HTTP-Version".equals(string) || "Status-Code".equals(string) || "Reason-Phrase".equals(string) || "Method".equals(string) || "Request-URI".equals(string) || et.b.equals(string2)) continue;
            stringBuilder.append(string);
            stringBuilder.append(": ");
            stringBuilder.append(et2.y(string));
            stringBuilder.append("\r\n");
        }
        stringBuilder.append("\r\n");
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
                    en.field324 = 25884 ^ -28202;
                    en.field325 = -9073 ^ -28202;
                    en.f = new int[3][3];
                    var13 = new String[16];
                    var11_1 = 0;
                    var10_2 = "\u00eaE\u0083\u00c4\f\u00abH\u00abe0\u00cd\u00c8\u00e8F\u0083X\u00ec'&\u00e9\u00fc}\u00b6\u0088Sxjw\u0004P\u00a8\u009d\u0082\u00de;d\u00f9\u008c\u009beN\u00c5vD\u00ce@\u0016\u00f8\u0087\u0003tL\u00a9\u009b\u00f8\"\u001a\u000b\u00f2\u00e4\u00fc\u00c2\u0013\u009d\u00fc<\u00d5\u0096\u00ee\u0002\u009e\u00d5\u000b\n\u00c2\u00d24\u00d4bO\u00ad\u00eb1x\u0002\u0096D\u0002@\u00d9\rtD<\u00d0\u0013\u0004\u00ee\u00cc\u00d8z\u00fd\u00b6\u00fa\u0002L\u001e\r\\'9\u00bc\u00b3\u0089\u00fa}ZL\u00adp\u00f0\u0006\u00f5\u00c5\u00e5\u00fb\u009f\u0013\u000b\u00f9n\u009d\u0093?\u00b7yye>\u00f8\u0006\u000b\u00e0:_d\u0087";
                    var12_3 = "\u00eaE\u0083\u00c4\f\u00abH\u00abe0\u00cd\u00c8\u00e8F\u0083X\u00ec'&\u00e9\u00fc}\u00b6\u0088Sxjw\u0004P\u00a8\u009d\u0082\u00de;d\u00f9\u008c\u009beN\u00c5vD\u00ce@\u0016\u00f8\u0087\u0003tL\u00a9\u009b\u00f8\"\u001a\u000b\u00f2\u00e4\u00fc\u00c2\u0013\u009d\u00fc<\u00d5\u0096\u00ee\u0002\u009e\u00d5\u000b\n\u00c2\u00d24\u00d4bO\u00ad\u00eb1x\u0002\u0096D\u0002@\u00d9\rtD<\u00d0\u0013\u0004\u00ee\u00cc\u00d8z\u00fd\u00b6\u00fa\u0002L\u001e\r\\'9\u00bc\u00b3\u0089\u00fa}ZL\u00adp\u00f0\u0006\u00f5\u00c5\u00e5\u00fb\u009f\u0013\u000b\u00f9n\u009d\u0093?\u00b7yye>\u00f8\u0006\u000b\u00e0:_d\u0087".length();
                    var9_4 = 4;
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
                        var10_2 = "\u0018\u00f0\u0090r\u009c\u00aaF\u00b4\u00ca\u0012\\\f\u00a8\u00c1\u00cbT<\u00ebI,v\u001b^\u00ff";
                        var12_3 = "\u0018\u00f0\u0090r\u009c\u00aaF\u00b4\u00ca\u0012\\\f\u00a8\u00c1\u00cbT<\u00ebI,v\u001b^\u00ff".length();
                        var9_4 = 11;
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
                                v13 = 63;
                                break;
                            }
                            case 1: {
                                v13 = 77;
                                break;
                            }
                            case 2: {
                                v13 = 44;
                                break;
                            }
                            case 3: {
                                v13 = 75;
                                break;
                            }
                            case 4: {
                                v13 = 51;
                                break;
                            }
                            case 5: {
                                v13 = 4;
                                break;
                            }
                            default: {
                                v13 = 69;
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
            en.b = var13;
            en.c = new String[16];
            en.a = "\r\n";
            var0_7 = 6992602010050456531L;
            var6_8 = new long[6];
            var3_9 = 0;
            var4_10 = "%\u0096<S\u0082\u0097\u00e7D\u00c6\u000e\u00b2(\u00e4\u00e3\u0083\u00fa\u00a5\u00a4\u00a2\u0015\u00c0^\u00a9\u0018\u0007\u00e0\fR\u009aA\u00f4\u00cf";
            var5_11 = "%\u0096<S\u0082\u0097\u00e7D\u00c6\u000e\u00b2(\u00e4\u00e3\u0083\u00fa\u00a5\u00a4\u00a2\u0015\u00c0^\u00a9\u0018\u0007\u00e0\fR\u009aA\u00f4\u00cf".length();
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
lbl114:
            // 1 sources

            while (true) {
                v16[v17] = v20;
                if (var2_12 < var5_11) ** continue;
                var4_10 = "\u00f0\u00a0A\u00c0\u00c64\u00ba\u0016\u00c1\u00ec\u00bd\u00f4\u0087\u00b6\u00a3\u00df";
                var5_11 = "\u00f0\u00a0A\u00c0\u00c64\u00ba\u0016\u00c1\u00ec\u00bd\u00f4\u0087\u00b6\u00a3\u00df".length();
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
lbl127:
            // 1 sources

            while (true) {
                v16[v17] = v20;
                if (var2_12 < var5_11) ** continue;
                en.d = var6_8;
                en.e = new Integer[6];
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
lbl140:
            // 1 sources

            ** continue;
        }
    }
}

