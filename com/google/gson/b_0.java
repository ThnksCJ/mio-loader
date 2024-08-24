/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.ab_0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;

/*
 * Renamed from com.google.gson.b
 */
public final class b_0 {
    private final Field a;
    public static final int[][] b;
    private static /* synthetic */ int field194;
    private static /* synthetic */ int field195;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public b_0(Field field) {
        ab_0.a(field);
        this.a = field;
    }

    public Class a() {
        return this.a.getDeclaringClass();
    }

    public String b() {
        return this.a.getName();
    }

    public Type c() {
        return this.a.getGenericType();
    }

    public Class d() {
        return this.a.getType();
    }

    public Annotation a(Class clazz) {
        return this.a.getAnnotation(clazz);
    }

    public Collection e() {
        return Arrays.asList(this.a.getAnnotations());
    }

    public boolean a(int n) {
        return (this.a.getModifiers() & n) != 0;
    }

    Object a(Object object) {
        return this.a.get(object);
    }

    boolean f() {
        return this.a.isSynthetic();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field194 = 0x687 ^ 0xFFFFA8AC;
        field195 = 0xFFFFA5F9 ^ 0xFFFFA8AC;
        b = new int[2][3];
    }
}

