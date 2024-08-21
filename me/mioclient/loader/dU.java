/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.mioclient.loader.dR
 */
package me.mioclient.loader;

import me.mioclient.loader.dR;
import me.mioclient.loader.dV;

class dU {
    public dV a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public char g;
    private static final String h;
    public static final int[][] i;
    private static /* synthetic */ int field256;
    private static /* synthetic */ int field257;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private dU() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(dV dV2, String string, int n, int n2, int n3, int n4, char c) {
        this.a = dV2;
        this.b = string;
        this.c = n;
        this.d = n2;
        this.e = n3;
        this.f = n4;
        this.g = c;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(dU dU2) {
        this.a(dU2.a, dU2.b, dU2.c, dU2.d, dU2.e, dU2.f, dU2.g);
    }

    public String toString() {
        return String.format(h, new Object[]{this.a, this.b});
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    /* synthetic */ dU(dR dR2) {
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
                field256 = 0x5B2E ^ 0xFFFFA431;
                field257 = 0xFFFFA86A ^ 0xFFFFA431;
                i = new int[1][1];
                char[] cArray3 = "\u001a!\u0010QN\u0002r".toCharArray();
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
                        case 0 -> 63;
                        case 1 -> 82;
                        case 2 -> 48;
                        case 3 -> 118;
                        case 4 -> 107;
                        case 5 -> 113;
                        default -> 85;
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
        h = new String(cArray).intern();
    }
}

