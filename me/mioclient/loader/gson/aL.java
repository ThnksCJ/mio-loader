/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import me.mioclient.loader.gson.aM;
import me.mioclient.loader.gson.aN;
import me.mioclient.loader.gson.aP;
import me.mioclient.loader.gson.aS;

public final class aL
extends AbstractMap
implements Serializable {
    private static final Comparator g;
    Comparator a;
    aS b;
    int c = 0;
    int d = 0;
    final aS e = new aS();
    private aN h;
    private aP i;
    static final /* synthetic */ boolean f;
    private static final String[] j;
    private static final String[] k;
    private static final long l;
    public static final int[][] m;
    private static /* synthetic */ int field8;
    private static /* synthetic */ int field9;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public aL() {
        this(g);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public aL(Comparator comparator) {
        this.a = comparator != null ? comparator : g;
    }

    @Override
    public int size() {
        return this.c;
    }

    @Override
    public Object get(Object object) {
        aS aS2 = this.a(object);
        return aS2 != null ? aS2.g : null;
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
        aS aS2 = this.a(object, true);
        Object object3 = aS2.g;
        aS2.g = object2;
        return object3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void clear() {
        aS aS2;
        this.b = null;
        this.c = 0;
        ++this.d;
        aS2.d = aS2.e = (aS2 = this.e);
    }

    @Override
    public Object remove(Object object) {
        aS aS2 = this.b(object);
        return aS2 != null ? aS2.g : null;
    }

    aS a(Object object, boolean bl) {
        aS aS2;
        aS aS3;
        Comparator comparator = this.a;
        aS aS4 = this.b;
        int n = 0;
        if (aS4 != null) {
            aS3 = comparator == g ? (Comparable)object : null;
            while (true) {
                int n2 = n = aS3 != null ? aS3.compareTo(aS4.f) : comparator.compare(object, aS4.f);
                if (n == 0) {
                    return aS4;
                }
                aS aS5 = aS2 = n < 0 ? aS4.b : aS4.c;
                if (aS2 == null) break;
                aS4 = aS2;
            }
        }
        if (!bl) {
            return null;
        }
        aS3 = this.e;
        if (aS4 == null) {
            if (comparator == g && !(object instanceof Comparable)) {
                throw new ClassCastException(object.getClass().getName() + " is not Comparable");
            }
            this.b = aS2 = new aS(aS4, object, aS3, aS3.e);
        } else {
            aS2 = new aS(aS4, object, aS3, aS3.e);
            if (n < 0) {
                aS4.b = aS2;
            } else {
                aS4.c = aS2;
            }
            this.b(aS4, true);
        }
        ++this.c;
        ++this.d;
        return aS2;
    }

    aS a(Object object) {
        return object != null ? this.a(object, false) : null;
    }

    aS a(Map.Entry entry) {
        aS aS2 = this.a(entry.getKey());
        boolean bl = aS2 != null && this.a(aS2.g, entry.getValue());
        return bl ? aS2 : null;
    }

    private boolean a(Object object, Object object2) {
        return object == object2 || object != null && object.equals(object2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    void a(aS aS2, boolean bl) {
        if (bl) {
            aS2.e.d = aS2.d;
            aS2.d.e = aS2.e;
        }
        aS aS3 = aS2.b;
        aS aS4 = aS2.c;
        aS aS5 = aS2.a;
        if (aS3 != null && aS4 != null) {
            aS aS6 = aS3.h > aS4.h ? aS3.b() : aS4.a();
            this.a(aS6, false);
            int n = 0;
            aS3 = aS2.b;
            if (aS3 != null) {
                n = aS3.h;
                aS6.b = aS3;
                aS3.a = aS6;
                aS2.b = null;
            }
            int n2 = 0;
            aS4 = aS2.c;
            if (aS4 != null) {
                n2 = aS4.h;
                aS6.c = aS4;
                aS4.a = aS6;
                aS2.c = null;
            }
            aS6.h = Math.max(n, n2) + 1;
            this.a(aS2, aS6);
            return;
        }
        if (aS3 != null) {
            this.a(aS2, aS3);
            aS2.b = null;
        } else if (aS4 != null) {
            this.a(aS2, aS4);
            aS2.c = null;
        } else {
            this.a(aS2, null);
        }
        this.b(aS5, false);
        --this.c;
        ++this.d;
    }

    aS b(Object object) {
        aS aS2;
        block0: {
            aS2 = this.a(object);
            if (aS2 == null) break block0;
            this.a(aS2, true);
        }
        return aS2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void a(aS aS2, aS aS3) {
        aS aS4 = aS2.a;
        aS2.a = null;
        if (aS3 != null) {
            aS3.a = aS4;
        }
        if (aS4 != null) {
            if (aS4.b == aS2) {
                aS4.b = aS3;
                return;
            }
            if (!f && aS4.c != aS2) {
                throw new AssertionError();
            }
            aS4.c = aS3;
            return;
        }
        this.b = aS3;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void b(aS aS2, boolean bl) {
        aS aS3 = aS2;
        while (aS3 != null) {
            aS aS4 = aS3.b;
            aS aS5 = aS3.c;
            int n = aS4 != null ? aS4.h : 0;
            int n2 = aS5 != null ? aS5.h : 0;
            int n3 = n - n2;
            if (n3 == (int)l) {
                var9_9 = aS5.b;
                var10_10 = aS5.c;
                var11_11 = var10_10 != null ? var10_10.h : 0;
                var12_12 = var9_9 != null ? var9_9.h : 0;
                var13_13 = var12_12 - var11_11;
                if (var13_13 == -1 || var13_13 == 0 && !bl) {
                    this.a(aS3);
                } else {
                    if (!f && var13_13 != 1) {
                        throw new AssertionError();
                    }
                    this.b(aS5);
                    this.a(aS3);
                }
                if (bl) {
                    return;
                }
            } else if (n3 == 2) {
                var9_9 = aS4.b;
                var12_12 = var9_9 != null ? var9_9.h : 0;
                var13_13 = var12_12 - (var11_11 = (var10_10 = aS4.c) != null ? var10_10.h : 0);
                if (var13_13 == 1 || var13_13 == 0 && !bl) {
                    this.b(aS3);
                } else {
                    if (!f) {
                        if (var13_13 != -1) {
                            throw new AssertionError();
                        }
                    }
                    this.a(aS4);
                    this.b(aS3);
                }
                if (bl) {
                    return;
                }
            } else if (n3 == 0) {
                aS3.h = n + 1;
                if (bl) {
                    return;
                }
            } else {
                if (!f) {
                    if (n3 != -1 && n3 != 1) {
                        throw new AssertionError();
                    }
                }
                aS3.h = Math.max(n, n2) + 1;
                if (!bl) {
                    return;
                }
            }
            aS3 = aS3.a;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void a(aS aS2) {
        aS aS3 = aS2.b;
        aS aS4 = aS2.c;
        aS aS5 = aS4.b;
        aS aS6 = aS4.c;
        aS2.c = aS5;
        if (aS5 != null) {
            aS5.a = aS2;
        }
        this.a(aS2, aS4);
        aS4.b = aS2;
        aS2.a = aS4;
        aS2.h = Math.max(aS3 != null ? aS3.h : 0, aS5 != null ? aS5.h : 0) + 1;
        aS4.h = Math.max(aS2.h, aS6 != null ? aS6.h : 0) + 1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void b(aS aS2) {
        aS aS3;
        aS aS4 = aS2.b;
        aS aS5 = aS2.c;
        aS aS6 = aS4.b;
        aS2.b = aS3 = aS4.c;
        if (aS3 != null) {
            aS3.a = aS2;
        }
        this.a(aS2, aS4);
        aS4.c = aS2;
        aS2.a = aS4;
        aS2.h = Math.max(aS5 != null ? aS5.h : 0, aS3 != null ? aS3.h : 0) + 1;
        aS4.h = Math.max(aS2.h, aS6 != null ? aS6.h : 0) + 1;
    }

    @Override
    public Set entrySet() {
        aN aN2 = this.h;
        return aN2 != null ? aN2 : (this.h = new aN(this));
    }

    @Override
    public Set keySet() {
        aP aP2 = this.i;
        return aP2 != null ? aP2 : (this.i = new aP(this));
    }

    private Object a() {
        return new LinkedHashMap(this);
    }

    private void a(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    /*
     * Unable to fully structure code
     */
    static {
        block17: {
            block15: {
                block16: {
                    break block16;
lbl1:
                    // 1 sources

                    return;
                }
                aL.field8 = 2324 ^ -15196;
                aL.field9 = -22270 ^ -15196;
                aL.m = new int[2][3];
                var7 = new String[3];
                var5_1 = 0;
                var4_2 = "\u00d9\u00d2\u00fa\u001ec\u00c8\u00fa[d\u00b6\u00eak\u00bc [\u00d8\u00dcp\u001eHm !$\u00c4\u0098P\u00b5\u0007\u00b3\u00ee\u0012\t\u0088\u0001MW\u0082\u00c2[\u0010?\u00f9la\u00c1\u009b\u0081o\u000bk\u009a\u0084\u009a\u00b4\nmU~\u00f3X";
                var6_3 = "\u00d9\u00d2\u00fa\u001ec\u00c8\u00fa[d\u00b6\u00eak\u00bc [\u00d8\u00dcp\u001eHm !$\u00c4\u0098P\u00b5\u0007\u00b3\u00ee\u0012\t\u0088\u0001MW\u0082\u00c2[\u0010?\u00f9la\u00c1\u009b\u0081o\u000bk\u009a\u0084\u009a\u00b4\nmU~\u00f3X".length();
                var3_4 = 18;
                var2_5 = -1;
lbl15:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
lbl17:
                // 1 sources

                while (true) {
                    var7[var5_1++] = new String(v0).intern();
                    if ((var2_5 += var3_4) < var6_3) {
                        var3_4 = var4_2.charAt(var2_5);
                        ** continue;
                    }
                    break block15;
                    break;
                }
                v1 = ++var2_5;
                v2 = var4_2.substring(v1, v1 + var3_4).toCharArray();
                var8_6 = 0;
                v3 = v2.length;
                v4 = v2;
                v5 = v3;
                if (v3 > 1) ** GOTO lbl68
                do {
                    v6 = v4;
                    v7 = v4;
                    v8 = var8_6;
                    while (true) {
                        v9 = v6[v8];
                        switch (var8_6 % 7) {
                            case 0: {
                                v10 = 109;
                                break;
                            }
                            case 1: {
                                v10 = 10;
                                break;
                            }
                            case 2: {
                                v10 = 59;
                                break;
                            }
                            case 3: {
                                v10 = 97;
                                break;
                            }
                            case 4: {
                                v10 = 40;
                                break;
                            }
                            case 5: {
                                v10 = 108;
                                break;
                            }
                            default: {
                                v10 = 68;
                            }
                        }
                        v6[v8] = (char)(v9 ^ v10);
                        ++var8_6;
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
                } while (v5 > var8_6);
                ** while (true)
            }
            aL.j = var7;
            aL.k = new String[3];
            break block17;
lbl78:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 7807316832433254226L;
        ** while (true)
        aL.l = 604884973406867628L ^ var0_7;
        aL.f = aL.class.desiredAssertionStatus() == false;
        aL.g = new aM();
        ** while (true)
    }
}

