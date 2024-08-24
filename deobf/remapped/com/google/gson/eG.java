/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.eH;
import com.google.gson.eJ;
import com.google.gson.eK;
import com.google.gson.eL;
import com.google.gson.ep;
import com.google.gson.eq;
import com.google.gson.et;
import java.io.Reader;
import java.io.StringReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;

public class eG {
    public static final Character a;
    public static final Character b;
    public static final Character c;
    public static final Character d;
    public static final Character e;
    public static final Character f;
    public static final Character g;
    public static final Character h;
    public static final Character i;
    public static final String j;
    public static final String k;
    private static final String[] l;
    private static final String[] m;
    private static final long[] n;
    private static final Integer[] o;
    public static final int[][] p;
    private static /* synthetic */ int field308;
    private static /* synthetic */ int field309;

    private static Iterable f(String string) {
        return new eH(string);
    }

    public static String a(String string) {
        StringBuilder stringBuilder = new StringBuilder(string.length());
        Iterator iterator = eG.f(string).iterator();
        block7: while (iterator.hasNext()) {
            int n = (Integer)iterator.next();
            switch (n) {
                case 38: {
                    stringBuilder.append("&amp;");
                    continue block7;
                }
                case 60: {
                    stringBuilder.append("&lt;");
                    continue block7;
                }
                case 62: {
                    stringBuilder.append("&gt;");
                    continue block7;
                }
                case 34: {
                    stringBuilder.append("&quot;");
                    continue block7;
                }
                case 39: {
                    stringBuilder.append("&apos;");
                    continue block7;
                }
            }
            if (eG.a(n)) {
                stringBuilder.append("&#x");
                stringBuilder.append(Integer.toHexString(n));
                stringBuilder.append(';');
                continue;
            }
            stringBuilder.appendCodePoint(n);
        }
        return stringBuilder.toString();
    }

    private static boolean a(int n) {
        return Character.isISOControl(n) && n != 9 && n != 10 && n != 13 || (n < 32 || n > 55295) && (n < 57344 || n > 65533) && (n < 65536 || n > 0x10FFFF);
    }

