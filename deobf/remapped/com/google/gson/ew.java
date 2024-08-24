/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.ep;
import com.google.gson.et;
import com.google.gson.ex;
import com.google.gson.ey;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ew {
    private static final String a;
    private final List b;
    private static final String[] c;
    private static final String[] d;
    private static final long[] e;
    private static final Integer[] f;
    public static final int[][] g;
    private static /* synthetic */ int field336;
    private static /* synthetic */ int field337;

    public static ex a() {
        return new ex();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public ew(String string) {
        String string2;
        if (string == null) {
            throw new NullPointerException("pointer cannot be null");
        }
        if (string.isEmpty() || string.equals("#")) {
            this.b = Collections.emptyList();
            return;
        }
        if (string.startsWith("#/")) {
            string2 = string.substring(2);
            string2 = URLDecoder.decode(string2, "utf-8");
        } else {
            if (!string.startsWith("/")) throw new IllegalArgumentException("a JSON pointer should start with '/' or '#/'");
            string2 = string.substring(1);
        }
        this.b = new ArrayList();
        int n = -1;
        int n2 = 0;
        do {
            String string3;
            if ((n2 = n + 1) == (n = string2.indexOf(47, n2)) || n2 == string2.length()) {
                this.b.add("");
                continue;
            }
            if (n >= 0) {
                string3 = string2.substring(n2, n);
                this.b.add(ew.a(string3));
                continue;
            }
            string3 = string2.substring(n2);
            this.b.add(ew.a(string3));
        } while (n >= 0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public ew(List list) {
        this.b = new ArrayList(list);
    }

    private static String a(String string) {
        return string.replace("~1", "/").replace("~0", "~");
    }

    public Object a(Object object) {
        if (this.b.isEmpty()) {
            return object;
        }
        Object object2 = object;
        for (String string : this.b) {
            if (object2 instanceof et) {
                object2 = ((et)object2).p(ew.a(string));
                continue;
            }
            if (object2 instanceof ep) {
                object2 = ew.a(object2, string);
                continue;
            }
            throw new ey(String.format("value [%s] is not an array or object therefore its key %s cannot be resolved", object2, string));
        }
        return object2;
    }

    private static Object a(Object object, String string) {
        ep ep2;
        int n = Integer.parseInt(string);
        if (n >= (ep2 = (ep)object).a()) {
            throw new ey(String.format("index %s is out of bounds - the array has %d elements", string, ep2.a()));
        }
        return ep2.a(n);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("");
        for (String string : this.b) {
            stringBuilder.append('/').append(ew.b(string));
        }
        return stringBuilder.toString();
    }

    private static String b(String string) {
        return string.replace("~", "~0").replace("/", "~1");
    }

    public String b() {
        StringBuilder stringBuilder = new StringBuilder("#");
        for (String string : this.b) {
            stringBuilder.append('/').append(URLEncoder.encode(string, "utf-8"));
        }
        return stringBuilder.toString();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block25: {
                        break block25;
lbl1:
                        // 1 sources

                        return;
                    }
                    ew.field336 = 26543 ^ -10793;
                    ew.field337 = -17952 ^ -10793;
                    ew.g = new int[4][3];
                    var13 = new String[14];
                    var11_1 = 0;
                    var10_2 = "\u00e8\u00eciV\u0007\u0002\u008cF\u0002+&\u0002nv&\u00df\u0003\u00ad/CQ\u0017\u00edm\u00d9\u0095\u0005\u0087\u0012\u008b\u00d5l\u009e\u00b1>\u00af\u0011Jx\u001f\u00973S\t\u00bf\u00a3\u00e6'\u00a3\u00f8g\u00e7\u0087\u0002\u0080\u00fb\u00054!\u00f2\u00eft\u0005]\u009a\u00df\u0098\u00d1\u0002\u0097\u00e3\u0016\u00d5\u00f1d\u00ce\u0004\t9N\u00aaE(3\u00df\u0080\u00dfZsYql\u00d0\u00bc\u0018\u000e2\u00a9.\u00da\u00b7\u0019;&\fCs\u0013\u009d\u00b2^\u00c2\u0092\u008d{\u00ca\u00c9M`,O^'\u00a0\u0010u\u00b5\u00df/%\u0015,r<!\u001a\u00a1-\u009c]\u001d\u00ec\u00ea\u0004=\u00b0\u0088;\u001a\u00f8g/\u008e\u00b1\u00ebTE\u00ef\u00e2\u00e7Q\u00ca@\u00eb";
                    var12_3 = "\u00e8\u00eciV\u0007\u0002\u008cF\u0002+&\u0002nv&\u00df\u0003\u00ad/CQ\u0017\u00edm\u00d9\u0095\u0005\u0087\u0012\u008b\u00d5l\u009e\u00b1>\u00af\u0011Jx\u001f\u00973S\t\u00bf\u00a3\u00e6'\u00a3\u00f8g\u00e7\u0087\u0002\u0080\u00fb\u00054!\u00f2\u00eft\u0005]\u009a\u00df\u0098\u00d1\u0002\u0097\u00e3\u0016\u00d5\u00f1d\u00ce\u0004\t9N\u00aaE(3\u00df\u0080\u00dfZsYql\u00d0\u00bc\u0018\u000e2\u00a9.\u00da\u00b7\u0019;&\fCs\u0013\u009d\u00b2^\u00c2\u0092\u008d{\u00ca\u00c9M`,O^'\u00a0\u0010u\u00b5\u00df/%\u0015,r<!\u001a\u00a1-\u009c]\u001d\u00ec\u00ea\u0004=\u00b0\u0088;\u001a\u00f8g/\u008e\u00b1\u00ebTE\u00ef\u00e2\u00e7Q\u00ca@\u00eb".length();
                    var9_4 = 5;
                    var8_5 = -1;
lbl15:
                    // 2 sources

                    while (true) {
                        v0 = ++var8_5;
                        v1 = var10_2.substring(v0, v0 + var9_4);
                        v2 = -1;
                        break block22;
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
                        var10_2 = "\u00eb\u0019\u0094\u00f9\u00ba\u00c04\u00c9\u00f5\u0084\u00f5L\u00da\u00e9+\u00149\u00dc=E\u00ddu\u0085\u00d8|k\u00a9XO\u0095\u00bf\u00eb\u00e7=\u00f2|\u00c9+\u001b\u0098cO\u00d2{2\u00fe\u00b6ek\u0086\u0011\u00a4\u00eeL5\u001a\u00bbgK\u0001\u00ca\u00a7\u00c8\u00e18\u001bF6=_\u00b9U\u0014\u00f6\u00de\u009a_\u00a5\u00aaI.!\u0015T8\u00d0WG\u009f\u00d3\u000e=\u0091\u00803\u008d\u00ba\u00c5FCl\u00de\u00ecj\u0095\u00f2\u00ef\u0099\u0002q\u0091]\u0085\u00f2ik\u00d0<j\u00d6\u0010l\u00af\u00fd<\u00cb?\u0091\u00db\u00f8";
                        var12_3 = "\u00eb\u0019\u0094\u00f9\u00ba\u00c04\u00c9\u00f5\u0084\u00f5L\u00da\u00e9+\u00149\u00dc=E\u00ddu\u0085\u00d8|k\u00a9XO\u0095\u00bf\u00eb\u00e7=\u00f2|\u00c9+\u001b\u0098cO\u00d2{2\u00fe\u00b6ek\u0086\u0011\u00a4\u00eeL5\u001a\u00bbgK\u0001\u00ca\u00a7\u00c8\u00e18\u001bF6=_\u00b9U\u0014\u00f6\u00de\u009a_\u00a5\u00aaI.!\u0015T8\u00d0WG\u009f\u00d3\u000e=\u0091\u00803\u008d\u00ba\u00c5FCl\u00de\u00ecj\u0095\u00f2\u00ef\u0099\u0002q\u0091]\u0085\u00f2ik\u00d0<j\u00d6\u0010l\u00af\u00fd<\u00cb?\u0091\u00db\u00f8".length();
                        var9_4 = 53;
                        var8_5 = -1;
lbl31:
                        // 2 sources

                        while (true) {
                            v4 = ++var8_5;
                            v1 = var10_2.substring(v4, v4 + var9_4);
                            v2 = 0;
                            break block22;
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
                        break block23;
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
                                v13 = 44;
                                break;
                            }
                            case 1: {
                                v13 = 48;
                                break;
                            }
                            case 2: {
                                v13 = 76;
                                break;
                            }
                            case 3: {
                                v13 = 26;
                                break;
                            }
                            case 4: {
                                v13 = 49;
                                break;
                            }
                            case 5: {
                                v13 = 85;
                                break;
                            }
                            default: {
                                v13 = 23;
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
            ew.c = var13;
            ew.d = new String[14];
            ew.a = "utf-8";
            var0_7 = 1538541411470443812L;
            var6_8 = new long[2];
            var3_9 = 0;
            var4_10 = "z\u0012/^\u0012\u008c\u00b0\u00f01\u001ba\u001b\u00ed\u00d7\u00d8\b";
            var5_11 = "z\u0012/^\u0012\u008c\u00b0\u00f01\u001ba\u001b\u00ed\u00d7\u00d8\b".length();
            var2_12 = 0;
            while (true) {
                break block24;
                break;
            }
lbl108:
            // 1 sources

            while (true) {
                var6_8[v16] = (((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L) ^ var0_7;
                if (var2_12 < var5_11) ** continue;
                ew.e = var6_8;
                ew.f = new Integer[2];
                ** continue;
                break;
            }
        }
        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
        v16 = var3_9++;
        ** while (true)
    }
}

