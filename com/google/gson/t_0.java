/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.Gson;
import com.google.gson.H;
import com.google.gson.K;
import com.google.gson.N;
import com.google.gson.S;
import com.google.gson.T;
import com.google.gson.V;
import com.google.gson.a;
import com.google.gson.ab_0;
import com.google.gson.av_0;
import com.google.gson.bF;
import com.google.gson.bK;
import com.google.gson.bm_0;
import com.google.gson.c;
import com.google.gson.cG;
import com.google.gson.cJ;
import com.google.gson.l_0;
import com.google.gson.u_0;
import com.google.gson.y_0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Renamed from com.google.gson.t
 */
public final class t_0 {
    private av_0 a = av_0.a;
    private K b = K.a;
    private l_0 c = com.google.gson.c.a;
    private final Map d = new HashMap();
    private final List e = new ArrayList();
    private final List f = new ArrayList();
    private boolean g = false;
    private String h;
    private int i = 2;
    private int j = 2;
    private boolean k = false;
    private boolean l = false;
    private boolean m = true;
    private boolean n = false;
    private boolean o = false;
    private boolean p = false;
    private S q = N.a;
    private S r = N.b;
    private static final long[] s;
    private static final Integer[] t;
    public static final int[][] u;
    private static /* synthetic */ int field344;
    private static /* synthetic */ int field345;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public t_0() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    t_0(Gson gson) {
        this.a = gson.i;
        this.c = gson.j;
        this.d.putAll(gson.k);
        this.g = gson.l;
        this.k = gson.m;
        this.o = gson.n;
        this.m = gson.o;
        this.n = gson.p;
        this.p = gson.q;
        this.l = gson.r;
        this.b = gson.v;
        this.h = gson.s;
        this.i = gson.t;
        this.j = gson.u;
        this.e.addAll(gson.w);
        this.f.addAll(gson.x);
        this.q = gson.y;
        this.r = gson.z;
    }

    public t_0 a(double d2) {
        this.a = this.a.a(d2);
        return this;
    }

    public t_0 a(int ... nArray) {
        this.a = this.a.a(nArray);
        return this;
    }

    public t_0 a() {
        this.o = true;
        return this;
    }

    public t_0 b() {
        this.a = this.a.c();
        return this;
    }

    public t_0 c() {
        this.g = true;
        return this;
    }

    public t_0 d() {
        this.k = true;
        return this;
    }

    public t_0 e() {
        this.a = this.a.b();
        return this;
    }

    public t_0 a(K k) {
        this.b = k;
        return this;
    }

    public t_0 a(c c2) {
        this.c = c2;
        return this;
    }

    public t_0 a(l_0 l_02) {
        this.c = l_02;
        return this;
    }

    public t_0 a(S s) {
        this.q = s;
        return this;
    }

    public t_0 b(S s) {
        this.r = s;
        return this;
    }

    public t_0 a(a ... aArray) {
        for (a a2 : aArray) {
            this.a = this.a.a(a2, true, true);
        }
        return this;
    }

    public t_0 a(a a2) {
        this.a = this.a.a(a2, true, false);
        return this;
    }

    public t_0 b(a a2) {
        this.a = this.a.a(a2, false, true);
        return this;
    }

    public t_0 f() {
        this.n = true;
        return this;
    }

    public t_0 g() {
        this.p = true;
        return this;
    }

    public t_0 h() {
        this.m = false;
        return this;
    }

    public t_0 a(String string) {
        this.h = string;
        return this;
    }

    public t_0 a(int n) {
        this.i = n;
        this.h = null;
        return this;
    }

    public t_0 a(int n, int n2) {
        this.i = n;
        this.j = n2;
        this.h = null;
        return this;
    }

    public t_0 a(Type type, Object object) {
        block2: {
            ab_0.a(object instanceof H || object instanceof y_0 || object instanceof u_0 || object instanceof T);
            if (object instanceof u_0) {
                this.d.put(type, (u_0)object);
            }
            if (object instanceof H || object instanceof y_0) {
                cJ cJ2 = cJ.b(type);
                this.e.add(bF.b(cJ2, object));
            }
            if (!(object instanceof T)) break block2;
            this.e.add(bK.a(cJ.b(type), (T)object));
        }
        return this;
    }

    public t_0 a(V v) {
        this.e.add(v);
        return this;
    }

    public t_0 a(Class clazz, Object object) {
        block1: {
            ab_0.a(object instanceof H || object instanceof y_0 || object instanceof T);
            if (object instanceof y_0 || object instanceof H) {
                this.f.add(bF.a(clazz, object));
            }
            if (!(object instanceof T)) break block1;
            this.e.add(bK.b(clazz, (T)object));
        }
        return this;
    }

    public t_0 i() {
        this.l = true;
        return this;
    }

    public Gson j() {
        ArrayList arrayList = new ArrayList(this.e.size() + this.f.size() + 3);
        arrayList.addAll(this.e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        this.a(this.h, this.i, this.j, arrayList);
        return new Gson(this.a, this.c, this.d, this.g, this.k, this.o, this.m, this.n, this.p, this.l, this.b, this.h, this.i, this.j, this.e, this.f, arrayList, this.q, this.r);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(String string, int n, int n2, List list) {
        V v;
        boolean bl2 = cG.a;
        V v2 = null;
        V v3 = null;
        if (string != null && !string.trim().isEmpty()) {
            v = bm_0.a.a(string);
            if (bl2) {
                v2 = cG.c.a(string);
                v3 = cG.b.a(string);
            }
        } else {
            if (n == 2) return;
            if (n2 == 2) return;
            v = bm_0.a.a(n, n2);
            if (bl2) {
                v2 = cG.c.a(n, n2);
                v3 = cG.b.a(n, n2);
            }
        }
        list.add(v);
        if (!bl2) return;
        list.add(v2);
        list.add(v3);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        field344 = 0x6700 ^ 0xFFFFFE5D;
        field345 = 0xFFFFD48D ^ 0xFFFFFE5D;
        u = new int[4][1];
        long l = 6614910310957675902L;
        long[] lArray = new long[2];
        int n = 0;
        String string = "Y1\u00ca\u00ff\u00b9\u0015NL\u00ea\u0096\u00854M\u00fd\u00eb]";
        int n2 = "Y1\u00ca\u00ff\u00b9\u0015NL\u00ea\u0096\u00854M\u00fd\u00eb]".length();
        int n3 = 0;
        do {
            byte[] byArray = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            lArray[n4] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l;
        } while (n3 < n2);
        s = lArray;
        t = new Integer[2];
    }
}

