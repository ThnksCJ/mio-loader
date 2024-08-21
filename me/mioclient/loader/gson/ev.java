/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.mioclient.loader.eu
 */
package me.mioclient.loader.gson;

import me.mioclient.loader.eu;

final class ev {
    private static final String a;
    public static final int[][] b;
    private static /* synthetic */ int field334;
    private static /* synthetic */ int field335;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private ev() {
    }

    protected final Object clone() {
        return this;
    }

    public boolean equals(Object object) {
        return object == null || object == this;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return a;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    /* synthetic */ ev(eu eu2) {
        this();
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
                field334 = 0x1436 ^ 0xFFFFA18C;
                field335 = 0xFFFF9DF2 ^ 0xFFFFA18C;
                b = new int[1][3];
                char[] cArray3 = "O?cs".toCharArray();
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
                    char c = cArray4[n5];
                    cArray4[n5] = (char)(c ^ (switch (n3 % 7) {
                        case 0 -> 33;
                        case 1 -> 74;
                        case 2 -> 15;
                        case 3 -> 31;
                        case 4 -> 42;
                        case 5 -> 26;
                        default -> 114;
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

