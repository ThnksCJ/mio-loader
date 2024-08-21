/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.io.Closeable;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.regex.Pattern;
import me.mioclient.loader.gson.eA;
import me.mioclient.loader.gson.eB;
import me.mioclient.loader.gson.eD;
import me.mioclient.loader.gson.eE;
import me.mioclient.loader.gson.ep;
import me.mioclient.loader.gson.eq;
import me.mioclient.loader.gson.ev;
import me.mioclient.loader.gson.ew;
import me.mioclient.loader.gson.ez;

public class et {
    static final Pattern a;
    private final Map c;
    public static final Object b;
    private static final String[] d;
    private static final String[] e;
    private static final long[] f;
    private static final Integer[] g;
    public static final int[][] h;
    private static /* synthetic */ int field330;
    private static /* synthetic */ int field331;

    public Class a() {
        return this.c.getClass();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public et() {
        this.c = new HashMap();
    }

    /*
     * Enabled aggressive block sorting
     */
    public et(et et2, String ... stringArray) {
        this(stringArray.length);
        int n = 0;
        while (n < stringArray.length) {
            this.d(stringArray[n], et2.p(stringArray[n]));
            ++n;
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     */
    public et(eD eD2) {
        this();
        if (eD2.g() != '{') {
            throw eD2.b("A JSONObject text must begin with '{'");
        }
        block9: while (true) {
            char c = eD2.f();
            char c2 = eD2.g();
            switch (c2) {
                case '\u0000': {
                    throw eD2.b("A JSONObject text must end with '}'");
                }
                case '}': {
                    return;
                }
                case '[': 
                case '{': {
                    if (c != '{') break;
                    throw eD2.b("A JSON Object can not directly nest another JSON Object or JSON Array.");
                }
            }
            eD2.b();
            String string = eD2.h().toString();
            c2 = eD2.g();
            if (c2 != ':') {
                throw eD2.b("Expected a ':' after a key");
            }
            if (string != null) {
                if (this.p(string) != null) {
                    throw eD2.b("Duplicate key \"" + string + "\"");
                }
                Object object = eD2.h();
                if (object != null) {
                    this.c(string, object);
                }
            }
            switch (eD2.g()) {
                case ',': 
                case ';': {
                    if (eD2.g() == '}') {
                        return;
                    }
                    eD2.b();
                    continue block9;
                }
                case '}': {
                    return;
                }
            }
            throw eD2.b("Expected a ',' or '}'");
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public et(Map map) {
        if (map == null) {
            this.c = new HashMap();
            return;
        }
        this.c = new HashMap(map.size());
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            if (entry.getKey() == null) {
                throw new NullPointerException("Null key.");
            }
            Object v = entry.getValue();
            if (v == null) continue;
            this.c.put(String.valueOf(entry.getKey()), et.e(v));
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public et(Object object) {
        this();
        this.f(object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private et(Object object, Set set) {
        this();
        this.a(object, set);
    }

    /*
     * Enabled aggressive block sorting
     */
    public et(Object object, String ... stringArray) {
        this(stringArray.length);
        Class<?> clazz = object.getClass();
        int n = 0;
        while (n < stringArray.length) {
            String string = stringArray[n];
            this.e(string, clazz.getField(string).get(object));
            ++n;
        }
        return;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public et(String string) {
        this(new eD(string));
    }

    /*
     * Enabled aggressive block sorting
     */
    public et(String string, Locale locale) {
        this();
        ResourceBundle resourceBundle = ResourceBundle.getBundle(string, locale, Thread.currentThread().getContextClassLoader());
        Enumeration<String> enumeration = resourceBundle.getKeys();
        while (enumeration.hasMoreElements()) {
            String string2 = enumeration.nextElement();
            if (string2 == null) continue;
            String[] stringArray = string2.split("\\.");
            int n = stringArray.length - 1;
            et et2 = this;
            for (int i = 0; i < n; ++i) {
                String string3 = stringArray[i];
                et et3 = et2.v(string3);
                if (et3 == null) {
                    et3 = new et();
                    et2.c(string3, et3);
                }
                et2 = et3;
            }
            et2.c(stringArray[n], resourceBundle.getString(string2));
        }
        return;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected et(int n) {
        this.c = new HashMap(n);
    }

    public et a(String string, Object object) {
        et.c(object);
        Object object2 = this.p(string);
        if (object2 == null) {
            this.c(string, object instanceof ep ? new ep().a(object) : object);
        } else if (object2 instanceof ep) {
            ((ep)object2).a(object);
        } else {
            this.c(string, new ep().a(object2).a(object));
        }
        return this;
    }

    public et b(String string, Object object) {
        et.c(object);
        Object object2 = this.p(string);
        if (object2 == null) {
            this.c(string, new ep().a(object));
        } else if (object2 instanceof ep) {
            this.c(string, ((ep)object2).a(object));
        } else {
            throw et.a(string, "JSONArray", null, null);
        }
        return this;
    }

    public static String a(double d2) {
        if (Double.isInfinite(d2) || Double.isNaN(d2)) {
            return "null";
        }
        String string = Double.toString(d2);
        if (string.indexOf(46) > 0 && string.indexOf(101) < 0 && string.indexOf(69) < 0) {
            while (string.endsWith("0")) {
                string = string.substring(0, string.length() - 1);
            }
            if (string.endsWith(".")) {
                string = string.substring(0, string.length() - 1);
            }
        }
        return string;
    }

    public Object a(String string) {
        if (string == null) {
            throw new eq("Null key.");
        }
        Object object = this.p(string);
        if (object == null) {
            throw new eq("JSONObject[" + et.B(string) + "] not found.");
        }
        return object;
    }

    public Enum a(Class clazz, String string) {
        Enum enum_ = this.b(clazz, string);
        if (enum_ == null) {
            throw et.a(string, "enum of type " + et.B(clazz.getSimpleName()), this.p(string), null);
        }
        return enum_;
    }

    public boolean b(String string) {
        Object object = this.a(string);
        if (object.equals(Boolean.FALSE) || object instanceof String && ((String)object).equalsIgnoreCase("false")) {
            return false;
        }
        if (object.equals(Boolean.TRUE) || object instanceof String && ((String)object).equalsIgnoreCase("true")) {
            return true;
        }
        throw et.a(string, "Boolean", object, null);
    }

    public BigInteger c(String string) {
        Object object = this.a(string);
        BigInteger bigInteger = et.a(object, null);
        if (bigInteger != null) {
            return bigInteger;
        }
        throw et.a(string, "BigInteger", object, null);
    }

    public BigDecimal d(String string) {
        Object object = this.a(string);
        BigDecimal bigDecimal = et.a(object, null);
        if (bigDecimal != null) {
            return bigDecimal;
        }
        throw et.a(string, "BigDecimal", object, null);
    }

    public double e(String string) {
        Object object = this.a(string);
        if (object instanceof Number) {
            return ((Number)object).doubleValue();
        }
        return Double.parseDouble(object.toString());
    }

    public float f(String string) {
        Object object = this.a(string);
        if (object instanceof Number) {
            return ((Number)object).floatValue();
        }
        return Float.parseFloat(object.toString());
    }

    public Number g(String string) {
        Object object = this.a(string);
        if (object instanceof Number) {
            return (Number)object;
        }
        return et.E(object.toString());
    }

    public int h(String string) {
        Object object = this.a(string);
        if (object instanceof Number) {
            return ((Number)object).intValue();
        }
        return Integer.parseInt(object.toString());
    }

    public ep i(String string) {
        Object object = this.a(string);
        if (object instanceof ep) {
            return (ep)object;
        }
        throw et.a(string, "JSONArray", object, null);
    }

    public et j(String string) {
        Object object = this.a(string);
        if (object instanceof et) {
            return (et)object;
        }
        throw et.a(string, "JSONObject", object, null);
    }

    public long k(String string) {
        Object object = this.a(string);
        if (object instanceof Number) {
            return ((Number)object).longValue();
        }
        return Long.parseLong(object.toString());
    }

    public static String[] a(et et2) {
        if (et2.g()) {
            return null;
        }
        return et2.c().toArray(new String[et2.e()]);
    }

    public static String[] a(Object object) {
        if (object == null) {
            return null;
        }
        Class<?> clazz = object.getClass();
        Field[] fieldArray = clazz.getFields();
        int n = fieldArray.length;
        if (n == 0) {
            return null;
        }
        String[] stringArray = new String[n];
        for (int i = 0; i < n; ++i) {
            stringArray[i] = fieldArray[i].getName();
        }
        return stringArray;
    }

    public String l(String string) {
        Object object = this.a(string);
        if (object instanceof String) {
            return (String)object;
        }
        throw et.a(string, "string", object, null);
    }

    public boolean m(String string) {
        return this.c.containsKey(string);
    }

    public et n(String string) {
        Object object = this.p(string);
        if (object == null) {
            this.b(string, 1);
        } else if (object instanceof Integer) {
            this.b(string, (Integer)object + 1);
        } else if (object instanceof Long) {
            this.b(string, (Long)object + 1L);
        } else if (object instanceof BigInteger) {
            this.c(string, ((BigInteger)object).add(BigInteger.ONE));
        } else if (object instanceof Float) {
            this.b(string, ((Float)object).floatValue() + 1.0f);
        } else if (object instanceof Double) {
            this.b(string, (Double)object + 1.0);
        } else if (object instanceof BigDecimal) {
            this.c(string, ((BigDecimal)object).add(BigDecimal.ONE));
        } else {
            throw new eq("Unable to increment [" + et.B(string) + "].");
        }
        return this;
    }

    public boolean o(String string) {
        return b.equals(this.p(string));
    }

    public Iterator b() {
        return this.c().iterator();
    }

    public Set c() {
        return this.c.keySet();
    }

    protected Set d() {
        return this.c.entrySet();
    }

    public int e() {
        return this.c.size();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void f() {
        this.c.clear();
    }

    public boolean g() {
        return this.c.isEmpty();
    }

    public ep h() {
        if (this.c.isEmpty()) {
            return null;
        }
        return new ep(this.c.keySet());
    }

    public static String a(Number number) {
        if (number == null) {
            throw new eq("Null pointer");
        }
        et.c(number);
        String string = number.toString();
        if (string.indexOf(46) > 0 && string.indexOf(101) < 0 && string.indexOf(69) < 0) {
            while (string.endsWith("0")) {
                string = string.substring(0, string.length() - 1);
            }
            if (string.endsWith(".")) {
                string = string.substring(0, string.length() - 1);
            }
        }
        return string;
    }

    public Object p(String string) {
        return string == null ? null : this.c.get(string);
    }

    public Enum b(Class clazz, String string) {
        return this.a(clazz, string, null);
    }

    public Enum a(Class clazz, String string, Enum enum_) {
        Object object = this.p(string);
        if (b.equals(object)) {
            return enum_;
        }
        if (clazz.isAssignableFrom(object.getClass())) {
            Enum enum_2 = (Enum)object;
            return enum_2;
        }
        return Enum.valueOf(clazz, object.toString());
    }

    public boolean q(String string) {
        return this.a(string, false);
    }

    public boolean a(String string, boolean bl2) {
        Object object = this.p(string);
        if (b.equals(object)) {
            return bl2;
        }
        if (object instanceof Boolean) {
            return (Boolean)object;
        }
        return this.b(string);
    }

    public BigDecimal a(String string, BigDecimal bigDecimal) {
        Object object = this.p(string);
        return et.a(object, bigDecimal);
    }

    static BigDecimal a(Object object, BigDecimal bigDecimal) {
        return et.a(object, bigDecimal, true);
    }

    static BigDecimal a(Object object, BigDecimal bigDecimal, boolean bl2) {
        if (b.equals(object)) {
            return bigDecimal;
        }
        if (object instanceof BigDecimal) {
            return (BigDecimal)object;
        }
        if (object instanceof BigInteger) {
            return new BigDecimal((BigInteger)object);
        }
        if (object instanceof Double || object instanceof Float) {
            if (!et.b((Number)object)) {
                return bigDecimal;
            }
            if (bl2) {
                return new BigDecimal(((Number)object).doubleValue());
            }
            return new BigDecimal(object.toString());
        }
        if (object instanceof Long || object instanceof Integer || object instanceof Short || object instanceof Byte) {
            return new BigDecimal(((Number)object).longValue());
        }
        return new BigDecimal(object.toString());
    }

    public BigInteger a(String string, BigInteger bigInteger) {
        Object object = this.p(string);
        return et.a(object, bigInteger);
    }

    static BigInteger a(Object object, BigInteger bigInteger) {
        if (b.equals(object)) {
            return bigInteger;
        }
        if (object instanceof BigInteger) {
            return (BigInteger)object;
        }
        if (object instanceof BigDecimal) {
            return ((BigDecimal)object).toBigInteger();
        }
        if (object instanceof Double || object instanceof Float) {
            if (!et.b((Number)object)) {
                return bigInteger;
            }
            return new BigDecimal(((Number)object).doubleValue()).toBigInteger();
        }
        if (object instanceof Long || object instanceof Integer || object instanceof Short || object instanceof Byte) {
            return BigInteger.valueOf(((Number)object).longValue());
        }
        String string = object.toString();
        if (et.D(string)) {
            return new BigDecimal(string).toBigInteger();
        }
        return new BigInteger(string);
    }

    public double r(String string) {
        return this.a(string, Double.NaN);
    }

    public double a(String string, double d2) {
        Number number = this.x(string);
        if (number == null) {
            return d2;
        }
        double d3 = number.doubleValue();
        return d3;
    }

    public float s(String string) {
        return this.a(string, Float.NaN);
    }

    public float a(String string, float f) {
        Number number = this.x(string);
        if (number == null) {
            return f;
        }
        float f2 = number.floatValue();
        return f2;
    }

    public int t(String string) {
        return this.a(string, 0);
    }

    public int a(String string, int n) {
        Number number = this.a(string, (Number)null);
        if (number == null) {
            return n;
        }
        return number.intValue();
    }

    public ep u(String string) {
        Object object = this.p(string);
        return object instanceof ep ? (ep)object : null;
    }

    public et v(String string) {
        return this.a(string, (et)null);
    }

    public et a(String string, et et2) {
        Object object = this.p(string);
        return object instanceof et ? (et)object : et2;
    }

    public long w(String string) {
        return this.a(string, 0L);
    }

    public long a(String string, long l) {
        Number number = this.a(string, (Number)null);
        if (number == null) {
            return l;
        }
        return number.longValue();
    }

    public Number x(String string) {
        return this.a(string, (Number)null);
    }

    public Number a(String string, Number number) {
        Object object = this.p(string);
        if (b.equals(object)) {
            return number;
        }
        if (object instanceof Number) {
            return (Number)object;
        }
        return et.E(object.toString());
    }

    public String y(String string) {
        return this.a(string, "");
    }

    public String a(String string, String string2) {
        Object object = this.p(string);
        return b.equals(object) ? string2 : object.toString();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void f(Object object) {
        this.a(object, Collections.newSetFromMap(new IdentityHashMap()));
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(Object object, Set set) {
        Method[] methodArray;
        Class<?> clazz = object.getClass();
        boolean bl2 = clazz.getClassLoader() != null;
        Method[] methodArray2 = methodArray = bl2 ? clazz.getMethods() : clazz.getDeclaredMethods();
        int n = methodArray2.length;
        int n2 = 0;
        while (n2 < n) {
            Object object2;
            String string;
            Method method = methodArray2[n2];
            int n3 = method.getModifiers();
            if (Modifier.isPublic(n3) && !Modifier.isStatic(n3) && method.getParameterTypes().length == 0 && !method.isBridge() && method.getReturnType() != Void.TYPE && et.G(method.getName()) && (string = et.a(method)) != null && !string.isEmpty() && (object2 = method.invoke(object, new Object[0])) != null) {
                if (set.contains(object2)) {
                    throw et.H(string);
                }
                set.add(object2);
                this.c.put(string, et.b(object2, set));
                set.remove(object2);
                if (object2 instanceof Closeable) {
                    ((Closeable)object2).close();
                }
            }
            ++n2;
        }
        return;
    }

    private static boolean G(String string) {
        return !"getClass".equals(string) && !"getDeclaringClass".equals(string);
    }

    private static String a(Method method) {
        String string;
        int n;
        int n2 = et.b(method, ez.class);
        if (n2 > 0 && ((n = et.b(method, eA.class)) < 0 || n2 <= n)) {
            return null;
        }
        eA eA2 = (eA)et.a(method, eA.class);
        if (eA2 != null && eA2.a() != null && !eA2.a().isEmpty()) {
            return eA2.a();
        }
        String string2 = method.getName();
        if (string2.startsWith("get") && string2.length() > 3) {
            string = string2.substring(3);
        } else if (string2.startsWith("is") && string2.length() > 2) {
            string = string2.substring(2);
        } else {
            return null;
        }
        if (string.length() == 0 || Character.isLowerCase(string.charAt(0))) {
            return null;
        }
        if (string.length() == 1) {
            string = string.toLowerCase(Locale.ROOT);
        } else if (!Character.isUpperCase(string.charAt(1))) {
            string = string.substring(0, 1).toLowerCase(Locale.ROOT) + string.substring(1);
        }
        return string;
    }

    private static Annotation a(Method method, Class clazz) {
        if (method == null || clazz == null) {
            return null;
        }
        if (method.isAnnotationPresent(clazz)) {
            return method.getAnnotation(clazz);
        }
        Class<?> clazz2 = method.getDeclaringClass();
        if (clazz2.getSuperclass() == null) {
            return null;
        }
        int n = 0;
        Class<?>[] classArray = clazz2.getInterfaces();
        int n2 = classArray.length;
        if (n < n2) {
            Class<?> clazz3 = classArray[n];
            Method method2 = clazz3.getMethod(method.getName(), method.getParameterTypes());
            return et.a(method2, clazz);
        }
        return et.a(clazz2.getSuperclass().getMethod(method.getName(), method.getParameterTypes()), clazz);
    }

    private static int b(Method method, Class clazz) {
        if (method == null || clazz == null) {
            return -1;
        }
        if (method.isAnnotationPresent(clazz)) {
            return 1;
        }
        Class<?> clazz2 = method.getDeclaringClass();
        if (clazz2.getSuperclass() == null) {
            return -1;
        }
        for (Class<?> clazz3 : clazz2.getInterfaces()) {
            Method method2 = clazz3.getMethod(method.getName(), method.getParameterTypes());
            int n = et.b(method2, clazz);
            if (n <= 0) continue;
            return n + 1;
        }
        int n = et.b(clazz2.getSuperclass().getMethod(method.getName(), method.getParameterTypes()), clazz);
        if (n > 0) {
            return n + 1;
        }
        return -1;
    }

    public et b(String string, boolean bl2) {
        return this.c(string, bl2 ? Boolean.TRUE : Boolean.FALSE);
    }

    public et a(String string, Collection collection) {
        return this.c(string, new ep(collection));
    }

    public et b(String string, double d2) {
        return this.c(string, d2);
    }

    public et b(String string, float f) {
        return this.c(string, Float.valueOf(f));
    }

    public et b(String string, int n) {
        return this.c(string, n);
    }

    public et b(String string, long l) {
        return this.c(string, l);
    }

    public et a(String string, Map map) {
        return this.c(string, new et(map));
    }

    public et c(String string, Object object) {
        if (string == null) {
            throw new NullPointerException("Null key.");
        }
        if (object != null) {
            et.c(object);
            this.c.put(string, object);
        } else {
            this.C(string);
        }
        return this;
    }

    public et d(String string, Object object) {
        if (string != null && object != null) {
            if (this.p(string) != null) {
                throw new eq("Duplicate key \"" + string + "\"");
            }
            return this.c(string, object);
        }
        return this;
    }

    public et e(String string, Object object) {
        if (string != null && object != null) {
            return this.c(string, object);
        }
        return this;
    }

    public Object z(String string) {
        return this.a(new ew(string));
    }

    public Object a(ew ew2) {
        return ew2.a(this);
    }

    public Object A(String string) {
        return this.b(new ew(string));
    }

    public Object b(ew ew2) {
        return ew2.a(this);
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static String B(String string) {
        StringWriter stringWriter = new StringWriter();
        StringBuffer stringBuffer = stringWriter.getBuffer();
        // MONITORENTER : stringBuffer
        // MONITOREXIT : stringBuffer
        return et.a(string, stringWriter).toString();
    }

    public static Writer a(String string, Writer writer) {
        if (string == null || string.isEmpty()) {
            writer.write("\"\"");
            return writer;
        }
        char c = '\u0000';
        int n = string.length();
        writer.write(34);
        block9: for (int i = 0; i < n; ++i) {
            char c2 = c;
            c = string.charAt(i);
            switch (c) {
                case '\"': 
                case '\\': {
                    writer.write(92);
                    writer.write(c);
                    continue block9;
                }
                case '/': {
                    if (c2 == '<') {
                        writer.write(92);
                    }
                    writer.write(c);
                    continue block9;
                }
                case '\b': {
                    writer.write("\\b");
                    continue block9;
                }
                case '\t': {
                    writer.write("\\t");
                    continue block9;
                }
                case '\n': {
                    writer.write("\\n");
                    continue block9;
                }
                case '\f': {
                    writer.write("\\f");
                    continue block9;
                }
                case '\r': {
                    writer.write("\\r");
                    continue block9;
                }
                default: {
                    if (c < ' ' || c >= '\u0080' && c < '\u00a0' || c >= '\u2000' && c < '\u2100') {
                        writer.write("\\u");
                        String string2 = Integer.toHexString(c);
                        writer.write("0000", 0, 4 - string2.length());
                        writer.write(string2);
                        continue block9;
                    }
                    writer.write(c);
                }
            }
        }
        writer.write(34);
        return writer;
    }

    public Object C(String string) {
        return this.c.remove(string);
    }

    public boolean b(Object object) {
        if (!(object instanceof et)) {
            return false;
        }
        if (!this.c().equals(((et)object).c())) {
            return false;
        }
        for (Map.Entry entry : this.d()) {
            Object object2;
            String string = (String)entry.getKey();
            Object v = entry.getValue();
            if (v == (object2 = ((et)object).a(string))) continue;
            if (v == null) {
                return false;
            }
            if (!(v instanceof et ? !((et)v).b(object2) : (v instanceof ep ? !((ep)v).c(object2) : (v instanceof Number && object2 instanceof Number ? !et.a((Number)v, (Number)object2) : (v instanceof eB && object2 instanceof eB ? !((eB)v).a().equals(((eB)object2).a()) : !v.equals(object2)))))) continue;
            return false;
        }
        return true;
    }

    static boolean a(Number number, Number number2) {
        if (!et.b(number) || !et.b(number2)) {
            return false;
        }
        if (number.getClass().equals(number2.getClass()) && number instanceof Comparable) {
            int n = ((Comparable)((Object)number)).compareTo(number2);
            return n == 0;
        }
        BigDecimal bigDecimal = et.a(number, null, false);
        BigDecimal bigDecimal2 = et.a(number2, null, false);
        if (bigDecimal == null || bigDecimal2 == null) {
            return false;
        }
        return bigDecimal.compareTo(bigDecimal2) == 0;
    }

    private static boolean b(Number number) {
        if (number instanceof Double && (((Double)number).isInfinite() || ((Double)number).isNaN())) {
            return false;
        }
        return !(number instanceof Float) || !((Float)number).isInfinite() && !((Float)number).isNaN();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected static boolean D(String string) {
        if (string.indexOf(46) > -1) return true;
        if (string.indexOf(101) > -1) return true;
        if (string.indexOf(69) > -1) return true;
        if (!"-0".equals(string)) return false;
        return true;
    }

    protected static Number E(String string) {
        char c = string.charAt(0);
        if (c >= '0' && c <= '9' || c == '-') {
            BigInteger bigInteger;
            if (et.D(string)) {
                BigDecimal bigDecimal = new BigDecimal(string);
                if (c == '-' && BigDecimal.ZERO.compareTo(bigDecimal) == 0) {
                    return -0.0;
                }
                return bigDecimal;
            }
            if (c == '0' && string.length() > 1) {
                var2_3 = string.charAt(1);
                if (var2_3 >= '0' && var2_3 <= '9') {
                    throw new NumberFormatException("val [" + string + "] is not a valid number.");
                }
            } else if (c == '-' && string.length() > 2) {
                var2_3 = string.charAt(1);
                char c2 = string.charAt(2);
                if (var2_3 == '0' && c2 >= '0' && c2 <= '9') {
                    throw new NumberFormatException("val [" + string + "] is not a valid number.");
                }
            }
            if ((bigInteger = new BigInteger(string)).bitLength() <= 31) {
                return bigInteger.intValue();
            }
            if (bigInteger.bitLength() <= 63) {
                return bigInteger.longValue();
            }
            return bigInteger;
        }
        throw new NumberFormatException("val [" + string + "] is not a valid number.");
    }

    public static Object F(String string) {
        if ("".equals(string)) {
            return string;
        }
        if ("true".equalsIgnoreCase(string)) {
            return Boolean.TRUE;
        }
        if ("false".equalsIgnoreCase(string)) {
            return Boolean.FALSE;
        }
        if ("null".equalsIgnoreCase(string)) {
            return b;
        }
        char c = string.charAt(0);
        if (c >= '0' && c <= '9' || c == '-') {
            return et.E(string);
        }
        return string;
    }

    public static void c(Object object) {
        if (!(object instanceof Number) || et.b((Number)object)) {
            return;
        }
        throw new eq("JSON does not allow non-finite numbers.");
    }

    public ep a(ep ep2) {
        if (ep2 == null || ep2.d()) {
            return null;
        }
        ep ep3 = new ep();
        for (int i = 0; i < ep2.a(); ++i) {
            ep3.a(this.p(ep2.l(i)));
        }
        return ep3;
    }

    public String toString() {
        return this.a(0);
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public String a(int n) {
        StringWriter stringWriter = new StringWriter();
        StringBuffer stringBuffer = stringWriter.getBuffer();
        // MONITORENTER : stringBuffer
        // MONITOREXIT : stringBuffer
        return this.a(stringWriter, n, 0).toString();
    }

    public static String d(Object object) {
        return eE.a(object);
    }

    public static Object e(Object object) {
        return et.b(object, null);
    }

    private static Object b(Object object, Set set) {
        String string;
        if (b.equals(object)) {
            return b;
        }
        if (object instanceof et || object instanceof ep || b.equals(object) || object instanceof eB || object instanceof Byte || object instanceof Character || object instanceof Short || object instanceof Integer || object instanceof Long || object instanceof Boolean || object instanceof Float || object instanceof Double || object instanceof String || object instanceof BigInteger || object instanceof BigDecimal || object instanceof Enum) {
            return object;
        }
        if (object instanceof Collection) {
            Collection collection = (Collection)object;
            return new ep(collection);
        }
        if (object.getClass().isArray()) {
            return new ep(object);
        }
        if (object instanceof Map) {
            Map map = (Map)object;
            return new et(map);
        }
        Package package_ = object.getClass().getPackage();
        String string2 = string = package_ != null ? package_.getName() : "";
        if (string.startsWith("java.") || string.startsWith("javax.") || object.getClass().getClassLoader() == null) {
            return object.toString();
        }
        if (set != null) {
            return new et(object, set);
        }
        return new et(object);
    }

    public Writer a(Writer writer) {
        return this.a(writer, 0, 0);
    }

    static final Writer a(Writer writer, Object object, int n, int n2) {
        if (object == null || object.equals(null)) {
            writer.write("null");
        } else if (object instanceof eB) {
            String string = ((eB)object).a();
            writer.write(string != null ? string.toString() : et.B(object.toString()));
        } else if (object instanceof Number) {
            String string = et.a((Number)object);
            if (a.matcher(string).matches()) {
                writer.write(string);
            } else {
                et.a(string, writer);
            }
        } else if (object instanceof Boolean) {
            writer.write(object.toString());
        } else if (object instanceof Enum) {
            writer.write(et.B(((Enum)object).name()));
        } else if (object instanceof et) {
            ((et)object).a(writer, n, n2);
        } else if (object instanceof ep) {
            ((ep)object).a(writer, n, n2);
        } else if (object instanceof Map) {
            Map map = (Map)object;
            new et(map).a(writer, n, n2);
        } else if (object instanceof Collection) {
            Collection collection = (Collection)object;
            new ep(collection).a(writer, n, n2);
        } else if (object.getClass().isArray()) {
            new ep(object).a(writer, n, n2);
        } else {
            et.a(object.toString(), writer);
        }
        return writer;
    }

    /*
     * Enabled aggressive block sorting
     */
    static final void a(Writer writer, int n) {
        int n2 = 0;
        while (n2 < n) {
            writer.write(32);
            ++n2;
        }
        return;
    }

    public Writer a(Writer writer, int n, int n2) {
        boolean bl2 = false;
        int n3 = this.e();
        writer.write(123);
        if (n3 == 1) {
            Map.Entry entry = (Map.Entry)this.d().iterator().next();
            String string = (String)entry.getKey();
            writer.write(et.B(string));
            writer.write(58);
            if (n > 0) {
                writer.write(32);
            }
            et.a(writer, entry.getValue(), n, n2);
        } else if (n3 != 0) {
            int n4 = n2 + n;
            for (Map.Entry entry : this.d()) {
                if (bl2) {
                    writer.write(44);
                }
                if (n > 0) {
                    writer.write(10);
                }
                et.a(writer, n4);
                String string = (String)entry.getKey();
                writer.write(et.B(string));
                writer.write(58);
                if (n > 0) {
                    writer.write(32);
                }
                et.a(writer, entry.getValue(), n, n4);
                bl2 = true;
            }
            if (n > 0) {
                writer.write(10);
            }
            et.a(writer, n2);
        }
        writer.write(125);
        return writer;
    }

    public Map i() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.d()) {
            Object object = entry.getValue() == null || b.equals(entry.getValue()) ? null : (entry.getValue() instanceof et ? ((et)entry.getValue()).i() : (entry.getValue() instanceof ep ? ((ep)entry.getValue()).c() : entry.getValue()));
            hashMap.put(entry.getKey(), (Map)object);
        }
        return hashMap;
    }

    private static eq a(String string, String string2, Object object, Throwable throwable) {
        if (object == null) {
            return new eq("JSONObject[" + et.B(string) + "] is not a " + string2 + " (null).", throwable);
        }
        if (object instanceof Map || object instanceof Iterable || object instanceof et) {
            return new eq("JSONObject[" + et.B(string) + "] is not a " + string2 + " (" + object.getClass() + ").", throwable);
        }
        return new eq("JSONObject[" + et.B(string) + "] is not a " + string2 + " (" + object.getClass() + " : " + object + ").", throwable);
    }

    private static eq H(String string) {
        return new eq("JavaBean object contains recursively defined member variable of key " + et.B(string));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block30: {
            block29: {
                block28: {
                    block27: {
                        block31: {
                            break block31;
lbl1:
                            // 1 sources

                            return;
                        }
                        et.field330 = 9437 ^ -1831;
                        et.field331 = -3625 ^ -1831;
                        et.h = new int[4][3];
                        var13 = new String[67];
                        var11_1 = 0;
                        var10_2 = "_\u00cf\fD/2\"`A\u00a0\u00c7#\u0099\u00d2\\\t\r\u00b3\u00bcq\u0097O\u000eL_\u0002\u0019\u0000\n\u00be\u0098\u00ebn\u007fM\u00ce\u00cc\u00ae1\u000f\u00de\u00d46]6\u00bd\u00044s\r\u00bc\u0007|\u00ee\u0003\u0018f\u00df\u0002\u00dc\u00c3|\u00d4\u00a0\u00e3\u00de\b\u0007\u00d0\u00d3\u00c6$\u00edr\u000b\u0014?\u00df`M\u0002\u00f4\u00c0\u0002\u0012\u00c2\u0004\u0012\u00bd\u00dcpF\u0093\u00ce\u0000\u00de\u00ab8\u00147\u001f{\u00d8\u00cc2Q'\u00b4\u00d4\u008b\u00b0\u00ae&\u008f\u0081\u00ed\u00da{\u00905\u0089\u00fe\u00a1\u0097\u0092\u00b6\b\u0013Ayz\u001f1\u009b\u00c9A\u001e/h\u0006l\u00f0\u0010\u00839\u00d3\u000e\u00b2\u00ac\u00dbf}\\w\u001b\u0090~\u0015\u00a4\u0018E\u0087\t\u009e\u0086\u00ce\u00d7\u00d9\u009b\u00c7\u00d6f\u0003\u00df\u00f6\u00ae\u0005\"\u00e2\u00d3\u0012\u0019\u0004m\u00f6s\u00f7\u0006\u00f3\u0094\u00b2\u0002\u0006\u009f\t\u00ba\u00a3\u00ed\u00b3\u009bh\u00d5\u008a\u0086\u0011\u00c7YV\u00d6\u00b2\u00e1\u0014\u00aa\u00ca {\u00c0\u001b\u0018\u00d1JU\u0015.L\n8\u0087\u00d8\u00d6^J@\u00d2\u00a5\u00e9\u0082\u00af\u00da\b\u0085[\u00a7-%mP\u00df\rPB\u0004U\u0097\u00b0\u00c6Lc\u00e0\u00d5EV\u008f\u00ba4\u0003\u00d1\u0086\u00f3\u00e1\u00d0\b\u0018\u009d\f\u00af\u001c>\u00cdb\u001es\u0015\u0017M.\u00cb?Pjl\u007fU\u009b'\u00ef\u00e7\u008c\u008b\u0096\u00a3.\u00b9\u00c6\u0004\u00cc\u00b3\u0007\u00b1\u0005F\u0086M\u00cd\u00f4\u0004C3?\u0010\ny\u00d9\u0013KkR*\u00d0\u00bb\u00e7\u0002\u00be\u00ca\bcOw\u00c1\u00c6\u001b\u00f7T\u0005n\u00dbHfT\b\u0017\u00fcLe\u00f8rj\u0088\u0002\u001e9\f\u00e1\u00c4\u00f5\u00a3\u008eB\u00aa\u00fbQ\u00c2\u00e52\u0002\u00deH\u0002\u008d\u00dd\u000b\n\\\\\u008c\u0085\u00e0\u009b\u00af\u00ec\u0019\u00b9\r\u00e2y\u00b1\u0091*\t\u00e0{\u0019c\u00d9\u00b8\u00f1\u0006W\u00d4\u00ea\u00c6z/D\u00ae\u00ae\u00f1\u0089#\u008d\u00e8\u00ee\u00ab@C\u0007\u00b7C\u00b3\u009c\u00be\u00a8Qw\u000f\u0085\u0019\u00d6\u00d0R\u00cf\u00f2\u00bd\u00f8N:E\u00f2\u009b\u0016i\u00a1\u001c]\u00b7\u0088/\r]T\r\u00b3\u00ed+:\u00dd}\u0019\u00f1\u00e0\u009b\u00e1\u0003\u0007F\u00d2m\u0000\u00b7\u0010\u00f9\f\u0002\u0091\u00b5\u0005O\u00e3\u00e9 L\n\u00bd?\u00aa\u00e0[m@\u001e\u0097/\u001a\u00b1p\u00fal\u00a5\u00a49\u00f2\u0015\u0086\u00d6]P\u00a8\u00afl\u00e6\u00c4\u00f4\u0084\u00905\u00cd\u00d1\u0088\u00a2\u0004\u0005x~&\u0004\u00b49H\u00b2\u00030\u00d1g\u0002\u00a3\u00bf\u0003P\u00b6\u00a4\u0006\u0082$\u00cfM\u00bba\u0007\u008e\u00c6\u00e5F\u00bc\u00dc\u00d7\u00020q\u000b\u001f\t-\u0006&'h\u00cbt\u00b3\u00fa*0\t\u00c9\u0090\u00ff\u00cd\u00d9\u00fc\u00ab\u0014\u00f03z\u00c9\u00968\u0000\u0000\u00ab\u00e3{ax6;\u009c\u00dc\u00f8&\u0010\u00ad\u00f6\u00a9\u00e5\u0099\u009cJ\u0095x*h\u00d4'\u00922OA\u0088_\u00bd\u009e\u009dk\u00b0\u00c1U}\u00c9<IyX\u0019\u001b\u0090u\u00ec\u001b\u009b3\u00b9I\u00cd\u00a2n\u00e2\u0097\u0002\u00af\u00c7\u001e\u009a\u0002\u00d4\u0007+\u00ec_l|}\u00f3I\u00eb01X\u0014\u00dd\u00f7\u00be\u00e4\u00c1\u00df\u00c8\u00eb\u00ad\u000e\u00e1l\u008d\u001b\u0001c\u00cf4\u00b0\u0083eR\u0096\u00af\u001a\u0013\u00999[\u0001\u00e2\u000b\u00e6\u001d\u00c1\u00a46\u00e5\u00ed\u000f\"\r`\u0005J\u00e4\u00de\u00d2\u00b8\u0018\u00df\u009f5\u00d4%}\b\u0080x\u00da{\u0087\u00be\u00c3\u000b&T2<\u001c\u00d9\u00de\u00bcm\u0002I\t\t\u00f8\r\u00a5f\u0092\u00d2\u00f4\u00dd\u00a2\u000b~\u0084\u0001\u00b7\u00a3\u0011\u00d8\rbk8\u000f{\u00a3\u0082\u00b3\u00a0`\u00d6\u008f)z\u00f7\u00e9\u00153.\u0002\u0004\\*nw\u0002_\u00864\u00f6\u00c3N\u00f3L\u00cf\u00edVd\u00cb^~`,\u0002\u0098W\t\u00de{`\u0004\u00b1\u008f_\u0005\u00f7\u009bRS3lW\u0015\u008d3\u0002\u00f20#\u00ec\u00fa\u00efXV\u00e8\u00c4\u0000\u008f\u001a\u00c5\u0019\u0003J\u00d9\u0010\u00d7%\u008aa\u0005{F\u00a1\u00f2~I\u00b7\u009c\u00c0\u00ee\u00b2x\u009b\f";
                        var12_3 = "_\u00cf\fD/2\"`A\u00a0\u00c7#\u0099\u00d2\\\t\r\u00b3\u00bcq\u0097O\u000eL_\u0002\u0019\u0000\n\u00be\u0098\u00ebn\u007fM\u00ce\u00cc\u00ae1\u000f\u00de\u00d46]6\u00bd\u00044s\r\u00bc\u0007|\u00ee\u0003\u0018f\u00df\u0002\u00dc\u00c3|\u00d4\u00a0\u00e3\u00de\b\u0007\u00d0\u00d3\u00c6$\u00edr\u000b\u0014?\u00df`M\u0002\u00f4\u00c0\u0002\u0012\u00c2\u0004\u0012\u00bd\u00dcpF\u0093\u00ce\u0000\u00de\u00ab8\u00147\u001f{\u00d8\u00cc2Q'\u00b4\u00d4\u008b\u00b0\u00ae&\u008f\u0081\u00ed\u00da{\u00905\u0089\u00fe\u00a1\u0097\u0092\u00b6\b\u0013Ayz\u001f1\u009b\u00c9A\u001e/h\u0006l\u00f0\u0010\u00839\u00d3\u000e\u00b2\u00ac\u00dbf}\\w\u001b\u0090~\u0015\u00a4\u0018E\u0087\t\u009e\u0086\u00ce\u00d7\u00d9\u009b\u00c7\u00d6f\u0003\u00df\u00f6\u00ae\u0005\"\u00e2\u00d3\u0012\u0019\u0004m\u00f6s\u00f7\u0006\u00f3\u0094\u00b2\u0002\u0006\u009f\t\u00ba\u00a3\u00ed\u00b3\u009bh\u00d5\u008a\u0086\u0011\u00c7YV\u00d6\u00b2\u00e1\u0014\u00aa\u00ca {\u00c0\u001b\u0018\u00d1JU\u0015.L\n8\u0087\u00d8\u00d6^J@\u00d2\u00a5\u00e9\u0082\u00af\u00da\b\u0085[\u00a7-%mP\u00df\rPB\u0004U\u0097\u00b0\u00c6Lc\u00e0\u00d5EV\u008f\u00ba4\u0003\u00d1\u0086\u00f3\u00e1\u00d0\b\u0018\u009d\f\u00af\u001c>\u00cdb\u001es\u0015\u0017M.\u00cb?Pjl\u007fU\u009b'\u00ef\u00e7\u008c\u008b\u0096\u00a3.\u00b9\u00c6\u0004\u00cc\u00b3\u0007\u00b1\u0005F\u0086M\u00cd\u00f4\u0004C3?\u0010\ny\u00d9\u0013KkR*\u00d0\u00bb\u00e7\u0002\u00be\u00ca\bcOw\u00c1\u00c6\u001b\u00f7T\u0005n\u00dbHfT\b\u0017\u00fcLe\u00f8rj\u0088\u0002\u001e9\f\u00e1\u00c4\u00f5\u00a3\u008eB\u00aa\u00fbQ\u00c2\u00e52\u0002\u00deH\u0002\u008d\u00dd\u000b\n\\\\\u008c\u0085\u00e0\u009b\u00af\u00ec\u0019\u00b9\r\u00e2y\u00b1\u0091*\t\u00e0{\u0019c\u00d9\u00b8\u00f1\u0006W\u00d4\u00ea\u00c6z/D\u00ae\u00ae\u00f1\u0089#\u008d\u00e8\u00ee\u00ab@C\u0007\u00b7C\u00b3\u009c\u00be\u00a8Qw\u000f\u0085\u0019\u00d6\u00d0R\u00cf\u00f2\u00bd\u00f8N:E\u00f2\u009b\u0016i\u00a1\u001c]\u00b7\u0088/\r]T\r\u00b3\u00ed+:\u00dd}\u0019\u00f1\u00e0\u009b\u00e1\u0003\u0007F\u00d2m\u0000\u00b7\u0010\u00f9\f\u0002\u0091\u00b5\u0005O\u00e3\u00e9 L\n\u00bd?\u00aa\u00e0[m@\u001e\u0097/\u001a\u00b1p\u00fal\u00a5\u00a49\u00f2\u0015\u0086\u00d6]P\u00a8\u00afl\u00e6\u00c4\u00f4\u0084\u00905\u00cd\u00d1\u0088\u00a2\u0004\u0005x~&\u0004\u00b49H\u00b2\u00030\u00d1g\u0002\u00a3\u00bf\u0003P\u00b6\u00a4\u0006\u0082$\u00cfM\u00bba\u0007\u008e\u00c6\u00e5F\u00bc\u00dc\u00d7\u00020q\u000b\u001f\t-\u0006&'h\u00cbt\u00b3\u00fa*0\t\u00c9\u0090\u00ff\u00cd\u00d9\u00fc\u00ab\u0014\u00f03z\u00c9\u00968\u0000\u0000\u00ab\u00e3{ax6;\u009c\u00dc\u00f8&\u0010\u00ad\u00f6\u00a9\u00e5\u0099\u009cJ\u0095x*h\u00d4'\u00922OA\u0088_\u00bd\u009e\u009dk\u00b0\u00c1U}\u00c9<IyX\u0019\u001b\u0090u\u00ec\u001b\u009b3\u00b9I\u00cd\u00a2n\u00e2\u0097\u0002\u00af\u00c7\u001e\u009a\u0002\u00d4\u0007+\u00ec_l|}\u00f3I\u00eb01X\u0014\u00dd\u00f7\u00be\u00e4\u00c1\u00df\u00c8\u00eb\u00ad\u000e\u00e1l\u008d\u001b\u0001c\u00cf4\u00b0\u0083eR\u0096\u00af\u001a\u0013\u00999[\u0001\u00e2\u000b\u00e6\u001d\u00c1\u00a46\u00e5\u00ed\u000f\"\r`\u0005J\u00e4\u00de\u00d2\u00b8\u0018\u00df\u009f5\u00d4%}\b\u0080x\u00da{\u0087\u00be\u00c3\u000b&T2<\u001c\u00d9\u00de\u00bcm\u0002I\t\t\u00f8\r\u00a5f\u0092\u00d2\u00f4\u00dd\u00a2\u000b~\u0084\u0001\u00b7\u00a3\u0011\u00d8\rbk8\u000f{\u00a3\u0082\u00b3\u00a0`\u00d6\u008f)z\u00f7\u00e9\u00153.\u0002\u0004\\*nw\u0002_\u00864\u00f6\u00c3N\u00f3L\u00cf\u00edVd\u00cb^~`,\u0002\u0098W\t\u00de{`\u0004\u00b1\u008f_\u0005\u00f7\u009bRS3lW\u0015\u008d3\u0002\u00f20#\u00ec\u00fa\u00efXV\u00e8\u00c4\u0000\u008f\u001a\u00c5\u0019\u0003J\u00d9\u0010\u00d7%\u008aa\u0005{F\u00a1\u00f2~I\u00b7\u009c\u00c0\u00ee\u00b2x\u009b\f".length();
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
                            var10_2 = "\u00b7\u001f\u00c8\u0000\u00ac\u00b7\u0005\u008d\u008c%a\u00b5";
                            var12_3 = "\u00b7\u001f\u00c8\u0000\u00ac\u00b7\u0005\u008d\u008c%a\u00b5".length();
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
                                    v13 = 50;
                                    break;
                                }
                                case 1: {
                                    v13 = 51;
                                    break;
                                }
                                case 2: {
                                    v13 = 23;
                                    break;
                                }
                                case 3: {
                                    v13 = 22;
                                    break;
                                }
                                case 4: {
                                    v13 = 5;
                                    break;
                                }
                                case 5: {
                                    v13 = 86;
                                    break;
                                }
                                default: {
                                    v13 = 71;
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
                et.d = var13;
                et.e = new String[67];
                var0_7 = 8459006487899132097L;
                var6_8 = new long[34];
                var3_9 = 0;
                var4_10 = "i\u00c5\u009e\u0018.\u0095\u00cf\u00d9\u00e7J\u00acRQC\u0001I)\u00f7\u00a1\u00fd~p\u00c1\u00d2*'\u00be\u00cb\u00ae\u00cdv~\f\u0010'\u00ac'$\u00e9=\u00d8p[G\u00a0\u00ba)f\u00cd\u00afJ\u00be\u00d6,{\u00fc\u00feG\u00fe6\u007fu+\u00f7\u009e;\u0012|\u00cd\u00d2\u00a2\u00c0\u00f84\u00af>\u00bd\u001aO\u00bf\u00bf)\u00a5\u0086\u0084\u008b\u008e\u0017\u000fC\u00cb\u000e`\u00e1N\u00d9\u00ab\u00a0\u00a6\u00bc\u00a6\u00d7\u009e\u0015u\u00c5\u0001\u00a1\u008c\u001a\u0095%\u000fy\u0096}D\u000e\u00b5\u00a49\u0085>\u009eRi\u0081\u00dc\u00dd?\"\u009e\u00c1\u00fd\f\u009bj\u00e2?\u00f6)3\u00d7\"\u008a\u0004s\u0093\u00c2\u00ac\u00e1<)\u001f\u00e5e\u00a7tl\u0089X\u0082\u00a7,A\u00de\u000f\u001d\u00ecFy\u00e8\u00bf6\u00bb\u0083u\u0097\u0092\u00abGT\u00dd\u0086\u00a5s\u0088\u00ebL+,\u00bf/{`\u00bfN\u00cc\u0001\u00d1\u0013}Y \u00d1K\u00db\u00ee\u0007@\u00e0\u008a\u00ffw\u00cb\u00c0\u00c5\u00bb\u00b7\u00a4\u0084\u00baL\u00f8W\u000eZ\u0017Ll\u0089\u00cb\u00d6\u00ed&\u00f3&O\u00fd\u008a\u00b5\u00bf\u008c\u00e6s\u00c7\u0012\u00da$0%\u009bmOMy";
                var5_11 = "i\u00c5\u009e\u0018.\u0095\u00cf\u00d9\u00e7J\u00acRQC\u0001I)\u00f7\u00a1\u00fd~p\u00c1\u00d2*'\u00be\u00cb\u00ae\u00cdv~\f\u0010'\u00ac'$\u00e9=\u00d8p[G\u00a0\u00ba)f\u00cd\u00afJ\u00be\u00d6,{\u00fc\u00feG\u00fe6\u007fu+\u00f7\u009e;\u0012|\u00cd\u00d2\u00a2\u00c0\u00f84\u00af>\u00bd\u001aO\u00bf\u00bf)\u00a5\u0086\u0084\u008b\u008e\u0017\u000fC\u00cb\u000e`\u00e1N\u00d9\u00ab\u00a0\u00a6\u00bc\u00a6\u00d7\u009e\u0015u\u00c5\u0001\u00a1\u008c\u001a\u0095%\u000fy\u0096}D\u000e\u00b5\u00a49\u0085>\u009eRi\u0081\u00dc\u00dd?\"\u009e\u00c1\u00fd\f\u009bj\u00e2?\u00f6)3\u00d7\"\u008a\u0004s\u0093\u00c2\u00ac\u00e1<)\u001f\u00e5e\u00a7tl\u0089X\u0082\u00a7,A\u00de\u000f\u001d\u00ecFy\u00e8\u00bf6\u00bb\u0083u\u0097\u0092\u00abGT\u00dd\u0086\u00a5s\u0088\u00ebL+,\u00bf/{`\u00bfN\u00cc\u0001\u00d1\u0013}Y \u00d1K\u00db\u00ee\u0007@\u00e0\u008a\u00ffw\u00cb\u00c0\u00c5\u00bb\u00b7\u00a4\u0084\u00baL\u00f8W\u000eZ\u0017Ll\u0089\u00cb\u00d6\u00ed&\u00f3&O\u00fd\u008a\u00b5\u00bf\u008c\u00e6s\u00c7\u0012\u00da$0%\u009bmOMy".length();
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
                    var4_10 = "]\u00a7A\u00a6V>\u0018\u0085dq\u00b7\u0087\u00f3\u00e4\u0096a";
                    var5_11 = "]\u00a7A\u00a6V>\u0018\u0085dq\u00b7\u0087\u00f3\u00e4\u0096a".length();
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
                    break block30;
                    break;
                }
            }
            v20 = v18 ^ var0_7;
            switch (v19) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl137:
                // 1 sources

                ** continue;
            }
        }
        et.f = var6_8;
        et.g = new Integer[34];
        et.a = Pattern.compile("-?(?:0|[1-9]\\d*)(?:\\.\\d+)?(?:[eE][+-]?\\d+)?");
        et.b = new ev(null);
        ** while (true)
    }
}

