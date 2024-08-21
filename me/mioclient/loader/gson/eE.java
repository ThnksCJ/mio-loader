/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.util.Collection;
import java.util.Map;
import me.mioclient.loader.gson.eB;
import me.mioclient.loader.gson.ep;
import me.mioclient.loader.gson.eq;
import me.mioclient.loader.gson.et;

public class eE {
    private static final int c;
    private boolean d = false;
    protected char a = (char)105;
    private final et[] e = new et[200];
    private int f = 0;
    protected Appendable b;
    private static final String[] g;
    private static final String[] h;
    private static final long[] i;
    private static final Integer[] j;
    public static final int[][] k;
    private static /* synthetic */ int field302;
    private static /* synthetic */ int field303;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public eE(Appendable appendable) {
        this.b = appendable;
    }

    private eE b(String string) {
        if (string == null) {
            throw new eq("Null pointer");
        }
        if (this.a == 'o' || this.a == 'a') {
            if (this.d && this.a == 'a') {
                this.b.append(',');
            }
            this.b.append(string);
            if (this.a == 'o') {
                this.a = (char)107;
            }
            this.d = true;
            return this;
        }
        throw new eq("Value out of sequence.");
    }

    public eE a() {
        if (this.a == 'i' || this.a == 'o' || this.a == 'a') {
            this.a((et)null);
            this.b("[");
            this.d = false;
            return this;
        }
        throw new eq("Misplaced array.");
    }

    private eE a(char c, char c2) {
        if (this.a != c) {
            throw new eq(c == 'a' ? "Misplaced endArray." : "Misplaced endObject.");
        }
        this.a(c);
        this.b.append(c2);
        this.d = true;
        return this;
    }

    public eE b() {
        return this.a('a', ']');
    }

    public eE c() {
        return this.a('k', '}');
    }

    public eE a(String string) {
        if (string == null) {
            throw new eq("Null key.");
        }
        if (this.a == 'k') {
            et et2 = this.e[this.f - 1];
            if (et2.m(string)) {
                throw new eq("Duplicate key \"" + string + "\"");
            }
            et2.b(string, true);
            if (this.d) {
                this.b.append(',');
            }
            this.b.append(et.B(string));
            this.b.append(':');
            this.d = false;
            this.a = (char)111;
            return this;
        }
        throw new eq("Misplaced key.");
    }

