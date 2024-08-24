/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.UnsafeAllocator;

/*
 * Renamed from com.google.gson.bd
 */
class bd_0
extends UnsafeAllocator {
    private static final String a;
    public static final int[][] b;
    private static /* synthetic */ int field180;
    private static /* synthetic */ int field181;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    bd_0() {
    }

    @Override
    public Object a(Class clazz) {
        throw new UnsupportedOperationException(a + clazz);
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
                field180 = 0x4168 ^ 0xFFFFD77F;
                field181 = 0xFFFFC14F ^ 0xFFFFD77F;
                b = new int[1][3];
                char[] cArray3 = "rT\tR\u0001-\u000bPY\u000bS\r8_T\u0015".toCharArray();
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
                        case 0 -> 49;
                        case 1 -> 53;
                        case 2 -> 103;
                        case 3 -> 60;
                        case 4 -> 110;
                        case 5 -> 89;
                        default -> 43;
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

