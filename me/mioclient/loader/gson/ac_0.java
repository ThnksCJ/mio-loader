/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
import me.mioclient.loader.gson.ab_0;
import me.mioclient.loader.gson.ad_0;
import me.mioclient.loader.gson.ae_0;
import me.mioclient.loader.gson.af_0;

/*
 * Renamed from me.mioclient.loader.gson.ac
 */
public final class ac_0 {
    static final Type[] a;
    private static final String[] b;
    private static final String[] c;
    public static final int[][] d;
    private static /* synthetic */ int field184;
    private static /* synthetic */ int field185;

    private ac_0() {
        throw new UnsupportedOperationException();
    }

    public static ParameterizedType a(Type type, Type type2, Type ... typeArray) {
        return new ae_0(type, type2, typeArray);
    }

    public static GenericArrayType a(Type type) {
        return new ad_0(type);
    }

    public static WildcardType b(Type type) {
        Type[] typeArray = type instanceof WildcardType ? ((WildcardType)type).getUpperBounds() : new Type[]{type};
        return new af_0(typeArray, a);
    }

    public static WildcardType c(Type type) {
        Type[] typeArray = type instanceof WildcardType ? ((WildcardType)type).getLowerBounds() : new Type[]{type};
        return new af_0(new Type[]{Object.class}, typeArray);
    }

    public static Type d(Type type) {
        if (type instanceof Class) {
            Class clazz = (Class)type;
            return clazz.isArray() ? new ad_0(ac_0.d(clazz.getComponentType())) : clazz;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType)type;
            return new ae_0(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType)type;
            return new ad_0(genericArrayType.getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType)type;
            return new af_0(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
        return type;
    }

    public static Class e(Type type) {
        if (type instanceof Class) {
            return (Class)type;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType)type;
            Type type2 = parameterizedType.getRawType();
            ab_0.a(type2 instanceof Class);
            return (Class)type2;
        }
        if (type instanceof GenericArrayType) {
            Type type3 = ((GenericArrayType)type).getGenericComponentType();
            return Array.newInstance(ac_0.e(type3), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return ac_0.e(((WildcardType)type).getUpperBounds()[0]);
        }
        String string = type == null ? "null" : type.getClass().getName();
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + string);
    }

    static boolean a(Object object, Object object2) {
        return object == object2 || object != null && object.equals(object2);
    }

    public static boolean a(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType)type;
            ParameterizedType parameterizedType2 = (ParameterizedType)type2;
            return ac_0.a((Object)parameterizedType.getOwnerType(), (Object)parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            GenericArrayType genericArrayType = (GenericArrayType)type;
            GenericArrayType genericArrayType2 = (GenericArrayType)type2;
            return ac_0.a(genericArrayType.getGenericComponentType(), genericArrayType2.getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType)type;
            WildcardType wildcardType2 = (WildcardType)type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (type instanceof TypeVariable) {
            if (!(type2 instanceof TypeVariable)) {
                return false;
            }
            TypeVariable typeVariable = (TypeVariable)type;
            TypeVariable typeVariable2 = (TypeVariable)type2;
            return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
        }
        return false;
    }

    static int a(Object object) {
        return object != null ? object.hashCode() : 0;
    }

    public static String f(Type type) {
        return type instanceof Class ? ((Class)type).getName() : type.toString();
    }

    static Type a(Type type, Class object, Class clazz) {
        Object object2;
        if (clazz == object) {
            return type;
        }
        if (clazz.isInterface()) {
            object2 = ((Class)object).getInterfaces();
            int n = ((Class<?>[])object2).length;
            for (int i = 0; i < n; ++i) {
                if (object2[i] == clazz) {
                    return ((Class)object).getGenericInterfaces()[i];
                }
                if (!clazz.isAssignableFrom((Class<?>)object2[i])) continue;
                return ac_0.a(((Class)object).getGenericInterfaces()[i], (Class)object2[i], clazz);
            }
        }
        if (!((Class)object).isInterface()) {
            while (object != Object.class) {
                object2 = ((Class)object).getSuperclass();
                if (object2 == clazz) {
                    return ((Class)object).getGenericSuperclass();
                }
                if (clazz.isAssignableFrom((Class<?>)object2)) {
                    return ac_0.a(((Class)object).getGenericSuperclass(), (Class)object2, clazz);
                }
                object = object2;
            }
        }
        return clazz;
    }