    public eE d() {
        if (this.a == 'i') {
            this.a = (char)111;
        }
        if (this.a == 'o' || this.a == 'a') {
            this.b("{");
            this.a(new et());
            this.d = false;
            return this;
        }
        throw new eq("Misplaced object.");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void a(char c) {
        char c2;
        if (this.f <= 0) {
            throw new eq("Nesting error.");
        }
        char c3 = c2 = this.e[this.f - 1] == null ? (char)'a' : 'k';
        if (c2 != c) {
            throw new eq("Nesting error.");
        }
        --this.f;
        this.a = (char)(this.f == 0 ? 100 : (this.e[this.f - 1] == null ? 97 : 107));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void a(et et2) {
        if (this.f >= 200) {
            throw new eq("Nesting too deep.");
        }
        this.e[this.f] = et2;
        this.a = (char)(et2 == null ? 97 : 107);
        ++this.f;
    }

    public static String a(Object object) {
        if (object == null || object.equals(null)) {
            return "null";
        }
        if (object instanceof eB) {
            String string = ((eB)object).a();
            if (string != null) {
                return string;
            }
            throw new eq("Bad value from toJSONString: " + string);
        }
        if (object instanceof Number) {
            String string = et.a((Number)object);
            if (et.a.matcher(string).matches()) {
                return string;
            }
            return et.B(string);
        }
        if (object instanceof Boolean || object instanceof et || object instanceof ep) {
            return object.toString();
        }
        if (object instanceof Map) {
            Map map = (Map)object;
            return new et(map).toString();
        }
        if (object instanceof Collection) {
            Collection collection = (Collection)object;
            return new ep(collection).toString();
        }
        if (object.getClass().isArray()) {
            return new ep(object).toString();
        }
        if (object instanceof Enum) {
            return et.B(((Enum)object).name());
        }
        return et.B(object.toString());
    }

    public eE a(boolean bl2) {
        return this.b(bl2 ? "true" : "false");
    }

    public eE a(double d2) {
        return this.b(d2);
    }

    public eE a(long l) {
        return this.b(Long.toString(l));
    }

    public eE b(Object object) {
        return this.b(eE.a(object));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block30: {
                        break block30;
lbl1:
                        // 1 sources

                        return;
                    }
                    eE.field302 = 16655 ^ -11590;
                    eE.field303 = -8264 ^ -11590;
                    eE.k = new int[3][1];
                    var13 = new String[16];
                    var11_1 = 0;
                    var10_2 = "\u001eh.0K\u00a4\u00f9\u00e7\u00a2o\u00d4D\u0018\u00c7\u001dm\t-\u00d64d\u00b8\u00bbDS\u0099\u000eJ\u009f\u00a4\u00ce\u001a{\u00d3\u001c\u00e7\u0010v\u00bc\fb\u0005\u00ff=C\u0090\u0013\u000e\u0015\u00da,\u00ef\u000e\u00d4\u00f0B\u0006dr \u00bd\u00ba\u001dG0\u00fcb\u00fe\u00b4\u0019\u00f5Q?\u008cN\u00e9\u008a\u00c4\u0013\u00a9\u00db\u001b\u008a\u0006\u00ff\u00c5\u00ce\"t\u00da\u0005\u00ab\u0014\u0084\u00b9}\n!\u00e3\u00b4\u000f\u000br\u00e5\u00fb\u00ac\u0081D\n\u00b9\fu\u001d\u0004k>\u00d8y\u0011\u00f0\u008f\u00f3\u00cc\u00f0;\u008e\u0014L\u0011\u0007\u009b\u00b5*\u00a9\u000en\u0011\u00ed\u00d93\u008f\u00ed\u00d8\u008c\u00c3\u0098I\u008ft\u00aa\u00dd\u0083\u00f4\u00ed\u0004H\u00f6\u00fc\u008e\f4\u00e7\u0017B\u00dcd\u00c2\u00c0BR\u0087=\u000e\u00f2\n\u00d0\u00f5\u0091\u0097\u0003*xi\u00bd\u0081D\u008e\u000f`\u0007\u00ca^\u00b1\u00f4\u0001\u00be\u00fewtPL\u00f1\u00a6";
                    var12_3 = "\u001eh.0K\u00a4\u00f9\u00e7\u00a2o\u00d4D\u0018\u00c7\u001dm\t-\u00d64d\u00b8\u00bbDS\u0099\u000eJ\u009f\u00a4\u00ce\u001a{\u00d3\u001c\u00e7\u0010v\u00bc\fb\u0005\u00ff=C\u0090\u0013\u000e\u0015\u00da,\u00ef\u000e\u00d4\u00f0B\u0006dr \u00bd\u00ba\u001dG0\u00fcb\u00fe\u00b4\u0019\u00f5Q?\u008cN\u00e9\u008a\u00c4\u0013\u00a9\u00db\u001b\u008a\u0006\u00ff\u00c5\u00ce\"t\u00da\u0005\u00ab\u0014\u0084\u00b9}\n!\u00e3\u00b4\u000f\u000br\u00e5\u00fb\u00ac\u0081D\n\u00b9\fu\u001d\u0004k>\u00d8y\u0011\u00f0\u008f\u00f3\u00cc\u00f0;\u008e\u0014L\u0011\u0007\u009b\u00b5*\u00a9\u000en\u0011\u00ed\u00d93\u008f\u00ed\u00d8\u008c\u00c3\u0098I\u008ft\u00aa\u00dd\u0083\u00f4\u00ed\u0004H\u00f6\u00fc\u008e\f4\u00e7\u0017B\u00dcd\u00c2\u00c0BR\u0087=\u000e\u00f2\n\u00d0\u00f5\u0091\u0097\u0003*xi\u00bd\u0081D\u008e\u000f`\u0007\u00ca^\u00b1\u00f4\u0001\u00be\u00fewtPL\u00f1\u00a6".length();
                    var9_4 = 16;
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
                        var10_2 = "\u00ccJtt\u0000,\u0090\u00f6\u008fMu\u001c\u00bes\u0016\u0083\u00e5< \u0016Q\u00b3\u00a0Go\u00aeY\u00df+z\u00f9\u00f2 \u0095\u001e(\u00056\u00ea\u00d1\u0089@";
                        var12_3 = "\u00ccJtt\u0000,\u0090\u00f6\u008fMu\u001c\u00bes\u0016\u0083\u00e5< \u0016Q\u00b3\u00a0Go\u00aeY\u00df+z\u00f9\u00f2 \u0095\u001e(\u00056\u00ea\u00d1\u0089@".length();
                        var9_4 = 19;
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
                                v13 = 112;
                                break;
                            }
                            case 1: {
                                v13 = 113;
                                break;
                            }
                            case 2: {
                                v13 = 116;
                                break;
                            }
                            case 3: {
                                v13 = 39;
                                break;
                            }
                            case 4: {
                                v13 = 113;
                                break;
                            }
                            case 5: {
                                v13 = 89;
                                break;
                            }
                            default: {
                                v13 = 60;
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
            eE.g = var13;
            eE.h = new String[16];
            var0_7 = 1924596649441555191L;
            var6_8 = new long[17];
            var3_9 = 0;
            var4_10 = " \u008e\u00a9\u0000R\u008d\u00ad\u00c3\u00b2)\u00b1o\u00e2\u00d7MKV4W\u00b2\u0094P\u001c#Y:\u001co\u009b\u00f5\u00c8qs\u000b\u0096\u00de\u009d\u00f2\u00c6\u00b0X\u00d6\u00e7\u00be>N\u0012\u00f1f\u0004\u00c93P\u0084\u00d1\u0084\u00cc>^'PO0@\u00aa\u00b9`\u0017A\u00f0\u00de\f/nO\u00a1\u0095i'\u0019\u00ed\u00ce\u009e\u00f8\"Gg#\u008a@\u00f3\u00acL*\u007f\u0098\u00e9\u00a9\u008ep\u00f5\u000b`|5\u0012\u00c9\u008d J_\u00eb8x\u00102\u00be\u00fa\u00d7\u0081";
            var5_11 = " \u008e\u00a9\u0000R\u008d\u00ad\u00c3\u00b2)\u00b1o\u00e2\u00d7MKV4W\u00b2\u0094P\u001c#Y:\u001co\u009b\u00f5\u00c8qs\u000b\u0096\u00de\u009d\u00f2\u00c6\u00b0X\u00d6\u00e7\u00be>N\u0012\u00f1f\u0004\u00c93P\u0084\u00d1\u0084\u00cc>^'PO0@\u00aa\u00b9`\u0017A\u00f0\u00de\f/nO\u00a1\u0095i'\u0019\u00ed\u00ce\u009e\u00f8\"Gg#\u008a@\u00f3\u00acL*\u007f\u0098\u00e9\u00a9\u008ep\u00f5\u000b`|5\u0012\u00c9\u008d J_\u00eb8x\u00102\u00be\u00fa\u00d7\u0081".length();
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
                var4_10 = "\u0011\u00b7\u0010\u00f9\u008c\u009a\u0084\u00e8<\u00c9\u00c9SfJJg";
                var5_11 = "\u0011\u00b7\u0010\u00f9\u008c\u009a\u0084\u00e8<\u00c9\u00c9SfJJg".length();
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
                eE.i = var6_8;
                eE.j = new Integer[17];
                eE.c = 200;
                ** continue;
                break;
            }
        }
        v20 = v18 ^ var0_7;
        switch (v19) {
            default: {
                ** continue;
            }
            ** case 0:
lbl140:
            // 1 sources

            ** continue;
        }
    }
}

