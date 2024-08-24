/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.eG;
import com.google.gson.eK;
import com.google.gson.ep;
import com.google.gson.eq;
import com.google.gson.es;
import com.google.gson.et;

public class er {
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;
    public static final int[][] e;
    private static /* synthetic */ int field326;
    private static /* synthetic */ int field327;

    private static Object a(eK eK2, boolean bl2, ep ep2, boolean bl3, int n) {
        return er.a(eK2, bl2, ep2, bl3 ? es.d : es.c, n);
    }

    private static Object a(eK eK2, boolean bl2, ep ep2, es es2, int n) {
        String string = null;
        ep ep3 = null;
        et et2 = null;
        String string2 = null;
        while (true) {
            if (!eK2.d()) {
                throw eK2.b("Bad XML");
            }
            Object object = eK2.i();
            if (object == eG.f) {
                object = eK2.k();
                if (object instanceof Character) {
                    if (object == eG.i) {
                        object = eK2.k();
                        if (!(object instanceof String)) {
                            throw new eq("Expected a closing name instead of '" + object + "'.");
                        }
                        if (eK2.k() != eG.e) {
                            throw eK2.b("Misshaped close tag");
                        }
                        return object;
                    }
                    if (object == eG.c) {
                        char c2 = eK2.e();
                        if (c2 == '-') {
                            if (eK2.e() == '-') {
                                eK2.d("-->");
                                continue;
                            }
                            eK2.b();
                            continue;
                        }
                        if (c2 == '[') {
                            object = eK2.k();
                            if (object.equals("CDATA") && eK2.e() == '[') {
                                if (ep2 == null) continue;
                                ep2.a((Object)eK2.a());
                                continue;
                            }
                            throw eK2.b("Expected 'CDATA['");
                        }
                        int n2 = 1;
                        do {
                            if ((object = eK2.j()) == null) {
                                throw eK2.b("Missing '>' after '<!'.");
                            }
                            if (object == eG.f) {
                                ++n2;
                                continue;
                            }
                            if (object != eG.e) continue;
                            --n2;
                        } while (n2 > 0);
                        continue;
                    }
                    if (object == eG.g) {
                        eK2.d("?>");
                        continue;
                    }
                    throw eK2.b("Misshaped tag");
                }
                if (!(object instanceof String)) {
                    throw eK2.b("Bad tagName '" + object + "'.");
                }
                string2 = (String)object;
                ep3 = new ep();
                et2 = new et();
                if (bl2) {
                    ep3.a((Object)string2);
                    if (ep2 != null) {
                        ep2.a((Object)ep3);
                    }
                } else {
                    et2.c("tagName", string2);
                    if (ep2 != null) {
                        ep2.a(et2);
                    }
                }
                object = null;
                while (true) {
                    if (object == null) {
                        object = eK2.k();
                    }
                    if (object == null) {
                        throw eK2.b("Misshaped tag");
                    }
                    if (!(object instanceof String)) break;
                    String string3 = (String)object;
                    if (!bl2 && ("tagName".equals(string3) || er.a((int)-32288, (int)71).equals(string3))) {
                        throw eK2.b("Reserved attribute.");
                    }
                    object = eK2.k();
                    if (object == eG.d) {
                        object = eK2.k();
                        if (!(object instanceof String)) {
                            throw eK2.b("Missing value");
                        }
                        et2.a(string3, es2.b() ? (String)object : eG.d((String)object));
                        object = null;
                        continue;
                    }
                    et2.a(string3, (Object)"");
                }
                if (bl2 && et2.e() > 0) {
                    ep3.a(et2);
                }
                if (object == eG.i) {
                    if (eK2.k() != eG.e) {
                        throw eK2.b("Misshaped tag");
                    }
                    if (ep2 != null) continue;
                    if (bl2) {
                        return ep3;
                    }
                    return et2;
                }
                if (object != eG.e) {
                    throw eK2.b("Misshaped tag");
                }
                if (n == es2.c()) {
                    throw eK2.b("Maximum nesting depth of " + es2.c() + " reached");
                }
                string = (String)er.a(eK2, bl2, ep3, es2, n + 1);
                if (string == null) continue;
                if (!string.equals(string2)) {
                    throw eK2.b("Mismatched '" + string2 + "' and '" + string + "'");
                }
                string2 = null;
                if (!bl2 && ep3.a() > 0) {
                    et2.c("childNodes", ep3);
                }
                if (ep2 != null) continue;
                if (bl2) {
                    return ep3;
                }
                return et2;
            }
            if (ep2 == null) continue;
            ep2.a(object instanceof String ? (es2.b() ? eG.b((String)object) : eG.d((String)object)) : object);
        }
    }

