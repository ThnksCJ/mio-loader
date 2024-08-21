/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import me.mioclient.loader.gson.ba_0;

public abstract class UnsafeAllocator {
    private static final String[] c;
    private static final String[] d;
    public static final int[][] a;
    private static /* synthetic */ int field180;
    private static /* synthetic */ int field181;

    public abstract Object a(Class var1);

    public static UnsafeAllocator a() {
        Class<?> clazz = Class.forName("sun.misc.Unsafe");
        Field field = clazz.getDeclaredField("theUnsafe");
        field.setAccessible(true);
        Object object = field.get(null);
        Method method = clazz.getMethod("allocateInstance", Class.class);
        return new ba_0(method, object);
    }

    /*
     * Enabled aggressive block sorting
     */
    static void b(Class clazz) {
        int n = clazz.getModifiers();
        if (Modifier.isInterface(n)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + clazz.getName());
        }
        if (!Modifier.isAbstract(n)) {
            return;
        }
        throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + clazz.getName());
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block21: {
                break block21;
lbl1:
                // 1 sources

                return;
            }
            UnsafeAllocator.field180 = 16322 ^ -17243;
            UnsafeAllocator.field181 = -19413 ^ -17243;
            UnsafeAllocator.a = new int[4][3];
            var5 = new String[8];
            var3_1 = 0;
            var2_2 = "\u009d\u00be\u008bg\u0094\u0006S\u009e\u00b5\u0011@2\u0013\u00ae\u0094\u00bf\u00ef\u0095\u00b4\u00a9\u00f2@&t\u00af\u00a6\u00ea\u00e1\u00f4m\u00e6\u0083)\u00ca/\u00bbu/`$R[\u009f\u0091z\u00fbq\u00c3\u008d\\\u00c7\u00d1K\u00beu\u00a11A\u00fa\u00f9\u00b3\u00f4\u000br.vu+D\u00a4\u00d6K\u0018\u009f\t\u00e6>\u00af\u00c7@\u008d\u00dc\u00e8\u00f8\u0010]\u00e4\u00b8&\u0090x\u00f5\u00fa\u009a<<:\u001e\u00d9*(1;%\u009fRi\u001cfh\u00af\u00ceo\u008eu\u00ad[\u001d\u001f\u00d2\u00ff\u0003\u00a3u\u00e8>\u00b9\u00ec\u0004\u0010\u0092a \u00f4\u00de+\u0087S}\u000e0\u008e6\u00ef\u00cb\u0011\u00d0\u00dc \u0098\u00fb";
            var4_3 = "\u009d\u00be\u008bg\u0094\u0006S\u009e\u00b5\u0011@2\u0013\u00ae\u0094\u00bf\u00ef\u0095\u00b4\u00a9\u00f2@&t\u00af\u00a6\u00ea\u00e1\u00f4m\u00e6\u0083)\u00ca/\u00bbu/`$R[\u009f\u0091z\u00fbq\u00c3\u008d\\\u00c7\u00d1K\u00beu\u00a11A\u00fa\u00f9\u00b3\u00f4\u000br.vu+D\u00a4\u00d6K\u0018\u009f\t\u00e6>\u00af\u00c7@\u008d\u00dc\u00e8\u00f8\u0010]\u00e4\u00b8&\u0090x\u00f5\u00fa\u009a<<:\u001e\u00d9*(1;%\u009fRi\u001cfh\u00af\u00ceo\u008eu\u00ad[\u001d\u001f\u00d2\u00ff\u0003\u00a3u\u00e8>\u00b9\u00ec\u0004\u0010\u0092a \u00f4\u00de+\u0087S}\u000e0\u008e6\u00ef\u00cb\u0011\u00d0\u00dc \u0098\u00fb".length();
            var1_4 = 11;
            var0_5 = -1;
lbl15:
            // 2 sources

            while (true) {
                v0 = ++var0_5;
                v1 = var2_2.substring(v0, v0 + var1_4);
                v2 = -1;
                break block20;
                break;
            }
lbl21:
            // 1 sources

            while (true) {
                var5[var3_1++] = v3.intern();
                if ((var0_5 += var1_4) < var4_3) {
                    var1_4 = var2_2.charAt(var0_5);
                    ** continue;
                }
                var2_2 = "\"\u00c0\u00db\u00dd\u00a7\u00c0Q\u001dR\u0015\u00ff<\u00c4\u00ea\u0092\u0010\u00f2\u0019\u0093\u009d\u00e2\u00a91?\u00de\u00ac\u00f8P\u009a\u0088_\u009c";
                var4_3 = "\"\u00c0\u00db\u00dd\u00a7\u00c0Q\u001dR\u0015\u00ff<\u00c4\u00ea\u0092\u0010\u00f2\u0019\u0093\u009d\u00e2\u00a91?\u00de\u00ac\u00f8P\u009a\u0088_\u009c".length();
                var1_4 = 15;
                var0_5 = -1;
lbl31:
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
lbl36:
            // 1 sources

            while (true) {
                var5[var3_1++] = v3.intern();
                if ((var0_5 += var1_4) < var4_3) {
                    var1_4 = var2_2.charAt(var0_5);
                    ** continue;
                }
                UnsafeAllocator.c = var5;
                UnsafeAllocator.d = new String[8];
                ** continue;
                break;
            }
        }
        v5 = v1.toCharArray();
        var6_6 = 0;
        v6 = v5.length;
        v7 = v5;
        v8 = v6;
        if (v6 > 1) ** GOTO lbl88
        do {
            v9 = v7;
            v10 = v7;
            v11 = var6_6;
            while (true) {
                v12 = v9[v11];
                switch (var6_6 % 7) {
                    case 0: {
                        v13 = 109;
                        break;
                    }
                    case 1: {
                        v13 = 97;
                        break;
                    }
                    case 2: {
                        v13 = 65;
                        break;
                    }
                    case 3: {
                        v13 = 28;
                        break;
                    }
                    case 4: {
                        v13 = 58;
                        break;
                    }
                    case 5: {
                        v13 = 122;
                        break;
                    }
                    default: {
                        v13 = 81;
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
lbl88:
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
lbl97:
            // 1 sources

            ** continue;
        }
    }
}

