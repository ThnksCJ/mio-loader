/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

public class cO
implements Closeable,
Flushable {
    private static final String[] a;
    private static final String[] b;
    private final Writer c;
    private int[] d = new int[32];
    private int e = 0;
    private String f;
    private String g;
    private boolean h;
    private boolean i;
    private String j;
    private boolean k;
    private static final String[] l;
    private static final String[] m;
    private static final long[] p;
    private static final Integer[] q;
    public static final int[][] n;
    private static /* synthetic */ int field172;
    private static /* synthetic */ int field173;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public cO(Writer writer) {
        this.a(6);
        this.g = ":";
        this.k = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.c = writer;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void c(String string) {
        if (string.length() == 0) {
            this.f = null;
            this.g = ":";
            return;
        }
        this.f = string;
        this.g = ": ";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void b(boolean bl2) {
        this.h = bl2;
    }

    public boolean g() {
        return this.h;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void c(boolean bl2) {
        this.i = bl2;
    }

    public final boolean h() {
        return this.i;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void d(boolean bl2) {
        this.k = bl2;
    }

    public final boolean i() {
        return this.k;
    }

    public cO b() {
        this.j();
        return this.a(1, '[');
    }

    public cO c() {
        return this.a(1, 2, ']');
    }

    public cO d() {
        this.j();
        return this.a(3, '{');
    }

    public cO e() {
        return this.a(3, 5, '}');
    }

    private cO a(int n, char c2) {
        this.m();
        this.a(n);
        this.c.write(c2);
        return this;
    }

    private cO a(int n, int n2, char c2) {
        int n3 = this.a();
        if (n3 != n2 && n3 != n) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.j != null) {
            throw new IllegalStateException("Dangling name: " + this.j);
        }
        --this.e;
        if (n3 == n2) {
            this.k();
        }
        this.c.write(c2);
        return this;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void a(int n) {
        if (this.e == this.d.length) {
            this.d = Arrays.copyOf(this.d, this.e * 2);
        }
        this.d[this.e++] = n;
    }

    private int a() {
        if (this.e == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        return this.d[this.e - 1];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void b(int n) {
        this.d[this.e - 1] = n;
    }

    public cO a(String string) {
        if (string == null) {
            throw new NullPointerException("name == null");
        }
        if (this.j != null) {
            throw new IllegalStateException();
        }
        if (this.e == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.j = string;
        return this;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void j() {
        if (this.j == null) {
            return;
        }
        this.l();
        this.e(this.j);
        this.j = null;
    }

    public cO b(String string) {
        if (string == null) {
            return this.f();
        }
        this.j();
        this.m();
        this.e(string);
        return this;
    }

    public cO d(String string) {
        if (string == null) {
            return this.f();
        }
        this.j();
        this.m();
        this.c.append(string);
        return this;
    }

    public cO f() {
        if (this.j != null) {
            if (this.k) {
                this.j();
            } else {
                this.j = null;
                return this;
            }
        }
        this.m();
        this.c.write("null");
        return this;
    }

    public cO a(boolean bl2) {
        this.j();
        this.m();
        this.c.write(bl2 ? "true" : "false");
        return this;
    }

    public cO a(Boolean bl2) {
        if (bl2 == null) {
            return this.f();
        }
        this.j();
        this.m();
        this.c.write(bl2 != false ? "true" : "false");
        return this;
    }

    public cO a(double d2) {
        this.j();
        if (!this.h && (Double.isNaN(d2) || Double.isInfinite(d2))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d2);
        }
        this.m();
        this.c.append(Double.toString(d2));
        return this;
    }

    public cO a(long l) {
        this.j();
        this.m();
        this.c.write(Long.toString(l));
        return this;
    }

    public cO a(Number number) {
        if (number == null) {
            return this.f();
        }
        this.j();
        String string = number.toString();
        if (!this.h && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        this.m();
        this.c.append(string);
        return this;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void flush() {
        if (this.e == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.c.flush();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void close() {
        this.c.close();
        int n = this.e;
        if (n > 1 || n == 1 && this.d[n - 1] != 7) {
            throw new IOException("Incomplete document");
        }
        this.e = 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void e(String string) {
        String[] stringArray = this.i ? b : a;
        this.c.write(34);
        int n = 0;
        int n2 = string.length();
        for (int i = 0; i < n2; ++i) {
            String string2;
            char c2 = string.charAt(i);
            if (c2 < '\u0080') {
                string2 = stringArray[c2];
                if (string2 == null) {
                    continue;
                }
            } else if (c2 == '\u2028') {
                string2 = "\\u2028";
            } else {
                if (c2 != '\u2029') continue;
                string2 = "\\u2029";
            }
            if (n < i) {
                this.c.write(string, n, i - n);
            }
            this.c.write(string2);
            n = i + 1;
        }
        if (n < n2) {
            this.c.write(string, n, n2 - n);
        }
        this.c.write(34);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void k() {
        if (this.f == null) {
            return;
        }
        this.c.write(10);
        int n = 1;
        int n2 = this.e;
        while (n < n2) {
            this.c.write(this.f);
            ++n;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void l() {
        int n = this.a();
        if (n == 5) {
            this.c.write(44);
        } else if (n != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.k();
        this.b(4);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void m() {
        switch (this.a()) {
            case 7: {
                if (!this.h) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            case 6: {
                this.b(7);
                return;
            }
            case 1: {
                this.b(2);
                this.k();
                return;
            }
            case 2: {
                this.c.append(',');
                this.k();
                return;
            }
            case 4: {
                this.c.append(this.g);
                this.b(5);
                return;
            }
        }
        throw new IllegalStateException("Nesting problem.");
    }

    /*
     * Unable to fully structure code
     */
    static {
        block31: {
            block30: {
                block29: {
                    block28: {
                        block32: {
                            break block32;
lbl1:
                            // 1 sources

                            return;
                        }
                        cO.field172 = 6859 ^ -5822;
                        cO.field173 = -9767 ^ -5822;
                        cO.n = new int[3][2];
                        var13 = new String[35];
                        var11_1 = 0;
                        var10_2 = "\u008b\u00b6\u0098-\f\u00ae\u0006q\"\u00c5\u00bf\u00e4\u00a0\u0002\u00d4\u00d1\u0006\u0018n\u00e86A\u0090\u0004\u00a3\u00c7\u00b7_\u0005R\u0092\u0080|\u00cd\u0006*\u0091\u00ae\u00c9\u0088<'\u00de9=\u0089L\u0094\u00d8\u00f7U\u00b7n\u0097LTa\u00cdq\u001a\u00d8{\u008d/\u0088FLU\u00a1s\u0014\u008fg*\u00e4\u001ai\u00cf_\u001f\u0096'D\u00ban\u00f9&\u009a\u00956\u00fc\u008f[\u0090\u00ea\u00b4\u00b5\u00d1\u00eb\u0099\u008b\u000b\u00e7!\u00c5\u0087\u00e5m\u0094t\u00b2o\u00b36~\u0099:\u00bf5\u0011\u00db\u0002k\u00b5\u000fLd'\u00b6r1\u00cf\u0004Mi\u00fc\u00ba\u00b2\u00a3\u00be\u0003X\u00a0\u00ce\u0002g\u0095\u0002v$\b\u00cf\u00b4\u00f3L\u00e3\u00a1\u00a5\b\u0006\u00c0\u00e7\u00f1\u0007!\u00ea\u0015\u00f49\u00feDS\\\u00b0\u00c2\u0000\u00dc\u00f9\u0097m\u0098\u00d2l6\u000fx\u009d\u00e6\u0006\u0001\u00fd\u00cbD$\u008c\u0002\u00a8T\u0002\u00d1V\u0006\u00bfZ\t\u00b0\u00cd]\u0002\u00e0r\u0005\u0094\u0085X\u009e\u00d6\u0006\u0010\u00d0\u00e9\u00e1al\u000b\\3q\u008d\u00b0\u00ad\u00a2@2\u00cb\u00e1\tJ\u00d1\u00a3,\u00e7D\u00df^\u00f1\u0013\u00c2\u0002W\u009c\u00d1d\u0098\u0096\u00b1r\u00fc\u00ba\u00d1\u00d2\u00cc\u000f+_\u0081\u0010\u0083\u00ea\u0088\u00f0<\u008f\u00aas\u009942\u0081\u00adu8~\u0004\u0014\u00b9\u0001~\u0002\u00e5[\u0010/\u00b0\u001d\u00bb\u008e\u00e6\u00fc^S\u0091k5\u0086\u00e3]\u00ac\fn*\u000f}X^\u001cp@S\u00d7\u0084\u0004%\u00f5'\u00f7";
                        var12_3 = "\u008b\u00b6\u0098-\f\u00ae\u0006q\"\u00c5\u00bf\u00e4\u00a0\u0002\u00d4\u00d1\u0006\u0018n\u00e86A\u0090\u0004\u00a3\u00c7\u00b7_\u0005R\u0092\u0080|\u00cd\u0006*\u0091\u00ae\u00c9\u0088<'\u00de9=\u0089L\u0094\u00d8\u00f7U\u00b7n\u0097LTa\u00cdq\u001a\u00d8{\u008d/\u0088FLU\u00a1s\u0014\u008fg*\u00e4\u001ai\u00cf_\u001f\u0096'D\u00ban\u00f9&\u009a\u00956\u00fc\u008f[\u0090\u00ea\u00b4\u00b5\u00d1\u00eb\u0099\u008b\u000b\u00e7!\u00c5\u0087\u00e5m\u0094t\u00b2o\u00b36~\u0099:\u00bf5\u0011\u00db\u0002k\u00b5\u000fLd'\u00b6r1\u00cf\u0004Mi\u00fc\u00ba\u00b2\u00a3\u00be\u0003X\u00a0\u00ce\u0002g\u0095\u0002v$\b\u00cf\u00b4\u00f3L\u00e3\u00a1\u00a5\b\u0006\u00c0\u00e7\u00f1\u0007!\u00ea\u0015\u00f49\u00feDS\\\u00b0\u00c2\u0000\u00dc\u00f9\u0097m\u0098\u00d2l6\u000fx\u009d\u00e6\u0006\u0001\u00fd\u00cbD$\u008c\u0002\u00a8T\u0002\u00d1V\u0006\u00bfZ\t\u00b0\u00cd]\u0002\u00e0r\u0005\u0094\u0085X\u009e\u00d6\u0006\u0010\u00d0\u00e9\u00e1al\u000b\\3q\u008d\u00b0\u00ad\u00a2@2\u00cb\u00e1\tJ\u00d1\u00a3,\u00e7D\u00df^\u00f1\u0013\u00c2\u0002W\u009c\u00d1d\u0098\u0096\u00b1r\u00fc\u00ba\u00d1\u00d2\u00cc\u000f+_\u0081\u0010\u0083\u00ea\u0088\u00f0<\u008f\u00aas\u009942\u0081\u00adu8~\u0004\u0014\u00b9\u0001~\u0002\u00e5[\u0010/\u00b0\u001d\u00bb\u008e\u00e6\u00fc^S\u0091k5\u0086\u00e3]\u00ac\fn*\u000f}X^\u001cp@S\u00d7\u0084\u0004%\u00f5'\u00f7".length();
                        var9_4 = 6;
                        var8_5 = -1;
lbl15:
                        // 2 sources

                        while (true) {
                            v0 = ++var8_5;
                            v1 = var10_2.substring(v0, v0 + var9_4);
                            v2 = -1;
                            break block28;
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
                            var10_2 = "\u00f7G\u00be\u008f\b\u001e^qS\u001f\u00e8\u00ff\u000b\u00d9\u00f8\u00aaY\u00ab\u00a8\u00b1\"}\u0094 ?\u0016hc\u001e\u00b6Xj\u0086\u00a1Ip\u00ca:\u00cd\u00eb\u0015CY\bH\u008d\u00ddk\u00f2{\u00da\u0096W\u0080\u0080oo\u0081o\u008e\u00918";
                            var12_3 = "\u00f7G\u00be\u008f\b\u001e^qS\u001f\u00e8\u00ff\u000b\u00d9\u00f8\u00aaY\u00ab\u00a8\u00b1\"}\u0094 ?\u0016hc\u001e\u00b6Xj\u0086\u00a1Ip\u00ca:\u00cd\u00eb\u0015CY\bH\u008d\u00ddk\u00f2{\u00da\u0096W\u0080\u0080oo\u0081o\u008e\u00918".length();
                            var9_4 = 40;
                            var8_5 = -1;
lbl31:
                            // 2 sources

                            while (true) {
                                v4 = ++var8_5;
                                v1 = var10_2.substring(v4, v4 + var9_4);
                                v2 = 0;
                                break block28;
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
                            break block29;
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
                                    v13 = 104;
                                    break;
                                }
                                case 1: {
                                    v13 = 19;
                                    break;
                                }
                                case 2: {
                                    v13 = 1;
                                    break;
                                }
                                case 3: {
                                    v13 = 114;
                                    break;
                                }
                                case 4: {
                                    v13 = 121;
                                    break;
                                }
                                case 5: {
                                    v13 = 75;
                                    break;
                                }
                                default: {
                                    v13 = 33;
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
                cO.l = var13;
                cO.m = new String[35];
                var0_7 = 1327694504792865270L;
                var6_8 = new long[29];
                var3_9 = 0;
                var4_10 = "\u00b6\u00d9\u0084\u00f4\u00de\u001cM\u00008\u00b2\u009e\u00c6\u00fa^\u0007\bI\u00b0\u00f0\u008dL\u0082\u008e\u0011W\u00a0S`\u00ee\u0005\u0092\u0015\u00be\u00e8cS\u001ao\u0011\u00e6\u00e5\u0019\u008ay\u00ca\u00cf\u00ae\u00d3\u0099\u0012\u00f1\u0083\u00cd:b\u00cc%\u0002\u00bd\u00fc\u000e\u00f7\u00a3\u0086=\u0084%\u0014\u00b7\u00a1\u00db\u00a3\u0083!\u0018\u0093B\u00d4\u00d5\u0095\u00c4y/{\u00f3\u00ac\u00b6\u0015\u00a0#\u00ef%\f\u00cf\u00c3\u001eS]=\u0093VF\u00e6a\u009f\u0080\u00f9\u001cAs\u008fp\u00b7\u00b4\u00cb/\u0016\u00e7\u00e2\u00d8o\u00e3\u0018\u00e7\u00fd\u00887d\u001c\u001bM][\u00b8\u0090'\u0088[,88\u00d0A\u00ca\u00b2\u000biUhx`u;\u00b2\u00c1\u001f\u00f5\u00fb\u00ec\u00da~\u00cc\u0003\u0081;\u0097\u00bb\u00c8\u00c0fq\u00cbj\u00b0\u00f9DM\u00ec\u00c6\u00f5sj\u008ed\u00da\u00c1~S\u0091\"\u00dd\u00bfK<*\u0001!\u008c\u00f4o\u00a8jau\tQ\u00e6\u0093\u00c0D\u0090!&\u00c6\u0006\u00c2";
                var5_11 = "\u00b6\u00d9\u0084\u00f4\u00de\u001cM\u00008\u00b2\u009e\u00c6\u00fa^\u0007\bI\u00b0\u00f0\u008dL\u0082\u008e\u0011W\u00a0S`\u00ee\u0005\u0092\u0015\u00be\u00e8cS\u001ao\u0011\u00e6\u00e5\u0019\u008ay\u00ca\u00cf\u00ae\u00d3\u0099\u0012\u00f1\u0083\u00cd:b\u00cc%\u0002\u00bd\u00fc\u000e\u00f7\u00a3\u0086=\u0084%\u0014\u00b7\u00a1\u00db\u00a3\u0083!\u0018\u0093B\u00d4\u00d5\u0095\u00c4y/{\u00f3\u00ac\u00b6\u0015\u00a0#\u00ef%\f\u00cf\u00c3\u001eS]=\u0093VF\u00e6a\u009f\u0080\u00f9\u001cAs\u008fp\u00b7\u00b4\u00cb/\u0016\u00e7\u00e2\u00d8o\u00e3\u0018\u00e7\u00fd\u00887d\u001c\u001bM][\u00b8\u0090'\u0088[,88\u00d0A\u00ca\u00b2\u000biUhx`u;\u00b2\u00c1\u001f\u00f5\u00fb\u00ec\u00da~\u00cc\u0003\u0081;\u0097\u00bb\u00c8\u00c0fq\u00cbj\u00b0\u00f9DM\u00ec\u00c6\u00f5sj\u008ed\u00da\u00c1~S\u0091\"\u00dd\u00bfK<*\u0001!\u008c\u00f4o\u00a8jau\tQ\u00e6\u0093\u00c0D\u0090!&\u00c6\u0006\u00c2".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v16 = var6_8;
                    v17 = var3_9++;
                    v18 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v19 = -1;
                    break block30;
                    break;
                }
lbl113:
                // 1 sources

                while (true) {
                    v16[v17] = v20;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u0089\u000e\u001ajT\u0086\u00d4\u00cb\u001e\u00dd\u008c\u0016\u0083\u00f0:\u00b6";
                    var5_11 = "\u0089\u000e\u001ajT\u0086\u00d4\u00cb\u001e\u00dd\u008c\u0016\u0083\u00f0:\u00b6".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v16 = var6_8;
                        v17 = var3_9++;
                        v18 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v19 = 0;
                        break block30;
                        break;
                    }
                    break;
                }
lbl126:
                // 1 sources

                while (true) {
                    v16[v17] = v20;
                    if (var2_12 < var5_11) ** continue;
                    break block31;
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
        cO.p = var6_8;
        cO.q = new Integer[29];
        cO.a = new String[128];
        for (var15_14 = 0; var15_14 <= 31; ++var15_14) {
            cO.a[var15_14] = String.format("\\u%04x", new Object[]{var15_14});
        }
        cO.a[34] = "\\\"";
        cO.a[92] = "\\\\";
        cO.a[9] = "\\t";
        cO.a[8] = "\\b";
        cO.a[10] = "\\n";
        cO.a[13] = "\\r";
        cO.a[12] = "\\f";
        cO.b = (String[])cO.a.clone();
        cO.b[60] = "\\u003c";
        cO.b[62] = "\\u003e";
        cO.b[38] = "\\u0026";
        cO.b[61] = "\\u003d";
        cO.b[39] = "\\u0027";
        ** while (true)
    }
}