    public static ep a(String string) {
        return (ep)er.a(new eK(string), true, null, es.c, 0);
    }

    public static ep a(String string, boolean bl2) {
        return (ep)er.a(new eK(string), true, null, bl2, 0);
    }

    public static ep a(String string, es es2) {
        return (ep)er.a(new eK(string), true, null, es2, 0);
    }

    public static ep a(eK eK2, es es2) {
        return (ep)er.a(eK2, true, null, es2, 0);
    }

    public static ep a(eK eK2, boolean bl2) {
        return (ep)er.a(eK2, true, null, bl2, 0);
    }

    public static ep a(eK eK2) {
        return (ep)er.a(eK2, true, null, false, 0);
    }

    public static et b(String string) {
        return (et)er.a(new eK(string), false, null, false, 0);
    }

    public static et b(String string, boolean bl2) {
        return (et)er.a(new eK(string), false, null, bl2, 0);
    }

    public static et b(String string, es es2) {
        return (et)er.a(new eK(string), false, null, es2, 0);
    }

    public static et b(eK eK2) {
        return (et)er.a(eK2, false, null, false, 0);
    }

    public static et b(eK eK2, boolean bl2) {
        return (et)er.a(eK2, false, null, bl2, 0);
    }

    public static et b(eK eK2, es es2) {
        return (et)er.a(eK2, false, null, es2, 0);
    }

    public static String a(ep ep2) {
        int n;
        int n2;
        StringBuilder stringBuilder = new StringBuilder();
        String string = ep2.l(0);
        eG.c(string);
        string = eG.a(string);
        stringBuilder.append('<');
        stringBuilder.append(string);
        Object object = ep2.n(1);
        if (object instanceof et) {
            n2 = 2;
            et et2 = (et)object;
            for (String string2 : et2.c()) {
                Object object2 = et2.p(string2);
                eG.c(string2);
                if (object2 == null) continue;
                stringBuilder.append(' ');
                stringBuilder.append(eG.a(string2));
                stringBuilder.append('=');
                stringBuilder.append('\"');
                stringBuilder.append(eG.a(object2.toString()));
                stringBuilder.append('\"');
            }
        } else {
            n2 = 1;
        }
        if (n2 >= (n = ep2.a())) {
            stringBuilder.append('/');
            stringBuilder.append('>');
        } else {
            stringBuilder.append('>');
            do {
                object = ep2.a(n2);
                ++n2;
                if (object == null) continue;
                if (object instanceof String) {
                    stringBuilder.append(eG.a(object.toString()));
                    continue;
                }
                if (object instanceof et) {
                    stringBuilder.append(er.a((et)object));
                    continue;
                }
                if (object instanceof ep) {
                    stringBuilder.append(er.a((ep)object));
                    continue;
                }
                stringBuilder.append(object.toString());
            } while (n2 < n);
            stringBuilder.append('<');
            stringBuilder.append('/');
            stringBuilder.append(string);
            stringBuilder.append('>');
        }
        return stringBuilder.toString();
    }

