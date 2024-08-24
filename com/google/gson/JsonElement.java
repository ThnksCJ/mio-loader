/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.B;
import com.google.gson.F;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.aW;
import com.google.gson.cO;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class JsonElement {
    private static final String[] b;
    private static final String[] c;
    public static final int[][] a;
    private static /* synthetic */ int field30;
    private static /* synthetic */ int field31;

    public abstract JsonElement p();

    public boolean q() {
        return this instanceof JsonArray;
    }

    public boolean r() {
        return this instanceof JsonObject;
    }

    public boolean s() {
        return this instanceof F;
    }

    public boolean t() {
        return this instanceof B;
    }

    public JsonObject u() {
        if (this.r()) {
            return (JsonObject)this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public JsonArray v() {
        if (this.q()) {
            return (JsonArray)this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public F w() {
        if (this.s()) {
            return (F)this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public B x() {
        if (this.t()) {
            return (B)this;
        }
        throw new IllegalStateException("Not a JSON Null: " + this);
    }

    public boolean o() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public Number d() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public String e() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public double f() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public float i() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public long j() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public int k() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public byte l() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public char m() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public BigDecimal g() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public BigInteger h() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public short n() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public String toString() {
        StringWriter stringWriter = new StringWriter();
        cO cO2 = new cO(stringWriter);
        cO2.b(true);
        aW.a(this, cO2);
        return stringWriter.toString();
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
            JsonElement.field30 = 854 ^ -17779;
            JsonElement.field31 = -11646 ^ -17779;
            JsonElement.a = new int[4][4];
            var5 = new String[4];
            var3_1 = 0;
            var2_2 = "\u00f7\u00ae\u001b\u00f6S\u0010!\u00a2P5\r\u00cb=.-\u00b8\u00c4\u00e0\u0013\u0099\u00cd\u00d6\u009a\u00ea\u009d\u0016\u0013\u00b6\u0003\u00d1\u0003\u00b6\u00e0J`\u00e2\u00b8-";
            var4_3 = "\u00f7\u00ae\u001b\u00f6S\u0010!\u00a2P5\r\u00cb=.-\u00b8\u00c4\u00e0\u0013\u0099\u00cd\u00d6\u009a\u00ea\u009d\u0016\u0013\u00b6\u0003\u00d1\u0003\u00b6\u00e0J`\u00e2\u00b8-".length();
            var1_4 = 18;
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
                var2_2 = "\u001e\u0012&a\u00f4\u00e2\u00d5\u00fc\u00ce\u00fe\u00de\u00bd@\u0010h\u00e1\u00da\u0016+\u00f2\u0080} aO\u008c\u009d\u00f0\u00b4b\n3\u00c7sZ\u00c2l\u00b3CH";
                var4_3 = "\u001e\u0012&a\u00f4\u00e2\u00d5\u00fc\u00ce\u00fe\u00de\u00bd@\u0010h\u00e1\u00da\u0016+\u00f2\u0080} aO\u008c\u009d\u00f0\u00b4b\n3\u00c7sZ\u00c2l\u00b3CH".length();
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
                JsonElement.b = var5;
                JsonElement.c = new String[4];
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
                        v13 = 18;
                        break;
                    }
                    case 1: {
                        v13 = 53;
                        break;
                    }
                    case 2: {
                        v13 = 84;
                        break;
                    }
                    case 3: {
                        v13 = 39;
                        break;
                    }
                    case 4: {
                        v13 = 33;
                        break;
                    }
                    case 5: {
                        v13 = 46;
                        break;
                    }
                    default: {
                        v13 = 104;
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

