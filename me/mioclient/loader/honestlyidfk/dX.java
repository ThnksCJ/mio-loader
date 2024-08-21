/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.honestlyidfk;

import me.mioclient.loader.honestlyidfk.dz_0;

public class dX {
    public final int a;
    public final int b;
    public final char c;
    public final String d;
    public dz_0 e;
    private static final String f;
    public static final int[][] g;
    private static /* synthetic */ int field258;
    private static /* synthetic */ int field259;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public dX(int n, int n2, char c, String string, dz_0 dz_02) {
        this.a = n;
        this.b = n2;
        this.c = c;
        this.d = string;
        this.e = dz_02;
    }

    public String toString() {
        return String.format(f, this.a, this.b, Character.valueOf(this.c), this.d);
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
                field258 = 0x66AE ^ 0xFFFFBA28;
                field259 = 0xFFFFA953 ^ 0xFFFFBA28;
                g = new int[3][2];
                char[] cArray3 = "=^\u0012\u0000~\u0004j\u0002\u001e[\rsE=\u0007Q\u000f\u000bi\u0004j\u0002o[\u000fo\u0004hCA\\T;\u0001<".toCharArray();
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
                        case 0 -> 102;
                        case 1 -> 50;
                        case 2 -> 123;
                        case 3 -> 110;
                        case 4 -> 27;
                        case 5 -> 36;
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
        f = new String(cArray).intern();
    }
}