    public static String a(et et2) {
        StringBuilder stringBuilder = new StringBuilder();
        String string = et2.y("tagName");
        if (string == null) {
            return eG.a(et2.toString());
        }
        eG.c(string);
        string = eG.a(string);
        stringBuilder.append('<');
        stringBuilder.append(string);
        for (String string2 : et2.c()) {
            if ("tagName".equals(string2) || "childNodes".equals(string2)) continue;
            eG.c(string2);
            Object object = et2.p(string2);
            if (object == null) continue;
            stringBuilder.append(' ');
            stringBuilder.append(eG.a(string2));
            stringBuilder.append('=');
            stringBuilder.append('\"');
            stringBuilder.append(eG.a(object.toString()));
            stringBuilder.append('\"');
        }
        ep ep2 = et2.u("childNodes");
        if (ep2 == null) {
            stringBuilder.append('/');
            stringBuilder.append('>');
        } else {
            stringBuilder.append('>');
            int n = ep2.a();
            for (int i = 0; i < n; ++i) {
                Object object = ep2.a(i);
                if (object == null) continue;
                if (object instanceof String) {
                    stringBuilder.append(eG.a(object.toString()));
                    continue;
                }
                if (object instanceof et) {
                    stringBuilder.append(er.a((et)object));
                    continue;
                }
                if (object instanceof ep) {
                    stringBuilder.append(er.a((ep)object));
                    continue;
                }
                stringBuilder.append(object.toString());
            }
            stringBuilder.append('<');
            stringBuilder.append('/');
            stringBuilder.append(string);
            stringBuilder.append('>');
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
                    er.field326 = 8232 ^ -18727;
                    er.field327 = -1903 ^ -18727;
                    er.e = new int[2][3];
                    var13 = new String[24];
                    var11_1 = 0;
                    var10_2 = "u\u00c7\u00b1\u00ce<\u0019T\u00fac\u00d5T$(\u00e0\b(\u007f\u009a4\u00c8:9\u00dd\u00c8\u0001\u000b9$\u008e\u00b3\u00dd$#F\u008ct\u00ae\u009c\u00b0\u0092\\\u00ae!\u00d9\u00c3Tu\u00c2\u00a8\u00d5\u00b4\u00f0\u00dcO\u0010|\f\u00e7\u0019$\u00c4\u00bc@T\u00adg\u0018\u00fe\u0007\u00c68\u00c3\u00c4\u00ea^M\r\u00ee\u009a?\u00ca\u00b1\u0085\u001a\u00ac\u001d\u00a5\u00d9\u00ae\u0010\u0017\u0084\u00c9r\u00a0\u0018\u00c8/\u0005\u00ea\u00cf\u0017\u0002\u00ef\r[\u00cd\u0096\u00fe\u00ebh\u0090\u000e\u009a\b\u00a5\u00bd\u0080D\u0098\u0002v\u00de\u0002\u0007^\u0007\u009d\u0018d\u00e7\u0087\u00d00\u0003fe\u000f\u0002\u00b4\u00c7\t\u00ce\u00b8\u00ca\u00b0[\u0016\u00e3\u00be8\u0011r\u0002\u00a6\u00fc\u00eb\u008d\u0018\u00b0I\u00ac\u00e00\u00d9\u0091\u008c\u0014\u00aa\r9T\u00c5\u0013\u00ef\u00b1\u00e7\u0081E\u00ac\u009a\u00f2a\u0002\u000e\u0092\r\u009f\t\u0011\u00b8u\u00c4\u00b4//y\u00d7H\u00c8\u0013\u007f)\r\u00bc\u00f6D\u00c4?!{\u0001\u0005\u00ef=\u00859x\u00cc\u00b0\u0007d\u00a6dyDj\u00af\u0007\u00e4\u008et|F\u00ca\u00ef\f\u00a2~\u00b6H\u0088\u00120O\u00cf\u009d\u00be^\n\u00c4#\u008b\u00c3sx\u00e6s\u0098\u0080\u0013%\u0091\u00ba0\u001a\u0016\u0015\u0081\u00e8\u00cc\u00e3\u0082[\u00cc\u00aa\u000bzq\u00b9";
                    var12_3 = "u\u00c7\u00b1\u00ce<\u0019T\u00fac\u00d5T$(\u00e0\b(\u007f\u009a4\u00c8:9\u00dd\u00c8\u0001\u000b9$\u008e\u00b3\u00dd$#F\u008ct\u00ae\u009c\u00b0\u0092\\\u00ae!\u00d9\u00c3Tu\u00c2\u00a8\u00d5\u00b4\u00f0\u00dcO\u0010|\f\u00e7\u0019$\u00c4\u00bc@T\u00adg\u0018\u00fe\u0007\u00c68\u00c3\u00c4\u00ea^M\r\u00ee\u009a?\u00ca\u00b1\u0085\u001a\u00ac\u001d\u00a5\u00d9\u00ae\u0010\u0017\u0084\u00c9r\u00a0\u0018\u00c8/\u0005\u00ea\u00cf\u0017\u0002\u00ef\r[\u00cd\u0096\u00fe\u00ebh\u0090\u000e\u009a\b\u00a5\u00bd\u0080D\u0098\u0002v\u00de\u0002\u0007^\u0007\u009d\u0018d\u00e7\u0087\u00d00\u0003fe\u000f\u0002\u00b4\u00c7\t\u00ce\u00b8\u00ca\u00b0[\u0016\u00e3\u00be8\u0011r\u0002\u00a6\u00fc\u00eb\u008d\u0018\u00b0I\u00ac\u00e00\u00d9\u0091\u008c\u0014\u00aa\r9T\u00c5\u0013\u00ef\u00b1\u00e7\u0081E\u00ac\u009a\u00f2a\u0002\u000e\u0092\r\u009f\t\u0011\u00b8u\u00c4\u00b4//y\u00d7H\u00c8\u0013\u007f)\r\u00bc\u00f6D\u00c4?!{\u0001\u0005\u00ef=\u00859x\u00cc\u00b0\u0007d\u00a6dyDj\u00af\u0007\u00e4\u008et|F\u00ca\u00ef\f\u00a2~\u00b6H\u0088\u00120O\u00cf\u009d\u00be^\n\u00c4#\u008b\u00c3sx\u00e6s\u0098\u0080\u0013%\u0091\u00ba0\u001a\u0016\u0015\u0081\u00e8\u00cc\u00e3\u0082[\u00cc\u00aa\u000bzq\u00b9".length();
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
                        var10_2 = "G\u00f8\u00f3\u00dc\u00c0q\u008a\u00b2\u0018\u00c9\u0085\u00fb\u00f1\n=\u00d2\u00b4\u00fd\u0094\u00bf\u001a\u008b\u0007\u009f";
                        var12_3 = "G\u00f8\u00f3\u00dc\u00c0q\u008a\u00b2\u0018\u00c9\u0085\u00fb\u00f1\n=\u00d2\u00b4\u00fd\u0094\u00bf\u001a\u008b\u0007\u009f".length();
                        var9_4 = 13;
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
                                v13 = 115;
                                break;
                            }
                            case 1: {
                                v13 = 71;
                                break;
                            }
                            case 2: {
                                v13 = 27;
                                break;
                            }
                            case 3: {
                                v13 = 70;
                                break;
                            }
                            case 4: {
                                v13 = 65;
                                break;
                            }
                            case 5: {
                                v13 = 103;
                                break;
                            }
                            default: {
                                v13 = 39;
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
            er.a = var13;
            er.b = new String[24];
            var0_7 = 926697568158276022L;
            var6_8 = new long[16];
            var3_9 = 0;
            var4_10 = "1;Q\u00fav\u00df30\u00db\u00b3j\u00a8\u008d\u0010\u00ca\u009d\u001c\u0015@\u0089\u007f\u0094\u0096;\u0014:\u008f\u00b6%-\u00c6\u00e5h\u00d0\u00f3\u00f1z\u00ab\u00a4\u001fRIR\u00d4\u001d!n\u00d4\u00b5\u00f0\u001e\u0005 9\u00ab\u00c0\u00e6\u00ea\f\u00fd_\u00ae`qN\u0091\u0086:7\u00f3\u00e5\u00d1p\u00d3Z\u0086\f!\u00e2\u0090\u0019\u0093\u00b40\u0016\n\u0095\u00b0\u00ac\u0092F\u00e6\u00aeX\u009f\u0093\u0093\u00f4\u00e5\u009aV\u00a1\u0006\u0000\u0096\u00ab\u00016\u00e4\u009b\u00ff\u0091";
            var5_11 = "1;Q\u00fav\u00df30\u00db\u00b3j\u00a8\u008d\u0010\u00ca\u009d\u001c\u0015@\u0089\u007f\u0094\u0096;\u0014:\u008f\u00b6%-\u00c6\u00e5h\u00d0\u00f3\u00f1z\u00ab\u00a4\u001fRIR\u00d4\u001d!n\u00d4\u00b5\u00f0\u001e\u0005 9\u00ab\u00c0\u00e6\u00ea\f\u00fd_\u00ae`qN\u0091\u0086:7\u00f3\u00e5\u00d1p\u00d3Z\u0086\f!\u00e2\u0090\u0019\u0093\u00b40\u0016\n\u0095\u00b0\u00ac\u0092F\u00e6\u00aeX\u009f\u0093\u0093\u00f4\u00e5\u009aV\u00a1\u0006\u0000\u0096\u00ab\u00016\u00e4\u009b\u00ff\u0091".length();
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
                var4_10 = ";/|\u00b0\u00bd\u0093\u00a4\u0087\u00b1\u00a4\u0001<vg\u00c7\u008e";
                var5_11 = ";/|\u00b0\u00bd\u0093\u00a4\u0087\u00b1\u00a4\u0001<vg\u00c7\u008e".length();
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
                er.c = var6_8;
                er.d = new Integer[16];
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

