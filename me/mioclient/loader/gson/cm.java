/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import me.mioclient.loader.gson.J;
import me.mioclient.loader.gson.JsonReader;
import me.mioclient.loader.gson.T;
import me.mioclient.loader.gson.cO;
import me.mioclient.loader.gson.cl_0;

class cm
extends T {
    final /* synthetic */ Class a;
    final /* synthetic */ cl_0 b;
    private static final String[] c;
    private static final String[] d;
    public static final int[][] e;
    private static /* synthetic */ int field74;
    private static /* synthetic */ int field75;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    cm(cl_0 cl_02, Class clazz) {
        this.b = cl_02;
        this.a = clazz;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(cO cO2, Object object) {
        this.b.b.a(cO2, object);
    }

    @Override
    public Object b(JsonReader jsonReader) {
        Object object = this.b.b.b(jsonReader);
        if (object != null && !this.a.isInstance(object)) {
            throw new J("Expected a " + this.a.getName() + " but was " + object.getClass().getName());
        }
        return object;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            break block14;
lbl1:
            // 1 sources

            return;
        }
        cm.field74 = 29487 ^ -14071;
        cm.field75 = -28455 ^ -14071;
        cm.e = new int[4][3];
        var5 = new String[2];
        var3_1 = 0;
        var2_2 = "\u00f2{U\u00a4\u0018\t\f\u00e0g\u000b\u00b8d\u00d0\u000fNL\u00e9<_T~";
        var4_3 = "\u00f2{U\u00a4\u0018\t\f\u00e0g\u000b\u00b8d\u00d0\u000fNL\u00e9<_T~".length();
        var1_4 = 9;
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
            cm.c = var5;
            cm.d = new String[2];
            ** continue;
            break;
        }
        v1 = ++var0_5;
        v2 = var2_2.substring(v1, v1 + var1_4).toCharArray();
        var6_6 = 0;
        v3 = v2.length;
        v4 = v2;
        v5 = v3;
        if (v3 > 1) ** GOTO lbl70
        do {
            v6 = v4;
            v7 = v4;
            v8 = var6_6;
            while (true) {
                v9 = v6[v8];
                switch (var6_6 % 7) {
                    case 0: {
                        v10 = 72;
                        break;
                    }
                    case 1: {
                        v10 = 78;
                        break;
                    }
                    case 2: {
                        v10 = 83;
                        break;
                    }
                    case 3: {
                        v10 = 88;
                        break;
                    }
                    case 4: {
                        v10 = 35;
                        break;
                    }
                    case 5: {
                        v10 = 27;
                        break;
                    }
                    default: {
                        v10 = 46;
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
lbl70:
            // 2 sources

            v0 = v4;
            v11 = v5;
        } while (v5 > var6_6);
        ** while (true)
    }
}

