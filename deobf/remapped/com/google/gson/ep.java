/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.eB;
import com.google.gson.eD;
import com.google.gson.eq;
import com.google.gson.et;
import com.google.gson.ew;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ep
implements Iterable {
    private final ArrayList a;
    private static final String[] b;
    private static final String[] c;
    private static final long[] d;
    private static final Integer[] e;
    public static final int[][] f;
    private static /* synthetic */ int field34;
    private static /* synthetic */ int field35;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public ep() {
        this.a = new ArrayList();
    }

    /*
     * Enabled aggressive block sorting
     */
    public ep(eD eD2) {
        this();
        if (eD2.g() != '[') {
            throw eD2.b("A JSONArray text must start with '['");
        }
        char c2 = eD2.g();
        if (c2 == '\u0000') {
            throw eD2.b("Expected a ',' or ']'");
        }
        if (c2 == ']') return;
        eD2.b();
        block5: while (true) {
            if (eD2.g() == ',') {
                eD2.b();
                this.a.add(et.b);
            } else {
                eD2.b();
                this.a.add(eD2.h());
            }
            switch (eD2.g()) {
                case '\u0000': {
                    throw eD2.b("Expected a ',' or ']'");
                }
                case ',': {
                    c2 = eD2.g();
                    if (c2 == '\u0000') {
                        throw eD2.b("Expected a ',' or ']'");
                    }
                    if (c2 == ']') {
                        return;
                    }
                    eD2.b();
                    continue block5;
                }
                case ']': {
                    return;
                }
            }
            break;
        }
        throw eD2.b("Expected a ',' or ']'");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public ep(String string) {
        this(new eD(string));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public ep(Collection collection) {
        if (collection == null) {
            this.a = new ArrayList();
            return;
        }
        this.a = new ArrayList(collection.size());
        this.a(collection, true);
    }

    /*
     * Enabled aggressive block sorting
     */
    public ep(Iterable iterable) {
        this();
        if (iterable == null) {
            return;
        }
        this.a(iterable, true);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public ep(ep ep2) {
        if (ep2 == null) {
            this.a = new ArrayList();
            return;
        }
        this.a = new ArrayList(ep2.a);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public ep(Object object) {
        this();
        if (!object.getClass().isArray()) {
            throw new eq("JSONArray initial value should be a string or collection or array.");
        }
        this.a(object, true);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public ep(int n) {
        if (n < 0) {
            throw new eq("JSONArray initial capacity cannot be negative.");
        }
        this.a = new ArrayList(n);
    }

    public Iterator iterator() {
        return this.a.iterator();
    }

    public Object a(int n) {
        Object object = this.n(n);
        if (object == null) {
            throw new eq("JSONArray[" + n + "] not found.");
        }
        return object;
    }

    public boolean b(int n) {
        Object object = this.a(n);
        if (object.equals(Boolean.FALSE) || object instanceof String && ((String)object).equalsIgnoreCase("false")) {
            return false;
        }
        if (object.equals(Boolean.TRUE) || object instanceof String && ((String)object).equalsIgnoreCase("true")) {
            return true;
        }
        throw ep.a(n, "boolean", object, null);
    }

    public double c(int n) {
        Object object = this.a(n);
        if (object instanceof Number) {
            return ((Number)object).doubleValue();
        }
        return Double.parseDouble(object.toString());
    }

    public float d(int n) {
        Object object = this.a(n);
        if (object instanceof Number) {
            return ((Number)object).floatValue();
        }
        return Float.parseFloat(object.toString());
    }

    public Number e(int n) {
        Object object = this.a(n);
        if (object instanceof Number) {
            return (Number)object;
        }
        return et.E(object.toString());
    }

    public Enum a(Class clazz, int n) {
        Enum enum_ = this.b(clazz, n);
        if (enum_ == null) {
            throw ep.a(n, "enum of type " + et.B(clazz.getSimpleName()), this.n(n), null);
        }
        return enum_;
    }

    public BigDecimal f(int n) {
        Object object = this.a(n);
        BigDecimal bigDecimal = et.a(object, null);
        if (bigDecimal == null) {
            throw ep.a(n, "BigDecimal", object, null);
        }
        return bigDecimal;
    }

    public BigInteger g(int n) {
        Object object = this.a(n);
        BigInteger bigInteger = et.a(object, null);
        if (bigInteger == null) {
            throw ep.a(n, "BigInteger", object, null);
        }
        return bigInteger;
    }

    public int h(int n) {
        Object object = this.a(n);
        if (object instanceof Number) {
            return ((Number)object).intValue();
        }
        return Integer.parseInt(object.toString());
    }

    public ep i(int n) {
        Object object = this.a(n);
        if (object instanceof ep) {
            return (ep)object;
        }
        throw ep.a(n, "JSONArray", object, null);
    }

    public et j(int n) {
        Object object = this.a(n);
        if (object instanceof et) {
            return (et)object;
        }
        throw ep.a(n, "JSONObject", object, null);
    }

    public long k(int n) {
        Object object = this.a(n);
        if (object instanceof Number) {
            return ((Number)object).longValue();
        }
        return Long.parseLong(object.toString());
    }

    public String l(int n) {
        Object object = this.a(n);
        if (object instanceof String) {
            return (String)object;
        }
        throw ep.a(n, "String", object, null);
    }

    public boolean m(int n) {
        return et.b.equals(this.n(n));
    }

    public String a(String string) {
        int n = this.a();
        if (n == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(et.d(this.a.get(0)));
        for (int i = 1; i < n; ++i) {
            stringBuilder.append(string).append(et.d(this.a.get(i)));
        }
        return stringBuilder.toString();
    }

    public int a() {
        return this.a.size();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void b() {
        this.a.clear();
    }

    public Object n(int n) {
        return n < 0 || n >= this.a() ? null : this.a.get(n);
    }

    public boolean o(int n) {
        return this.a(n, false);
    }

    public boolean a(int n, boolean bl2) {
        return this.b(n);
    }

    public double p(int n) {
        return this.a(n, Double.NaN);
    }

    public double a(int n, double d2) {
        Number number = this.a(n, (Number)null);
        if (number == null) {
            return d2;
        }
        double d3 = number.doubleValue();
        return d3;
    }

    public float q(int n) {
        return this.a(n, Float.NaN);
    }

    public float a(int n, float f) {
        Number number = this.a(n, (Number)null);
        if (number == null) {
            return f;
        }
        float f2 = number.floatValue();
        return f2;
    }

    public int r(int n) {
        return this.a(n, 0);
    }

    public int a(int n, int n2) {
        Number number = this.a(n, (Number)null);
        if (number == null) {
            return n2;
        }
        return number.intValue();
    }

    public Enum b(Class clazz, int n) {
        return this.a(clazz, n, null);
    }

    public Enum a(Class clazz, int n, Enum enum_) {
        Object object = this.n(n);
        if (et.b.equals(object)) {
            return enum_;
        }
        if (clazz.isAssignableFrom(object.getClass())) {
            Enum enum_2 = (Enum)object;
            return enum_2;
        }
        return Enum.valueOf(clazz, object.toString());
    }

    public BigInteger a(int n, BigInteger bigInteger) {
        Object object = this.n(n);
        return et.a(object, bigInteger);
    }

    public BigDecimal a(int n, BigDecimal bigDecimal) {
        Object object = this.n(n);
        return et.a(object, bigDecimal);
    }

    public ep s(int n) {
        Object object = this.n(n);
        return object instanceof ep ? (ep)object : null;
    }

    public et t(int n) {
        Object object = this.n(n);
        return object instanceof et ? (et)object : null;
    }

    public long u(int n) {
        return this.a(n, 0L);
    }

    public long a(int n, long l) {
        Number number = this.a(n, (Number)null);
        if (number == null) {
            return l;
        }
        return number.longValue();
    }

    public Number v(int n) {
        return this.a(n, (Number)null);
    }

    public Number a(int n, Number number) {
        Object object = this.n(n);
        if (et.b.equals(object)) {
            return number;
        }
        if (object instanceof Number) {
            return (Number)object;
        }
        if (object instanceof String) {
            return et.E((String)object);
        }
        return number;
    }

    public String w(int n) {
        return this.a(n, "");
    }

    public String a(int n, String string) {
        Object object = this.n(n);
        return et.b.equals(object) ? string : object.toString();
    }

    public ep a(boolean bl2) {
        return this.a(bl2 ? Boolean.TRUE : Boolean.FALSE);
    }

    public ep a(Collection collection) {
        return this.a((Object)new ep(collection));
    }

    public ep a(double d2) {
        return this.a((Object)d2);
    }

    public ep a(float f) {
        return this.a(Float.valueOf(f));
    }

    public ep x(int n) {
        return this.a((Object)n);
    }

    public ep a(long l) {
        return this.a((Object)l);
    }

    public ep a(Map map) {
        return this.a(new et(map));
    }

    public ep a(Object object) {
        et.c(object);
        this.a.add(object);
        return this;
    }

    public ep b(int n, boolean bl2) {
        return this.a(n, bl2 ? Boolean.TRUE : Boolean.FALSE);
    }

    public ep a(int n, Collection collection) {
        return this.a(n, new ep(collection));
    }

    public ep b(int n, double d2) {
        return this.a(n, (Object)d2);
    }

    public ep b(int n, float f) {
        return this.a(n, (Object)Float.valueOf(f));
    }

    public ep b(int n, int n2) {
        return this.a(n, (Object)n2);
    }

    public ep b(int n, long l) {
        return this.a(n, (Object)l);
    }

    public ep a(int n, Map map) {
        this.a(n, new et(map));
        return this;
    }

    public ep a(int n, Object object) {
        if (n < 0) {
            throw new eq("JSONArray[" + n + "] not found.");
        }
        if (n < this.a()) {
            et.c(object);
            this.a.set(n, object);
            return this;
        }
        if (n == this.a()) {
            return this.a(object);
        }
        this.a.ensureCapacity(n + 1);
        while (n != this.a()) {
            this.a.add(et.b);
        }
        return this.a(object);
    }

    public ep b(Collection collection) {
        this.a(collection, false);
        return this;
    }

    public ep a(Iterable iterable) {
        this.a(iterable, false);
        return this;
    }

    public ep a(ep ep2) {
        this.a.addAll(ep2.a);
        return this;
    }

    public ep b(Object object) {
        this.a(object, false);
        return this;
    }

    public Object b(String string) {
        return this.a(new ew(string));
    }

    public Object a(ew ew2) {
        return ew2.a(this);
    }

    public Object c(String string) {
        return this.b(new ew(string));
    }

    public Object b(ew ew2) {
        return ew2.a(this);
    }

    public Object y(int n) {
        return n >= 0 && n < this.a() ? this.a.remove(n) : null;
    }

    public boolean c(Object object) {
        if (!(object instanceof ep)) {
            return false;
        }
        int n = this.a();
        if (n != ((ep)object).a()) {
            return false;
        }
        for (int i = 0; i < n; ++i) {
            Object e2;
            Object e3 = this.a.get(i);
            if (e3 == (e2 = ((ep)object).a.get(i))) continue;
            if (e3 == null) {
                return false;
            }
            if (!(e3 instanceof et ? !((et)e3).b(e2) : (e3 instanceof ep ? !((ep)e3).c(e2) : (e3 instanceof Number && e2 instanceof Number ? !et.a((Number)e3, (Number)e2) : (e3 instanceof eB && e2 instanceof eB ? !((eB)e3).a().equals(((eB)e2).a()) : !e3.equals(e2)))))) continue;
            return false;
        }
        return true;
    }

    public et b(ep ep2) {
        if (ep2 == null || ep2.d() || this.d()) {
            return null;
        }
        et et2 = new et(ep2.a());
        for (int i = 0; i < ep2.a(); ++i) {
            et2.c(ep2.l(i), this.n(i));
        }
        return et2;
    }

    public String toString() {
        return this.z(0);
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public String z(int n) {
        StringWriter stringWriter = new StringWriter();
        StringBuffer stringBuffer = stringWriter.getBuffer();
        // MONITORENTER : stringBuffer
        // MONITOREXIT : stringBuffer
        return this.a(stringWriter, n, 0).toString();
    }

    public Writer a(Writer writer) {
        return this.a(writer, 0, 0);
    }

    public Writer a(Writer writer, int n, int n2) {
        boolean bl2 = false;
        int n3 = this.a();
        writer.write(91);
        if (n3 == 1) {
            et.a(writer, this.a.get(0), n, n2);
        } else if (n3 != 0) {
            int n4 = n2 + n;
            for (int i = 0; i < n3; ++i) {
                if (bl2) {
                    writer.write(44);
                }
                if (n > 0) {
                    writer.write(10);
                }
                et.a(writer, n4);
                et.a(writer, this.a.get(i), n, n4);
                bl2 = true;
            }
            if (n > 0) {
                writer.write(10);
            }
            et.a(writer, n2);
        }
        writer.write(93);
        return writer;
    }

    public List c() {
        ArrayList<Object> arrayList = new ArrayList<Object>(this.a.size());
        for (Object e2 : this.a) {
            if (e2 == null || et.b.equals(e2)) {
                arrayList.add(null);
                continue;
            }
            if (e2 instanceof ep) {
                arrayList.add(((ep)e2).c());
                continue;
            }
            if (e2 instanceof et) {
                arrayList.add(((et)e2).i());
                continue;
            }
            arrayList.add(e2);
        }
        return arrayList;
    }

    public boolean d() {
        return this.a.isEmpty();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(Collection collection, boolean bl2) {
        this.a.ensureCapacity(this.a.size() + collection.size());
        if (bl2) {
            for (Object e2 : collection) {
                this.a(et.e(e2));
            }
            return;
        } else {
            for (Object e3 : collection) {
                this.a(e3);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(Iterable iterable, boolean bl2) {
        if (bl2) {
            for (Object t : iterable) {
                this.a(et.e(t));
            }
            return;
        } else {
            for (Object t : iterable) {
                this.a(t);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(Object object, boolean bl2) {
        if (object.getClass().isArray()) {
            int n = Array.getLength(object);
            this.a.ensureCapacity(this.a.size() + n);
            if (bl2) {
                int n2 = 0;
                while (n2 < n) {
                    this.a(et.e(Array.get(object, n2)));
                    ++n2;
                }
                return;
            }
            int n3 = 0;
            while (n3 < n) {
                this.a(Array.get(object, n3));
                ++n3;
            }
            return;
        }
        if (object instanceof ep) {
            this.a.addAll(((ep)object).a);
            return;
        }
        if (object instanceof Collection) {
            this.a((Collection)object, bl2);
            return;
        }
        if (!(object instanceof Iterable)) throw new eq("JSONArray initial value should be a string or collection or array.");
        this.a((Iterable)object, bl2);
    }

    private static eq a(int n, String string, Object object, Throwable throwable) {
        if (object == null) {
            return new eq("JSONArray[" + n + "] is not a " + string + " (null).", throwable);
        }
        if (object instanceof Map || object instanceof Iterable || object instanceof et) {
            return new eq("JSONArray[" + n + "] is not a " + string + " (" + object.getClass() + ").", throwable);
        }
        return new eq("JSONArray[" + n + "] is not a " + string + " (" + object.getClass() + " : " + object + ").", throwable);
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
                    ep.field34 = 4725 ^ -27239;
                    ep.field35 = -10478 ^ -27239;
                    ep.f = new int[1][1];
                    var13 = new String[34];
                    var11_1 = 0;
                    var10_2 = "x\u00c8.\u00c2\u00e8\u007fSps\u0006\u00ebS{l]Lo|\u00a0\u00cc@c\u00a1\u0000\u00c0\u00cbW;\u00afQ\u00d3\u00b7\u00cd\u00beLx\u00c7\u0084aH\u00e0q\u00a0j\u00f8\u00b1E|\u0007\n2na\u0083\u00b3i~\u00a8\\h\u0002?M\f\u0088\u0013\u00e2\u0010\u00f3L\u00f1\u001a7\u00c4`m+\u00f4\u001bk\u009b4\u00d4T\u00ff\u0017N.\u00e7\u00d9\u00a7\u00c2\u00f8\u00b0Q\"\u00b1\u00b0\u001b\u00dbU\u0007\u00bf,\u00a1\u0089\u00da\u00de\u0099\u000b\u008f\u001f\u00ba\u007f\u001c\u0010k\u001d)6\u000b\u0086*$+\u0098\u00faKP\u001d\u00fa\u009e\nK\u00d7o\u00cep!\u00dba\u0001\u00be\u0015\u008e\u00d4'\u00b1\u0081gI\u00aa\u0016\u00b7\u00ff\u00e4\u001bk2\u0017{y\f\u00bavB\u00f9\u00f2\u0018\u0010\u009c\u001b\u009b\u00e6\u00e0\u00da\u001ai\u0082\u00e9\u00a5p\u00f7Z\u0011\u00e2\u00e5\u00bc\u00ee\u0007^\u00d4U\u0099\u009cZ9\u00f8\u001e\u00fdxc\u00e7W\u00aa\u0001\u00eb\u0010&0\u00f9\u009d\u0018\u0014s\u00b4<\u007f\u0003\u00f1\u0019\u0007Y\u00fa\u0016\u00c4\u00e7\"\u00d0\u00c1\u00890$\u00a9\u00e9}s\u009b\u00f5\u0087\u0093=D\u00db\u009d\u00b5\u00e1\u00ecW\u00a1D\u001d\u00d7\u001f\u001f\u00bc\u00d8\u00d2\u00eb\u008fr\u00a4\u00d5\u0012\u00af\u00e0[pW\u0015\u00f4\u00feh\u00f4h\u00cft\u00bf\u00b1\u0015\u000b\u00b0\u0085\u00e1\u00e1F\u0001SC\u00ff\u009f\r\u00a0\u00e6\u00c3+\u00fb&.\u00be\u00cd\u00e1\nw\u00f3\u0003?\u00ab\u0088\u00051&\u008b\u00c3\u008d\u000b\u00c8\u0014\u00ed\u00ec\u00a1\u0002lO\u00f9\u0019\u0002\u0005\u0089\u001e\u009fz}\nOS\u00efSk)\u00de\u009f(4\f\u0091-\u00c1\u00d7\u0097\u00b4}\u0005\u00a6'R\u0011\u0003\u00d9X`*4\u0084sh7\u00aa40\u001b\u00b7\u00af\u00d8\u00e9@\u00c4\u0004p\u00ce:B\u00b3e\u00bb\u009a\u000bF\u00ad\u009e\u00b9=\u00d8e\u00cb\u0010\u0007I|bp\u00a4\u0011\u00d0\u0004V=.\u00c7\u0006\u0017\u0085G05\u00b6\nE\u008a\u008f\u001fn\u00fa\u00c5\u00da+&\u0002N\u0090\u0002g\u0001\ts(IK\u00b6p\u00de\u008bHBO\u00ce\u00ce\u0097F\u00eb\u00c0\u00f8\u008b\u0019w\u0011/\u00e6\u0010\u0091Af\u00c7e?L\u00b5\u00195\u00178\u00e11U\u008c\u0019\u00a8\u00c1\u00ae\u00e4=\u00a7\u00f1\u001f\u0080\u00d3KHT\u0092\u00ad\u00f5\u00c5\u0088\u00ea\u00f8\u00d9\u0001B\u001929{\u00bcJ-e ?\f\n\u00e5\u00c7\u009b\u00b6\u00e2\u00df\u0083h\u00e2\u00db\u0004\u00db\u00c7\u009f$\u0006z\u00d1o\u0090\u00c7\u00dd\b\u001d\u00f1\u0082_\u00e7\u00b0'\u0001";
                    var12_3 = "x\u00c8.\u00c2\u00e8\u007fSps\u0006\u00ebS{l]Lo|\u00a0\u00cc@c\u00a1\u0000\u00c0\u00cbW;\u00afQ\u00d3\u00b7\u00cd\u00beLx\u00c7\u0084aH\u00e0q\u00a0j\u00f8\u00b1E|\u0007\n2na\u0083\u00b3i~\u00a8\\h\u0002?M\f\u0088\u0013\u00e2\u0010\u00f3L\u00f1\u001a7\u00c4`m+\u00f4\u001bk\u009b4\u00d4T\u00ff\u0017N.\u00e7\u00d9\u00a7\u00c2\u00f8\u00b0Q\"\u00b1\u00b0\u001b\u00dbU\u0007\u00bf,\u00a1\u0089\u00da\u00de\u0099\u000b\u008f\u001f\u00ba\u007f\u001c\u0010k\u001d)6\u000b\u0086*$+\u0098\u00faKP\u001d\u00fa\u009e\nK\u00d7o\u00cep!\u00dba\u0001\u00be\u0015\u008e\u00d4'\u00b1\u0081gI\u00aa\u0016\u00b7\u00ff\u00e4\u001bk2\u0017{y\f\u00bavB\u00f9\u00f2\u0018\u0010\u009c\u001b\u009b\u00e6\u00e0\u00da\u001ai\u0082\u00e9\u00a5p\u00f7Z\u0011\u00e2\u00e5\u00bc\u00ee\u0007^\u00d4U\u0099\u009cZ9\u00f8\u001e\u00fdxc\u00e7W\u00aa\u0001\u00eb\u0010&0\u00f9\u009d\u0018\u0014s\u00b4<\u007f\u0003\u00f1\u0019\u0007Y\u00fa\u0016\u00c4\u00e7\"\u00d0\u00c1\u00890$\u00a9\u00e9}s\u009b\u00f5\u0087\u0093=D\u00db\u009d\u00b5\u00e1\u00ecW\u00a1D\u001d\u00d7\u001f\u001f\u00bc\u00d8\u00d2\u00eb\u008fr\u00a4\u00d5\u0012\u00af\u00e0[pW\u0015\u00f4\u00feh\u00f4h\u00cft\u00bf\u00b1\u0015\u000b\u00b0\u0085\u00e1\u00e1F\u0001SC\u00ff\u009f\r\u00a0\u00e6\u00c3+\u00fb&.\u00be\u00cd\u00e1\nw\u00f3\u0003?\u00ab\u0088\u00051&\u008b\u00c3\u008d\u000b\u00c8\u0014\u00ed\u00ec\u00a1\u0002lO\u00f9\u0019\u0002\u0005\u0089\u001e\u009fz}\nOS\u00efSk)\u00de\u009f(4\f\u0091-\u00c1\u00d7\u0097\u00b4}\u0005\u00a6'R\u0011\u0003\u00d9X`*4\u0084sh7\u00aa40\u001b\u00b7\u00af\u00d8\u00e9@\u00c4\u0004p\u00ce:B\u00b3e\u00bb\u009a\u000bF\u00ad\u009e\u00b9=\u00d8e\u00cb\u0010\u0007I|bp\u00a4\u0011\u00d0\u0004V=.\u00c7\u0006\u0017\u0085G05\u00b6\nE\u008a\u008f\u001fn\u00fa\u00c5\u00da+&\u0002N\u0090\u0002g\u0001\ts(IK\u00b6p\u00de\u008bHBO\u00ce\u00ce\u0097F\u00eb\u00c0\u00f8\u008b\u0019w\u0011/\u00e6\u0010\u0091Af\u00c7e?L\u00b5\u00195\u00178\u00e11U\u008c\u0019\u00a8\u00c1\u00ae\u00e4=\u00a7\u00f1\u001f\u0080\u00d3KHT\u0092\u00ad\u00f5\u00c5\u0088\u00ea\u00f8\u00d9\u0001B\u001929{\u00bcJ-e ?\f\n\u00e5\u00c7\u009b\u00b6\u00e2\u00df\u0083h\u00e2\u00db\u0004\u00db\u00c7\u009f$\u0006z\u00d1o\u0090\u00c7\u00dd\b\u001d\u00f1\u0082_\u00e7\u00b0'\u0001".length();
                    var9_4 = 2;
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
                        var10_2 = "\u00ff\u0019\t\u00fa\u00ee\u00f8\u0007\u0080\u00f6:\t\u00d8M\u00af";
                        var12_3 = "\u00ff\u0019\t\u00fa\u00ee\u00f8\u0007\u0080\u00f6:\t\u00d8M\u00af".length();
                        var9_4 = 6;
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
                                v13 = 25;
                                break;
                            }
                            case 1: {
                                v13 = 113;
                                break;
                            }
                            case 2: {
                                v13 = 72;
                                break;
                            }
                            case 3: {
                                v13 = 23;
                                break;
                            }
                            case 4: {
                                v13 = 113;
                                break;
                            }
                            case 5: {
                                v13 = 14;
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
            ep.b = var13;
            ep.c = new String[34];
            var0_7 = 1235121574634566963L;
            var6_8 = new long[8];
            var3_9 = 0;
            var4_10 = "\u001fb\u00de_\u0082%LN\u001b\u008f\u00ac\u00e7\u00fc\u00ab\u0092\u00ee\u0019\u00b2p\u00ea\u00c3\u00f5\u009c\u00f6T\u00af\u00b1y\u0088\u007f\u00ce&9\u00a6V\u0011\u00f3\u00c6\u00f4!\u0082\u008du\bS\u00a0\u00f1\u008a";
            var5_11 = "\u001fb\u00de_\u0082%LN\u001b\u008f\u00ac\u00e7\u00fc\u00ab\u0092\u00ee\u0019\u00b2p\u00ea\u00c3\u00f5\u009c\u00f6T\u00af\u00b1y\u0088\u007f\u00ce&9\u00a6V\u0011\u00f3\u00c6\u00f4!\u0082\u008du\bS\u00a0\u00f1\u008a".length();
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
                var4_10 = "\u0004\u00fc\u00ed@\u00dd\u00b9/N\u0095T\u00d5Z\u00df\u00f4\u00820";
                var5_11 = "\u0004\u00fc\u00ed@\u00dd\u00b9/N\u0095T\u00d5Z\u00df\u00f4\u00820".length();
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
                ep.d = var6_8;
                ep.e = new Integer[8];
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

