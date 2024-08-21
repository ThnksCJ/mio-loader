/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.discordipc;

import me.mioclient.loader.discordipc.dj;
import me.mioclient.loader.discordipc.dk;
import me.mioclient.loader.gson.C;

public class di {
    private String a;
    private String b;
    private dj c;
    private dk d;
    private static final String[] e;
    private static final String[] f;
    public static final int[][] g;
    private static /* synthetic */ int field276;
    private static /* synthetic */ int field277;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(String string) {
        this.a = string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void b(String string) {
        this.b = string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(String string, String string2) {
        if (this.c == null) {
            this.c = new dj();
        }
        this.c.a = string;
        this.c.b = string2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void b(String string, String string2) {
        if (this.c == null) {
            this.c = new dj();
        }
        this.c.c = string;
        this.c.d = string2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(long l) {
        if (this.d == null) {
            this.d = new dk();
        }
        this.d.a = l;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void b(long l) {
        if (this.d == null) {
            this.d = new dk();
        }
        this.d.b = l;
    }

    public C a() {
        C c;
        C c2 = new C();
        if (this.a != null) {
            c2.a("details", this.a);
        }
        if (this.b != null) {
            c2.a("state", this.b);
        }
        if (this.c != null) {
            c = new C();
            if (this.c.a != null) {
                c.a("large_image", this.c.a);
            }
            if (this.c.b != null) {
                c.a("large_text", this.c.b);
            }
            if (this.c.c != null) {
                c.a("small_image", this.c.c);
            }
            if (this.c.d != null) {
                c.a("small_text", this.c.d);
            }
            c2.a("assets", c);
        }
        if (this.d != null) {
            c = new C();
            if (this.d.a != null) {
                c.a("start", this.d.a);
            }
            if (this.d.b != null) {
                c.a("end", this.d.b);
            }
            c2.a("timestamps", c);
        }
        return c2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block21: {
                break block21;
lbl1:
                // 1 sources

                return;
            }
            di.field276 = 12140 ^ -6627;
            di.field277 = -32348 ^ -6627;
            di.g = new int[4][4];
            var5 = new String[10];
            var3_1 = 0;
            var2_2 = "\u00fb\u0094\u0096T\u00fcz8\u0003\u0097\u00e0*\n\u00e1\b\u00deN\u00d5\u00a5VNV\u000f\u000bC\u00fe\u008e\u009b5v\u0096zV\u009d\u008c\u0005`\t\u0005\u00c15\u0005k]dM\b\u000b\u009e~\u00da\r\u00c7\u00ce\u00e0m\u0098\u007fU\u0006Y\u008a`G\u00d8\u0083";
            var4_3 = "\u00fb\u0094\u0096T\u00fcz8\u0003\u0097\u00e0*\n\u00e1\b\u00deN\u00d5\u00a5VNV\u000f\u000bC\u00fe\u008e\u009b5v\u0096zV\u009d\u008c\u0005`\t\u0005\u00c15\u0005k]dM\b\u000b\u009e~\u00da\r\u00c7\u00ce\u00e0m\u0098\u007fU\u0006Y\u008a`G\u00d8\u0083".length();
            var1_4 = 7;
            var0_5 = -1;
lbl15:
            // 2 sources

            while (true) {
                v0 = ++var0_5;
                v1 = var2_2.substring(v0, v0 + var1_4);
                v2 = -1;
                break block20;
                break;
            }
lbl21:
            // 1 sources

            while (true) {
                var5[var3_1++] = v3.intern();
                if ((var0_5 += var1_4) < var4_3) {
                    var1_4 = var2_2.charAt(var0_5);
                    ** continue;
                }
                var2_2 = "\u00b9c\u00d1(\u00de\u0000\u00f6\u00bc\u00fd_\ni\u00bf$5\u0018\u00c9\u0006\u0085\u00e3x";
                var4_3 = "\u00b9c\u00d1(\u00de\u0000\u00f6\u00bc\u00fd_\ni\u00bf$5\u0018\u00c9\u0006\u0085\u00e3x".length();
                var1_4 = 10;
                var0_5 = -1;
lbl31:
                // 2 sources

                while (true) {
                    v4 = ++var0_5;
                    v1 = var2_2.substring(v4, v4 + var1_4);
                    v2 = 0;
                    break block20;
                    break;
                }
                break;
            }
lbl36:
            // 1 sources

            while (true) {
                var5[var3_1++] = v3.intern();
                if ((var0_5 += var1_4) < var4_3) {
                    var1_4 = var2_2.charAt(var0_5);
                    ** continue;
                }
                di.e = var5;
                di.f = new String[10];
                ** continue;
                break;
            }
        }
        v5 = v1.toCharArray();
        var6_6 = 0;
        v6 = v5.length;
        v7 = v5;
        v8 = v6;
        if (v6 > 1) ** GOTO lbl88
        do {
            v9 = v7;
            v10 = v7;
            v11 = var6_6;
            while (true) {
                v12 = v9[v11];
                switch (var6_6 % 7) {
                    case 0: {
                        v13 = 75;
                        break;
                    }
                    case 1: {
                        v13 = 75;
                        break;
                    }
                    case 2: {
                        v13 = 28;
                        break;
                    }
                    case 3: {
                        v13 = 7;
                        break;
                    }
                    case 4: {
                        v13 = 62;
                        break;
                    }
                    case 5: {
                        v13 = 49;
                        break;
                    }
                    default: {
                        v13 = 87;
                    }
                }
                v9[v11] = (char)(v12 ^ v13);
                ++var6_6;
                v7 = v10;
                v8 = v8;
                if (v8 != 0) break;
                v10 = v7;
                v14 = v8;
                v11 = v8;
                v9 = v7;
            }
lbl88:
            // 2 sources

            v15 = v7;
            v14 = v8;
        } while (v8 > var6_6);
        v3 = new String(v15);
        switch (v2) {
            default: {
                ** continue;
            }
            ** case 0:
lbl97:
            // 1 sources

            ** continue;
        }
    }
}

