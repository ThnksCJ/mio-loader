/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.eD;
import com.google.gson.eq;
import com.google.gson.et;
import java.util.Locale;

/*
 * Renamed from com.google.gson.el
 */
public class el_0 {
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;
    public static final int[][] e;
    private static /* synthetic */ int field320;
    private static /* synthetic */ int field321;

    public static String a(String string) {
        String string2 = string.trim();
        int n = string2.length();
        StringBuilder stringBuilder = new StringBuilder(n);
        for (int i = 0; i < n; ++i) {
            char c2 = string2.charAt(i);
            if (c2 < ' ' || c2 == '+' || c2 == '%' || c2 == '=' || c2 == ';') {
                stringBuilder.append('%');
                stringBuilder.append(Character.forDigit((char)(c2 >>> 4), 16));
                stringBuilder.append(Character.forDigit(c2, 16));
                continue;
            }
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    public static et b(String string) {
        et et2 = new et();
        eD eD2 = new eD(string);
        String string2 = el_0.c(eD2.d('=').trim());
        if ("".equals(string2)) {
            throw new eq("Cookies must have a 'name'");
        }
        et2.c("name", string2);
        eD2.b('=');
        et2.c("value", el_0.c(eD2.d(';')).trim());
        eD2.e();
        while (eD2.d()) {
            Object object;
            string2 = el_0.c(eD2.a("=;")).trim().toLowerCase(Locale.ROOT);
            if ("name".equalsIgnoreCase(string2)) {
                throw new eq("Illegal attribute name: 'name'");
            }
            if ("value".equalsIgnoreCase(string2)) {
                throw new eq("Illegal attribute name: 'value'");
            }
            if (eD2.e() != '=') {
                object = Boolean.TRUE;
            } else {
                object = el_0.c(eD2.d(';')).trim();
                eD2.e();
            }
            if ("".equals(string2) || "".equals(object)) continue;
            et2.c(string2, object);
        }
        return et2;
    }

    public static String a(et et2) {
        StringBuilder stringBuilder = new StringBuilder();
        String string = null;
        Object object = null;
        for (String string2 : et2.c()) {
            if ("name".equalsIgnoreCase(string2)) {
                string = et2.l(string2).trim();
            }
            if ("value".equalsIgnoreCase(string2)) {
                object = et2.l(string2).trim();
            }
            if (string == null || object == null) continue;
            break;
        }
        if (string == null || "".equals(string.trim())) {
            throw new eq("Cookie does not have a name");
        }
        if (object == null) {
            object = "";
        }
        stringBuilder.append(el_0.a(string));
        stringBuilder.append("=");
        stringBuilder.append(el_0.a((String)object));
        for (String string2 : et2.c()) {
            if ("name".equalsIgnoreCase(string2) || "value".equalsIgnoreCase(string2)) continue;
            object = et2.p(string2);
            if (object instanceof Boolean) {
                if (!Boolean.TRUE.equals(object)) continue;
                stringBuilder.append(';').append(el_0.a(string2));
                continue;
            }
            stringBuilder.append(';').append(el_0.a(string2)).append('=').append(el_0.a(object.toString()));
        }
        return stringBuilder.toString();
    }

    public static String c(String string) {
        int n = string.length();
        StringBuilder stringBuilder = new StringBuilder(n);
        for (int i = 0; i < n; ++i) {
            char c2 = string.charAt(i);
            if (c2 == '+') {
                c2 = ' ';
            } else if (c2 == '%' && i + 2 < n) {
                int n2 = eD.a(string.charAt(i + 1));
                int n3 = eD.a(string.charAt(i + 2));
                if (n2 >= 0 && n3 >= 0) {
                    c2 = (char)(n2 * 16 + n3);
                    i += 2;
                }
            }
            stringBuilder.append(c2);
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
                    el_0.field320 = 18064 ^ -1251;
                    el_0.field321 = -28432 ^ -1251;
                    el_0.e = new int[4][4];
                    var13 = new String[9];
                    var11_1 = 0;
                    var10_2 = "u\u00ff\u009b\u00d7\u00d6\u0005\u00ba\u00d9b\u0013\u00e9\u001e\u0003\u0001\u008d\u00b4\u0016\u009c\u001e\u0012\u00ef\u00f3\u00d4\u00d7\u00ab\u009f\u00a8\u0005Jj\u00cf\u00aa\f\u0091\u00d7:\u00b0,\u0016p\u0006E\u0004\u00b7\u00d3\u00d9B\u001b\u00ba\u00e5\u00f2E\u0094i\u00cdl^\u00e1*\u00f4\u0094\u00ee\u00a9\u00d3F/\u00fao\u00fc\u00a97\u00f7\u00b3\u0011\u00fc\u001a\u00a5\u0088\u0011\u00e8\u00e8\u00dc\u0011\u009e\u00fec|\u00e2\u0010\u00f5\u00ab\u0001\u00bc\u00a8\u001e\u00b3\u0092\u00d0\\5\u00b3`\u001f\r\u00dfLo.\u00e7\u0019}\u000f\u001e\u00c8j((\u00d8\u00f3D\u00b4\u000eq4\u00ea\u00d0UP\u00d9\n\u00d4\u0095\u00b2\u00af";
                    var12_3 = "u\u00ff\u009b\u00d7\u00d6\u0005\u00ba\u00d9b\u0013\u00e9\u001e\u0003\u0001\u008d\u00b4\u0016\u009c\u001e\u0012\u00ef\u00f3\u00d4\u00d7\u00ab\u009f\u00a8\u0005Jj\u00cf\u00aa\f\u0091\u00d7:\u00b0,\u0016p\u0006E\u0004\u00b7\u00d3\u00d9B\u001b\u00ba\u00e5\u00f2E\u0094i\u00cdl^\u00e1*\u00f4\u0094\u00ee\u00a9\u00d3F/\u00fao\u00fc\u00a97\u00f7\u00b3\u0011\u00fc\u001a\u00a5\u0088\u0011\u00e8\u00e8\u00dc\u0011\u009e\u00fec|\u00e2\u0010\u00f5\u00ab\u0001\u00bc\u00a8\u001e\u00b3\u0092\u00d0\\5\u00b3`\u001f\r\u00dfLo.\u00e7\u0019}\u000f\u001e\u00c8j((\u00d8\u00f3D\u00b4\u000eq4\u00ea\u00d0UP\u00d9\n\u00d4\u0095\u00b2\u00af".length();
                    var9_4 = 5;
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
                        var10_2 = "\u00ff\u00ae\u00d0\u00ed\u0002\u0013\u0005";
                        var12_3 = "\u00ff\u00ae\u00d0\u00ed\u0002\u0013\u0005".length();
                        var9_4 = 4;
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
                                v13 = 77;
                                break;
                            }
                            case 1: {
                                v13 = 107;
                                break;
                            }
                            case 2: {
                                v13 = 72;
                                break;
                            }
                            case 3: {
                                v13 = 125;
                                break;
                            }
                            case 4: {
                                v13 = 40;
                                break;
                            }
                            case 5: {
                                v13 = 13;
                                break;
                            }
                            default: {
                                v13 = 62;
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
            el_0.a = var13;
            el_0.b = new String[9];
            var0_7 = 1751029351405687099L;
            var6_8 = new long[14];
            var3_9 = 0;
            var4_10 = "\u00d4W\u00ef<\\Q\\\u0017\u00a22\u007f.\u00e5\u00bci\u00157\u0093\u00af\u00fd`[^\u00f99\u00f2K\u0085\u00cd\u00b0\u00afP\u00a1\u00b2\u00ce\r>\u0082\u0010\u00fd\u00de\u0004O\u0097\u00c2\u0092\u0093T\u00d6\u00aaW\f\"\u0001R\b\u00dc\u0002\u00d3\u000b\u00d31\u0005b\u00fc)\u009b\u00bb\"\u0001\u00d1\u00b0\u00a8[.\u009bGBh5\u00e5!\u008d=\u00fa\u00e8;\u000f\u0007\u008f\u009b\u00e9\u00a8J\u00ca\u00f2";
            var5_11 = "\u00d4W\u00ef<\\Q\\\u0017\u00a22\u007f.\u00e5\u00bci\u00157\u0093\u00af\u00fd`[^\u00f99\u00f2K\u0085\u00cd\u00b0\u00afP\u00a1\u00b2\u00ce\r>\u0082\u0010\u00fd\u00de\u0004O\u0097\u00c2\u0092\u0093T\u00d6\u00aaW\f\"\u0001R\b\u00dc\u0002\u00d3\u000b\u00d31\u0005b\u00fc)\u009b\u00bb\"\u0001\u00d1\u00b0\u00a8[.\u009bGBh5\u00e5!\u008d=\u00fa\u00e8;\u000f\u0007\u008f\u009b\u00e9\u00a8J\u00ca\u00f2".length();
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
                var4_10 = "\u00ea\u001e\u00a4\u00d0\u00c8\u00b8\u00a8u\\\u009a\u00b3\u00ed\u00e0\u00de\u0013\t";
                var5_11 = "\u00ea\u001e\u00a4\u00d0\u00c8\u00b8\u00a8u\\\u009a\u00b3\u00ed\u00e0\u00de\u0013\t".length();
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
                el_0.c = var6_8;
                el_0.d = new Integer[14];
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

