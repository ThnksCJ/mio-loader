/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import me.mioclient.loader.gson.ep;
import me.mioclient.loader.gson.eq;
import me.mioclient.loader.gson.et;

public class eD {
    private long a;
    private boolean b;
    private long c;
    private long d;
    private char e;
    private final Reader f;
    private boolean g;
    private long h;
    private static final String[] i;
    private static final String[] j;
    private static final long[] m;
    private static final Integer[] n;
    public static final int[][] k;
    private static /* synthetic */ int field304;
    private static /* synthetic */ int field305;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public eD(Reader reader) {
        this.f = reader.markSupported() ? reader : new BufferedReader(reader);
        this.b = false;
        this.g = false;
        this.e = '\u0000';
        this.c = 0L;
        this.a = 1L;
        this.h = 0L;
        this.d = 1L;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public eD(InputStream inputStream) {
        this(new InputStreamReader(inputStream));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public eD(String string) {
        this(new StringReader(string));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void b() {
        if (this.g || this.c <= 0L) {
            throw new eq("Stepping back two steps is not supported");
        }
        this.a();
        this.g = true;
        this.b = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a() {
        --this.c;
        if (this.e != '\r' && this.e != '\n') {
            if (this.a <= 0L) return;
            --this.a;
            return;
        }
        --this.d;
        this.a = this.h;
    }

    public static int a(char c) {
        if (c >= '0' && c <= '9') {
            return c - 48;
        }
        if (c >= 'A' && c <= 'F') {
            return c - 55;
        }
        if (c >= 'a' && c <= 'f') {
            return c - 87;
        }
        return -1;
    }

    public boolean c() {
        return this.b && !this.g;
    }

    public boolean d() {
        if (this.g) {
            return true;
        }
        this.f.mark(1);
        if (this.f.read() <= 0) {
            this.b = true;
            return false;
        }
        this.f.reset();
        return true;
    }

    public char e() {
        int n;
        if (this.g) {
            this.g = false;
            n = this.e;
        } else {
            n = this.f.read();
        }
        if (n <= 0) {
            this.b = true;
            return '\u0000';
        }
        this.b(n);
        this.e = (char)n;
        return this.e;
    }

    protected char f() {
        return this.e;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void b(int n) {
        if (n <= 0) {
            return;
        }
        ++this.c;
        if (n == 13) {
            ++this.d;
            this.h = this.a;
            this.a = 0L;
            return;
        }
        if (n == 10) {
            if (this.e != '\r') {
                ++this.d;
                this.h = this.a;
            }
            this.a = 0L;
            return;
        }
        ++this.a;
    }

    public char b(char c) {
        char c2 = this.e();
        if (c2 != c) {
            if (c2 > '\u0000') {
                throw this.b("Expected '" + c + "' and instead saw '" + c2 + "'");
            }
            throw this.b("Expected '" + c + "' and instead saw ''");
        }
        return c2;
    }

    public String a(int n) {
        if (n == 0) {
            return "";
        }
        char[] cArray = new char[n];
        for (int i = 0; i < n; ++i) {
            cArray[i] = this.e();
            if (!this.c()) continue;
            throw this.b("Substring bounds error");
        }
        return new String(cArray);
    }

    public char g() {
        char c;
        while ((c = this.e()) != '\u0000' && c <= ' ') {
        }
        return c;
    }

    public String c(char c) {
        StringBuilder stringBuilder = new StringBuilder();
        block13: while (true) {
            char c2 = this.e();
            switch (c2) {
                case '\u0000': 
                case '\n': 
                case '\r': {
                    throw this.b("Unterminated string");
                }
                case '\\': {
                    c2 = this.e();
                    switch (c2) {
                        case 'b': {
                            stringBuilder.append('\b');
                            continue block13;
                        }
                        case 't': {
                            stringBuilder.append('\t');
                            continue block13;
                        }
                        case 'n': {
                            stringBuilder.append('\n');
                            continue block13;
                        }
                        case 'f': {
                            stringBuilder.append('\f');
                            continue block13;
                        }
                        case 'r': {
                            stringBuilder.append('\r');
                            continue block13;
                        }
                        case 'u': {
                            stringBuilder.append((char)Integer.parseInt(this.a(4), 16));
                            continue block13;
                        }
                        case '\"': 
                        case '\'': 
                        case '/': 
                        case '\\': {
                            stringBuilder.append(c2);
                            continue block13;
                        }
                    }
                    throw this.b("Illegal escape.");
                }
            }
            if (c2 == c) {
                return stringBuilder.toString();
            }
            stringBuilder.append(c2);
        }
    }

    public String d(char c) {
        StringBuilder stringBuilder = new StringBuilder();
        while (true) {
            char c2;
            if ((c2 = this.e()) == c || c2 == '\u0000' || c2 == '\n' || c2 == '\r') {
                if (c2 != '\u0000') {
                    this.b();
                }
                return stringBuilder.toString().trim();
            }
            stringBuilder.append(c2);
        }
    }

    public String a(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        while (true) {
            char c;
            if (string.indexOf(c = this.e()) >= 0 || c == '\u0000' || c == '\n' || c == '\r') {
                if (c != '\u0000') {
                    this.b();
                }
                return stringBuilder.toString().trim();
            }
            stringBuilder.append(c);
        }
    }

    public Object h() {
        String string;
        char c = this.g();
        switch (c) {
            case '\"': 
            case '\'': {
                return this.c(c);
            }
            case '{': {
                this.b();
                return new et(this);
            }
            case '[': {
                this.b();
                return new ep(this);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (c >= ' ' && ",:]}/\\\"[{;=#".indexOf(c) < 0) {
            stringBuilder.append(c);
            c = this.e();
        }
        if (!this.b) {
            this.b();
        }
        if ("".equals(string = stringBuilder.toString().trim())) {
            throw this.b("Missing value");
        }
        return et.F(string);
    }

    public char e(char c) {
        char c2;
        long l = this.c;
        long l2 = this.a;
        long l3 = this.d;
        this.f.mark(1000000);
        do {
            if ((c2 = this.e()) != '\u0000') continue;
            this.f.reset();
            this.c = l;
            this.a = l2;
            this.d = l3;
            return '\u0000';
        } while (c2 != c);
        this.f.mark(1);
        this.b();
        return c2;
    }

    public eq b(String string) {
        return new eq(string + this.toString());
    }

    public eq a(String string, Throwable throwable) {
        return new eq(string + this.toString(), throwable);
    }

    public String toString() {
        return " at " + this.c + " [character " + this.a + " line " + this.d + "]";
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
                    eD.field304 = 28506 ^ -8087;
                    eD.field305 = -27758 ^ -8087;
                    eD.k = new int[4][2];
                    var13 = new String[18];
                    var11_1 = 0;
                    var10_2 = "\u00b1\u00fc!\u00bd63\u00a2\u00a97p\f\u00e1\u00eb\u00f1\u0015_\u008c\u00c9\u009f\u008a\u0013\u00e9\u0084\u0014~\u00ea\u00e7'\u00da^\u00d4\u00d0'G\u00ac|\u0001\u00ec\u00eaR\u00bd\u0017\u0006\u00d8\u0013\u0010\u00f6\u0003(\u00e7\u0098\u00a7\u00ec[\u00c0s\u0089\u00be\u00a4\u00d6q\u00c3LT\r7\u00a3\u00fbs\u0004$\u00adV\u00c2\u0005\u00bc\u0097*(\u00cbx\u00af\u00b5C\u0098va\u00c7O\u008d\u00ab\u00aeT\u00f6S\u00c1\u00e3\u00c6\u0015\u00aey\u00e5\u00fb\u00f8'B\u0099Rnbt\u0012\u00da\u00e7\u001bz\u001f&r0\u00dc\u0016]\u0085\"O\u001c\u00a3T\u00bb\u00d7A\u0095\u0084\u0090\\T\u00f0\u00c1\u009a\u0019\u009c\u00e8\u0081\u0090)\u00f1:$X\u00ac\u00d5\u00df\u0010\u00df\n\u00dav \u001b\u00cf;\u00b9\u00b2Z\u001a\u00feI\fR\u00ef4\u00cdP\u000e\u00ec\u001c\n\u0002X0\u0013\u00e3wT\u0094\u00ac(\u001a\u001e\u00fe\u009e\u0097Gf\u008b\u0006\u00be \u008a\u00b50\u00a8\u00c2\u00d3\u001f\u00f3\u001c&\u00c9\u0013\u00f6?\u00e8\u0088\u00b13\u00fa $O\u0000\u00c8\u00cf\u00d2\u00eb\u00d7d\u0019\u00939m\u000fs\u00ab\u00c4Q\u0090\u000b%\u001aq\u0088vQ\u001bG/]\u00ef\u000fb!\u00ca\u0090\u00d0\u0083\u00f3LpT\u0094\u00f9\u00d4\u0019\u009b\u000f\u00f1u\u00b8\u001a\u009e\u00d2:fI\u0011\u00b3Q0\f\u0007\u0016\u00e4CM\u00f0\u00fcH\u0002\n\u00e9H\u00e4M\u00feK13d.\u00d5G\u00e7\u00f7\n\u00ad\u0096\u00a2\u00f0F\u009a\u00ac\u009c\u00f6\u00d6\u00048j\u00dd\u0010\u0006t\u0081I\u008f\u0007K";
                    var12_3 = "\u00b1\u00fc!\u00bd63\u00a2\u00a97p\f\u00e1\u00eb\u00f1\u0015_\u008c\u00c9\u009f\u008a\u0013\u00e9\u0084\u0014~\u00ea\u00e7'\u00da^\u00d4\u00d0'G\u00ac|\u0001\u00ec\u00eaR\u00bd\u0017\u0006\u00d8\u0013\u0010\u00f6\u0003(\u00e7\u0098\u00a7\u00ec[\u00c0s\u0089\u00be\u00a4\u00d6q\u00c3LT\r7\u00a3\u00fbs\u0004$\u00adV\u00c2\u0005\u00bc\u0097*(\u00cbx\u00af\u00b5C\u0098va\u00c7O\u008d\u00ab\u00aeT\u00f6S\u00c1\u00e3\u00c6\u0015\u00aey\u00e5\u00fb\u00f8'B\u0099Rnbt\u0012\u00da\u00e7\u001bz\u001f&r0\u00dc\u0016]\u0085\"O\u001c\u00a3T\u00bb\u00d7A\u0095\u0084\u0090\\T\u00f0\u00c1\u009a\u0019\u009c\u00e8\u0081\u0090)\u00f1:$X\u00ac\u00d5\u00df\u0010\u00df\n\u00dav \u001b\u00cf;\u00b9\u00b2Z\u001a\u00feI\fR\u00ef4\u00cdP\u000e\u00ec\u001c\n\u0002X0\u0013\u00e3wT\u0094\u00ac(\u001a\u001e\u00fe\u009e\u0097Gf\u008b\u0006\u00be \u008a\u00b50\u00a8\u00c2\u00d3\u001f\u00f3\u001c&\u00c9\u0013\u00f6?\u00e8\u0088\u00b13\u00fa $O\u0000\u00c8\u00cf\u00d2\u00eb\u00d7d\u0019\u00939m\u000fs\u00ab\u00c4Q\u0090\u000b%\u001aq\u0088vQ\u001bG/]\u00ef\u000fb!\u00ca\u0090\u00d0\u0083\u00f3LpT\u0094\u00f9\u00d4\u0019\u009b\u000f\u00f1u\u00b8\u001a\u009e\u00d2:fI\u0011\u00b3Q0\f\u0007\u0016\u00e4CM\u00f0\u00fcH\u0002\n\u00e9H\u00e4M\u00feK13d.\u00d5G\u00e7\u00f7\n\u00ad\u0096\u00a2\u00f0F\u009a\u00ac\u009c\u00f6\u00d6\u00048j\u00dd\u0010\u0006t\u0081I\u008f\u0007K".length();
                    var9_4 = 10;
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
                        var10_2 = "\u0095\u00e5\u00a6M\u00fa\u00db\u0090\u0097\u00d3\u00a2\u00ba\u001a3\u00e0Z\n\u008d\u00ee\u00fbC0\u00e21\u0081\u008fs\u00a6w\u00a9;\u0086=Ww\u00be\u00e9\u0098\u00e6\u0081gE}\u00bc\u009fM\u00ac9\u00f1\u008d\"\u00be\u007f\u00c3\u001eV\u00b1\u0005\u00daa\u000b\u00ee8\u00ffF\u0002-u\u00cc9\u001ay}:x\u00d3m\u00f3\u00e8\"|\u00a7\u0092nA";
                        var12_3 = "\u0095\u00e5\u00a6M\u00fa\u00db\u0090\u0097\u00d3\u00a2\u00ba\u001a3\u00e0Z\n\u008d\u00ee\u00fbC0\u00e21\u0081\u008fs\u00a6w\u00a9;\u0086=Ww\u00be\u00e9\u0098\u00e6\u0081gE}\u00bc\u009fM\u00ac9\u00f1\u008d\"\u00be\u007f\u00c3\u001eV\u00b1\u0005\u00daa\u000b\u00ee8\u00ffF\u0002-u\u00cc9\u001ay}:x\u00d3m\u00f3\u00e8\"|\u00a7\u0092nA".length();
                        var9_4 = 49;
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
                                v13 = 23;
                                break;
                            }
                            case 1: {
                                v13 = 67;
                                break;
                            }
                            case 2: {
                                v13 = 104;
                                break;
                            }
                            case 3: {
                                v13 = 88;
                                break;
                            }
                            case 4: {
                                v13 = 2;
                                break;
                            }
                            case 5: {
                                v13 = 50;
                                break;
                            }
                            default: {
                                v13 = 78;
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
            eD.i = var13;
            eD.j = new String[18];
            var0_7 = 1974562488958334412L;
            var6_8 = new long[20];
            var3_9 = 0;
            var4_10 = "9\u0002T<\u00e4\u00d8\f\u00ba@Ez\u00d1D\u0012X\u00fa\u008e\f/\u009b4!\u00933't\u00b0\u00b9\u0014\u00ec[\u001b/\u000b\u0005)\u0011\u00dc\u00a5K^Y\u00b5d\t\u0099\u0018\u0080\u00cbF\u008f\u00ff%\u0089H\u00bf\u007fR\u008e\u0095\u0006\u009d\u0018\u00f2l\u0000\u00e8`\u00e0\r\u00ebg\u0015\u00df\u0083s\u00d6\u00d6(\u00b0\u00e4w\u00b0\u009cB_\u00bdf\u00daw4\u009b\u009bX^'\u0003\u00ad\u00db\u0019\u00b8\u0018Rv2\u00c1\u00da\u00c0JB\u00e4\u00dc\u00d6\u00cb\u00a1\u00d6HO\u00b8( \u00cd\u00d1\u00bc\u0095\u001c\u00e7\u0012\u0003.b\u00f1m\u00b6\u00a0c\nz\u00f6t\u00e7\u0082\u001f[";
            var5_11 = "9\u0002T<\u00e4\u00d8\f\u00ba@Ez\u00d1D\u0012X\u00fa\u008e\f/\u009b4!\u00933't\u00b0\u00b9\u0014\u00ec[\u001b/\u000b\u0005)\u0011\u00dc\u00a5K^Y\u00b5d\t\u0099\u0018\u0080\u00cbF\u008f\u00ff%\u0089H\u00bf\u007fR\u008e\u0095\u0006\u009d\u0018\u00f2l\u0000\u00e8`\u00e0\r\u00ebg\u0015\u00df\u0083s\u00d6\u00d6(\u00b0\u00e4w\u00b0\u009cB_\u00bdf\u00daw4\u009b\u009bX^'\u0003\u00ad\u00db\u0019\u00b8\u0018Rv2\u00c1\u00da\u00c0JB\u00e4\u00dc\u00d6\u00cb\u00a1\u00d6HO\u00b8( \u00cd\u00d1\u00bc\u0095\u001c\u00e7\u0012\u0003.b\u00f1m\u00b6\u00a0c\nz\u00f6t\u00e7\u0082\u001f[".length();
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
                var4_10 = "\"\nd\u00efe\u00ba\u00e8ta\u00ac;g+;\u00d1\u00f9";
                var5_11 = "\"\nd\u00efe\u00ba\u00e8ta\u00ac;g+;\u00d1\u00f9".length();
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
                eD.m = var6_8;
                eD.n = new Integer[20];
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
lbl139:
            // 1 sources

            ** continue;
        }
    }
}

