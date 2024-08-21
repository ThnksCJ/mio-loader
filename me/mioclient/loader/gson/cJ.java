/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;
import me.mioclient.loader.gson.ab_0;
import me.mioclient.loader.gson.ac_0;

public class cJ {
    final Class a;
    final Type b;
    final int c;
    private static final String[] d;
    private static final String[] e;
    private static final long f;
    public static final int[][] g;
    private static /* synthetic */ int field216;
    private static /* synthetic */ int field217;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected cJ() {
        this.b = cJ.a(this.getClass());
        this.a = ac_0.e(this.b);
        this.c = this.b.hashCode();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    cJ(Type type) {
        this.b = ac_0.d((Type)ab_0.a(type));
        this.a = ac_0.e(this.b);
        this.c = this.b.hashCode();
    }

    static Type a(Class clazz) {
        Type type = clazz.getGenericSuperclass();
        if (type instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        ParameterizedType parameterizedType = (ParameterizedType)type;
        return ac_0.d(parameterizedType.getActualTypeArguments()[0]);
    }

    public final Class a() {
        return this.a;
    }

    public final Type b() {
        return this.b;
    }

    public boolean b(Class clazz) {
        return this.a(clazz);
    }

    public boolean a(Type type) {
        if (type == null) {
            return false;
        }
        if (this.b.equals(type)) {
            return true;
        }
        if (this.b instanceof Class) {
            return this.a.isAssignableFrom(ac_0.e(type));
        }
        if (this.b instanceof ParameterizedType) {
            return cJ.a(type, (ParameterizedType)this.b, new HashMap());
        }
        if (this.b instanceof GenericArrayType) {
            return this.a.isAssignableFrom(ac_0.e(type)) && cJ.a(type, (GenericArrayType)this.b);
        }
        throw cJ.a(this.b, Class.class, ParameterizedType.class, GenericArrayType.class);
    }

    public boolean a(cJ cJ2) {
        return this.a(cJ2.b());
    }

    private static boolean a(Type clazz, GenericArrayType genericArrayType) {
        Type type = genericArrayType.getGenericComponentType();
        if (type instanceof ParameterizedType) {
            Class<?> clazz2 = clazz;
            if (clazz instanceof GenericArrayType) {
                clazz2 = ((GenericArrayType)((Object)clazz)).getGenericComponentType();
            } else if (clazz instanceof Class) {
                Class<?> clazz3 = clazz;
                while (clazz3.isArray()) {
                    clazz3 = clazz3.getComponentType();
                }
                clazz2 = clazz3;
            }
            return cJ.a((Type)clazz2, (ParameterizedType)type, new HashMap());
        }
        return true;
    }

    private static boolean a(Type type, ParameterizedType parameterizedType, Map map) {
        if (type == null) {
            return false;
        }
        if (parameterizedType.equals(type)) {
            return true;
        }
        Class clazz = ac_0.e(type);
        ParameterizedType parameterizedType2 = null;
        if (type instanceof ParameterizedType) {
            parameterizedType2 = (ParameterizedType)type;
        }
        if (parameterizedType2 != null) {
            Type[] object = parameterizedType2.getActualTypeArguments();
            TypeVariable<Class<T>>[] typeVariableArray = clazz.getTypeParameters();
            for (int i = 0; i < object.length; ++i) {
                Type type2 = object[i];
                TypeVariable typeVariable = typeVariableArray[i];
                while (type2 instanceof TypeVariable) {
                    TypeVariable typeVariable2 = (TypeVariable)type2;
                    type2 = (Type)map.get(typeVariable2.getName());
                }
                map.put(typeVariable.getName(), type2);
            }
            if (cJ.a(parameterizedType2, parameterizedType, map)) {
                return true;
            }
        }
        for (Type type2 : clazz.getGenericInterfaces()) {
            if (!cJ.a(type2, parameterizedType, new HashMap(map))) continue;
            return true;
        }
        Type type3 = clazz.getGenericSuperclass();
        return cJ.a(type3, parameterizedType, new HashMap(map));
    }

    private static boolean a(ParameterizedType parameterizedType, ParameterizedType parameterizedType2, Map map) {
        if (parameterizedType.getRawType().equals(parameterizedType2.getRawType())) {
            Type[] typeArray = parameterizedType.getActualTypeArguments();
            Type[] typeArray2 = parameterizedType2.getActualTypeArguments();
            for (int i = 0; i < typeArray.length; ++i) {
                if (cJ.a(typeArray[i], typeArray2[i], map)) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    private static AssertionError a(Type type, Class ... classArray) {
        StringBuilder stringBuilder = new StringBuilder("Unexpected type. Expected one of: ");
        for (Class clazz : classArray) {
            stringBuilder.append(clazz.getName()).append(", ");
        }
        stringBuilder.append("but got: ").append(type.getClass().getName()).append(", for type token: ").append(type.toString()).append((char)f);
        return new AssertionError((Object)stringBuilder.toString());
    }

    private static boolean a(Type type, Type type2, Map map) {
        return type2.equals(type) || type instanceof TypeVariable && type2.equals(map.get(((TypeVariable)type).getName()));
    }

    public final int hashCode() {
        return this.c;
    }

    public final boolean equals(Object object) {
        return object instanceof cJ && ac_0.a(this.b, ((cJ)object).b);
    }

    public final String toString() {
        return ac_0.f(this.b);
    }

    public static cJ b(Type type) {
        return new cJ(type);
    }

    public static cJ c(Class clazz) {
        return new cJ(clazz);
    }

    public static cJ a(Type type, Type ... typeArray) {
        return new cJ(ac_0.a(null, type, typeArray));
    }

    public static cJ c(Type type) {
        return new cJ(ac_0.a(type));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block22: {
                block21: {
                    block23: {
                        break block23;
lbl1:
                        // 1 sources

                        return;
                    }
                    cJ.field216 = 27152 ^ -28004;
                    cJ.field217 = -23326 ^ -28004;
                    cJ.g = new int[1][1];
                    var7 = new String[5];
                    var5_1 = 0;
                    var4_2 = "\u00a6\u0002\u001e\u00da\u00d8d\f-x\u0093\u0080\f\u00c6O\u00c3\u00f2\u008e\f\u00176ETN='\u00db\u009b\u00f7+\u00a5\u0095wTW\u00f5\u00c3>\u0093\u00ee\u0081\u00a9\u00a4\u0002\u00d4&";
                    var6_3 = "\u00a6\u0002\u001e\u00da\u00d8d\f-x\u0093\u0080\f\u00c6O\u00c3\u00f2\u008e\f\u00176ETN='\u00db\u009b\u00f7+\u00a5\u0095wTW\u00f5\u00c3>\u0093\u00ee\u0081\u00a9\u00a4\u0002\u00d4&".length();
                    var3_4 = 18;
                    var2_5 = -1;
lbl15:
                    // 2 sources

                    while (true) {
                        v0 = ++var2_5;
                        v1 = var4_2.substring(v0, v0 + var3_4);
                        v2 = -1;
                        break block21;
                        break;
                    }
lbl21:
                    // 1 sources

                    while (true) {
                        var7[var5_1++] = v3.intern();
                        if ((var2_5 += var3_4) < var6_3) {
                            var3_4 = var4_2.charAt(var2_5);
                            ** continue;
                        }
                        var4_2 = "=\u0085\u00f8\u009aA\u0085\u0088\u00f4\u00b8\"\u00dd\u0082$Z\u00fe\u00c4\u009d\u00d9\u00aa\u00a0mKm\u00bcb\u00b4\u00a0\u00e9\u008b=<FI\u00a7f\u00de\u00d6\u00ce\u00c1)\u009b\u00b6\b\u00c1";
                        var6_3 = "=\u0085\u00f8\u009aA\u0085\u0088\u00f4\u00b8\"\u00dd\u0082$Z\u00fe\u00c4\u009d\u00d9\u00aa\u00a0mKm\u00bcb\u00b4\u00a0\u00e9\u008b=<FI\u00a7f\u00de\u00d6\u00ce\u00c1)\u009b\u00b6\b\u00c1".length();
                        var3_4 = 9;
                        var2_5 = -1;
lbl31:
                        // 2 sources

                        while (true) {
                            v4 = ++var2_5;
                            v1 = var4_2.substring(v4, v4 + var3_4);
                            v2 = 0;
                            break block21;
                            break;
                        }
                        break;
                    }
lbl36:
                    // 1 sources

                    while (true) {
                        var7[var5_1++] = v3.intern();
                        if ((var2_5 += var3_4) < var6_3) {
                            var3_4 = var4_2.charAt(var2_5);
                            ** continue;
                        }
                        break block22;
                        break;
                    }
                }
                v5 = v1.toCharArray();
                var8_6 = 0;
                v6 = v5.length;
                v7 = v5;
                v8 = v6;
                if (v6 > 1) ** GOTO lbl86
                do {
                    v9 = v7;
                    v10 = v7;
                    v11 = var8_6;
                    while (true) {
                        v12 = v9[v11];
                        switch (var8_6 % 7) {
                            case 0: {
                                v13 = 18;
                                break;
                            }
                            case 1: {
                                v13 = 52;
                                break;
                            }
                            case 2: {
                                v13 = 71;
                                break;
                            }
                            case 3: {
                                v13 = 87;
                                break;
                            }
                            case 4: {
                                v13 = 43;
                                break;
                            }
                            case 5: {
                                v13 = 119;
                                break;
                            }
                            default: {
                                v13 = 58;
                            }
                        }
                        v9[v11] = (char)(v12 ^ v13);
                        ++var8_6;
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
                } while (v8 > var8_6);
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
            cJ.d = var7;
            cJ.e = new String[5];
            break block24;
lbl100:
            // 1 sources

            while (true) {
                cJ.f = 9076786272988667948L ^ var0_7;
                ** continue;
                break;
            }
        }
        var0_7 = 660712197648916482L;
        ** while (true)
    }
}

