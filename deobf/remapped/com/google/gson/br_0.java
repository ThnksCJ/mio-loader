/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.B;
import com.google.gson.F;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.bs_0;
import com.google.gson.cO;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from com.google.gson.br
 */
public final class br_0
extends cO {
    private static final Writer a;
    private static final F b;
    private final List c = new ArrayList();
    private String d;
    private JsonElement e = B.a;
    private static final String[] n;
    private static final String[] o;
    public static final int[][] f;
    private static /* synthetic */ int field172;
    private static /* synthetic */ int field173;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public br_0() {
        super(a);
    }

    public JsonElement a() {
        if (!this.c.isEmpty()) {
            throw new IllegalStateException("Expected one JSON element but was " + this.c);
        }
        return this.e;
    }

    private JsonElement j() {
        return (JsonElement)this.c.get(this.c.size() - 1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void a(JsonElement jsonElement) {
        if (this.d != null) {
            if (!jsonElement.t() || this.i()) {
                JsonObject jsonObject = (JsonObject)this.j();
                jsonObject.a(this.d, jsonElement);
            }
            this.d = null;
            return;
        }
        if (this.c.isEmpty()) {
            this.e = jsonElement;
            return;
        }
        JsonElement jsonElement2 = this.j();
        if (!(jsonElement2 instanceof JsonArray)) throw new IllegalStateException();
        ((JsonArray)jsonElement2).a(jsonElement);
    }

    @Override
    public cO b() {
        JsonArray jsonArray = new JsonArray();
        this.a(jsonArray);
        this.c.add(jsonArray);
        return this;
    }

    @Override
    public cO c() {
        if (this.c.isEmpty() || this.d != null) {
            throw new IllegalStateException();
        }
        JsonElement jsonElement = this.j();
        if (jsonElement instanceof JsonArray) {
            this.c.remove(this.c.size() - 1);
            return this;
        }
        throw new IllegalStateException();
    }

    @Override
    public cO d() {
        JsonObject jsonObject = new JsonObject();
        this.a(jsonObject);
        this.c.add(jsonObject);
        return this;
    }

    @Override
    public cO e() {
        if (this.c.isEmpty() || this.d != null) {
            throw new IllegalStateException();
        }
        JsonElement jsonElement = this.j();
        if (jsonElement instanceof JsonObject) {
            this.c.remove(this.c.size() - 1);
            return this;
        }
        throw new IllegalStateException();
    }

    @Override
    public cO a(String string) {
        if (string == null) {
            throw new NullPointerException("name == null");
        }
        if (this.c.isEmpty() || this.d != null) {
            throw new IllegalStateException();
        }
        JsonElement jsonElement = this.j();
        if (jsonElement instanceof JsonObject) {
            this.d = string;
            return this;
        }
        throw new IllegalStateException();
    }

    @Override
    public cO b(String string) {
        if (string == null) {
            return this.f();
        }
        this.a(new F(string));
        return this;
    }

    @Override
    public cO f() {
        this.a(B.a);
        return this;
    }

    @Override
    public cO a(boolean bl2) {
        this.a(new F(bl2));
        return this;
    }

    @Override
    public cO a(Boolean bl2) {
        if (bl2 == null) {
            return this.f();
        }
        this.a(new F(bl2));
        return this;
    }

    @Override
    public cO a(double d2) {
        if (!this.g() && (Double.isNaN(d2) || Double.isInfinite(d2))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d2);
        }
        this.a(new F(d2));
        return this;
    }

    @Override
    public cO a(long l) {
        this.a(new F(l));
        return this;
    }

    @Override
    public cO a(Number number) {
        double d2;
        if (number == null) {
            return this.f();
        }
        if (!this.g() && (Double.isNaN(d2 = number.doubleValue()) || Double.isInfinite(d2))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
        }
        this.a(new F(number));
        return this;
    }

    @Override
    public void flush() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void close() {
        if (!this.c.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.c.add(b);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block22: {
                    break block22;
lbl1:
                    // 1 sources

                    return;
                }
                br_0.field172 = 463 ^ -28671;
                br_0.field173 = -31718 ^ -28671;
                br_0.f = new int[1][2];
                var5 = new String[6];
                var3_1 = 0;
                var2_2 = "\u00c7\u00af\u00cf>Ef\u0094S\u0014Dt\u0085\u0006\u0094\u00c2=N\u00fd\u00b9\u00d6\u00c3\u001cT\u00da\u00fc\u00a5\u00f2\u00144{\u00ca ^\u0013D6\u00f0\u00b6Fd\u0013\u00d0\u0091\u00cdT.\u00819\u0080#\u00d5v=\f\u00e4\u00a5) \u00ff\u00b0\u0091\u00eb\u00a0Wgg!9a\u0010\u00e7\u00be]\u00eb4\u00fb\u00a8\u0089\u0018\u00b9'5K\u00b03f\u000f8'+\u00bd\u0013I\u000f\u0089\u008b\u00c8=V\u00a0";
                var4_3 = "\u00c7\u00af\u00cf>Ef\u0094S\u0014Dt\u0085\u0006\u0094\u00c2=N\u00fd\u00b9\u00d6\u00c3\u001cT\u00da\u00fc\u00a5\u00f2\u00144{\u00ca ^\u0013D6\u00f0\u00b6Fd\u0013\u00d0\u0091\u00cdT.\u00819\u0080#\u00d5v=\f\u00e4\u00a5) \u00ff\u00b0\u0091\u00eb\u00a0Wgg!9a\u0010\u00e7\u00be]\u00eb4\u00fb\u00a8\u0089\u0018\u00b9'5K\u00b03f\u000f8'+\u00bd\u0013I\u000f\u0089\u008b\u00c8=V\u00a0".length();
                var1_4 = 33;
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
                    var2_2 = "a\"\u00ca\u00ea~\u00a0\u00d2\u00cd\u00d5ELuJZya#\u0016\u00bc\u00caL\u0092C\u0087iI\u00f5\u000f\u00a3|\u0082v\u0080\u00e3\u0006\u0019\u00b78\u00d8\u00da\"";
                    var4_3 = "a\"\u00ca\u00ea~\u00a0\u00d2\u00cd\u00d5ELuJZya#\u0016\u00bc\u00caL\u0092C\u0087iI\u00f5\u000f\u00a3|\u0082v\u0080\u00e3\u0006\u0019\u00b78\u00d8\u00da\"".length();
                    var1_4 = 34;
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
                    break block21;
                    break;
                }
            }
            v5 = v1.toCharArray();
            var6_6 = 0;
            v6 = v5.length;
            v7 = v5;
            v8 = v6;
            if (v6 > 1) ** GOTO lbl86
            do {
                v9 = v7;
                v10 = v7;
                v11 = var6_6;
                while (true) {
                    v12 = v9[v11];
                    switch (var6_6 % 7) {
                        case 0: {
                            v13 = 11;
                            break;
                        }
                        case 1: {
                            v13 = 109;
                            break;
                        }
                        case 2: {
                            v13 = 26;
                            break;
                        }
                        case 3: {
                            v13 = 17;
                            break;
                        }
                        case 4: {
                            v13 = 121;
                            break;
                        }
                        case 5: {
                            v13 = 98;
                            break;
                        }
                        default: {
                            v13 = 88;
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
lbl86:
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
lbl95:
                // 1 sources

                ** continue;
            }
        }
        br_0.n = var5;
        br_0.o = new String[6];
        br_0.a = new bs_0();
        br_0.b = new F("closed");
        ** while (true)
    }
}

