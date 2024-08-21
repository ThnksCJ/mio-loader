/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import me.mioclient.loader.gson.cy;

final class cz
extends cy {
    private static Class a;
    private final Object b = cz.b();
    private final Field c = cz.c();
    private static final String[] d;
    private static final String[] e;
    public static final int[][] f;
    private static /* synthetic */ int field240;
    private static /* synthetic */ int field241;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    cz() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(AccessibleObject accessibleObject) {
        boolean bl2 = this.b(accessibleObject);
        if (bl2) {
            return;
        }
        accessibleObject.setAccessible(true);
    }

    boolean b(AccessibleObject accessibleObject) {
        if (this.b != null && this.c != null) {
            Method method = a.getMethod("objectFieldOffset", Field.class);
            long l = (Long)method.invoke(this.b, this.c);
            Method method2 = a.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE);
            method2.invoke(this.b, accessibleObject, l, true);
            return true;
        }
        return false;
    }

    private static Object b() {
        a = Class.forName("sun.misc.Unsafe");
        Field field = a.getDeclaredField("theUnsafe");
        field.setAccessible(true);
        return field.get(null);
    }

    private static Field c() {
        return AccessibleObject.class.getDeclaredField("override");
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
            cz.field240 = 16320 ^ -16034;
            cz.field241 = -15263 ^ -16034;
            cz.f = new int[1][1];
            var5 = new String[4];
            var3_1 = 0;
            var2_2 = "\u0082\u00d1\u00ba\u008f;\u00da\u00dfY\b\u00beH\u00d65\u00caI\u000f\u00a7\u00cc\u00b4O\u00ef\u00a1\u00ad\u00d1[Y\u0012\u0010AT\u00da\u00eez\u0010K\r\u0086\u00ec\u00a0?\u001f\u000f\u0007\u00a5\u009dxs-\u00f6\u0003\u00da\u00d5\u0098\u00c3\u00cc.d\u00a1\u00de\u0094\u00f7\u0006\\g\u00af\u008c<\u00fb\u00d3\u00fdG\u0090m\u00af\u00ae\u00c5\u00e9HS\u00c3\u00af\u00da\u00f1\u00e9fl\u00a0\u00d2\u00ba\u00a8yaA\u00a2\u00ef?\u00bc\u00e15\u001ft\u00ce+\u0003)\u000fH\u0007\u00c4\u00bc\u00adE\u00b7\u00c3\u00aa[\u00daTh\u00ca\u00b7-i)}sHA\u0001\u0095q\u009fy\u00fe&k\u00aa \u00e5\u00a3\u00c7\u00c1\u00c3\u001d\th\u001b\u0014\u00ff\u00c9\u0098\b\u00104\u00ac";
            var4_3 = "\u0082\u00d1\u00ba\u008f;\u00da\u00dfY\b\u00beH\u00d65\u00caI\u000f\u00a7\u00cc\u00b4O\u00ef\u00a1\u00ad\u00d1[Y\u0012\u0010AT\u00da\u00eez\u0010K\r\u0086\u00ec\u00a0?\u001f\u000f\u0007\u00a5\u009dxs-\u00f6\u0003\u00da\u00d5\u0098\u00c3\u00cc.d\u00a1\u00de\u0094\u00f7\u0006\\g\u00af\u008c<\u00fb\u00d3\u00fdG\u0090m\u00af\u00ae\u00c5\u00e9HS\u00c3\u00af\u00da\u00f1\u00e9fl\u00a0\u00d2\u00ba\u00a8yaA\u00a2\u00ef?\u00bc\u00e15\u001ft\u00ce+\u0003)\u000fH\u0007\u00c4\u00bc\u00adE\u00b7\u00c3\u00aa[\u00daTh\u00ca\u00b7-i)}sHA\u0001\u0095q\u009fy\u00fe&k\u00aa \u00e5\u00a3\u00c7\u00c1\u00c3\u001d\th\u001b\u0014\u00ff\u00c9\u0098\b\u00104\u00ac".length();
            var1_4 = 32;
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
                var2_2 = "#\u00e6\u00a6Q^|qd\u00d8\u008ep\u00b1k\u0005\u00ccr\u00da\na\u00a1\fk\u00da\u00e3F\u00e3U\u00f1";
                var4_3 = "#\u00e6\u00a6Q^|qd\u00d8\u008ep\u00b1k\u0005\u00ccr\u00da\na\u00a1\fk\u00da\u00e3F\u00e3U\u00f1".length();
                var1_4 = 17;
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
                cz.d = var5;
                cz.e = new String[4];
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
                        v13 = 49;
                        break;
                    }
                    case 1: {
                        v13 = 94;
                        break;
                    }
                    case 2: {
                        v13 = 12;
                        break;
                    }
                    case 3: {
                        v13 = 13;
                        break;
                    }
                    case 4: {
                        v13 = 79;
                        break;
                    }
                    case 5: {
                        v13 = 74;
                        break;
                    }
                    default: {
                        v13 = 26;
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

