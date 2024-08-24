/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.V;
import com.google.gson.bm_0;
import com.google.gson.cA;
import com.google.gson.cC;
import com.google.gson.cE;
import com.google.gson.cH;
import com.google.gson.cI;
import java.sql.Date;
import java.sql.Timestamp;

public final class cG {
    public static final boolean a;
    public static final bm_0 b;
    public static final bm_0 c;
    public static final V d;
    public static final V e;
    public static final V f;
    public static final int[][] g;
    private static /* synthetic */ int field214;
    private static /* synthetic */ int field215;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private cG() {
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        boolean bl2;
        char[] cArray;
        block13: {
            int n;
            int n2;
            char[] cArray2;
            int n3;
            block12: {
                field214 = 0x2B0D ^ 0xFFFFA3A4;
                field215 = 0xFFFFBAF3 ^ 0xFFFFA3A4;
                g = new int[2][1];
                char[] cArray3 = "}onYfH_{ \\Y<^".toCharArray();
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
                        case 0 -> 23;
                        case 1 -> 14;
                        case 2 -> 24;
                        case 3 -> 56;
                        case 4 -> 72;
                        case 5 -> 59;
                        default -> 46;
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
        String string = new String(cArray).intern();
        Class.forName(string);
        a = bl2 = true;
        if (a) {
            b = new cH(Date.class);
            c = new cI(Timestamp.class);
            d = cA.a;
            e = cC.a;
            f = cE.a;
            return;
        }
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
    }
}

