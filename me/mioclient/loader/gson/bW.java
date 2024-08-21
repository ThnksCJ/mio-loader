/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.util.BitSet;
import me.mioclient.loader.gson.J;
import me.mioclient.loader.gson.JsonReader;
import me.mioclient.loader.gson.JsonToken;
import me.mioclient.loader.gson.T;
import me.mioclient.loader.gson.cO;
import me.mioclient.loader.gson.cn;

class bW
extends T {
    private static final String[] a;
    private static final String[] b;
    public static final int[][] c;
    private static /* synthetic */ int field74;
    private static /* synthetic */ int field75;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    bW() {
    }

    public BitSet a(JsonReader jsonReader) {
        BitSet bitSet = new BitSet();
        jsonReader.beginArray();
        int n = 0;
        JsonToken jsonToken = jsonReader.peek();
        while (jsonToken != JsonToken.b) {
            if (switch (cn.a[jsonToken.ordinal()]) {
                case 1 -> jsonReader.m() != 0;
                case 2 -> jsonReader.i();
                case 3 -> {
                    String var6_6 = jsonReader.h();
                    yield Integer.parseInt(var6_6) != 0;
                }
                default -> throw new J("Invalid bitset value type: " + (Object)((Object)jsonToken));
            }) {
                bitSet.set(n);
            }
            ++n;
            jsonToken = jsonReader.peek();
        }
        jsonReader.endArray();
        return bitSet;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(cO cO2, BitSet bitSet) {
        cO2.b();
        int n = bitSet.length();
        for (int i = 0; i < n; ++i) {
            int n2 = bitSet.get(i) ? 1 : 0;
            cO2.a((long)n2);
        }
        cO2.c();
    }

    @Override
    public /* synthetic */ Object b(JsonReader jsonReader) {
        return this.a(jsonReader);
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
        bW.field74 = 3 ^ -4261;
        bW.field75 = -23536 ^ -4261;
        bW.c = new int[3][3];
        var5 = new String[2];
        var3_1 = 0;
        var2_2 = "\u0086\u0000\u00ee\u00bb\u00e5cnx\u00faj|\u0096 \u00ec\u009d\u00ac\u00de8\u000f\u00b3M\u00bbI\u00d5c\u0012\u00b55Tx=%\u0005,\u00eb\u00cd\u009c\f\u00f8p\u0092?\u00b6yg\u00fd\u001f\u00c2\u00ee\u001f\u00ff\u00a2o,\u008c\u001cX\u009b\u007f\u00e3I\t\u00aail\u00fe\u0015&\u0093\u00a4\u009b$A\u00d1+A\u00c9\u00b4;'\u00d6";
        var4_3 = "\u0086\u0000\u00ee\u00bb\u00e5cnx\u00faj|\u0096 \u00ec\u009d\u00ac\u00de8\u000f\u00b3M\u00bbI\u00d5c\u0012\u00b55Tx=%\u0005,\u00eb\u00cd\u009c\f\u00f8p\u0092?\u00b6yg\u00fd\u001f\u00c2\u00ee\u001f\u00ff\u00a2o,\u008c\u001cX\u009b\u007f\u00e3I\t\u00aail\u00fe\u0015&\u0093\u00a4\u009b$A\u00d1+A\u00c9\u00b4;'\u00d6".length();
        var1_4 = 27;
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
            bW.a = var5;
            bW.b = new String[2];
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
                        v10 = 58;
                        break;
                    }
                    case 1: {
                        v10 = 83;
                        break;
                    }
                    case 2: {
                        v10 = 111;
                        break;
                    }
                    case 3: {
                        v10 = 19;
                        break;
                    }
                    case 4: {
                        v10 = 1;
                        break;
                    }
                    case 5: {
                        v10 = 82;
                        break;
                    }
                    default: {
                        v10 = 119;
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

