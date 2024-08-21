/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.util.ArrayList;
import java.util.List;
import me.mioclient.loader.gson.ew;

public class ex {
    private final List a = new ArrayList();
    private static final String b;
    public static final int[][] c;
    private static /* synthetic */ int field338;
    private static /* synthetic */ int field339;

    public ew a() {
        return new ew(this.a);
    }

    public ex a(String string) {
        if (string == null) {
            throw new NullPointerException(b);
        }
        this.a.add(string);
        return this;
    }

    public ex a(int n) {
        this.a.add(String.valueOf(n));
        return this;
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
                field338 = 0x17C4 ^ 0xFFFFD64E;
                field339 = 0xFFFFBE6A ^ 0xFFFFD64E;
                c = new int[3][3];
                char[] cArray3 = "3\u007fq<s2o&~t6i2n\"0t,q~".toCharArray();
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
                        case 0 -> 71;
                        case 1 -> 16;
                        case 2 -> 26;
                        case 3 -> 89;
                        case 4 -> 29;
                        case 5 -> 18;
                        default -> 12;
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
        b = new String(cArray).intern();
    }
}

