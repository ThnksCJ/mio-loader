/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class cw {
    private static final String a;
    private static final TimeZone b;
    private static final String[] c;
    private static final String[] d;
    private static final long[] e;
    private static final Integer[] f;
    public static final int[][] g;
    private static /* synthetic */ int field236;
    private static /* synthetic */ int field237;

    public static String a(Date date) {
        return cw.a(date, false, b);
    }

    public static String a(Date date, boolean bl2) {
        return cw.a(date, bl2, b);
    }

    public static String a(Date date, boolean bl2, TimeZone timeZone) {
        int n;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        int n2 = cw.a((int)20724, (int)-4533).length();
        n2 += bl2 ? ".sss".length() : 0;
        StringBuilder stringBuilder = new StringBuilder(n2 += timeZone.getRawOffset() == 0 ? "Z".length() : "+hh:mm".length());
        cw.a(stringBuilder, gregorianCalendar.get(1), cw.a((int)20712, (int)-54).length());
        stringBuilder.append('-');
        cw.a(stringBuilder, gregorianCalendar.get(2) + 1, "MM".length());
        stringBuilder.append('-');
        cw.a(stringBuilder, gregorianCalendar.get(5), "dd".length());
        stringBuilder.append('T');
        cw.a(stringBuilder, gregorianCalendar.get(11), "hh".length());
        stringBuilder.append(':');
        cw.a(stringBuilder, gregorianCalendar.get(12), "mm".length());
        stringBuilder.append(':');
        cw.a(stringBuilder, gregorianCalendar.get(13), "ss".length());
        if (bl2) {
            stringBuilder.append('.');
            cw.a(stringBuilder, gregorianCalendar.get(14), "sss".length());
        }
        if ((n = timeZone.getOffset(gregorianCalendar.getTimeInMillis())) != 0) {
            int n3 = Math.abs(n / 60000 / 60);
            int n4 = Math.abs(n / 60000);
            stringBuilder.append(n < 0 ? (char)'-' : '+');
            cw.a(stringBuilder, n3, "hh".length());
            stringBuilder.append(':');
            cw.a(stringBuilder, n4, "mm".length());
        } else {
            stringBuilder.append('Z');
        }
        return stringBuilder.toString();
    }

    public static Date a(String string, ParsePosition parsePosition) {
        int n;
        Object var2_2 = null;
        int n2 = parsePosition.getIndex();
        int n3 = cw.a(string, n2, n2 += 4);
        if (cw.a(string, n2, '-')) {
            // empty if block
        }
        int n4 = cw.a(string, ++n2, n2 += 2);
        if (cw.a(string, n2, '-')) {
            // empty if block
        }
        int n5 = cw.a(string, ++n2, n2 += 2);
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        boolean bl2 = cw.a(string, n2, 'T');
        if (!bl2 && string.length() <= n2) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(n3, n4 - 1, n5);
            parsePosition.setIndex(n2);
            return gregorianCalendar.getTime();
        }
        if (bl2) {
            char c;
            n6 = cw.a(string, ++n2, n2 += 2);
            if (cw.a(string, n2, ':')) {
                // empty if block
            }
            n7 = cw.a(string, ++n2, n2 += 2);
            if (cw.a(string, n2, ':')) {
                ++n2;
            }
            if (string.length() > n2 && (c = string.charAt(n2)) != 'Z' && c != '+' && c != '-') {
                if ((n8 = cw.a(string, n2, n2 += 2)) > 59 && n8 < 63) {
                    n8 = 59;
                }
                if (cw.a(string, n2, '.')) {
                    n = cw.a(string, ++n2 + 1);
                    int n10 = Math.min(n, n2 + 3);
                    int n11 = cw.a(string, n2, n10);
                    switch (n10 - n2) {
                        case 2: {
                            n9 = n11 * 10;
                            break;
                        }
                        case 1: {
                            n9 = n11 * 100;
                            break;
                        }
                        default: {
                            n9 = n11;
                        }
                    }
                    n2 = n;
                }
            }
        }
        if (string.length() <= n2) {
            throw new IllegalArgumentException("No time zone indicator");
        }
        TimeZone timeZone = null;
        n = string.charAt(n2);
        if (n == 90) {
            timeZone = b;
            ++n2;
        } else if (n == 43 || n == 45) {
            String string2 = string.substring(n2);
            string2 = string2.length() >= 5 ? string2 : string2 + "00";
            n2 += string2.length();
            if ("+0000".equals(string2) || "+00:00".equals(string2)) {
                timeZone = b;
            } else {
                String string3;
                String string4 = "GMT" + string2;
                timeZone = TimeZone.getTimeZone(string4);
                String string5 = timeZone.getID();
                if (!string5.equals(string4) && !(string3 = string5.replace(":", "")).equals(string4)) {
                    throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + string4 + " given, resolves to " + timeZone.getID());
                }
            }
        } else {
            throw new IndexOutOfBoundsException("Invalid time zone indicator '" + (char)n + "'");
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, n3);
        gregorianCalendar.set(2, n4 - 1);
        gregorianCalendar.set(5, n5);
        gregorianCalendar.set(11, n6);
        gregorianCalendar.set(12, n7);
        gregorianCalendar.set(13, n8);
        gregorianCalendar.set(14, n9);
        parsePosition.setIndex(n2);
        return gregorianCalendar.getTime();
    }

    private static boolean a(String string, int n, char c) {
        return n < string.length() && string.charAt(n) == c;
    }

    private static int a(String string, int n, int n2) {
        int n3;
        if (n < 0 || n2 > string.length() || n > n2) {
            throw new NumberFormatException(string);
        }
        int n4 = n;
        int n5 = 0;
        if (n4 < n2) {
            if ((n3 = Character.digit(string.charAt(n4++), 10)) < 0) {
                throw new NumberFormatException("Invalid number: " + string.substring(n, n2));
            }
            n5 = -n3;
        }
        while (n4 < n2) {
            if ((n3 = Character.digit(string.charAt(n4++), 10)) < 0) {
                throw new NumberFormatException("Invalid number: " + string.substring(n, n2));
            }
            n5 *= 10;
            n5 -= n3;
        }
        return -n5;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void a(StringBuilder stringBuilder, int n, int n2) {
        String string = Integer.toString(n);
        for (int i = n2 - string.length(); i > 0; --i) {
            stringBuilder.append('0');
        }
        stringBuilder.append(string);
    }

    private static int a(String string, int n) {
        for (int i = n; i < string.length(); ++i) {
            char c = string.charAt(i);
            if (c >= '0' && c <= '9') continue;
            return i;
        }
        return string.length();
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
                        cw.field236 = 25855 ^ -1730;
                        cw.field237 = -24821 ^ -1730;
                        cw.g = new int[2][1];
                        var13 = new String[26];
                        var11_1 = 0;
                        var10_2 = "\u00c9\u0006\u00c9\u0017\u00f3Yu\u0091\u00bd\u0085l\u0017\u00b70\u00db\u008f\u0014e\u0087\u0007\u0018\u00dfJ\u0090\u0014\\%\u00d1\u001c\u00d4\u00f9\u00c0a\u0017P\u00b7O\u00062\u0003\u00dey\u00c3\u00fd\u0002\u00c6~\u0004\u009ai-V\u0003y\u00032\u0002\u00fcZ\u0005\u00ca\u0019\u00c10 \u0003s\u00954\u0006\na\u0081f&C\u0004w\u00d1'\u0000\u0010\u00a2N\u00a4\u001e^x\u00c0\u00b5\u000b\u0001\u00ba\u0087m\"\u0080\u00cd\u0002}\u00c1\u0003\u00c3\u00ed\u00f0\u0002\t,\u0003I4s\u0002\u008b;!\u00f5\u00b0\u00cf*\u009bn\u00d3\u0081\u0089\u00dd\u0007&\u0080\u0007YT-,\u00f0Awu\u00db\u0002N\u0094\u00dd9\u001e\u0090\u00ad\u00bf\u00b7\u001d\u00a8e\u00e5{v\u00d4\u00c5 \u00b1\u00af\u00b4\u00ca\u00e9d\u00a8B\u0014\u00de<\u000e)\u00d5;y\t\u00136N\u0003\u0002\u00ef\u00f7\u0016\u00ff\u00e2\u00be\u00bf\u0084\u00ff?\u00c1\u00c1\u0095vK\u00d2G\u00ce]\u00f55\u0085B\u001c\u001e\u0002\u00e7[\u0013aq\u00e5\u0014\u00d9\u0006p\u00d7\u001b\u00f0\u00ca\u0080p\u00c1\u00d8\u00bd\u0007\u0011\u00f0\u0003`\u00bb<";
                        var12_3 = "\u00c9\u0006\u00c9\u0017\u00f3Yu\u0091\u00bd\u0085l\u0017\u00b70\u00db\u008f\u0014e\u0087\u0007\u0018\u00dfJ\u0090\u0014\\%\u00d1\u001c\u00d4\u00f9\u00c0a\u0017P\u00b7O\u00062\u0003\u00dey\u00c3\u00fd\u0002\u00c6~\u0004\u009ai-V\u0003y\u00032\u0002\u00fcZ\u0005\u00ca\u0019\u00c10 \u0003s\u00954\u0006\na\u0081f&C\u0004w\u00d1'\u0000\u0010\u00a2N\u00a4\u001e^x\u00c0\u00b5\u000b\u0001\u00ba\u0087m\"\u0080\u00cd\u0002}\u00c1\u0003\u00c3\u00ed\u00f0\u0002\t,\u0003I4s\u0002\u008b;!\u00f5\u00b0\u00cf*\u009bn\u00d3\u0081\u0089\u00dd\u0007&\u0080\u0007YT-,\u00f0Awu\u00db\u0002N\u0094\u00dd9\u001e\u0090\u00ad\u00bf\u00b7\u001d\u00a8e\u00e5{v\u00d4\u00c5 \u00b1\u00af\u00b4\u00ca\u00e9d\u00a8B\u0014\u00de<\u000e)\u00d5;y\t\u00136N\u0003\u0002\u00ef\u00f7\u0016\u00ff\u00e2\u00be\u00bf\u0084\u00ff?\u00c1\u00c1\u0095vK\u00d2G\u00ce]\u00f55\u0085B\u001c\u001e\u0002\u00e7[\u0013aq\u00e5\u0014\u00d9\u0006p\u00d7\u001b\u00f0\u00ca\u0080p\u00c1\u00d8\u00bd\u0007\u0011\u00f0\u0003`\u00bb<".length();
                        var9_4 = 16;
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
                            var10_2 = "y\u0017\u0016\u0004\u0085\u0081\u0084\u000f\u008a\u0086\u0013\u000e^&\u0090W\u00a2m\u00fc\u00e6\u00cf^N\u009f\u0085";
                            var12_3 = "y\u0017\u0016\u0004\u0085\u0081\u0084\u000f\u008a\u0086\u0013\u000e^&\u0090W\u00a2m\u00fc\u00e6\u00cf^N\u009f\u0085".length();
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
                                    v13 = 117;
                                    break;
                                }
                                case 1: {
                                    v13 = 24;
                                    break;
                                }
                                case 2: {
                                    v13 = 72;
                                    break;
                                }
                                case 3: {
                                    v13 = 22;
                                    break;
                                }
                                case 4: {
                                    v13 = 23;
                                    break;
                                }
                                case 5: {
                                    v13 = 93;
                                    break;
                                }
                                default: {
                                    v13 = 108;
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
                cw.c = var13;
                cw.d = new String[26];
                cw.a = "UTC";
                var0_7 = 6815753222864373544L;
                var6_8 = new long[35];
                var3_9 = 0;
                var4_10 = "\u00d9(\u0015l\u00ee\u00d5\u00ee\u00fc\u00f5\u00c8\u00b5\u0080\u009a\u008c)\u00f8tjl\u0082\u0004\u0085\u00ceE'\u00bd;\u0099\u00da__|@\f:\u0000p\u00c3\u00ee`'{,\u0019\u00a1s\u00bc<\u00e3U\u0010\u00019\u00c8\u0012\u0013\u00be\u00fb\u00d7\u00d5\u00f9\u0084O\n0\u00fb>\u00b6\u001e\u0012\u00b3If\u008bHlD\u0092\u001e\u00d0hK\u00b1\u00c5\u00d28\u000f\u00ff\u0095Z\u0082\u0097v[\u00f8&\u00eb|w\u008e\u00d4O\u00e4\u00d1\u009d/\u00ccd\u008f\u00f7\u00ad,\u00b6\u00cf\u008f\u0001`\u00bf\u00de\u00ba\u00d53\f\u00b6\u0013\u0091\u00a0@\u009c\u00cd\u00d6\u0092\u00d2\u00c1\"\u00ac\u0018>\u00a1\f\u00b0\\KO\u00c2\u00e9\u0014\u00eeH\u001909-\u00f3\u007f\u0000\u00c0\u00e2\u00dc\u00dbB\u00d4\u00c3\u00a1yr\u0080\u00a5\u0093g{E\u008c\u00ae\u0098\u00d4\u001c\u0000\u001c\u0084\u00d9\u00fc\u00d8\u00ca\u0019d\u00d2\u00bc\u00d3\u00fa\u00fe\u00a4o^\u00d6c\u00a5 \u0095\t\u008fe\u00ac<\u0090`5^\u009bT=\u00b8\u00b1p\u000bF\u009fj\u00a7\u00cd<\u00e5\u00c2\u00f0\u00b8\u00a5+\u008dk\u00eb\u00a2\u00f6\u00aeW\u008av\rp\t\u00a3?\u00f2\u00ac\u00ba\u00bcq\u00bb\u00d9\u0006\u00f0\u00ec2 g\u0098\u00a5L\u0014_{\u001b\u0082\u00f5\u0090";
                var5_11 = "\u00d9(\u0015l\u00ee\u00d5\u00ee\u00fc\u00f5\u00c8\u00b5\u0080\u009a\u008c)\u00f8tjl\u0082\u0004\u0085\u00ceE'\u00bd;\u0099\u00da__|@\f:\u0000p\u00c3\u00ee`'{,\u0019\u00a1s\u00bc<\u00e3U\u0010\u00019\u00c8\u0012\u0013\u00be\u00fb\u00d7\u00d5\u00f9\u0084O\n0\u00fb>\u00b6\u001e\u0012\u00b3If\u008bHlD\u0092\u001e\u00d0hK\u00b1\u00c5\u00d28\u000f\u00ff\u0095Z\u0082\u0097v[\u00f8&\u00eb|w\u008e\u00d4O\u00e4\u00d1\u009d/\u00ccd\u008f\u00f7\u00ad,\u00b6\u00cf\u008f\u0001`\u00bf\u00de\u00ba\u00d53\f\u00b6\u0013\u0091\u00a0@\u009c\u00cd\u00d6\u0092\u00d2\u00c1\"\u00ac\u0018>\u00a1\f\u00b0\\KO\u00c2\u00e9\u0014\u00eeH\u001909-\u00f3\u007f\u0000\u00c0\u00e2\u00dc\u00dbB\u00d4\u00c3\u00a1yr\u0080\u00a5\u0093g{E\u008c\u00ae\u0098\u00d4\u001c\u0000\u001c\u0084\u00d9\u00fc\u00d8\u00ca\u0019d\u00d2\u00bc\u00d3\u00fa\u00fe\u00a4o^\u00d6c\u00a5 \u0095\t\u008fe\u00ac<\u0090`5^\u009bT=\u00b8\u00b1p\u000bF\u009fj\u00a7\u00cd<\u00e5\u00c2\u00f0\u00b8\u00a5+\u008dk\u00eb\u00a2\u00f6\u00aeW\u008av\rp\t\u00a3?\u00f2\u00ac\u00ba\u00bcq\u00bb\u00d9\u0006\u00f0\u00ec2 g\u0098\u00a5L\u0014_{\u001b\u0082\u00f5\u0090".length();
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
                    var4_10 = "\u00c9\u008d\u00fe\u00d4\u0018\u00aaHE\u00cf\u00a8]8\u00fc Cx";
                    var5_11 = "\u00c9\u008d\u00fe\u00d4\u0018\u00aaHE\u00cf\u00a8]8\u00fc Cx".length();
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
lbl138:
                // 1 sources

                ** continue;
            }
        }
        cw.e = var6_8;
        cw.f = new Integer[35];
        cw.b = TimeZone.getTimeZone("UTC");
        ** while (true)
    }
}

