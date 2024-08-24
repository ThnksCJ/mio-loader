/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class aU {
    private static final String[] a;
    private static final String[] b;
    public static final int[][] c;
    private static /* synthetic */ int field164;
    private static /* synthetic */ int field165;

    public static DateFormat a(int n) {
        return new SimpleDateFormat(aU.b(n), Locale.US);
    }

    public static DateFormat a(int n, int n2) {
        String string = aU.c(n) + " " + aU.d(n2);
        return new SimpleDateFormat(string, Locale.US);
    }

    private static String b(int n) {
        switch (n) {
            case 3: {
                return "M/d/yy";
            }
            case 2: {
                return "MMM d, y";
            }
            case 1: {
                return "MMMM d, y";
            }
            case 0: {
                return "EEEE, MMMM d, y";
            }
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + n);
    }

    private static String c(int n) {
        switch (n) {
            case 3: {
                return "M/d/yy";
            }
            case 2: {
                return "MMM d, yyyy";
            }
            case 1: {
                return "MMMM d, yyyy";
            }
            case 0: {
                return "EEEE, MMMM d, yyyy";
            }
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + n);
    }

    private static String d(int n) {
        switch (n) {
            case 3: {
                return "h:mm a";
            }
            case 2: {
                return "h:mm:ss a";
            }
            case 0: 
            case 1: {
                return "h:mm:ss a z";
            }
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + n);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block21: {
                break block21;
lbl1:
                // 1 sources

                return;
            }
            aU.field164 = 9492 ^ -8010;
            aU.field165 = -15523 ^ -8010;
            aU.c = new int[3][2];
            var5 = new String[13];
            var3_1 = 0;
            var2_2 = "f\u00e5s.jO\u000b\u00adw\u00ab\u00a8\u00116\u00ea\"\u0013\u00dc\u00cf\t0\u0096\u0018\u00f9#\u0094lnN\t3\u00e5\u00d9.%]\u00aa\u00a2:\u000f\u001e2\u00dcl\u00bek30\u00dc\u0018\u00ddg\u0098$\u00f7\u000b5\u007f\u0019}=7\u00a9\u00efZN\u00fe\f.H\u00db\"[\u00efc\u0001\u00af\u00caX\u0092\u0006\u0092ce\u000b\u00d9\u00f9\u001a-\u0098\u0086\\]tG\u0003\u001c\u0092\u00b9\u009e\u00a0u\u00dcRq|\u00a7-\u00a4\u00f5\u0011:{J\u001a\u00c5\u00d9\u009bt\u00feq3\u00a3\u0092\u0086h\u001c\u009a%\u009bX\u0099=\u00ba\u0005\u0007\u00f0e\u009a\u00f5^\u0006-\u0085\u0092\u00d7'b";
            var4_3 = "f\u00e5s.jO\u000b\u00adw\u00ab\u00a8\u00116\u00ea\"\u0013\u00dc\u00cf\t0\u0096\u0018\u00f9#\u0094lnN\t3\u00e5\u00d9.%]\u00aa\u00a2:\u000f\u001e2\u00dcl\u00bek30\u00dc\u0018\u00ddg\u0098$\u00f7\u000b5\u007f\u0019}=7\u00a9\u00efZN\u00fe\f.H\u00db\"[\u00efc\u0001\u00af\u00caX\u0092\u0006\u0092ce\u000b\u00d9\u00f9\u001a-\u0098\u0086\\]tG\u0003\u001c\u0092\u00b9\u009e\u00a0u\u00dcRq|\u00a7-\u00a4\u00f5\u0011:{J\u001a\u00c5\u00d9\u009bt\u00feq3\u00a3\u0092\u0086h\u001c\u009a%\u009bX\u0099=\u00ba\u0005\u0007\u00f0e\u009a\u00f5^\u0006-\u0085\u0092\u00d7'b".length();
            var1_4 = 6;
            var0_5 = -1;
lbl15:
            // 2 sources

            while (true) {
                v0 = ++var0_5;
                v1 = var2_2.substring(v0, v0 + var1_4);
                v2 = -1;
                break block20;
                break;
            }
lbl21:
            // 1 sources

            while (true) {
                var5[var3_1++] = v3.intern();
                if ((var0_5 += var1_4) < var4_3) {
                    var1_4 = var2_2.charAt(var0_5);
                    ** continue;
                }
                var2_2 = "\u0099@,\"\u00a0\u00a2\u00f0\t\u00a4?\u00d2\u0083y\u00b8\u00cbY\u00e1\u0086\bWF\u00f4\u008e\u00fa\u00f2\u0097\u00ba";
                var4_3 = "\u0099@,\"\u00a0\u00a2\u00f0\t\u00a4?\u00d2\u0083y\u00b8\u00cbY\u00e1\u0086\bWF\u00f4\u008e\u00fa\u00f2\u0097\u00ba".length();
                var1_4 = 18;
                var0_5 = -1;
lbl31:
                // 2 sources

                while (true) {
                    v4 = ++var0_5;
                    v1 = var2_2.substring(v4, v4 + var1_4);
                    v2 = 0;
                    break block20;
                    break;
                }
                break;
            }
lbl36:
            // 1 sources

            while (true) {
                var5[var3_1++] = v3.intern();
                if ((var0_5 += var1_4) < var4_3) {
                    var1_4 = var2_2.charAt(var0_5);
                    ** continue;
                }
                aU.a = var5;
                aU.b = new String[13];
                ** continue;
                break;
            }
        }
        v5 = v1.toCharArray();
        var6_6 = 0;
        v6 = v5.length;
        v7 = v5;
        v8 = v6;
        if (v6 > 1) ** GOTO lbl88
        do {
            v9 = v7;
            v10 = v7;
            v11 = var6_6;
            while (true) {
                v12 = v9[v11];
                switch (var6_6 % 7) {
                    case 0: {
                        v13 = 84;
                        break;
                    }
                    case 1: {
                        v13 = 30;
                        break;
                    }
                    case 2: {
                        v13 = 61;
                        break;
                    }
                    case 3: {
                        v13 = 65;
                        break;
                    }
                    case 4: {
                        v13 = 67;
                        break;
                    }
                    case 5: {
                        v13 = 3;
                        break;
                    }
                    default: {
                        v13 = 104;
                    }
                }
                v9[v11] = (char)(v12 ^ v13);
                ++var6_6;
                v7 = v10;
                v8 = v8;
                if (v8 != 0) break;
                v10 = v7;
                v14 = v8;
                v11 = v8;
                v9 = v7;
            }
lbl88:
            // 2 sources

            v15 = v7;
            v14 = v8;
        } while (v8 > var6_6);
        v3 = new String(v15);
        switch (v2) {
            default: {
                ** continue;
            }
            ** case 0:
lbl97:
            // 1 sources

            ** continue;
        }
    }
}

