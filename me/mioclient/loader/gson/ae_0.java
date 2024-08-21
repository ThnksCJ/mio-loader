/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import me.mioclient.loader.gson.ab_0;
import me.mioclient.loader.gson.ac_0;

/*
 * Renamed from me.mioclient.loader.gson.ae
 */
final class ae_0
implements Serializable,
ParameterizedType {
    private final Type a;
    private final Type b;
    private final Type[] c;
    private static final long d;
    private static final String e;
    private static final long f;
    public static final int[][] g;
    private static /* synthetic */ int field12;
    private static /* synthetic */ int field13;

    /*
     * Enabled aggressive block sorting
     */
    public ae_0(Type type, Type type2, Type ... typeArray) {
        int n;
        if (type2 instanceof Class) {
            Class clazz = (Class)type2;
            n = Modifier.isStatic(clazz.getModifiers()) || clazz.getEnclosingClass() == null ? 1 : 0;
            ab_0.a(type != null || n != 0);
        }
        this.a = type == null ? null : ac_0.d(type);
        this.b = ac_0.d(type2);
        this.c = (Type[])typeArray.clone();
        int n2 = 0;
        n = this.c.length;
        while (n2 < n) {
            ab_0.a(this.c[n2]);
            ac_0.h(this.c[n2]);
            this.c[n2] = ac_0.d(this.c[n2]);
            ++n2;
        }
        return;
    }

    @Override
    public Type[] getActualTypeArguments() {
        return (Type[])this.c.clone();
    }

    @Override
    public Type getRawType() {
        return this.b;
    }

    @Override
    public Type getOwnerType() {
        return this.a;
    }

    public boolean equals(Object object) {
        return object instanceof ParameterizedType && ac_0.a((Type)this, (ParameterizedType)object);
    }

    public int hashCode() {
        return Arrays.hashCode(this.c) ^ this.b.hashCode() ^ ac_0.a((Object)this.a);
    }

    public String toString() {
        int n = this.c.length;
        if (n == 0) {
            return ac_0.f(this.b);
        }
        StringBuilder stringBuilder = new StringBuilder((int)f * (n + 1));
        stringBuilder.append(ac_0.f(this.b)).append("<").append(ac_0.f(this.c[0]));
        for (int i = 1; i < n; ++i) {
            stringBuilder.append(e).append(ac_0.f(this.c[i]));
        }
        return stringBuilder.append(">").toString();
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n;
            int n2;
            char[] cArray2;
            int n3;
            block11: {
                field12 = 0x3951 ^ 0xFFFFBBE7;
                field13 = 0xFFFF8542 ^ 0xFFFFBBE7;
                g = new int[3][1];
                d = 0L;
                char[] cArray3 = "K9".toCharArray();
                n3 = 0;
                int n4 = cArray3.length;
                cArray2 = cArray3;
                n2 = n4;
                if (n4 <= 1) break block11;
                cArray = cArray2;
                n = n2;
                if (n2 <= n3) break block12;
            }
            do {
                char[] cArray4 = cArray2;
                char[] cArray5 = cArray2;
                int n5 = n3;
                while (true) {
                    char c = cArray4[n5];
                    cArray4[n5] = (char)(c ^ (switch (n3 % 7) {
                        case 0 -> 103;
                        case 1 -> 25;
                        case 2 -> 21;
                        case 3 -> 126;
                        case 4 -> 22;
                        case 5 -> 72;
                        default -> 106;
                    }));
                    ++n3;
                    cArray2 = cArray5;
                    n2 = n2;
                    if (n2 != 0) break;
                    cArray5 = cArray2;
                    n = n2;
                    n5 = n2;
                    cArray4 = cArray2;
                }
                cArray = cArray2;
                n = n2;
            } while (n2 > n3);
        }
        e = new String(cArray).intern();
        long l = 6181006353275375848L;
        f = 0x42729C90A96950F6L ^ l;
    }
}