    static Type b(Type type, Class clazz, Class clazz2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType)type).getUpperBounds()[0];
        }
        ab_0.a(clazz2.isAssignableFrom(clazz));
        return ac_0.a(type, clazz, ac_0.a(type, clazz, clazz2));
    }

    public static Type g(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType)type).getGenericComponentType() : ((Class)type).getComponentType();
    }

    public static Type a(Type type, Class clazz) {
        Type type2 = ac_0.b(type, clazz, Collection.class);
        if (type2 instanceof WildcardType) {
            type2 = ((WildcardType)type2).getUpperBounds()[0];
        }
        if (type2 instanceof ParameterizedType) {
            return ((ParameterizedType)type2).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    public static Type[] b(Type type, Class clazz) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type type2 = ac_0.b(type, clazz, Map.class);
        if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType)type2;
            return parameterizedType.getActualTypeArguments();
        }
        return new Type[]{Object.class, Object.class};
    }

    public static Type a(Type type, Class clazz, Type type2) {
        return ac_0.a(type, clazz, type2, new HashMap());
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static Type a(Type var0, Class var1_1, Type var2_2, Map var3_3) {
        block12: {
            block7: {
                block11: {
                    block10: {
                        block9: {
                            block8: {
                                var4_4 = null;
                                while (var2_2 instanceof TypeVariable) {
                                    var5_5 = (TypeVariable)var2_2;
                                    var6_6 /* !! */  = (Class<?>)var3_3.get(var5_5);
                                    if (var6_6 /* !! */  != null) {
                                        return var6_6 /* !! */  == Void.TYPE ? var2_2 : var6_6 /* !! */ ;
                                    }
                                    var3_3.put(var5_5, Void.TYPE);
                                    if (var4_4 == null) {
                                        var4_4 = var5_5;
                                    }
                                    if ((var2_2 = ac_0.a(var0, var1_1, (TypeVariable)var5_5)) != var5_5) continue;
                                    break block7;
                                }
                                if (!(var2_2 instanceof Class) || !((Class)var2_2).isArray()) break block8;
                                var5_5 = (Class)var2_2;
                                var6_6 /* !! */  = var5_5.getComponentType();
                                var2_2 = ac_0.a((Object)var6_6 /* !! */ , (Object)(var7_7 = ac_0.a(var0, var1_1, var6_6 /* !! */ , var3_3))) != false ? var5_5 : ac_0.a(var7_7);
                                break block7;
                            }
                            if (!(var2_2 instanceof GenericArrayType)) break block9;
                            var5_5 = (GenericArrayType)var2_2;
                            var6_6 /* !! */  = var5_5.getGenericComponentType();
                            var2_2 = ac_0.a((Object)var6_6 /* !! */ , (Object)(var7_8 = ac_0.a(var0, var1_1, var6_6 /* !! */ , var3_3))) != false ? var5_5 : ac_0.a(var7_8);
                            break block7;
                        }
                        if (!(var2_2 instanceof ParameterizedType)) break block10;
                        var5_5 = (ParameterizedType)var2_2;
                        var6_6 /* !! */  = var5_5.getOwnerType();
                        var7_9 = ac_0.a(var0, var1_1, var6_6 /* !! */ , var3_3);
                        var8_11 = ac_0.a((Object)var7_9, (Object)var6_6 /* !! */ ) == false;
                        var9_14 = var5_5.getActualTypeArguments();
                        var11_16 = var9_14.length;
                        for (var10_15 = 0; var10_15 < var11_16; ++var10_15) {
                            var12_17 = ac_0.a(var0, var1_1, var9_14[var10_15], var3_3);
                            if (ac_0.a((Object)var12_17, (Object)var9_14[var10_15])) continue;
                            if (!var8_11) {
                                var9_14 = (Type[])var9_14.clone();
                                var8_11 = true;
                            }
                            var9_14[var10_15] = var12_17;
                        }
                        var2_2 = var8_11 != false ? ac_0.a(var7_9, var5_5.getRawType(), var9_14) : var5_5;
                        break block7;
                    }
                    if (!(var2_2 instanceof WildcardType)) break block7;
                    var5_5 = (WildcardType)var2_2;
                    var6_6 /* !! */  = var5_5.getLowerBounds();
                    var7_10 = var5_5.getUpperBounds();
                    if (var6_6 /* !! */ .length != 1) break block11;
                    var8_12 = ac_0.a(var0, var1_1, var6_6 /* !! */ [0], var3_3);
                    if (var8_12 == var6_6 /* !! */ [0]) ** GOTO lbl-1000
                    var2_2 = ac_0.c(var8_12);
                    break block7;
                }
                if (var7_10.length == 1 && (var8_13 = ac_0.a(var0, var1_1, var7_10[0], var3_3)) != var7_10[0]) {
                    var2_2 = ac_0.b(var8_13);
                } else lbl-1000:
                // 2 sources

                {
                    var2_2 = var5_5;
                }
            }
            if (var4_4 == null) break block12;
            var3_3.put(var4_4, var2_2);
        }
        return var2_2;
    }

    static Type a(Type type, Class clazz, TypeVariable typeVariable) {
        Class clazz2 = ac_0.a(typeVariable);
        if (clazz2 == null) {
            return typeVariable;
        }
        Type type2 = ac_0.a(type, clazz, clazz2);
        if (type2 instanceof ParameterizedType) {
            int n = ac_0.a(clazz2.getTypeParameters(), (Object)typeVariable);
            return ((ParameterizedType)type2).getActualTypeArguments()[n];
        }
        return typeVariable;
    }

    private static int a(Object[] objectArray, Object object) {
        int n = objectArray.length;
        for (int i = 0; i < n; ++i) {
            if (!object.equals(objectArray[i])) continue;
            return i;
        }
        throw new NoSuchElementException();
    }

    private static Class a(TypeVariable typeVariable) {
        Object d2 = typeVariable.getGenericDeclaration();
        return d2 instanceof Class ? (Class)d2 : null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static void h(Type type) {
        ab_0.a(!(type instanceof Class) || !((Class)type).isPrimitive());
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block15: {
                break block15;
lbl1:
                // 1 sources

                return;
            }
            ac_0.field184 = 19667 ^ -21033;
            ac_0.field185 = -27177 ^ -21033;
            ac_0.d = new int[3][4];
            var5 = new String[3];
            var3_1 = 0;
            var2_2 = ",\f7)\u000b\u00b5\u008c:\u00e7\u00e1B\u00c2-\u0095%\u0013\u00ba\u00e5^\u00d4d\u00a4B\u0093F.m\u00e2\u00f9\u00e2A{I\u00ec\u009d\u00dd\u00c5RT\u0018\u00dc\u00c5H\u008b\u00f7kQE\u00d0\u00a1\u00d8^\u00b8\u0014\u00946\u00d2\u00b0\u00be\u00fd}i\u00ee\r=\u00af\u0018\u0018\u0097\\7;\u00a7\u0015\u00c4a\u00eb\u00044\\f\u0086";
            var4_3 = ",\f7)\u000b\u00b5\u008c:\u00e7\u00e1B\u00c2-\u0095%\u0013\u00ba\u00e5^\u00d4d\u00a4B\u0093F.m\u00e2\u00f9\u00e2A{I\u00ec\u009d\u00dd\u00c5RT\u0018\u00dc\u00c5H\u008b\u00f7kQE\u00d0\u00a1\u00d8^\u00b8\u0014\u00946\u00d2\u00b0\u00be\u00fd}i\u00ee\r=\u00af\u0018\u0018\u0097\\7;\u00a7\u0015\u00c4a\u00eb\u00044\\f\u0086".length();
            var1_4 = 63;
            var0_5 = -1;
lbl15:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl17:
            // 1 sources

            while (true) {
                var5[var3_1++] = new String(v0).intern();
                if ((var0_5 += var1_4) < var4_3) {
                    var1_4 = var2_2.charAt(var0_5);
                    ** continue;
                }
                break block14;
                break;
            }
            v1 = ++var0_5;
            v2 = var2_2.substring(v1, v1 + var1_4).toCharArray();
            var6_6 = 0;
            v3 = v2.length;
            v4 = v2;
            v5 = v3;
            if (v3 > 1) ** GOTO lbl68
            do {
                v6 = v4;
                v7 = v4;
                v8 = var6_6;
                while (true) {
                    v9 = v6[v8];
                    switch (var6_6 % 7) {
                        case 0: {
                            v10 = 82;
                            break;
                        }
                        case 1: {
                            v10 = 30;
                            break;
                        }
                        case 2: {
                            v10 = 101;
                            break;
                        }
                        case 3: {
                            v10 = 121;
                            break;
                        }
                        case 4: {
                            v10 = 92;
                            break;
                        }
                        case 5: {
                            v10 = 2;
                            break;
                        }
                        default: {
                            v10 = 12;
                        }
                    }
                    v6[v8] = (char)(v9 ^ v10);
                    ++var6_6;
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
            } while (v5 > var6_6);
            ** while (true)
        }
        ac_0.b = var5;
        ac_0.c = new String[3];
        ac_0.a = new Type[0];
        ** while (true)
    }
}

