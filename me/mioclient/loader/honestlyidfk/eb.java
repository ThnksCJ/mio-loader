/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.honestlyidfk;

import java.util.function.Supplier;
import me.mioclient.loader.honestlyidfk.dY;
import me.mioclient.loader.honestlyidfk.ec;
import me.mioclient.loader.honestlyidfk.ed;
import me.mioclient.loader.honestlyidfk.ee;
import me.mioclient.loader.honestlyidfk.ef;
import me.mioclient.loader.honestlyidfk.eg;
import me.mioclient.loader.honestlyidfk.eh;
import me.mioclient.loader.honestlyidfk.ei;
import me.mioclient.loader.honestlyidfk.ej;

public class eb {
    private static final eb b;
    private static final eb c;
    private static final eb d;
    public final ej a;
    private static final String[] e;
    private static final String[] f;
    private static final long[] g;
    private static final Integer[] h;
    public static final int[][] i;
    private static /* synthetic */ int field312;
    private static /* synthetic */ int field313;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private eb(ej ej2) {
        this.a = ej2;
    }

    public static eb a() {
        return b;
    }

    public static eb a(boolean bl2) {
        return bl2 ? c : d;
    }

    public static eb a(double d2) {
        return new eg(d2, null);
    }

    public static eb a(String string) {
        return new eh(string, null);
    }

    public static eb a(dY dY2) {
        return new ee(dY2);
    }

    public static eb a(ei ei2) {
        return new ef(ei2);
    }

    public boolean b() {
        return this.a == ej.a;
    }

    public boolean c() {
        return this.a == ej.b;
    }

    public boolean d() {
        return this.a == ej.c;
    }

    public boolean e() {
        return this.a == ej.d;
    }

    public boolean f() {
        return this.a == ej.e;
    }

    public boolean g() {
        return this.a == ej.f;
    }

    public boolean h() {
        return ed.a((ed)this);
    }

    public double i() {
        return eg.a((eg)this);
    }

    public String j() {
        return eh.a((eh)this);
    }

    public dY k() {
        return ee.a((ee)this);
    }

    public ei l() {
        return ef.a((ef)this);
    }

    public boolean m() {
        switch (ec.a[this.a.ordinal()]) {
            default: {
                return false;
            }
            case 2: {
                return this.h();
            }
            case 3: 
            case 4: 
            case 5: 
            case 6: 
        }
        return true;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        eb eb2 = (eb)object;
        if (this.a != eb2.a) {
            return false;
        }
        switch (ec.a[this.a.ordinal()]) {
            case 1: {
                return true;
            }
            case 2: {
                return this.h() == eb2.h();
            }
            case 3: {
                return this.i() == eb2.i();
            }
            case 4: {
                return this.j().equals(eb2.j());
            }
            case 5: {
                return this.k() == eb2.k();
            }
            case 6: {
                return this.l() == eb2.l();
            }
        }
        return false;
    }

    public int hashCode() {
        int n = super.hashCode();
        switch (ec.a[this.a.ordinal()]) {
            case 2: {
                n = 31 * n + (this.h() ? 1 : 0);
                break;
            }
            case 3: {
                long l = Double.doubleToLongBits(this.i());
                n = 31 * n + (int)(l ^ l >>> 32);
                break;
            }
            case 4: {
                String string = this.j();
                n = 31 * n + string.hashCode();
                break;
            }
            case 5: {
                n = 31 * n + this.k().hashCode();
                break;
            }
            case 6: {
                n = 31 * n + this.l().hashCode();
            }
        }
        return n;
    }

    public String toString() {
        switch (ec.a[this.a.ordinal()]) {
            case 1: {
                return "null";
            }
            case 2: {
                return this.h() ? "true" : "false";
            }
            case 3: {
                double d2 = this.i();
                return d2 % 1.0 == 0.0 ? Integer.toString((int)d2) : Double.toString(d2);
            }
            case 4: {
                return this.j();
            }
            case 5: {
                return "<function>";
            }
            case 6: {
                Supplier supplier = this.l().a("_toString");
                return supplier == null ? "<map>" : ((eb)supplier.get()).toString();
            }
        }
        return "";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    /* synthetic */ eb(ej ej2, ec ec2) {
        this(ej2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block25: {
            block24: {
                block23: {
                    block22: {
                        block26: {
                            break block26;
lbl1:
                            // 1 sources

                            return;
                        }
                        eb.field312 = 2739 ^ -14466;
                        eb.field313 = -21368 ^ -14466;
                        eb.i = new int[3][1];
                        var13 = new String[6];
                        var11_1 = 0;
                        var10_2 = "\u0013\u008b[\u0082\u001ar\u009d&!\u0005y\u0093\u0017\u0098\u0016\u0005\u00ac\u00ca\u00b1=5\u0004\u00cb\u00cdTT";
                        var12_3 = "\u0013\u008b[\u0082\u001ar\u009d&!\u0005y\u0093\u0017\u0098\u0016\u0005\u00ac\u00ca\u00b1=5\u0004\u00cb\u00cdTT".length();
                        var9_4 = 9;
                        var8_5 = -1;
lbl15:
                        // 2 sources

                        while (true) {
                            v0 = ++var8_5;
                            v1 = var10_2.substring(v0, v0 + var9_4);
                            v2 = -1;
                            break block22;
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
                            var10_2 = "6\u00e8\u00ea\u0083b\u00cegvw\u0090\u0004k>\u0000\u00c4";
                            var12_3 = "6\u00e8\u00ea\u0083b\u00cegvw\u0090\u0004k>\u0000\u00c4".length();
                            var9_4 = 10;
                            var8_5 = -1;
lbl31:
                            // 2 sources

                            while (true) {
                                v4 = ++var8_5;
                                v1 = var10_2.substring(v4, v4 + var9_4);
                                v2 = 0;
                                break block22;
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
                            break block23;
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
                                    v13 = 118;
                                    break;
                                }
                                case 1: {
                                    v13 = 16;
                                    break;
                                }
                                case 2: {
                                    v13 = 44;
                                    break;
                                }
                                case 3: {
                                    v13 = 88;
                                    break;
                                }
                                case 4: {
                                    v13 = 2;
                                    break;
                                }
                                case 5: {
                                    v13 = 98;
                                    break;
                                }
                                default: {
                                    v13 = 13;
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
                eb.e = var13;
                eb.f = new String[6];
                var0_7 = 1883771284769455430L;
                var6_8 = new long[3];
                var3_9 = 0;
                var4_10 = "\u00fe2\u0091QW\u00a0+\u00e0\u0097\u00ef\u0010bR\u0000rW\u0019\u00e5]\\@\u00ec\u000em";
                var5_11 = "\u00fe2\u0091QW\u00a0+\u00e0\u0097\u00ef\u0010bR\u0000rW\u0019\u00e5]\\@\u00ec\u000em".length();
                var2_12 = 0;
                while (true) {
                    break block24;
                    break;
                }
lbl107:
                // 1 sources

                while (true) {
                    var6_8[v16] = (((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L) ^ var0_7;
                    if (var2_12 < var5_11) ** continue;
                    break block25;
                    break;
                }
            }
            var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
            v16 = var3_9++;
            ** while (true)
        }
        eb.g = var6_8;
        eb.h = new Integer[3];
        eb.b = new eb(ej.a);
        eb.c = new ed(true, null);
        eb.d = new ed(false, null);
        ** while (true)
    }
}

