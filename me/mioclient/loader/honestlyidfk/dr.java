/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.honestlyidfk;

import java.util.ArrayList;
import java.util.List;
import me.mioclient.loader.ds_0;
import me.mioclient.loader.honestlyidfk.dq_0;
import me.mioclient.loader.honestlyidfk.eb;

public class dr {
    public byte[] a = new byte[8];
    private int c;
    public final List b = new ArrayList();
    private static final String[] d;
    private static final String[] e;
    private static final long[] f;
    private static final Integer[] g;
    public static final int[][] h;
    private static /* synthetic */ int field286;
    private static /* synthetic */ int field287;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void b(int n) {
        if (this.c >= this.a.length) {
            byte[] byArray = new byte[this.a.length * 2];
            System.arraycopy(this.a, 0, byArray, 0, this.a.length);
            this.a = byArray;
        }
        this.a[this.c++] = (byte)n;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(dq_0 dq_02) {
        this.b(dq_02.ordinal());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(dq_0 dq_02, int n) {
        this.b(dq_02.ordinal());
        this.b(n);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(dq_0 dq_02, eb eb2) {
        this.b(dq_02.ordinal());
        this.a(eb2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(eb eb2) {
        int n = -1;
        for (int i = 0; i < this.b.size(); ++i) {
            if (!((eb)this.b.get(i)).equals(eb2)) continue;
            n = i;
            break;
        }
        if (n == -1) {
            n = this.b.size();
            this.b.add(eb2);
        }
        this.b(n);
    }

    public int b(dq_0 dq_02) {
        this.a(dq_02);
        this.b(0);
        this.b(0);
        return this.c - 2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(int n) {
        int n2 = this.c - n - 2;
        this.a[n] = (byte)(n2 >> 8);
        this.a[n + 1] = (byte)n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a() {
        int n = 0;
        while (n < this.c) {
            dq_0 dq_02 = dq_0.a(this.a[n]);
            System.out.format("%3d %-18s", new Object[]{n, dq_02});
            switch (ds_0.a[dq_02.ordinal()]) {
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 6: 
                case 7: {
                    System.out.format("%3d '%s'", this.a[++n], this.b.get(this.a[n]));
                    break;
                }
                case 8: 
                case 9: {
                    System.out.format("%3d %s", this.a[++n], this.a[n] == 1 ? "argument" : "arguments");
                    break;
                }
                case 10: 
                case 11: 
                case 12: {
                    System.out.format("%3d -> %d", (n += 2) - 2, n + 1 + (this.a[n - 1] << 8 | this.a[n]));
                    break;
                }
                case 13: {
                    System.out.format("%3d", this.a[++n]);
                    break;
                }
                case 14: 
                case 15: {
                    System.out.format("%3d.%-3d '%s.%s'", this.a[(n += 2) - 1], this.a[n], this.b.get(this.a[n - 1]), this.b.get(this.a[n]));
                    break;
                }
            }
            System.out.println();
            ++n;
        }
        return;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block30: {
                        break block30;
lbl1:
                        // 1 sources

                        return;
                    }
                    dr.field286 = 8854 ^ -6187;
                    dr.field287 = -32033 ^ -6187;
                    dr.h = new int[2][1];
                    var13 = new String[8];
                    var11_1 = 0;
                    var10_2 = "\u00e8\u00c9\u00e8\u00de\u00ae\u009f\u0080\"\u0003\u00d9\u00f7\u0001\tG\u00d5\u00d2a\u00c2\u00df\u0013'\u00fe\u0006\u009b\u007fI4\u00b1+\t\n!\u00b4\u00c3%<\u00f1V\u0016\t%y\u009e\u00f4C~;\u007f\u00df";
                    var12_3 = "\u00e8\u00c9\u00e8\u00de\u00ae\u009f\u0080\"\u0003\u00d9\u00f7\u0001\tG\u00d5\u00d2a\u00c2\u00df\u0013'\u00fe\u0006\u009b\u007fI4\u00b1+\t\n!\u00b4\u00c3%<\u00f1V\u0016\t%y\u009e\u00f4C~;\u007f\u00df".length();
                    var9_4 = 8;
                    var8_5 = -1;
lbl15:
                    // 2 sources

                    while (true) {
                        v0 = ++var8_5;
                        v1 = var10_2.substring(v0, v0 + var9_4);
                        v2 = -1;
                        break block27;
                        break;
                    }
lbl21:
                    // 1 sources

                    while (true) {
                        var13[var11_1++] = v3.intern();
                        if ((var8_5 += var9_4) < var12_3) {
                            var9_4 = var10_2.charAt(var8_5);
                            ** continue;
                        }
                        var10_2 = "\u008b\u008cKJ\u00f3\u00b25\u009c\u0010\u00f24dS\u0014V\u00cbJ\u00f4Y1\u00ces\u001a\u009a\u001d";
                        var12_3 = "\u008b\u008cKJ\u00f3\u00b25\u009c\u0010\u00f24dS\u0014V\u00cbJ\u00f4Y1\u00ces\u001a\u009a\u001d".length();
                        var9_4 = 8;
                        var8_5 = -1;
lbl31:
                        // 2 sources

                        while (true) {
                            v4 = ++var8_5;
                            v1 = var10_2.substring(v4, v4 + var9_4);
                            v2 = 0;
                            break block27;
                            break;
                        }
                        break;
                    }
lbl36:
                    // 1 sources

                    while (true) {
                        var13[var11_1++] = v3.intern();
                        if ((var8_5 += var9_4) < var12_3) {
                            var9_4 = var10_2.charAt(var8_5);
                            ** continue;
                        }
                        break block28;
                        break;
                    }
                }
                v5 = v1.toCharArray();
                var14_6 = 0;
                v6 = v5.length;
                v7 = v5;
                v8 = v6;
                if (v6 > 1) ** GOTO lbl86
                do {
                    v9 = v7;
                    v10 = v7;
                    v11 = var14_6;
                    while (true) {
                        v12 = v9[v11];
                        switch (var14_6 % 7) {
                            case 0: {
                                v13 = 38;
                                break;
                            }
                            case 1: {
                                v13 = 95;
                                break;
                            }
                            case 2: {
                                v13 = 27;
                                break;
                            }
                            case 3: {
                                v13 = 69;
                                break;
                            }
                            case 4: {
                                v13 = 54;
                                break;
                            }
                            case 5: {
                                v13 = 82;
                                break;
                            }
                            default: {
                                v13 = 61;
                            }
                        }
                        v9[v11] = (char)(v12 ^ v13);
                        ++var14_6;
                        v7 = v10;
                        v8 = v8;
                        if (v8 != 0) break;
                        v10 = v7;
                        v14 = v8;
                        v11 = v8;
                        v9 = v7;
                    }
lbl86:
                    // 2 sources

                    v15 = v7;
                    v14 = v8;
                } while (v8 > var14_6);
                v3 = new String(v15);
                switch (v2) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl95:
                    // 1 sources

                    ** continue;
                }
            }
            dr.d = var13;
            dr.e = new String[8];
            var0_7 = 1143236957686561954L;
            var6_8 = new long[4];
            var3_9 = 0;
            var4_10 = "\u0087\u009e\u0092a#\u00ebzx\u00f4\u0090q\u0015\u009a\u001d\u00b7T";
            var5_11 = "\u0087\u009e\u0092a#\u00ebzx\u00f4\u0090q\u0015\u009a\u001d\u00b7T".length();
            var2_12 = 0;
            while (true) {
                var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                v16 = var6_8;
                v17 = var3_9++;
                v18 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                v19 = -1;
                break block29;
                break;
            }
lbl113:
            // 1 sources

            while (true) {
                v16[v17] = v20;
                if (var2_12 < var5_11) ** continue;
                var4_10 = "\u00dan\u00e2\\\u00b34\u00f73\u00f3\u0007\u0087\u0003\u009b\u00b0\u00e7\u00d7";
                var5_11 = "\u00dan\u00e2\\\u00b34\u00f73\u00f3\u0007\u0087\u0003\u009b\u00b0\u00e7\u00d7".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v16 = var6_8;
                    v17 = var3_9++;
                    v18 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v19 = 0;
                    break block29;
                    break;
                }
                break;
            }
lbl126:
            // 1 sources

            while (true) {
                v16[v17] = v20;
                if (var2_12 < var5_11) ** continue;
                dr.f = var6_8;
                dr.g = new Integer[4];
                ** continue;
                break;
            }
        }
        v20 = v18 ^ var0_7;
        switch (v19) {
            default: {
                ** continue;
            }
            ** case 0:
lbl139:
            // 1 sources

            ** continue;
        }
    }
}

