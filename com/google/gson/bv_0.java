/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.J;
import com.google.gson.JsonReader;
import com.google.gson.JsonToken;
import com.google.gson.N;
import com.google.gson.S;
import com.google.gson.T;
import com.google.gson.V;
import com.google.gson.bw_0;
import com.google.gson.bx_0;
import com.google.gson.cO;

/*
 * Renamed from com.google.gson.bv
 */
public final class bv_0
extends T {
    private static final V a;
    private final S b;
    private static final String c;
    public static final int[][] d;
    private static /* synthetic */ int field74;
    private static /* synthetic */ int field75;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private bv_0(S s) {
        this.b = s;
    }

    private static V b(S s) {
        bv_0 bv_02 = new bv_0(s);
        return new bw_0(bv_02);
    }

    public static V a(S s) {
        if (s == N.b) {
            return a;
        }
        return bv_0.b(s);
    }

    public Number a(JsonReader jsonReader) {
        JsonToken jsonToken = jsonReader.peek();
        switch (bx_0.a[jsonToken.ordinal()]) {
            case 1: {
                jsonReader.j();
                return null;
            }
            case 2: 
            case 3: {
                return this.b.b(jsonReader);
            }
        }
        throw new J(c + (Object)((Object)jsonToken));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(cO cO2, Number number) {
        cO2.a(number);
    }

    @Override
    public /* synthetic */ Object b(JsonReader jsonReader) {
        return this.a(jsonReader);
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n;
            int n2;
            char[] cArray2;
            int n3;
            block11: {
                field74 = 0x16F4 ^ 0xFFFF8134;
                field75 = 0xFFFFD788 ^ 0xFFFF8134;
                d = new int[3][3];
                char[] cArray3 = "\u0011j4;v\u0019>:ud0`\u000051`h~r\u0002#n2".toCharArray();
                n3 = 0;
                int n4 = cArray3.length;
                cArray2 = cArray3;
                n2 = n4;
                if (n4 <= 1) break block11;
                cArray = cArray2;
                n = n2;
                if (n2 <= n3) break block12;
            }
            do {
                char[] cArray4 = cArray2;
                char[] cArray5 = cArray2;
                int n5 = n3;
                while (true) {
                    char c2 = cArray4[n5];
                    cArray4[n5] = (char)(c2 ^ (switch (n3 % 7) {
                        case 0 -> 84;
                        case 1 -> 18;
                        case 2 -> 68;
                        case 3 -> 94;
                        case 4 -> 21;
                        case 5 -> 109;
                        default -> 87;
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
        c = new String(cArray).intern();
        a = bv_0.b(N.b);
    }
}

