/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import me.mioclient.loader.gson.B;
import me.mioclient.loader.gson.C;
import me.mioclient.loader.gson.F;
import me.mioclient.loader.gson.JsonArray;
import me.mioclient.loader.gson.JsonElement;
import me.mioclient.loader.gson.JsonReader;
import me.mioclient.loader.gson.JsonToken;
import me.mioclient.loader.gson.bq_0;

public final class JsonTreeReader
extends JsonReader {
    private static final Reader b;
    private static final Object c;
    private Object[] d = new Object[32];
    private int e = 0;
    private String[] pathNames = new String[32];
    private int[] pathIndices = new int[32];
    private static final String[] S;
    private static final String[] T;
    private static final long[] W;
    private static final Integer[] X;
    public static final int[][] a;
    private static /* synthetic */ int field174;
    private static /* synthetic */ int field175;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public JsonTreeReader(JsonElement jsonElement) {
        super(b);
        this.push(jsonElement);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void beginArray() {
        this.expect(JsonToken.BEGIN_ARRAY);
        JsonArray jsonArray = (JsonArray)this.u();
        this.push(jsonArray.iterator());
        this.pathIndices[this.e - 1] = 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void endArray() {
        this.expect(JsonToken.b);
        this.v();
        this.v();
        if (this.e <= 0) return;
        int n = this.e - 1;
        this.pathIndices[n] = this.pathIndices[n] + 1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void beginObject() {
        this.expect(JsonToken.c);
        C c = (C)this.u();
        this.push(c.b().iterator());
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void endObject() {
        this.expect(JsonToken.d);
        this.v();
        this.v();
        if (this.e <= 0) return;
        int n = this.e - 1;
        this.pathIndices[n] = this.pathIndices[n] + 1;
    }

    @Override
    public boolean hasNext() {
        JsonToken jsonToken = this.f();
        return jsonToken != JsonToken.d && jsonToken != JsonToken.b;
    }

    public JsonToken f() {
        if (this.e == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object object = this.u();
        if (object instanceof Iterator) {
            boolean bl = this.d[this.e - 2] instanceof C;
            Iterator iterator = (Iterator)object;
            if (iterator.hasNext()) {
                if (bl) {
                    return JsonToken.e;
                }
                this.push(iterator.next());
                return this.f();
            }
            return bl ? JsonToken.d : JsonToken.b;
        }
        if (object instanceof C) {
            return JsonToken.c;
        }
        if (object instanceof JsonArray) {
            return JsonToken.BEGIN_ARRAY;
        }
        if (object instanceof F) {
            F f = (F)object;
            if (f.y()) {
                return JsonToken.f;
            }
            if (f.b()) {
                return JsonToken.h;
            }
            if (f.c()) {
                return JsonToken.g;
            }
            throw new AssertionError();
        }
        if (object instanceof B) {
            return JsonToken.i;
        }
        if (object == c) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new AssertionError();
    }

    private Object u() {
        return this.d[this.e - 1];
    }

    private Object v() {
        Object object = this.d[--this.e];
        this.d[this.e] = null;
        return object;
    }

    private void expect(JsonToken jsonToken) {
        if (this.f() == jsonToken) {
            return;
        }
        throw new IllegalStateException("Expected " + (Object)((Object)jsonToken) + " but was " + (Object)((Object)this.f()) + this.w());
    }

    @Override
    public String g() {
        String string;
        this.expect(JsonToken.e);
        Iterator iterator = (Iterator)this.u();
        Map.Entry entry = (Map.Entry)iterator.next();
        this.pathNames[this.e - 1] = string = (String)entry.getKey();
        this.push(entry.getValue());
        return string;
    }

    @Override
    public String h() {
        String string;
        block1: {
            JsonToken jsonToken = this.f();
            if (jsonToken != JsonToken.f && jsonToken != JsonToken.g) {
                throw new IllegalStateException("Expected " + (Object)((Object)JsonToken.f) + " but was " + (Object)((Object)jsonToken) + this.w());
            }
            string = ((F)this.v()).e();
            if (this.e <= 0) break block1;
            int n = this.e - 1;
            this.pathIndices[n] = this.pathIndices[n] + 1;
        }
        return string;
    }

    @Override
    public boolean i() {
        boolean bl;
        block0: {
            this.expect(JsonToken.h);
            bl = ((F)this.v()).o();
            if (this.e <= 0) break block0;
            int n = this.e - 1;
            this.pathIndices[n] = this.pathIndices[n] + 1;
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void j() {
        this.expect(JsonToken.i);
        this.v();
        if (this.e <= 0) return;
        int n = this.e - 1;
        this.pathIndices[n] = this.pathIndices[n] + 1;
    }

    @Override
    public double k() {
        double d2;
        block2: {
            JsonToken jsonToken = this.f();
            if (jsonToken != JsonToken.g && jsonToken != JsonToken.f) {
                throw new IllegalStateException("Expected " + (Object)((Object)JsonToken.g) + " but was " + (Object)((Object)jsonToken) + this.w());
            }
            d2 = ((F)this.u()).f();
            if (!this.r() && (Double.isNaN(d2) || Double.isInfinite(d2))) {
                throw new NumberFormatException("JSON forbids NaN and infinities: " + d2);
            }
            this.v();
            if (this.e <= 0) break block2;
            int n = this.e - 1;
            this.pathIndices[n] = this.pathIndices[n] + 1;
        }
        return d2;
    }

    @Override
    public long l() {
        long l;
        block1: {
            JsonToken jsonToken = this.f();
            if (jsonToken != JsonToken.g && jsonToken != JsonToken.f) {
                throw new IllegalStateException("Expected " + (Object)((Object)JsonToken.g) + " but was " + (Object)((Object)jsonToken) + this.w());
            }
            l = ((F)this.u()).j();
            this.v();
            if (this.e <= 0) break block1;
            int n = this.e - 1;
            this.pathIndices[n] = this.pathIndices[n] + 1;
        }
        return l;
    }

    @Override
    public int m() {
        int n;
        block1: {
            JsonToken jsonToken = this.f();
            if (jsonToken != JsonToken.g && jsonToken != JsonToken.f) {
                throw new IllegalStateException("Expected " + (Object)((Object)JsonToken.g) + " but was " + (Object)((Object)jsonToken) + this.w());
            }
            n = ((F)this.u()).k();
            this.v();
            if (this.e <= 0) break block1;
            int n2 = this.e - 1;
            this.pathIndices[n2] = this.pathIndices[n2] + 1;
        }
        return n;
    }

    JsonElement n() {
        JsonToken jsonToken = this.f();
        if (jsonToken == JsonToken.e || jsonToken == JsonToken.b || jsonToken == JsonToken.d || jsonToken == JsonToken.END_DOCUMENT) {
            throw new IllegalStateException("Unexpected " + (Object)((Object)jsonToken) + " when reading a JsonElement.");
        }
        JsonElement jsonElement = (JsonElement)this.u();
        this.o();
        return jsonElement;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void close() {
        this.d = new Object[]{c};
        this.e = 1;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void o() {
        if (this.f() == JsonToken.e) {
            this.g();
            this.pathNames[this.e - 2] = "null";
        } else {
            this.v();
            if (this.e > 0) {
                this.pathNames[this.e - 1] = "null";
            }
        }
        if (this.e <= 0) return;
        int n = this.e - 1;
        this.pathIndices[n] = this.pathIndices[n] + 1;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + this.w();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void p() {
        this.expect(JsonToken.e);
        Iterator iterator = (Iterator)this.u();
        Map.Entry entry = (Map.Entry)iterator.next();
        this.push(entry.getValue());
        this.push(new F((String)entry.getKey()));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void push(Object object) {
        if (this.e == this.d.length) {
            int n = this.e * 2;
            this.d = Arrays.copyOf(this.d, n);
            this.pathIndices = Arrays.copyOf(this.pathIndices, n);
            this.pathNames = Arrays.copyOf(this.pathNames, n);
        }
        this.d[this.e++] = object;
    }

    @Override
    public String q() {
        StringBuilder stringBuilder = new StringBuilder().append('$');
        for (int i = 0; i < this.e; ++i) {
            if (this.d[i] instanceof JsonArray) {
                if (++i >= this.e || !(this.d[i] instanceof Iterator)) continue;
                stringBuilder.append('[').append(this.pathIndices[i]).append(']');
                continue;
            }
            if (!(this.d[i] instanceof C) || ++i >= this.e || !(this.d[i] instanceof Iterator)) continue;
            stringBuilder.append('.');
            if (this.pathNames[i] == null) continue;
            stringBuilder.append(this.pathNames[i]);
        }
        return stringBuilder.toString();
    }

    private String w() {
        return " at path " + this.q();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block30: {
            block29: {
                block28: {
                    block27: {
                        block31: {
                            break block31;
lbl1:
                            // 1 sources

                            return;
                        }
                        JsonTreeReader.field174 = 12291 ^ -6131;
                        JsonTreeReader.field175 = -27894 ^ -6131;
                        JsonTreeReader.a = new int[2][4];
                        var13 = new String[11];
                        var11_1 = 0;
                        var10_2 = "l\u0003w\u00f7'\u0011\u0083\u00afs\u0014\u00aa\u001e^5\u00cf2\u008d\u00f8s\u00e2\u0002\u00ddE\u00d2\u00c5\u00f8\u00bf\b\u00c4*!\u000b>J5\u001b\u0015%i\u00ae\u001f\u001a\u0000\u00d9^m\u00e8\u00a7~j\u00b4\u00c3\u0004\u00d8\u00c5T\u00a8\u00f5\u00cf\u0080\u008c@\u00e7\u00e1\u0004\u0089q\u0099\u001c\u000bM\u0013T<\u00e7\u00c7\u00ecV\u001d3\u00cf\u0004~\u00f6g\u00ec\t\nRw\u0095\u00c1mpT\u0089\u001c\u009c\u00a6\u00b8\u00ad\u00c8\u000e\u00c5\u0093\u000f\u00b8@Ey&\u00d6*\u00ba\u0097\u00ef\u00d37\u00a6\u0084?\u00b9\u009d\u00d83\tM\u00a9S\u00a2\u00a3\u00bb\u0013\u00faa";
                        var12_3 = "l\u0003w\u00f7'\u0011\u0083\u00afs\u0014\u00aa\u001e^5\u00cf2\u008d\u00f8s\u00e2\u0002\u00ddE\u00d2\u00c5\u00f8\u00bf\b\u00c4*!\u000b>J5\u001b\u0015%i\u00ae\u001f\u001a\u0000\u00d9^m\u00e8\u00a7~j\u00b4\u00c3\u0004\u00d8\u00c5T\u00a8\u00f5\u00cf\u0080\u008c@\u00e7\u00e1\u0004\u0089q\u0099\u001c\u000bM\u0013T<\u00e7\u00c7\u00ecV\u001d3\u00cf\u0004~\u00f6g\u00ec\t\nRw\u0095\u00c1mpT\u0089\u001c\u009c\u00a6\u00b8\u00ad\u00c8\u000e\u00c5\u0093\u000f\u00b8@Ey&\u00d6*\u00ba\u0097\u00ef\u00d37\u00a6\u0084?\u00b9\u009d\u00d83\tM\u00a9S\u00a2\u00a3\u00bb\u0013\u00faa".length();
                        var9_4 = 9;
                        var8_5 = -1;
lbl15:
                        // 2 sources

                        while (true) {
                            v0 = ++var8_5;
                            v1 = var10_2.substring(v0, v0 + var9_4);
                            v2 = -1;
                            break block27;
                            break;
                        }
lbl21:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v3.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "\u00d0t-f\u00fb\u00dbxM?\t\u0080\u0094&M\u00ebv57!";
                            var12_3 = "\u00d0t-f\u00fb\u00dbxM?\t\u0080\u0094&M\u00ebv57!".length();
                            var9_4 = 9;
                            var8_5 = -1;
lbl31:
                            // 2 sources

                            while (true) {
                                v4 = ++var8_5;
                                v1 = var10_2.substring(v4, v4 + var9_4);
                                v2 = 0;
                                break block27;
                                break;
                            }
                            break;
                        }
lbl36:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v3.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            break block28;
                            break;
                        }
                    }
                    v5 = v1.toCharArray();
                    var14_6 = 0;
                    v6 = v5.length;
                    v7 = v5;
                    v8 = v6;
                    if (v6 > 1) ** GOTO lbl86
                    do {
                        v9 = v7;
                        v10 = v7;
                        v11 = var14_6;
                        while (true) {
                            v12 = v9[v11];
                            switch (var14_6 % 7) {
                                case 0: {
                                    v13 = 88;
                                    break;
                                }
                                case 1: {
                                    v13 = 46;
                                    break;
                                }
                                case 2: {
                                    v13 = 108;
                                    break;
                                }
                                case 3: {
                                    v13 = 64;
                                    break;
                                }
                                case 4: {
                                    v13 = 89;
                                    break;
                                }
                                case 5: {
                                    v13 = 90;
                                    break;
                                }
                                default: {
                                    v13 = 38;
                                }
                            }
                            v9[v11] = (char)(v12 ^ v13);
                            ++var14_6;
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
                    } while (v8 > var14_6);
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
                JsonTreeReader.S = var13;
                JsonTreeReader.T = new String[11];
                var0_7 = 7805484157318757416L;
                var6_8 = new long[6];
                var3_9 = 0;
                var4_10 = "\u00b76\u00b4\u00b6\u001c\u001c\u00b3\u0007\u00ef\u0011\u0081T]9\u00b3\u0093K\u00bd\u00ef\u000eq\u00f9\u008e'#E\u0006\u00f3Wr\u0014\u00cc";
                var5_11 = "\u00b76\u00b4\u00b6\u001c\u001c\u00b3\u0007\u00ef\u0011\u0081T]9\u00b3\u0093K\u00bd\u00ef\u000eq\u00f9\u008e'#E\u0006\u00f3Wr\u0014\u00cc".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v16 = var6_8;
                    v17 = var3_9++;
                    v18 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v19 = -1;
                    break block29;
                    break;
                }
lbl113:
                // 1 sources

                while (true) {
                    v16[v17] = v20;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "S\u0010\u0016\u009f+\u000b\u0014\u00a5\u000f\u0081s\u00c6=\u00af\u00d66";
                    var5_11 = "S\u0010\u0016\u009f+\u000b\u0014\u00a5\u000f\u0081s\u00c6=\u00af\u00d66".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v16 = var6_8;
                        v17 = var3_9++;
                        v18 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v19 = 0;
                        break block29;
                        break;
                    }
                    break;
                }
lbl126:
                // 1 sources

                while (true) {
                    v16[v17] = v20;
                    if (var2_12 < var5_11) ** continue;
                    break block30;
                    break;
                }
            }
            v20 = v18 ^ var0_7;
            switch (v19) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl137:
                // 1 sources

                ** continue;
            }
        }
        JsonTreeReader.W = var6_8;
        JsonTreeReader.X = new Integer[6];
        JsonTreeReader.b = new bq_0();
        JsonTreeReader.c = new Object();
        ** while (true)
    }
}

