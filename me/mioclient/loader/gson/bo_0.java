/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import me.mioclient.loader.gson.GSONBuilder;
import me.mioclient.loader.gson.H;
import me.mioclient.loader.gson.T;
import me.mioclient.loader.gson.V;
import me.mioclient.loader.gson.X;
import me.mioclient.loader.gson.ag_0;
import me.mioclient.loader.gson.bF;
import me.mioclient.loader.gson.cJ;
import me.mioclient.loader.gson.y_0;

/*
 * Renamed from me.mioclient.loader.gson.bo
 */
public final class bo_0
implements V {
    private final ag_0 a;
    private static final String[] b;
    private static final String[] c;
    public static final int[][] d;
    private static /* synthetic */ int field76;
    private static /* synthetic */ int field77;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public bo_0(ag_0 ag_02) {
        this.a = ag_02;
    }

    @Override
    public T a(GSONBuilder gSONBuilder, cJ cJ2) {
        Class clazz = cJ2.a();
        X x = clazz.getAnnotation(X.class);
        if (x == null) {
            return null;
        }
        return this.a(this.a, gSONBuilder, cJ2, x);
    }

    T a(ag_0 ag_02, GSONBuilder gSONBuilder, cJ cJ2, X x) {
        T t;
        Object object = ag_02.a(cJ.c(x.a())).a();
        if (object instanceof T) {
            t = (T)object;
        } else if (object instanceof V) {
            t = ((V)object).a(gSONBuilder, cJ2);
        } else if (object instanceof H || object instanceof y_0) {
            H h = object instanceof H ? (H)object : null;
            y_0 y_02 = object instanceof y_0 ? (y_0)object : null;
            t = new bF(h, y_02, gSONBuilder, cJ2, null);
        } else {
            throw new IllegalArgumentException("Invalid attempt to bind an instance of " + object.getClass().getName() + " as a @JsonAdapter for " + cJ2.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
        }
        if (t != null && x.b()) {
            t = t.a();
        }
        return t;
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
        bo_0.field76 = 1273 ^ -25851;
        bo_0.field77 = -7753 ^ -25851;
        bo_0.d = new int[1][1];
        var5 = new String[3];
        var3_1 = 0;
        var2_2 = "\u00c1\u008d\\\u00ba\u00e9\u00ba\u0014\u00ccH^\u00f4\u00ab\u0004\u00a71\u00b3\u00ac\u00c7\u00f4\u00fd?C\u00bb\u0014\u00bd\u00e6\u00ae\u00c7\u0083]\u00bb\u00d7s\u00d5\u0007\u00dd@|\u00f5\u00ef$/9\u00f4\u0015\u00a6Uf\u00cf9\u00fcp\u00c3Lq\\+k\u0093h\u00a3w>\u00c0)\u0080,:\u00d5\u00db\u00a9\u00d6\u00a7\u0097\u0089\u00e8J\u0002\u00ad\u00dc\u0086`'\u0001\u00d0^\u0013h\u0084 \u00a5\u00fc\u00e4x\u00dd\u00cd\u001b\u00a4\u00dc\u0017[\u0007\u00f3\u00e8[\u0098<%\u00b1\u0007 zB\u001d\u0088\u0097\u00c5\u001f\b8\u0010\u0087\u00ad'^\u0094\u00125\u00cf\u0003&\\@\u0014TD\u009ck\u007f>\u00ae\u00e9V\\\u00dd\u0093\u0096>>\u00d4+\nw{\u00f6v\u0013a\u00fe[t\u00e6I";
        var4_3 = "\u00c1\u008d\\\u00ba\u00e9\u00ba\u0014\u00ccH^\u00f4\u00ab\u0004\u00a71\u00b3\u00ac\u00c7\u00f4\u00fd?C\u00bb\u0014\u00bd\u00e6\u00ae\u00c7\u0083]\u00bb\u00d7s\u00d5\u0007\u00dd@|\u00f5\u00ef$/9\u00f4\u0015\u00a6Uf\u00cf9\u00fcp\u00c3Lq\\+k\u0093h\u00a3w>\u00c0)\u0080,:\u00d5\u00db\u00a9\u00d6\u00a7\u0097\u0089\u00e8J\u0002\u00ad\u00dc\u0086`'\u0001\u00d0^\u0013h\u0084 \u00a5\u00fc\u00e4x\u00dd\u00cd\u001b\u00a4\u00dc\u0017[\u0007\u00f3\u00e8[\u0098<%\u00b1\u0007 zB\u001d\u0088\u0097\u00c5\u001f\b8\u0010\u0087\u00ad'^\u0094\u00125\u00cf\u0003&\\@\u0014TD\u009ck\u007f>\u00ae\u00e9V\\\u00dd\u0093\u0096>>\u00d4+\nw{\u00f6v\u0013a\u00fe[t\u00e6I".length();
        var1_4 = 99;
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
            bo_0.b = var5;
            bo_0.c = new String[3];
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
                        v10 = 124;
                        break;
                    }
                    case 1: {
                        v10 = 3;
                        break;
                    }
                    case 2: {
                        v10 = 64;
                        break;
                    }
                    case 3: {
                        v10 = 5;
                        break;
                    }
                    case 4: {
                        v10 = 81;
                        break;
                    }
                    case 5: {
                        v10 = 33;
                        break;
                    }
                    default: {
                        v10 = 112;
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

