/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class eJ {
    public static final int a;
    public static final int b;
    public static final eJ c;
    public static final eJ d;
    private boolean e;
    private String f;
    private boolean g;
    private Map h;
    private Set i;
    private int j = 512;
    private static final String[] k;
    private static final String[] l;
    private static final long[] m;
    private static final Integer[] n;
    public static final int[][] o;
    private static /* synthetic */ int field310;
    private static /* synthetic */ int field311;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public eJ() {
        this.e = false;
        this.f = "content";
        this.g = false;
        this.h = Collections.emptyMap();
        this.i = Collections.emptySet();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public eJ(boolean bl2) {
        this(bl2, "content", false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public eJ(String string) {
        this(false, string, false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public eJ(boolean bl2, String string) {
        this.e = bl2;
        this.f = string;
        this.g = false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public eJ(boolean bl2, String string, boolean bl3) {
        this.e = bl2;
        this.f = string;
        this.g = bl3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private eJ(boolean bl2, String string, boolean bl3, Map map, Set set, int n) {
        this.e = bl2;
        this.f = string;
        this.g = bl3;
        this.h = Collections.unmodifiableMap(map);
        this.i = Collections.unmodifiableSet(set);
        this.j = n;
    }

    protected eJ a() {
        return new eJ(this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public boolean b() {
        return this.e;
    }

    public eJ a(boolean bl2) {
        eJ eJ2 = this.a();
        eJ2.e = bl2;
        return eJ2;
    }

    public String c() {
        return this.f;
    }

    public eJ a(String string) {
        eJ eJ2 = this.a();
        eJ2.f = string;
        return eJ2;
    }

    public boolean d() {
        return this.g;
    }

    public eJ b(boolean bl2) {
        eJ eJ2 = this.a();
        eJ2.g = bl2;
        return eJ2;
    }

    public Map e() {
        return this.h;
    }

    public eJ a(Map map) {
        eJ eJ2 = this.a();
        HashMap hashMap = new HashMap(map);
        eJ2.h = Collections.unmodifiableMap(hashMap);
        return eJ2;
    }

    public Set f() {
        return this.i;
    }

    public eJ a(Set set) {
        eJ eJ2 = this.a();
        HashSet hashSet = new HashSet(set);
        eJ2.i = Collections.unmodifiableSet(hashSet);
        return eJ2;
    }

    public int g() {
        return this.j;
    }

    public eJ a(int n) {
        eJ eJ2 = this.a();
        eJ2.j = n > -1 ? n : -1;
        return eJ2;
    }

    protected /* synthetic */ Object clone() {
        return this.a();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block18: {
            block17: {
                block16: {
                    block19: {
                        break block19;
lbl1:
                        // 1 sources

                        return;
                    }
                    eJ.field310 = 4422 ^ -18491;
                    eJ.field311 = -32304 ^ -18491;
                    eJ.o = new int[4][1];
                    eJ.a = -1;
                    var13 = new String[2];
                    var11_1 = 0;
                    var10_2 = "q{F\u0017SU\b\u0007h\u00cfe\u00817\u0087\u0084";
                    var12_3 = "q{F\u0017SU\b\u0007h\u00cfe\u00817\u0087\u0084".length();
                    var9_4 = 7;
                    var8_5 = -1;
lbl17:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl19:
                    // 1 sources

                    while (true) {
                        var13[var11_1++] = new String(v0).intern();
                        if ((var8_5 += var9_4) < var12_3) {
                            var9_4 = var10_2.charAt(var8_5);
                            ** continue;
                        }
                        break block16;
                        break;
                    }
                    v1 = ++var8_5;
                    v2 = var10_2.substring(v1, v1 + var9_4).toCharArray();
                    var14_6 = 0;
                    v3 = v2.length;
                    v4 = v2;
                    v5 = v3;
                    if (v3 > 1) ** GOTO lbl70
                    do {
                        v6 = v4;
                        v7 = v4;
                        v8 = var14_6;
                        while (true) {
                            v9 = v6[v8];
                            switch (var14_6 % 7) {
                                case 0: {
                                    v10 = 82;
                                    break;
                                }
                                case 1: {
                                    v10 = 111;
                                    break;
                                }
                                case 2: {
                                    v10 = 67;
                                    break;
                                }
                                case 3: {
                                    v10 = 99;
                                    break;
                                }
                                case 4: {
                                    v10 = 53;
                                    break;
                                }
                                case 5: {
                                    v10 = 79;
                                    break;
                                }
                                default: {
                                    v10 = 121;
                                }
                            }
                            v6[v8] = (char)(v9 ^ v10);
                            ++var14_6;
                            v4 = v7;
                            v5 = v5;
                            if (v5 != 0) break;
                            v7 = v4;
                            v11 = v5;
                            v8 = v5;
                            v6 = v4;
                        }
lbl70:
                        // 2 sources

                        v0 = v4;
                        v11 = v5;
                    } while (v5 > var14_6);
                    ** while (true)
                }
                eJ.k = var13;
                eJ.l = new String[2];
                var0_7 = 5277021271723453973L;
                var6_8 = new long[3];
                var3_9 = 0;
                var4_10 = "\\\u00f7\u0004x1\u0004\u0087\u00aem\u00a0\u00a1b\tl\u0090\u001e\u001f\u00ca\u0005\u00f5\u00ad\u0093\u00d3\u001b";
                var5_11 = "\\\u00f7\u0004x1\u0004\u0087\u00aem\u00a0\u00a1b\tl\u0090\u001e\u001f\u00ca\u0005\u00f5\u00ad\u0093\u00d3\u001b".length();
                var2_12 = 0;
                while (true) {
                    break block17;
                    break;
                }
lbl87:
                // 1 sources

                while (true) {
                    var6_8[v12] = (((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L) ^ var0_7;
                    if (var2_12 < var5_11) ** continue;
                    break block18;
                    break;
                }
            }
            var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
            v12 = var3_9++;
            ** while (true)
        }
        eJ.m = var6_8;
        eJ.n = new Integer[3];
        eJ.b = 512;
        eJ.c = new eJ();
        eJ.d = new eJ().a(true);
        ** while (true)
    }
}

