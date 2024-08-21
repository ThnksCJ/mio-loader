/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader;

import me.mioclient.loader.dV;

public class dP {
    public dV a;
    public String b;
    public int c = 1;
    public int d = -1;
    public char e;
    private final String h;
    public int f;
    public int g;
    private int i;
    private static final String[] j;
    private static final String[] k;
    private static final long[] l;
    private static final Integer[] m;
    public static final int[][] n;
    private static /* synthetic */ int field248;
    private static /* synthetic */ int field249;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public dP(String string) {
        this.h = string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a() {
        this.f = this.g;
        if (this.j()) {
            this.a(dV.F);
            return;
        }
        if (this.i > 0) {
            this.e();
            if (this.j()) {
                this.a(dV.F);
                return;
            }
            char c = this.g();
            if (this.b(c) || c == '-' && this.b(this.h())) {
                this.c();
                return;
            }
            if (this.c(c)) {
                this.d();
                return;
            }
            switch (c) {
                case '\"': 
                case '\'': {
                    this.b();
                    return;
                }
                case '=': {
                    if (this.a('=')) {
                        this.a(dV.i);
                        return;
                    }
                    this.f();
                    return;
                }
                case '!': {
                    this.a(this.a('=') ? dV.j : dV.u);
                    return;
                }
                case '>': {
                    this.a(this.a('=') ? dV.l : dV.k);
                    return;
                }
                case '<': {
                    this.a(this.a('=') ? dV.n : dV.m);
                    return;
                }
                case '+': {
                    this.a(dV.o);
                    return;
                }
                case '-': {
                    this.a(dV.p);
                    return;
                }
                case '*': {
                    this.a(dV.q);
                    return;
                }
                case '/': {
                    this.a(dV.r);
                    return;
                }
                case '%': {
                    this.a(dV.s);
                    return;
                }
                case '^': {
                    this.a(dV.t);
                    return;
                }
                case '.': {
                    this.a(dV.v);
                    return;
                }
                case ',': {
                    this.a(dV.w);
                    return;
                }
                case '?': {
                    this.a(dV.x);
                    return;
                }
                case ':': {
                    this.a(dV.y);
                    return;
                }
                case '(': {
                    this.a(dV.z);
                    return;
                }
                case ')': {
                    this.a(dV.A);
                    return;
                }
                case '{': {
                    ++this.i;
                    this.a(dV.B);
                    return;
                }
                case '}': {
                    --this.i;
                    this.a(dV.C);
                    return;
                }
                case '#': {
                    while (this.b(this.h())) {
                        this.g();
                    }
                    this.a(dV.D, this.h.substring(this.f + 1, this.g));
                    return;
                }
                default: {
                    this.f();
                }
            }
            return;
        }
        char c = this.g();
        if (c == '\n') {
            ++this.c;
        }
        if (c == '{') {
            ++this.i;
            this.a(dV.B);
            return;
        }
        if (c == '#') {
            while (this.b(this.h())) {
                this.g();
            }
            this.a(dV.D, this.h.substring(this.f + 1, this.g));
            return;
        }
        while (!this.j() && this.h() != '{' && this.h() != '#') {
            if (this.h() == '\n') {
                ++this.c;
            }
            this.g();
        }
        this.a(dV.a);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void b() {
        while (!this.j() && this.h() != '\"' && this.h() != '\'') {
            if (this.h() == '\n') {
                ++this.c;
            }
            this.g();
        }
        if (this.j()) {
            this.a(dV.E, "Unterminated expression.");
            return;
        }
        this.g();
        this.a(dV.a, this.h.substring(this.f + 1, this.g - 1));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void c() {
        while (this.b(this.h())) {
            this.g();
        }
        if (this.h() == '.' && this.b(this.i())) {
            this.g();
            while (this.b(this.h())) {
                this.g();
            }
        }
        this.a(dV.c);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void d() {
        while (!this.j() && this.d(this.h())) {
            this.g();
        }
        this.a(dV.b);
        switch (this.b) {
            case "null": {
                this.a = dV.d;
                return;
            }
            case "true": {
                this.a = dV.e;
                return;
            }
            case "false": {
                this.a = dV.f;
                return;
            }
            case "and": {
                this.a = dV.g;
                return;
            }
            case "or": {
                this.a = dV.h;
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void e() {
        block4: while (true) {
            if (this.j()) {
                return;
            }
            char c = this.h();
            switch (c) {
                case '\t': 
                case '\r': 
                case ' ': {
                    this.g();
                    continue block4;
                }
                case '\n': {
                    ++this.c;
                    this.g();
                    continue block4;
                }
            }
            break;
        }
        this.f = this.g;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void f() {
        this.a(dV.E, "Unexpected character.");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void a(dV dV2, String string) {
        this.a = dV2;
        this.b = string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void a(dV dV2) {
        this.a(dV2, this.h.substring(this.f, this.g));
    }

    private boolean a(char c) {
        if (this.j()) {
            return false;
        }
        if (this.h.charAt(this.g) != c) {
            return false;
        }
        this.g();
        return true;
    }

    private char g() {
        ++this.d;
        this.e = this.h.charAt(this.g++);
        return this.e;
    }

    private char h() {
        if (this.j()) {
            return '\u0000';
        }
        return this.h.charAt(this.g);
    }

    private char i() {
        if (this.g + 1 >= this.h.length()) {
            return '\u0000';
        }
        return this.h.charAt(this.g + 1);
    }

    private boolean j() {
        return this.g >= this.h.length();
    }

    private boolean b(char c) {
        return c >= '0' && c <= '9';
    }

    private boolean c(char c) {
        return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c == '_';
    }

    private boolean d(char c) {
        return this.c(c) || this.b(c);
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
                    dP.field248 = 9815 ^ -19804;
                    dP.field249 = -24615 ^ -19804;
                    dP.n = new int[3][2];
                    var13 = new String[7];
                    var11_1 = 0;
                    var10_2 = "\u0087X\u0088\u00b0\u0018\u0019\u00d5_\u009e\u00b8\u00c1\u00db\u00f1U\u001e`\u0086S\u00c4Q*\u00d8\u00bc\u008f\u009b\u001cf\u00a2\u0097\u0004\u0086v\u00e8\u009b\u0015\u0083\u00d5\u001d\u0083\u00c1\u00d4\u00bc@\u00f6a\u00d5|@xx(\u00a7\u00deE\u00e5\u00d6\u0005\u00a8\u009f$/\u00db";
                    var12_3 = "\u0087X\u0088\u00b0\u0018\u0019\u00d5_\u009e\u00b8\u00c1\u00db\u00f1U\u001e`\u0086S\u00c4Q*\u00d8\u00bc\u008f\u009b\u001cf\u00a2\u0097\u0004\u0086v\u00e8\u009b\u0015\u0083\u00d5\u001d\u0083\u00c1\u00d4\u00bc@\u00f6a\u00d5|@xx(\u00a7\u00deE\u00e5\u00d6\u0005\u00a8\u009f$/\u00db".length();
                    var9_4 = 4;
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
                        var10_2 = "\u00c1w\u0003u[p";
                        var12_3 = "\u00c1w\u0003u[p".length();
                        var9_4 = 2;
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
                                v13 = 12;
                                break;
                            }
                            case 1: {
                                v13 = 108;
                                break;
                            }
                            case 2: {
                                v13 = 118;
                                break;
                            }
                            case 3: {
                                v13 = 111;
                                break;
                            }
                            case 4: {
                                v13 = 21;
                                break;
                            }
                            case 5: {
                                v13 = 91;
                                break;
                            }
                            default: {
                                v13 = 59;
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
            dP.j = var13;
            dP.k = new String[7];
            var0_7 = 6050382540255189440L;
            var6_8 = new long[19];
            var3_9 = 0;
            var4_10 = "\u00f6 \u009aV\u0001y^A/\u00c6,\u0087{,\u00d2\u00b3\u0089j\u0018\u00bdw%\u009a\u00a4r\u00af\u0006\u00c9_\u00d4\u008eXO\u00b8\u0083\u00c7\u00bbg<+\u00b9 \u00a6\u00e6$\u00a3\u00ac\u00bb\u00fc\u0082\u0000jy\u0080P\u00e7\u000b\u00b8I\u00e4yC;l|\u0085[\u00ces&\u0005\u0093qcW\u00c9J\u00e5\u008c\u00cf\u00f9\u00f5\u00fdN\u008c\u00e7t\u009fZa\u0092\u0004\u00fei\u00ae:\u0016f(\u00de\u000b\u001f\u0080\u00ebo\u00a6\u008f1$\u00ed\u0006\u0098\u008d\u00ef\u00af\u00fe&j\u0083\u0000\u00ff]\u00b6\u0001\u0005\u00d9\u0002\u00a8\u00c1\u00fb\u00caU3`\u00b5\u00f0";
            var5_11 = "\u00f6 \u009aV\u0001y^A/\u00c6,\u0087{,\u00d2\u00b3\u0089j\u0018\u00bdw%\u009a\u00a4r\u00af\u0006\u00c9_\u00d4\u008eXO\u00b8\u0083\u00c7\u00bbg<+\u00b9 \u00a6\u00e6$\u00a3\u00ac\u00bb\u00fc\u0082\u0000jy\u0080P\u00e7\u000b\u00b8I\u00e4yC;l|\u0085[\u00ces&\u0005\u0093qcW\u00c9J\u00e5\u008c\u00cf\u00f9\u00f5\u00fdN\u008c\u00e7t\u009fZa\u0092\u0004\u00fei\u00ae:\u0016f(\u00de\u000b\u001f\u0080\u00ebo\u00a6\u008f1$\u00ed\u0006\u0098\u008d\u00ef\u00af\u00fe&j\u0083\u0000\u00ff]\u00b6\u0001\u0005\u00d9\u0002\u00a8\u00c1\u00fb\u00caU3`\u00b5\u00f0".length();
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
                var4_10 = "X\u00b0\u0090l1\u0014\u00ff\u00d0*\u00e5\u00d6 \u00fb\u0099\u0082\u00b5";
                var5_11 = "X\u00b0\u0090l1\u0014\u00ff\u00d0*\u00e5\u00d6 \u00fb\u0099\u0082\u00b5".length();
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
                dP.l = var6_8;
                dP.m = new Integer[19];
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

