/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.JsonReader;
import com.google.gson.JsonToken;
import com.google.gson.T;
import com.google.gson.cO;

/*
 * Renamed from com.google.gson.co
 */
class co_0
extends T {
    private static final String a;
    public static final int[][] b;
    private static /* synthetic */ int field74;
    private static /* synthetic */ int field75;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    co_0() {
    }

    public Boolean a(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.i) {
            jsonReader.j();
            return null;
        }
        return Boolean.valueOf(jsonReader.h());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(cO cO2, Boolean bl2) {
        cO2.b(bl2 == null ? a : bl2.toString());
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
                field74 = 0x11E4 ^ 0xFFFFF980;
                field75 = 0xFFFFDC3B ^ 0xFFFFF980;
                b = new int[1][1];
                char[] cArray3 = "y\u0010@W".toCharArray();
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
                        case 0 -> 23;
                        case 1 -> 101;
                        case 2 -> 44;
                        case 3 -> 59;
                        case 4 -> 118;
                        case 5 -> 12;
                        default -> 88;
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
        a = new String(cArray).intern();
    }
}

