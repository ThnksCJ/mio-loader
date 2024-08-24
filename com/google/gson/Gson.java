/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.B;
import com.google.gson.JsonElement;
import com.google.gson.JsonReader;
import com.google.gson.JsonSyntaxException;
import com.google.gson.JsonToken;
import com.google.gson.JsonTreeReader;
import com.google.gson.K;
import com.google.gson.N;
import com.google.gson.S;
import com.google.gson.T;
import com.google.gson.V;
import com.google.gson.aV;
import com.google.gson.aW;
import com.google.gson.ag_0;
import com.google.gson.av_0;
import com.google.gson.bB;
import com.google.gson.bK;
import com.google.gson.be_0;
import com.google.gson.bg;
import com.google.gson.bi_0;
import com.google.gson.bo_0;
import com.google.gson.br_0;
import com.google.gson.bt_0;
import com.google.gson.bv_0;
import com.google.gson.by_0;
import com.google.gson.c;
import com.google.gson.cG;
import com.google.gson.cJ;
import com.google.gson.cO;
import com.google.gson.l_0;
import com.google.gson.n_0;
import com.google.gson.o_0;
import com.google.gson.p_0;
import com.google.gson.q_0;
import com.google.gson.r_0;
import com.google.gson.s_0;
import com.google.gson.t_0;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public final class Gson {
    static final boolean a;
    static final boolean b;
    static final boolean c;
    static final boolean d;
    static final boolean e;
    static final boolean f;
    static final boolean g;
    private static final cJ A;
    private static final String B;
    private final ThreadLocal C = new ThreadLocal();
    private final Map D = new ConcurrentHashMap();
    private final ag_0 E;
    private final bo_0 F;
    final List h;
    final av_0 i;
    final l_0 j;
    final Map k;
    final boolean l;
    final boolean m;
    final boolean n;
    final boolean o;
    final boolean p;
    final boolean q;
    final boolean r;
    final String s;
    final int t;
    final int u;
    final K v;
    final List w;
    final List x;
    final S y;
    final S z;
    private static final String[] G;
    private static final String[] H;
    public static final int[][] I;
    private static /* synthetic */ int field342;
    private static /* synthetic */ int field343;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Gson() {
        this(av_0.a, com.google.gson.c.a, Collections.emptyMap(), false, false, false, true, false, false, false, K.a, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), N.a, N.b);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    Gson(av_0 av_02, l_0 l_02, Map map, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7, K k, String string, int n, int n2, List list, List list2, List list3, S s, S s2) {
        this.i = av_02;
        this.j = l_02;
        this.k = map;
        this.E = new ag_0(map);
        this.l = bl;
        this.m = bl2;
        this.n = bl3;
        this.o = bl4;
        this.p = bl5;
        this.q = bl6;
        this.r = bl7;
        this.v = k;
        this.s = string;
        this.t = n;
        this.u = n2;
        this.w = list;
        this.x = list2;
        this.y = s;
        this.z = s2;
        ArrayList<V> arrayList = new ArrayList<V>();
        arrayList.add(bK.V);
        arrayList.add(by_0.a(s));
        arrayList.add(av_02);
        arrayList.addAll(list3);
        arrayList.add(bK.B);
        arrayList.add(bK.m);
        arrayList.add(bK.g);
        arrayList.add(bK.i);
        arrayList.add(bK.k);
        T t = Gson.a(k);
        arrayList.add(bK.a(Long.TYPE, Long.class, t));
        arrayList.add(bK.a(Double.TYPE, Double.class, this.a(bl7)));
        arrayList.add(bK.a(Float.TYPE, Float.class, this.b(bl7)));
        arrayList.add(bv_0.a(s2));
        arrayList.add(bK.o);
        arrayList.add(bK.q);
        arrayList.add(bK.a(AtomicLong.class, Gson.a(t)));
        arrayList.add(bK.a(AtomicLongArray.class, Gson.b(t)));
        arrayList.add(bK.s);
        arrayList.add(bK.x);
        arrayList.add(bK.D);
        arrayList.add(bK.F);
        arrayList.add(bK.a(BigDecimal.class, bK.z));
        arrayList.add(bK.a(BigInteger.class, bK.A));
        arrayList.add(bK.H);
        arrayList.add(bK.J);
        arrayList.add(bK.N);
        arrayList.add(bK.P);
        arrayList.add(bK.T);
        arrayList.add(bK.L);
        arrayList.add(bK.d);
        arrayList.add(bi_0.a);
        arrayList.add(bK.R);
        if (cG.a) {
            arrayList.add(cG.e);
            arrayList.add(cG.d);
            arrayList.add(cG.f);
        }
        arrayList.add(be_0.a);
        arrayList.add(bK.b);
        arrayList.add(new bg(this.E));
        arrayList.add(new bt_0(this.E, bl2));
        this.F = new bo_0(this.E);
        arrayList.add(this.F);
        arrayList.add(bK.W);
        arrayList.add(new bB(this.E, l_02, av_02, this.F));
        this.h = Collections.unmodifiableList(arrayList);
    }

    public t_0 a() {
        return new t_0(this);
    }

    public av_0 b() {
        return this.i;
    }

    public l_0 c() {
        return this.j;
    }

    public boolean d() {
        return this.l;
    }

    public boolean e() {
        return this.o;
    }

    private T a(boolean bl) {
        if (bl) {
            return bK.v;
        }
        return new n_0(this);
    }

    private T b(boolean bl) {
        if (bl) {
            return bK.u;
        }
        return new o_0(this);
    }

    static void a(double d2) {
        if (!Double.isNaN(d2) && !Double.isInfinite(d2)) {
            return;
        }
        throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
    }

    private static T a(K k) {
        if (k == K.a) {
            return bK.t;
        }
        return new p_0();
    }

    private static T a(T t) {
        return new q_0(t).a();
    }

    private static T b(T t) {
        return new r_0(t).a();
    }

    public T a(cJ cJ2) {
        s_0 s_02;
        T t = (T)this.D.get(cJ2 == null ? A : cJ2);
        if (t != null) {
            return t;
        }
        HashMap<cJ, s_0> hashMap = (HashMap<cJ, s_0>)this.C.get();
        boolean bl = false;
        if (hashMap == null) {
            hashMap = new HashMap<cJ, s_0>();
            this.C.set(hashMap);
            bl = true;
        }
        if ((s_02 = (s_0)hashMap.get(cJ2)) != null) {
            return s_02;
        }
        s_0 s_03 = new s_0();
        hashMap.put(cJ2, s_03);
        for (V v : this.h) {
            T t2 = v.a(this, cJ2);
            if (t2 == null) continue;
            s_03.a(t2);
            this.D.put(cJ2, t2);
            T t3 = t2;
            hashMap.remove(cJ2);
            if (bl) {
                this.C.remove();
            }
            return t3;
        }
        throw new IllegalArgumentException("GSON (2.8.9) cannot handle " + cJ2);
    }

    public T a(V v, cJ cJ2) {
        if (!this.h.contains(v)) {
            v = this.F;
        }
        boolean bl = false;
        for (V v2 : this.h) {
            if (!bl) {
                if (v2 != v) continue;
                bl = true;
                continue;
            }
            T t = v2.a(this, cJ2);
            if (t == null) continue;
            return t;
        }
        throw new IllegalArgumentException("GSON cannot serialize " + cJ2);
    }

    public T a(Class clazz) {
        return this.a(cJ.c(clazz));
    }

    public JsonElement a(Object object) {
        if (object == null) {
            return com.google.gson.B.a;
        }
        return this.a(object, object.getClass());
    }

    public JsonElement a(Object object, Type type) {
        br_0 br_02 = new br_0();
        this.a(object, type, br_02);
        return br_02.a();
    }

    public String b(Object object) {
        if (object == null) {
            return this.a(com.google.gson.B.a);
        }
        return this.b(object, object.getClass());
    }

    public String b(Object object, Type type) {
        StringWriter stringWriter = new StringWriter();
        this.a(object, type, stringWriter);
        return stringWriter.toString();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(Object object, Appendable appendable) {
        if (object != null) {
            this.a(object, object.getClass(), appendable);
            return;
        }
        this.a((JsonElement)com.google.gson.B.a, appendable);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(Object object, Type type, Appendable appendable) {
        cO cO2 = this.a(aW.a(appendable));
        this.a(object, type, cO2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(Object object, Type type, cO cO2) {
        T t = this.a(cJ.b(type));
        boolean bl = cO2.g();
        cO2.b(true);
        boolean bl2 = cO2.h();
        cO2.c(this.o);
        boolean bl3 = cO2.i();
        cO2.d(this.l);
        t.a(cO2, object);
        cO2.b(bl);
        cO2.c(bl2);
        cO2.d(bl3);
    }

    public String a(JsonElement jsonElement) {
        StringWriter stringWriter = new StringWriter();
        this.a(jsonElement, (Appendable)stringWriter);
        return stringWriter.toString();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(JsonElement jsonElement, Appendable appendable) {
        cO cO2 = this.a(aW.a(appendable));
        this.a(jsonElement, cO2);
    }

    public cO a(Writer writer) {
        if (this.n) {
            writer.write(")]}'\n");
        }
        cO cO2 = new cO(writer);
        if (this.p) {
            cO2.c("  ");
        }
        cO2.d(this.l);
        return cO2;
    }

    public JsonReader newJsonReader(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        jsonReader.a(this.q);
        return jsonReader;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(JsonElement jsonElement, cO cO2) {
        boolean bl = cO2.g();
        cO2.b(true);
        boolean bl2 = cO2.h();
        cO2.c(this.o);
        boolean bl3 = cO2.i();
        cO2.d(this.l);
        aW.a(jsonElement, cO2);
        cO2.b(bl);
        cO2.c(bl2);
        cO2.d(bl3);
    }

    public Object a(String string, Class clazz) {
        Object object = this.fromJson(string, (Type)clazz);
        return aV.a(clazz).cast(object);
    }

    public Object fromJson(String string, Type type) {
        if (string == null) {
            return null;
        }
        StringReader stringReader = new StringReader(string);
        Object object = this.fromJson((Reader)stringReader, type);
        return object;
    }

    public Object fromJson(Reader reader, Class clazz) {
        JsonReader jsonReader = this.newJsonReader(reader);
        Object object = this.fromJson(jsonReader, (Type)clazz);
        Gson.assertFullConsumption(object, jsonReader);
        return aV.a(clazz).cast(object);
    }

    public Object fromJson(Reader reader, Type type) {
        JsonReader jsonReader = this.newJsonReader(reader);
        Object object = this.fromJson(jsonReader, type);
        Gson.assertFullConsumption(object, jsonReader);
        return object;
    }

    private static void assertFullConsumption(Object object, JsonReader jsonReader) {
        if (object == null || jsonReader.peek() == JsonToken.END_DOCUMENT) {
            return;
        }
        throw new JsonSyntaxException("JSON document was not fully consumed.");
    }

    public Object fromJson(JsonReader jsonReader, Type type) {
        Object object;
        boolean bl = true;
        boolean bl2 = jsonReader.isLenient();
        jsonReader.a(true);
        jsonReader.peek();
        bl = false;
        cJ cJ2 = cJ.b(type);
        T t = this.a(cJ2);
        Object object2 = object = t.b(jsonReader);
        jsonReader.a(bl2);
        return object2;
    }

    public Object a(JsonElement jsonElement, Class clazz) {
        Object object = this.a(jsonElement, (Type)clazz);
        return aV.a(clazz).cast(object);
    }

    public Object a(JsonElement jsonElement, Type type) {
        if (jsonElement == null) {
            return null;
        }
        return this.fromJson(new JsonTreeReader(jsonElement), type);
    }

    public String toString() {
        return "{serializeNulls:" + this.l + ",factories:" + this.h + ",instanceCreators:" + this.E + "}";
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block22: {
                    break block22;
lbl1:
                    // 1 sources

                    return;
                }
                Gson.field342 = 28210 ^ -12553;
                Gson.field343 = -19047 ^ -12553;
                Gson.I = new int[1][3];
                Gson.g = false;
                Gson.f = false;
                Gson.e = false;
                Gson.d = true;
                Gson.c = false;
                Gson.b = false;
                Gson.a = false;
                var5 = new String[12];
                var3_1 = 0;
                var2_2 = "\u001ag\u001f+\u00f3\u0090\u0091\u008eH\u00a3\u00b2\u00aa\u00b7\u00a2v}\u00e3\"=Vw\u00b5O\u00eb\u00bc\b\u0016\u001f\u0018qP2\u00a7\u00f4Z-1\u00de\u0083\u000fJ]$\u00f1\u00de\u0081\u00c8\u00f2\u0018=3\u0011\u00c7\u009a\u0007#\u0080m\u0093OK\\\u0083\u00db\u00a3\u0080\u00eeb!\u00a2j!z$g\u00fe*\u00d2\f3\b\u00b5\u009f\u00f0\u00cc\u00e4\u00b9\u00fa\u00be\u00b5\u00d5\u0013\u00aa\u00fa\u00ca\n\u001c\u00d4N\u00d4hr\u001c\u00e21\b\u0085x\u00d8\u00c7\u0005\u0089 =t\u00d6G\u00f1\u001dK\u00a6t\u0091\u00fa\u0084\u00fc\u00af&\u00c0\u00ffi\u00fa\u0094tJ\u0003q\u00cd\u009cDi\u00916\u009b\u0012\u00f1\u00b6\u00b0\u00fa\u00ac\u000bv\u00b5+i\u0094\u00d8,\u00a5\u00c7\u00ae\u001d\u0012\u00dd\u00cdQ\u00985\u00fa\u0004$]\u00e5\u0006:\b\u00ccv\n\u0012Q\u001d\u001eb\u00f4\"9lDM\u00b9C\u00f0?\u00d8\u009f\u00ec\u00fc\u00d3\u00f7R\u001c\u00facN\r\u001ao\u0014\u00ff\u00fb\u0005\u00a8.I\u00029%\u00ef}\u009c\u00ce\u00dd\u00af\u00c6+4*.#\u00ed\u00d1edk\u00f7\u00d6 ;\u00f3\u00e0\u0002\u00cc?\u0094\u0010\u00f2R\u0012\u00ad\\P\u0003\u00fb\u009c\u0010\u00ba\u0083\u000b\t\t\u00e9?Lg\u0085\u0081\u00c4N\u0019\u000e\u00e3\u001b\u0089\u0080\u00fcq\u00d1\u0014\u001a\u00d4\u0014r\u0092D\u00f9\u00d1/@\u00eb\u00d2bm\u00e8\u00bd\r\u00b3x3[\u001d\t\u00a6\u0016\u00bae\u007f\u00cf/\u00c8\u000f\u00de\u00b6\u001d\u00aeT\u00da\u00c43\u00b0\u0084\u00a6p\u00c5ok#:v>";
                var4_3 = "\u001ag\u001f+\u00f3\u0090\u0091\u008eH\u00a3\u00b2\u00aa\u00b7\u00a2v}\u00e3\"=Vw\u00b5O\u00eb\u00bc\b\u0016\u001f\u0018qP2\u00a7\u00f4Z-1\u00de\u0083\u000fJ]$\u00f1\u00de\u0081\u00c8\u00f2\u0018=3\u0011\u00c7\u009a\u0007#\u0080m\u0093OK\\\u0083\u00db\u00a3\u0080\u00eeb!\u00a2j!z$g\u00fe*\u00d2\f3\b\u00b5\u009f\u00f0\u00cc\u00e4\u00b9\u00fa\u00be\u00b5\u00d5\u0013\u00aa\u00fa\u00ca\n\u001c\u00d4N\u00d4hr\u001c\u00e21\b\u0085x\u00d8\u00c7\u0005\u0089 =t\u00d6G\u00f1\u001dK\u00a6t\u0091\u00fa\u0084\u00fc\u00af&\u00c0\u00ffi\u00fa\u0094tJ\u0003q\u00cd\u009cDi\u00916\u009b\u0012\u00f1\u00b6\u00b0\u00fa\u00ac\u000bv\u00b5+i\u0094\u00d8,\u00a5\u00c7\u00ae\u001d\u0012\u00dd\u00cdQ\u00985\u00fa\u0004$]\u00e5\u0006:\b\u00ccv\n\u0012Q\u001d\u001eb\u00f4\"9lDM\u00b9C\u00f0?\u00d8\u009f\u00ec\u00fc\u00d3\u00f7R\u001c\u00facN\r\u001ao\u0014\u00ff\u00fb\u0005\u00a8.I\u00029%\u00ef}\u009c\u00ce\u00dd\u00af\u00c6+4*.#\u00ed\u00d1edk\u00f7\u00d6 ;\u00f3\u00e0\u0002\u00cc?\u0094\u0010\u00f2R\u0012\u00ad\\P\u0003\u00fb\u009c\u0010\u00ba\u0083\u000b\t\t\u00e9?Lg\u0085\u0081\u00c4N\u0019\u000e\u00e3\u001b\u0089\u0080\u00fcq\u00d1\u0014\u001a\u00d4\u0014r\u0092D\u00f9\u00d1/@\u00eb\u00d2bm\u00e8\u00bd\r\u00b3x3[\u001d\t\u00a6\u0016\u00bae\u007f\u00cf/\u00c8\u000f\u00de\u00b6\u001d\u00aeT\u00da\u00c43\u00b0\u0084\u00a6p\u00c5ok#:v>".length();
                var1_4 = 5;
                var0_5 = -1;
lbl22:
                // 2 sources

                while (true) {
                    v0 = ++var0_5;
                    v1 = var2_2.substring(v0, v0 + var1_4);
                    v2 = -1;
                    break block20;
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v3.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    var2_2 = "\u00c6\u00e6\u0015\u00bd\u00ec\u00c6\u00ee\u00ec\u00e5|}\u00e5\u00b3\u00cbL\u00c2\u00f9f\u00d3\u00c2m\u0018\u0002_\u0012";
                    var4_3 = "\u00c6\u00e6\u0015\u00bd\u00ec\u00c6\u00ee\u00ec\u00e5|}\u00e5\u00b3\u00cbL\u00c2\u00f9f\u00d3\u00c2m\u0018\u0002_\u0012".length();
                    var1_4 = 22;
                    var0_5 = -1;
lbl38:
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
lbl43:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v3.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    break block21;
                    break;
                }
            }
            v5 = v1.toCharArray();
            var6_6 = 0;
            v6 = v5.length;
            v7 = v5;
            v8 = v6;
            if (v6 > 1) ** GOTO lbl93
            do {
                v9 = v7;
                v10 = v7;
                v11 = var6_6;
                while (true) {
                    v12 = v9[v11];
                    switch (var6_6 % 7) {
                        case 0: {
                            v13 = 19;
                            break;
                        }
                        case 1: {
                            v13 = 89;
                            break;
                        }
                        case 2: {
                            v13 = 79;
                            break;
                        }
                        case 3: {
                            v13 = 61;
                            break;
                        }
                        case 4: {
                            v13 = 33;
                            break;
                        }
                        case 5: {
                            v13 = 50;
                            break;
                        }
                        default: {
                            v13 = 18;
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
lbl93:
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
lbl102:
                // 1 sources

                ** continue;
            }
        }
        Gson.G = var5;
        Gson.H = new String[12];
        Gson.B = ")]}'\n";
        Gson.A = cJ.c(Object.class);
        ** while (true)
    }
}

