/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import java.lang.reflect.Type;

public final class aV {
    public static final int[][] a;
    private static /* synthetic */ int field166;
    private static /* synthetic */ int field167;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private aV() {
    }

    public static boolean a(Type type) {
        return type instanceof Class && ((Class)type).isPrimitive();
    }

    public static boolean b(Type type) {
        return type == Integer.class || type == Float.class || type == Byte.class || type == Double.class || type == Long.class || type == Character.class || type == Boolean.class || type == Short.class || type == Void.class;
    }

    public static Class a(Class clazz) {
        if (clazz == Integer.TYPE) {
            return Integer.class;
        }
        if (clazz == Float.TYPE) {
            return Float.class;
        }
        if (clazz == Byte.TYPE) {
            return Byte.class;
        }
        if (clazz == Double.TYPE) {
            return Double.class;
        }
        if (clazz == Long.TYPE) {
            return Long.class;
        }
        if (clazz == Character.TYPE) {
            return Character.class;
        }
        if (clazz == Boolean.TYPE) {
            return Boolean.class;
        }
        if (clazz == Short.TYPE) {
            return Short.class;
        }
        if (clazz == Void.TYPE) {
            return Void.class;
        }
        return clazz;
    }

    public static Class b(Class clazz) {
        if (clazz == Integer.class) {
            return Integer.TYPE;
        }
        if (clazz == Float.class) {
            return Float.TYPE;
        }
        if (clazz == Byte.class) {
            return Byte.TYPE;
        }
        if (clazz == Double.class) {
            return Double.TYPE;
        }
        if (clazz == Long.class) {
            return Long.TYPE;
        }
        if (clazz == Character.class) {
            return Character.TYPE;
        }
        if (clazz == Boolean.class) {
            return Boolean.TYPE;
        }
        if (clazz == Short.class) {
            return Short.TYPE;
        }
        if (clazz == Void.class) {
            return Void.TYPE;
        }
        return clazz;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field166 = 0x4428 ^ 0xFFFF8FEF;
        field167 = 0xFFFFCFA5 ^ 0xFFFF8FEF;
        a = new int[4][2];
    }
}

