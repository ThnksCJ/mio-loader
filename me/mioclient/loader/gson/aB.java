/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import me.mioclient.loader.gson.aC;
import me.mioclient.loader.gson.aD;
import me.mioclient.loader.gson.aE;
import me.mioclient.loader.gson.aF;
import me.mioclient.loader.gson.aH;
import me.mioclient.loader.gson.aK;

public final class aB
extends AbstractMap
implements Serializable {
    private static final Comparator h;
    Comparator a;
    aK[] b;
    final aK c;
    int d = 0;
    int e = 0;
    int f;
    private aF i;
    private aH j;
    static final /* synthetic */ boolean g;
    private static final String[] k;
    private static final String[] l;
    private static final long[] m;
    private static final Integer[] n;
    public static final int[][] o;
    private static /* synthetic */ int field6;
    private static /* synthetic */ int field7;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public aB() {
        this(h);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public aB(Comparator comparator) {
        this.a = comparator != null ? comparator : h;
        this.c = new aK();
        this.b = new aK[16];
        this.f = this.b.length / 2 + this.b.length / 4;
    }

    @Override
    public int size() {
        return this.d;
    }

    @Override
    public Object get(Object object) {
        aK aK2 = this.a(object);
        return aK2 != null ? aK2.h : null;
    }

    @Override
    public boolean containsKey(Object object) {
        return this.a(object) != null;
    }

    @Override
    public Object put(Object object, Object object2) {
        if (object == null) {
            throw new NullPointerException("key == null");
        }
        aK aK2 = this.a(object, true);
        Object object3 = aK2.h;
        aK2.h = object2;
        return object3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void clear() {
        Arrays.fill(this.b, null);
        this.d = 0;
        ++this.e;
        aK aK2 = this.c;
        aK aK3 = aK2.d;
        while (aK3 != aK2) {
            aK aK4 = aK3.d;
            aK3.e = null;
            aK3.d = null;
            aK3 = aK4;
        }
        aK2.d = aK2.e = aK2;
    }

    @Override
    public Object remove(Object object) {
        aK aK2 = this.b(object);
        return aK2 != null ? aK2.h : null;
    }

    aK a(Object object, boolean bl) {
        aK aK2;
        aK aK3;
        Comparator comparator = this.a;
        aK[] aKArray = this.b;
        int n = aB.a(object.hashCode());
        int n2 = n & aKArray.length - 1;
        aK aK4 = aKArray[n2];
        int n3 = 0;
        if (aK4 != null) {
            aK3 = comparator == h ? (Comparable)object : null;
            while (true) {
                int n4 = n3 = aK3 != null ? aK3.compareTo(aK4.f) : comparator.compare(object, aK4.f);
                if (n3 == 0) {
                    return aK4;
                }
                aK aK5 = aK2 = n3 < 0 ? aK4.b : aK4.c;
                if (aK2 == null) break;
                aK4 = aK2;
            }
        }
        if (!bl) {
            return null;
        }
        aK3 = this.c;
        if (aK4 == null) {
            if (comparator == h && !(object instanceof Comparable)) {
                throw new ClassCastException(object.getClass().getName() + " is not Comparable");
            }
            aKArray[n2] = aK2 = new aK(aK4, object, n, aK3, aK3.e);
        } else {
            aK2 = new aK(aK4, object, n, aK3, aK3.e);
            if (n3 < 0) {
                aK4.b = aK2;
            } else {
                aK4.c = aK2;
            }
            this.b(aK4, true);
        }
        if (this.d++ > this.f) {
            this.a();
        }
        ++this.e;
        return aK2;
    }

    aK a(Object object) {
        return object != null ? this.a(object, false) : null;
    }

    aK a(Map.Entry entry) {
        aK aK2 = this.a(entry.getKey());
        boolean bl = aK2 != null && this.a(aK2.h, entry.getValue());
        return bl ? aK2 : null;
    }

    private boolean a(Object object, Object object2) {
        return object == object2 || object != null && object.equals(object2);
    }

    private static int a(int n) {
        n ^= n >>> 20 ^ n >>> 12;
        return n ^ n >>> 7 ^ n >>> 4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    void a(aK aK2, boolean bl) {
        if (bl) {
            aK2.e.d = aK2.d;
            aK2.d.e = aK2.e;
            aK2.e = null;
            aK2.d = null;
        }
        aK aK3 = aK2.b;
        aK aK4 = aK2.c;
        aK aK5 = aK2.a;
        if (aK3 != null && aK4 != null) {
            aK aK6 = aK3.i > aK4.i ? aK3.b() : aK4.a();
            this.a(aK6, false);
            int n = 0;
            aK3 = aK2.b;
            if (aK3 != null) {
                n = aK3.i;
                aK6.b = aK3;
                aK3.a = aK6;
                aK2.b = null;
            }
            int n2 = 0;
            aK4 = aK2.c;
            if (aK4 != null) {
                n2 = aK4.i;
                aK6.c = aK4;
                aK4.a = aK6;
                aK2.c = null;
            }
            aK6.i = Math.max(n, n2) + 1;
            this.a(aK2, aK6);
            return;
        }
        if (aK3 != null) {
            this.a(aK2, aK3);
            aK2.b = null;
        } else if (aK4 != null) {
            this.a(aK2, aK4);
            aK2.c = null;
        } else {
            this.a(aK2, null);
        }
        this.b(aK5, false);
        --this.d;
        ++this.e;
    }

    aK b(Object object) {
        aK aK2;
        block0: {
            aK2 = this.a(object);
            if (aK2 == null) break block0;
            this.a(aK2, true);
        }
        return aK2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void a(aK aK2, aK aK3) {
        aK aK4 = aK2.a;
        aK2.a = null;
        if (aK3 != null) {
            aK3.a = aK4;
        }
        if (aK4 != null) {
            if (aK4.b == aK2) {
                aK4.b = aK3;
                return;
            }
            if (!g && aK4.c != aK2) {
                throw new AssertionError();
            }
            aK4.c = aK3;
            return;
        }
        int n = aK2.g & this.b.length - 1;
        this.b[n] = aK3;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void b(aK aK2, boolean bl) {
        aK aK3 = aK2;
        while (aK3 != null) {
            aK aK4 = aK3.b;
            aK aK5 = aK3.c;
            int n = aK4 != null ? aK4.i : 0;
            int n2 = aK5 != null ? aK5.i : 0;
            int n3 = n - n2;
            if (n3 == -2) {
                var9_9 = aK5.b;
                var10_10 = aK5.c;
                var11_11 = var10_10 != null ? var10_10.i : 0;
                var12_12 = var9_9 != null ? var9_9.i : 0;
                var13_13 = var12_12 - var11_11;
                if (var13_13 == -1 || var13_13 == 0 && !bl) {
                    this.a(aK3);
                } else {
                    if (!g && var13_13 != 1) {
                        throw new AssertionError();
                    }
                    this.b(aK5);
                    this.a(aK3);
                }
                if (bl) {
                    return;
                }
            } else if (n3 == 2) {
                var9_9 = aK4.b;
                var12_12 = var9_9 != null ? var9_9.i : 0;
                var13_13 = var12_12 - (var11_11 = (var10_10 = aK4.c) != null ? var10_10.i : 0);
                if (var13_13 == 1 || var13_13 == 0 && !bl) {
                    this.b(aK3);
                } else {
                    if (!g) {
                        if (var13_13 != -1) {
                            throw new AssertionError();
                        }
                    }
                    this.a(aK4);
                    this.b(aK3);
                }
                if (bl) {
                    return;
                }
            } else if (n3 == 0) {
                aK3.i = n + 1;
                if (bl) {
                    return;
                }
            } else {
                if (!g) {
                    if (n3 != -1 && n3 != 1) {
                        throw new AssertionError();
                    }
                }
                aK3.i = Math.max(n, n2) + 1;
                if (!bl) {
                    return;
                }
            }
            aK3 = aK3.a;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void a(aK aK2) {
        aK aK3 = aK2.b;
        aK aK4 = aK2.c;
        aK aK5 = aK4.b;
        aK aK6 = aK4.c;
        aK2.c = aK5;
        if (aK5 != null) {
            aK5.a = aK2;
        }
        this.a(aK2, aK4);
        aK4.b = aK2;
        aK2.a = aK4;
        aK2.i = Math.max(aK3 != null ? aK3.i : 0, aK5 != null ? aK5.i : 0) + 1;
        aK4.i = Math.max(aK2.i, aK6 != null ? aK6.i : 0) + 1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void b(aK aK2) {
        aK aK3;
        aK aK4 = aK2.b;
        aK aK5 = aK2.c;
        aK aK6 = aK4.b;
        aK2.b = aK3 = aK4.c;
        if (aK3 != null) {
            aK3.a = aK2;
        }
        this.a(aK2, aK4);
        aK4.c = aK2;
        aK2.a = aK4;
        aK2.i = Math.max(aK5 != null ? aK5.i : 0, aK3 != null ? aK3.i : 0) + 1;
        aK4.i = Math.max(aK2.i, aK6 != null ? aK6.i : 0) + 1;
    }

    @Override
    public Set entrySet() {
        aF aF2 = this.i;
        return aF2 != null ? aF2 : (this.i = new aF(this));
    }

    @Override
    public Set keySet() {
        aH aH2 = this.j;
        return aH2 != null ? aH2 : (this.j = new aH(this));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void a() {
        this.b = aB.a(this.b);
        this.f = this.b.length / 2 + this.b.length / 4;
    }

    static aK[] a(aK[] aKArray) {
        int n = aKArray.length;
        aK[] aKArray2 = new aK[n * 2];
        aE aE2 = new aE();
        aD aD2 = new aD();
        aD aD3 = new aD();
        for (int i = 0; i < n; ++i) {
            aK aK2;
            aK aK3 = aKArray[i];
            if (aK3 == null) continue;
            aE2.a(aK3);
            int n2 = 0;
            int n3 = 0;
            while ((aK2 = aE2.a()) != null) {
                if ((aK2.g & n) == 0) {
                    ++n2;
                    continue;
                }
                ++n3;
            }
            aD2.a(n2);
            aD3.a(n3);
            aE2.a(aK3);
            while ((aK2 = aE2.a()) != null) {
                if ((aK2.g & n) == 0) {
                    aD2.a(aK2);
                    continue;
                }
                aD3.a(aK2);
            }
            aKArray2[i] = n2 > 0 ? aD2.a() : null;
            aKArray2[i + n] = n3 > 0 ? aD3.a() : null;
        }
        return aKArray2;
    }

    private Object b() {
        return new LinkedHashMap(this);
    }

    private void a(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    /*
     * Unable to fully structure code
     */
    static {
        block23: {
            block22: {
                block21: {
                    block24: {
                        break block24;
lbl1:
                        // 1 sources

                        return;
                    }
                    aB.field6 = 24119 ^ -7639;
                    aB.field7 = -26847 ^ -7639;
                    aB.o = new int[1][2];
                    var13 = new String[3];
                    var11_1 = 0;
                    var10_2 = "\u00f6\u00e2\u00f1\u001f-C\u00ec\u00bb\u00daD:\u001a\r\u00d1\u00fc\u009a\u00c6?\u001e\u009c\u00c6TS\u0085!s}\u00b4L\u0094\u00a8]\u001e\u00f0\u009f\u00ac\u0083\u0091\u00f3\u00e6\u00a7\u00f4\u00e1\u0012M\u00a5\u00c1\u009cX\u000bK\u00cen\u0017\u00c6\u0010\u00fc\u00870G\u0096";
                    var12_3 = "\u00f6\u00e2\u00f1\u001f-C\u00ec\u00bb\u00daD:\u001a\r\u00d1\u00fc\u009a\u00c6?\u001e\u009c\u00c6TS\u0085!s}\u00b4L\u0094\u00a8]\u001e\u00f0\u009f\u00ac\u0083\u0091\u00f3\u00e6\u00a7\u00f4\u00e1\u0012M\u00a5\u00c1\u009cX\u000bK\u00cen\u0017\u00c6\u0010\u00fc\u00870G\u0096".length();
                    var9_4 = 18;
                    var8_5 = -1;
lbl15:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl17:
                    // 1 sources

                    while (true) {
                        var13[var11_1++] = new String(v0).intern();
                        if ((var8_5 += var9_4) < var12_3) {
                            var9_4 = var10_2.charAt(var8_5);
                            ** continue;
                        }
                        break block21;
                        break;
                    }
                    v1 = ++var8_5;
                    v2 = var10_2.substring(v1, v1 + var9_4).toCharArray();
                    var14_6 = 0;
                    v3 = v2.length;
                    v4 = v2;
                    v5 = v3;
                    if (v3 > 1) ** GOTO lbl68
                    do {
                        v6 = v4;
                        v7 = v4;
                        v8 = var14_6;
                        while (true) {
                            v9 = v6[v8];
                            switch (var14_6 % 7) {
                                case 0: {
                                    v10 = 24;
                                    break;
                                }
                                case 1: {
                                    v10 = 17;
                                    break;
                                }
                                case 2: {
                                    v10 = 123;
                                    break;
                                }
                                case 3: {
                                    v10 = 5;
                                    break;
                                }
                                case 4: {
                                    v10 = 15;
                                    break;
                                }
                                case 5: {
                                    v10 = 75;
                                    break;
                                }
                                default: {
                                    v10 = 127;
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
lbl68:
                        // 2 sources

                        v0 = v4;
                        v11 = v5;
                    } while (v5 > var14_6);
                    ** while (true)
                }
                aB.k = var13;
                aB.l = new String[3];
                var0_7 = 4946393257001388420L;
                var6_8 = new long[5];
                var3_9 = 0;
                var4_10 = "\u00b6\u0011\u00a3x\u00da{\u00c4\u00e0\u0013b\u00cb\u0005\u00ce\nb\u00f5\u00d8\u00e7\u00b1\u00ff\u00e4\u00b6\u00eb\"";
                var5_11 = "\u00b6\u0011\u00a3x\u00da{\u00c4\u00e0\u0013b\u00cb\u0005\u00ce\nb\u00f5\u00d8\u00e7\u00b1\u00ff\u00e4\u00b6\u00eb\"".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v12 = var6_8;
                    v13 = var3_9++;
                    v14 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v15 = -1;
                    break block22;
                    break;
                }
lbl91:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u008e\u00a7\u00d9\u00ecB\u00f5z\u001ck:[\u00bb4\u00d7L4";
                    var5_11 = "\u008e\u00a7\u00d9\u00ecB\u00f5z\u001ck:[\u00bb4\u00d7L4".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v12 = var6_8;
                        v13 = var3_9++;
                        v14 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v15 = 0;
                        break block22;
                        break;
                    }
                    break;
                }
lbl104:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var2_12 < var5_11) ** continue;
                    break block23;
                    break;
                }
            }
            v16 = v14 ^ var0_7;
            switch (v15) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl115:
                // 1 sources

                ** continue;
            }
        }
        aB.m = var6_8;
        aB.n = new Integer[5];
        aB.g = aB.class.desiredAssertionStatus() == false;
        aB.h = new aC();
        ** while (true)
    }
}

