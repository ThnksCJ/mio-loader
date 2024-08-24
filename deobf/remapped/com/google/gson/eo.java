/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.eD;

public class eo
extends eD {
    private static final String k;
    private static final long[] l;
    private static final Integer[] o;
    public static final int[][] a;
    private static /* synthetic */ int field304;
    private static /* synthetic */ int field305;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public eo(String string) {
        super(string);
    }

    public String a() {
        char c2;
        StringBuilder stringBuilder = new StringBuilder();
        while (Character.isWhitespace(c2 = this.e())) {
        }
        if (c2 == '\"' || c2 == '\'') {
            char c3 = c2;
            while (true) {
                if ((c2 = this.e()) < ' ') {
                    throw this.b(k);
                }
                if (c2 == c3) {
                    return stringBuilder.toString();
                }
                stringBuilder.append(c2);
            }
        }
        while (c2 != '\u0000' && !Character.isWhitespace(c2)) {
            stringBuilder.append(c2);
            c2 = this.e();
        }
        return stringBuilder.toString();
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block13: {
            int n;
            int n2;
            char[] cArray2;
            int n3;
            block12: {
                field304 = 0x1A31 ^ 0xFFFFD053;
                field305 = 0xFFFFFE52 ^ 0xFFFFD053;
                a = new int[3][2];
                char[] cArray3 = "(\\qf\u001a?&\u0013Sqf\fr<\t@lm\u000f|".toCharArray();
                n3 = 0;
                int n4 = cArray3.length;
                cArray2 = cArray3;
                n2 = n4;
                if (n4 <= 1) break block12;
                cArray = cArray2;
                n = n2;
                if (n2 <= n3) break block13;
            }
            do {
                char[] cArray4 = cArray2;
                char[] cArray5 = cArray2;
                int n5 = n3;
                while (true) {
                    char c2 = cArray4[n5];
                    cArray4[n5] = (char)(c2 ^ (switch (n3 % 7) {
                        case 0 -> 125;
                        case 1 -> 50;
                        case 2 -> 5;
                        case 3 -> 3;
                        case 4 -> 104;
                        case 5 -> 82;
                        default -> 79;
                    }));
                    ++n3;
                    cArray2 = cArray5;
                    n2 = n2;
                    if (n2 != 0) break;
                    cArray5 = cArray2;
                    n = n2;
                    n5 = n2;
                    cArray4 = cArray2;
                }
                cArray = cArray2;
                n = n2;
            } while (n2 > n3);
        }
        k = new String(cArray).intern();
        long l = 6862860322326549752L;
        long[] lArray = new long[3];
        int n = 0;
        String string = "g2\u00c1\u00dd\u000e\u00f3\u00ef\u0086\u009d\u009b\u00ec\u00e7p\u00d0\u0014?e\u00edi~\u00e6\u00fe\u0092C";
        int n6 = "g2\u00c1\u00dd\u000e\u00f3\u00ef\u0086\u009d\u009b\u00ec\u00e7p\u00d0\u0014?e\u00edi~\u00e6\u00fe\u0092C".length();
        int n7 = 0;
        do {
            byte[] byArray = string.substring(n7, n7 += 8).getBytes("ISO-8859-1");
            int n8 = n++;
            lArray[n8] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l;
        } while (n7 < n6);
        eo.l = lArray;
        o = new Integer[3];
    }
}