    public static String b(String string) {
        StringBuilder stringBuilder = new StringBuilder(string.length());
        int n = string.length();
        for (int i = 0; i < n; ++i) {
            char c2 = string.charAt(i);
            if (c2 == '&') {
                int n2 = string.indexOf(59, i);
                if (n2 > i) {
                    String string2 = string.substring(i + 1, n2);
                    stringBuilder.append(eK.c(string2));
                    i += string2.length() + 1;
                    continue;
                }
                stringBuilder.append(c2);
                continue;
            }
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void c(String string) {
        int n = string.length();
        if (n == 0) {
            throw new eq("Empty string.");
        }
        int n2 = 0;
        while (n2 < n) {
            if (Character.isWhitespace(string.charAt(n2))) {
                throw new eq("'" + string + "' contains a space character.");
            }
            ++n2;
        }
        return;
    }

    private static boolean a(eK eK2, et et2, String string, eJ eJ2, int n) {
        String string2;
        et et3 = null;
        Object object = eK2.k();
        if (object == c) {
            char c2 = eK2.e();
            if (c2 == '-') {
                if (eK2.e() == '-') {
                    eK2.d("-->");
                    return false;
                }
                eK2.b();
            } else if (c2 == '[') {
                object = eK2.k();
                if ("CDATA".equals(object) && eK2.e() == '[') {
                    String string3 = eK2.a();
                    if (string3.length() > 0) {
                        et2.a(eJ2.c(), (Object)string3);
                    }
                    return false;
                }
                throw eK2.b("Expected 'CDATA['");
            }
            int n2 = 1;
            do {
                if ((object = eK2.j()) == null) {
                    throw eK2.b("Missing '>' after '<!'.");
                }
                if (object == f) {
                    ++n2;
                    continue;
                }
                if (object != e) continue;
                --n2;
            } while (n2 > 0);
            return false;
        }
        if (object == g) {
            eK2.d("?>");
            return false;
        }
        if (object == i) {
            object = eK2.k();
            if (string == null) {
                throw eK2.b("Mismatched close tag " + object);
            }
            if (!object.equals(string)) {
                throw eK2.b("Mismatched " + string + " and " + object);
            }
            if (eK2.k() != e) {
                throw eK2.b("Misshaped close tag");
            }
            return true;
        }
        if (object instanceof Character) {
            throw eK2.b("Misshaped tag");
        }
        String string4 = (String)object;
        object = null;
        et3 = new et();
        boolean bl2 = false;
        eL eL2 = null;
        while (true) {
            if (object == null) {
                object = eK2.k();
            }
            if (!(object instanceof String)) break;
            string2 = (String)object;
            object = eK2.k();
            if (object == d) {
                object = eK2.k();
                if (!(object instanceof String)) {
                    throw eK2.b("Missing value");
                }
                if (eJ2.d() && "xsi:nil".equals(string2) && Boolean.parseBoolean((String)object)) {
                    bl2 = true;
                } else if (eJ2.e() != null && !eJ2.e().isEmpty() && "xsi:type".equals(string2)) {
                    eL2 = (eL)eJ2.e().get(object);
                } else if (!bl2) {
                    et3.a(string2, eJ2.b() ? (String)object : eG.d((String)object));
                }
                object = null;
                continue;
            }
            et3.a(string2, (Object)"");
        }
        if (object == i) {
            if (eK2.k() != e) {
                throw eK2.b("Misshaped tag");
            }
            if (eJ2.f().contains(string4)) {
                if (bl2) {
                    et2.b(string4, et.b);
                } else if (et3.e() > 0) {
                    et2.b(string4, et3);
                } else {
                    et2.c(string4, new ep());
                }
            } else if (bl2) {
                et2.a(string4, et.b);
            } else if (et3.e() > 0) {
                et2.a(string4, (Object)et3);
            } else {
                et2.a(string4, (Object)"");
            }
            return false;
        }
        if (object == e) {
            while (true) {
                if ((object = eK2.i()) == null) {
                    if (string4 != null) {
                        throw eK2.b("Unclosed tag " + string4);
                    }
                    return false;
                }
                if (object instanceof String) {
                    string2 = (String)object;
                    if (string2.length() <= 0) continue;
                    if (eL2 != null) {
                        et3.a(eJ2.c(), eG.a(string2, eL2));
                        continue;
                    }
                    et3.a(eJ2.c(), eJ2.b() ? string2 : eG.d(string2));
                    continue;
                }
                if (object != f) continue;
                if (n == eJ2.g()) {
                    throw eK2.b("Maximum nesting depth of " + eJ2.g() + " reached");
                }
                if (eG.a(eK2, et3, string4, eJ2, n + 1)) break;
            }
            if (eJ2.f().contains(string4)) {
                if (et3.e() == 0) {
                    et2.c(string4, new ep());
                } else if (et3.e() == 1 && et3.p(eJ2.c()) != null) {
                    et2.b(string4, et3.p(eJ2.c()));
                } else {
                    et2.b(string4, et3);
                }
            } else if (et3.e() == 0) {
                et2.a(string4, (Object)"");
            } else if (et3.e() == 1 && et3.p(eJ2.c()) != null) {
                et2.a(string4, et3.p(eJ2.c()));
            } else {
                et2.a(string4, (Object)et3);
            }
            return false;
        }
        throw eK2.b("Misshaped tag");
    }

    public static Object a(String string, eL eL2) {
        if (eL2 != null) {
            return eL2.a(string);
        }
        return eG.d(string);
    }

    public static Object d(String string) {
        if ("".equals(string)) {
            return string;
        }
        if ("true".equalsIgnoreCase(string)) {
            return Boolean.TRUE;
        }
        if ("false".equalsIgnoreCase(string)) {
            return Boolean.FALSE;
        }
        if ("null".equalsIgnoreCase(string)) {
            return et.b;
        }
        char c2 = string.charAt(0);
        if (c2 >= '0' && c2 <= '9' || c2 == '-') {
            return eG.g(string);
        }
        return string;
    }

    private static Number g(String string) {
        char c2 = string.charAt(0);
        if (c2 >= '0' && c2 <= '9' || c2 == '-') {
            BigInteger bigInteger;
            if (eG.h(string)) {
                BigDecimal bigDecimal = new BigDecimal(string);
                if (c2 == '-' && BigDecimal.ZERO.compareTo(bigDecimal) == 0) {
                    return -0.0;
                }
                return bigDecimal;
            }
            if (c2 == '0' && string.length() > 1) {
                var2_3 = string.charAt(1);
                if (var2_3 >= '0' && var2_3 <= '9') {
                    throw new NumberFormatException("val [" + string + "] is not a valid number.");
                }
            } else if (c2 == '-' && string.length() > 2) {
                var2_3 = string.charAt(1);
                char c3 = string.charAt(2);
                if (var2_3 == '0' && c3 >= '0' && c3 <= '9') {
                    throw new NumberFormatException("val [" + string + "] is not a valid number.");
                }
            }
            if ((bigInteger = new BigInteger(string)).bitLength() <= 31) {
                return bigInteger.intValue();
            }
            if (bigInteger.bitLength() <= 63) {
                return bigInteger.longValue();
            }
            return bigInteger;
        }
        throw new NumberFormatException("val [" + string + "] is not a valid number.");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean h(String string) {
        if (string.indexOf(46) > -1) return true;
        if (string.indexOf(101) > -1) return true;
        if (string.indexOf(69) > -1) return true;
        if (!"-0".equals(string)) return false;
        return true;
    }

    public static et e(String string) {
        return eG.a(string, eJ.c);
    }

    public static et a(Reader reader) {
        return eG.a(reader, eJ.c);
    }

    public static et a(Reader reader, boolean bl2) {
        if (bl2) {
            return eG.a(reader, eJ.d);
        }
        return eG.a(reader, eJ.c);
    }

    public static et a(Reader reader, eJ eJ2) {
        et et2 = new et();
        eK eK2 = new eK(reader);
        while (eK2.d()) {
            eK2.d("<");
            if (!eK2.d()) continue;
            eG.a(eK2, et2, null, eJ2, 0);
        }
        return et2;
    }

    public static et a(String string, boolean bl2) {
        return eG.a((Reader)new StringReader(string), bl2);
    }

    public static et a(String string, eJ eJ2) {
        return eG.a((Reader)new StringReader(string), eJ2);
    }

    public static String a(Object object) {
        return eG.a(object, null, eJ.c);
    }

    public static String a(Object object, String string) {
        return eG.a(object, string, eJ.c);
    }

    public static String a(Object object, String string, eJ eJ2) {
        return eG.a(object, string, eJ2, 0, 0);
    }

    private static String a(Object object, String string, eJ eJ2, int n, int n2) {
        String string2;
        StringBuilder stringBuilder = new StringBuilder();
        if (object instanceof et) {
            if (string != null) {
                stringBuilder.append(eG.b(n2));
                stringBuilder.append('<');
                stringBuilder.append(string);
                stringBuilder.append('>');
                if (n > 0) {
                    stringBuilder.append("\n");
                    n2 += n;
                }
            }
            et et2 = (et)object;
            for (String string3 : et2.c()) {
                Object object2;
                int n3;
                int n4;
                ep ep2;
                Object object3 = et2.p(string3);
                if (object3 == null) {
                    object3 = "";
                } else if (object3.getClass().isArray()) {
                    object3 = new ep(object3);
                }
                if (string3.equals(eJ2.c())) {
                    if (object3 instanceof ep) {
                        ep2 = (ep)object3;
                        n4 = ep2.a();
                        for (n3 = 0; n3 < n4; ++n3) {
                            if (n3 > 0) {
                                stringBuilder.append('\n');
                            }
                            object2 = ep2.n(n3);
                            stringBuilder.append(eG.a(object2.toString()));
                        }
                        continue;
                    }
                    stringBuilder.append(eG.a(object3.toString()));
                    continue;
                }
                if (object3 instanceof ep) {
                    ep2 = (ep)object3;
                    n4 = ep2.a();
                    for (n3 = 0; n3 < n4; ++n3) {
                        object2 = ep2.n(n3);
                        if (object2 instanceof ep) {
                            stringBuilder.append('<');
                            stringBuilder.append(string3);
                            stringBuilder.append('>');
                            stringBuilder.append(eG.a(object2, null, eJ2, n, n2));
                            stringBuilder.append("</");
                            stringBuilder.append(string3);
                            stringBuilder.append('>');
                            continue;
                        }
                        stringBuilder.append(eG.a(object2, string3, eJ2, n, n2));
                    }
                    continue;
                }
                if ("".equals(object3)) {
                    stringBuilder.append(eG.b(n2));
                    stringBuilder.append('<');
                    stringBuilder.append(string3);
                    stringBuilder.append("/>");
                    if (n <= 0) continue;
                    stringBuilder.append("\n");
                    continue;
                }
                stringBuilder.append(eG.a(object3, string3, eJ2, n, n2));
            }
            if (string != null) {
                stringBuilder.append(eG.b(n2 - n));
                stringBuilder.append("</");
                stringBuilder.append(string);
                stringBuilder.append('>');
                if (n > 0) {
                    stringBuilder.append("\n");
                }
            }
            return stringBuilder.toString();
        }
        if (object != null && (object instanceof ep || object.getClass().isArray())) {
            ep ep3 = object.getClass().isArray() ? new ep(object) : (ep)object;
            int n5 = ep3.a();
            for (int i = 0; i < n5; ++i) {
                Object object4 = ep3.n(i);
                stringBuilder.append(eG.a(object4, string == null ? "array" : string, eJ2, n, n2));
            }
            return stringBuilder.toString();
        }
        String string4 = string2 = object == null ? "null" : eG.a(object.toString());
        if (string == null) {
            return eG.b(n2) + "\"" + string2 + "\"" + (n > 0 ? "\n" : "");
        }
        if (string2.length() == 0) {
            return eG.b(n2) + "<" + string + "/>" + (n > 0 ? "\n" : "");
        }
        return eG.b(n2) + "<" + string + ">" + string2 + "</" + string + ">" + (n > 0 ? "\n" : "");
    }

    public static String a(Object object, int n) {
        return eG.a(object, null, eJ.c, n);
    }

    public static String a(Object object, String string, int n) {
        return eG.a(object, string, eJ.c, n);
    }

    public static String a(Object object, String string, eJ eJ2, int n) {
        return eG.a(object, string, eJ2, n, 0);
    }

    private static final String b(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            stringBuilder.append(' ');
        }
        return stringBuilder.toString();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block30: {
            block29: {
                block28: {
                    block27: {
                        block31: {
                            break block31;
lbl1:
                            // 1 sources

                            return;
                        }
                        eG.field308 = 17764 ^ -15513;
                        eG.field309 = -20233 ^ -15513;
                        eG.p = new int[3][2];
                        var13 = new String[41];
                        var11_1 = 0;
                        var10_2 = "\u00ecX\u0002\u00db\u00d1\u0004\u00bfbsF\u0004L\u0005T\u00ad\bK7<|\u009c=\u00d7\u00c3\u0002\u0096\u00ce\u0004_X/\u00ef\r\u00cc\u00f5O\u00b7\u00c5\u009aST\u008cR~B\u00f4\u0005\b|\u008c\f>\u000b\u008ec\r\u00f8\u00f6\u001d>f$\u0086\u00d0\u0002-\u00af\u0004*\u00c3\u0098\u001f\u0005\u00fe\u0001@\u00f0\u0099\u0017s\u00ea\u00b2\u00d7\t?\u00cc3\u00bc7\u00ce\u0014\u00cd\u000e\u00d7\u00879\u00a4\u0017:\u00ce\u008c{\r\u00f7\u00cb)\u000bnE\u00e4\u0086\u00fc\u0007gV7\u0007\u00bc\u00f6\u00c2DY**\b\u009d\u0094\u00b9r\u00b6\u00ddr\u00ed\u0002\u0081\u00ca\u0003\u00dcyf\u0011\u00a0\u00e8\u00c2\u00b2n]ibM\u00c8s\u00b5\u00b2\u00e0)\u0010 \u0015\u0096\u00e1\u000e\u00a8\u0096\u00172'\u00a5\u00ae\u00e0u\u00e2\u0000\u0099nE\u00cd\u00c6\u0092{\u0006\u00d82\u00c2\u00d9~4\b4\u00ee\u00d3GaZh/\u0005q\u00f6Z>%\u0002\u00e0\u009f\u001d\t}\u00caY\u0013kn\u00a9gI\u00d2~\u00e8?\u001e\u0012\u0095\u00d7\u00b6\u00e6T\u00e5\u0014\u00db`i\u00d0k\u00aa\u0018}\u009e{9 \u00e2\u0081\u00dc\u001bK\u00day\u00a85f\u00aa\u00e3n\u0006\u00b5\u00b7D#$\u0013\u00eb\u0011\u00a1\u00a8j\u00df\u0096\u0084A2\u001e%\u0015\u00f8\u0012\u00ab\u00b4\u008d \u0007.\u00ff\u0090e\u0013\u000ec\u0002\u00a2\u00a6\u0004\u00b5x2\u0005\u0002\u00d3\u00c8\u0018X\u0094\u00dfx\u00b4\u00ca\u0013\u00d9I\u00eb\u0090m\u00e1\u00b7O\u00fa\u00c6d\u00a2\u00f4#l\u00b1!\r\u0018C\u00df\u00e2\u00a5\u0096o\u00ad~\u0017\u00ee\u008c\u00f6\u0019>\u00a7\u0010m3*\u0005\u00e9\u00877\u009dpqTZ\u0080\u00ef\u00ecN\u0096\u0011_\u00a1\u00e2+\r\u00a4\u00e6HVW\u00001\u007f\u00b5M\u0097\u00c7\u00d9\u0005.\u00d7\u0001z\u00f0\r\u00a3]\u00a8!J\u00e1\u00a4\u00e8\u00e0\u0013uq\u009c\u0005U\u00eb\u00ab\u00e9\u00dd\u0005\u008c\u00b0\u00b03\u0015";
                        var12_3 = "\u00ecX\u0002\u00db\u00d1\u0004\u00bfbsF\u0004L\u0005T\u00ad\bK7<|\u009c=\u00d7\u00c3\u0002\u0096\u00ce\u0004_X/\u00ef\r\u00cc\u00f5O\u00b7\u00c5\u009aST\u008cR~B\u00f4\u0005\b|\u008c\f>\u000b\u008ec\r\u00f8\u00f6\u001d>f$\u0086\u00d0\u0002-\u00af\u0004*\u00c3\u0098\u001f\u0005\u00fe\u0001@\u00f0\u0099\u0017s\u00ea\u00b2\u00d7\t?\u00cc3\u00bc7\u00ce\u0014\u00cd\u000e\u00d7\u00879\u00a4\u0017:\u00ce\u008c{\r\u00f7\u00cb)\u000bnE\u00e4\u0086\u00fc\u0007gV7\u0007\u00bc\u00f6\u00c2DY**\b\u009d\u0094\u00b9r\u00b6\u00ddr\u00ed\u0002\u0081\u00ca\u0003\u00dcyf\u0011\u00a0\u00e8\u00c2\u00b2n]ibM\u00c8s\u00b5\u00b2\u00e0)\u0010 \u0015\u0096\u00e1\u000e\u00a8\u0096\u00172'\u00a5\u00ae\u00e0u\u00e2\u0000\u0099nE\u00cd\u00c6\u0092{\u0006\u00d82\u00c2\u00d9~4\b4\u00ee\u00d3GaZh/\u0005q\u00f6Z>%\u0002\u00e0\u009f\u001d\t}\u00caY\u0013kn\u00a9gI\u00d2~\u00e8?\u001e\u0012\u0095\u00d7\u00b6\u00e6T\u00e5\u0014\u00db`i\u00d0k\u00aa\u0018}\u009e{9 \u00e2\u0081\u00dc\u001bK\u00day\u00a85f\u00aa\u00e3n\u0006\u00b5\u00b7D#$\u0013\u00eb\u0011\u00a1\u00a8j\u00df\u0096\u0084A2\u001e%\u0015\u00f8\u0012\u00ab\u00b4\u008d \u0007.\u00ff\u0090e\u0013\u000ec\u0002\u00a2\u00a6\u0004\u00b5x2\u0005\u0002\u00d3\u00c8\u0018X\u0094\u00dfx\u00b4\u00ca\u0013\u00d9I\u00eb\u0090m\u00e1\u00b7O\u00fa\u00c6d\u00a2\u00f4#l\u00b1!\r\u0018C\u00df\u00e2\u00a5\u0096o\u00ad~\u0017\u00ee\u008c\u00f6\u0019>\u00a7\u0010m3*\u0005\u00e9\u00877\u009dpqTZ\u0080\u00ef\u00ecN\u0096\u0011_\u00a1\u00e2+\r\u00a4\u00e6HVW\u00001\u007f\u00b5M\u0097\u00c7\u00d9\u0005.\u00d7\u0001z\u00f0\r\u00a3]\u00a8!J\u00e1\u00a4\u00e8\u00e0\u0013uq\u009c\u0005U\u00eb\u00ab\u00e9\u00dd\u0005\u008c\u00b0\u00b03\u0015".length();
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
                            var10_2 = "\u0096\u008b\u0003\u0006\u0012u\u009e#Wk";
                            var12_3 = "\u0096\u008b\u0003\u0006\u0012u\u009e#Wk".length();
                            var9_4 = 3;
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
                                    v13 = 81;
                                    break;
                                }
                                case 1: {
                                    v13 = 76;
                                    break;
                                }
                                case 2: {
                                    v13 = 97;
                                    break;
                                }
                                case 3: {
                                    v13 = 52;
                                    break;
                                }
                                case 4: {
                                    v13 = 7;
                                    break;
                                }
                                case 5: {
                                    v13 = 48;
                                    break;
                                }
                                default: {
                                    v13 = 46;
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
                eG.l = var13;
                eG.m = new String[41];
                eG.j = "xsi:nil";
                eG.k = "xsi:type";
                var0_7 = 3318709731272694966L;
                var6_8 = new long[38];
                var3_9 = 0;
                var4_10 = "\u0083\u00dc\u00aaX\u0017%\u00cc\u0097\u0015\u0096\u00cbFO\u00be\u00a0(Y\u00d1\u0087\u00b3\u00ffM\u00e9\u00d6\u00b5\u0086q\u00dfhnq\u00a3\u009fd\u00ea-\u00b7\u008b\u00c1\u00ae\u00d8\u00c9\u0014\u00d7\u00a9\u00e09\u00c4\u0097\u001d\u00de5\t\u00d9\u001d\u001b\u00d3\u00e2\u0018\u0088\u00bfS.\u00b3}\u0017\u00ba}y\u008b)\u00b0\u00f9\u00ec\u008b\u00a2\u00c4\u0086<n.\u008f\u0090\u00b6\u00cc\u00c3w\u00c3\u00ec\u0011\u0081\u00b5\u00e9G9\u00ab\u0085\u0000\u0088\u00bf\u00bep\u0017\u008eq\u00af\u00b8_ph\u0019\u00c4\u00dby-*\u00a7\u001b\u00d8m\u0001\u00e7\u00b8\u0012\u009f\u00a3\u00d9\u0086\u00c7\u00bd\u008d\u00f0_-\"\u00f9kH\u00b1\u0094\u00c3K\u009d\u009ef\u00ab\u00f3r\u001fV-\u00f4v,\u00e9\u00ab\u00d2\u008a\u00cb\u0004\u00f9\u00bc\u00a92\u00e0\u0004\u00caq\u0086\u0080l\u0012J\u00d7\u00846ix8Ym\u0007\u00da\u009d\u00cd'\u00c31\u00db\u00ad\u000e\u00f9\u001e\u0090v\u00d7\u00e2)+\u0081__\u001e\u0012\u00a8\u008e&\u00bd\u00de\u0084\u0080\u00e1\u00bb[>\u0002=VS\u009a\u00dbV*S\u0004\u00ff\u00ff8\u008c\u00d6\u0096\u0011@\u00e9\u008d\u00f8\u00ca\u008b\u00da=\u0092\u000e\u00f9:\u00bf\u0004D\u00c0W_P\u00e6\u00db\u00c9q\u00f8\u009c\u00c3\u00f7\u00f3\u0011PR\u00ba\u00e0\u00bf\u001d\u00eb\u00ea\u00d1\u00ca\u007f\u00e5\u00bd\u008ba:\u00e4\u009b\u0099\u001c\b\u0088\u009b}\u00ec\"\u0088";
                var5_11 = "\u0083\u00dc\u00aaX\u0017%\u00cc\u0097\u0015\u0096\u00cbFO\u00be\u00a0(Y\u00d1\u0087\u00b3\u00ffM\u00e9\u00d6\u00b5\u0086q\u00dfhnq\u00a3\u009fd\u00ea-\u00b7\u008b\u00c1\u00ae\u00d8\u00c9\u0014\u00d7\u00a9\u00e09\u00c4\u0097\u001d\u00de5\t\u00d9\u001d\u001b\u00d3\u00e2\u0018\u0088\u00bfS.\u00b3}\u0017\u00ba}y\u008b)\u00b0\u00f9\u00ec\u008b\u00a2\u00c4\u0086<n.\u008f\u0090\u00b6\u00cc\u00c3w\u00c3\u00ec\u0011\u0081\u00b5\u00e9G9\u00ab\u0085\u0000\u0088\u00bf\u00bep\u0017\u008eq\u00af\u00b8_ph\u0019\u00c4\u00dby-*\u00a7\u001b\u00d8m\u0001\u00e7\u00b8\u0012\u009f\u00a3\u00d9\u0086\u00c7\u00bd\u008d\u00f0_-\"\u00f9kH\u00b1\u0094\u00c3K\u009d\u009ef\u00ab\u00f3r\u001fV-\u00f4v,\u00e9\u00ab\u00d2\u008a\u00cb\u0004\u00f9\u00bc\u00a92\u00e0\u0004\u00caq\u0086\u0080l\u0012J\u00d7\u00846ix8Ym\u0007\u00da\u009d\u00cd'\u00c31\u00db\u00ad\u000e\u00f9\u001e\u0090v\u00d7\u00e2)+\u0081__\u001e\u0012\u00a8\u008e&\u00bd\u00de\u0084\u0080\u00e1\u00bb[>\u0002=VS\u009a\u00dbV*S\u0004\u00ff\u00ff8\u008c\u00d6\u0096\u0011@\u00e9\u008d\u00f8\u00ca\u008b\u00da=\u0092\u000e\u00f9:\u00bf\u0004D\u00c0W_P\u00e6\u00db\u00c9q\u00f8\u009c\u00c3\u00f7\u00f3\u0011PR\u00ba\u00e0\u00bf\u001d\u00eb\u00ea\u00d1\u00ca\u007f\u00e5\u00bd\u008ba:\u00e4\u009b\u0099\u001c\b\u0088\u009b}\u00ec\"\u0088".length();
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
lbl115:
                // 1 sources

                while (true) {
                    v16[v17] = v20;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "=\u001b5\"\u001d`\u00b1\u00ff\\f\u00b0\u0014\u00f7\u0082\u0094,";
                    var5_11 = "=\u001b5\"\u001d`\u00b1\u00ff\\f\u00b0\u0014\u00f7\u0082\u0094,".length();
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
lbl128:
                // 1 sources

                while (true) {
                    v16[v17] = v20;
                    if (var2_12 < var5_11) ** continue;
                    break block30;
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
        eG.n = var6_8;
        eG.o = new Integer[38];
        eG.a = Character.valueOf('&');
        eG.b = Character.valueOf('\'');
        eG.c = Character.valueOf('!');
        eG.d = Character.valueOf('=');
        eG.e = Character.valueOf('>');
        eG.f = Character.valueOf('<');
        eG.g = Character.valueOf('?');
        eG.h = Character.valueOf('\"');
        eG.i = Character.valueOf('/');
        ** while (true)
    }
}

