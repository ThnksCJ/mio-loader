/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.honestlyidfk;

import java.util.ArrayList;
import me.mioclient.loader.dA;
import me.mioclient.loader.dC;
import me.mioclient.loader.dD;
import me.mioclient.loader.dE;
import me.mioclient.loader.dG;
import me.mioclient.loader.dH;
import me.mioclient.loader.dI;
import me.mioclient.loader.dJ;
import me.mioclient.loader.dK;
import me.mioclient.loader.dL;
import me.mioclient.loader.dM;
import me.mioclient.loader.dP;
import me.mioclient.loader.dS;
import me.mioclient.loader.dU;
import me.mioclient.loader.dV;
import me.mioclient.loader.honestlyidfk.dB;
import me.mioclient.loader.honestlyidfk.dF;
import me.mioclient.loader.honestlyidfk.dN;
import me.mioclient.loader.honestlyidfk.dT;
import me.mioclient.loader.honestlyidfk.dX;
import me.mioclient.loader.honestlyidfk.dz_0;

public class dQ {
    private final dP a;
    private final dU b = new dU(null);
    private final dU c = new dU(null);
    private int d;
    private static final String[] e;
    private static final String[] f;
    private static final long g;
    public static final int[][] h;
    private static /* synthetic */ int field250;
    private static /* synthetic */ int field251;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private dQ(String string) {
        this.a = new dP(string);
    }

    private dT a() {
        dT dT2 = new dT();
        this.o();
        while (!this.p()) {
            dT2.a.add(this.b());
        }
        return dT2;
    }

    public static dT a(String string) {
        return new dQ(string).a();
    }

    private dz_0 b() {
        if (this.a(new dV[]{dV.D})) {
            if (this.b.b.isEmpty()) {
                this.a("Expected section index.", null);
            }
            int n = this.b.c;
            int n2 = Integer.parseInt(this.b.b);
            dz_0 dz_02 = this.c();
            dz_02 = new dK(n, this.b.d, n2, dz_02);
            if (n2 > (int)g) {
                this.a("Section index cannot be larger than 255.", dz_02);
            }
            return dz_02;
        }
        return this.c();
    }

    private dz_0 c() {
        return this.d();
    }

    private dz_0 d() {
        int n = this.b.c;
        dz_0 dz_02 = this.e();
        if (this.a(new dV[]{dV.x})) {
            dz_0 dz_03 = this.b();
            this.a(dV.y, "Expected ':' after first part of condition.", dz_02);
            dz_0 dz_04 = this.b();
            dz_02 = new dE(n, this.b.d, dz_02, dz_03, dz_04);
        }
        return dz_02;
    }

    private dz_0 e() {
        dz_0 dz_02 = this.f();
        while (this.a(new dV[]{dV.g})) {
            int n = this.b.c;
            dz_0 dz_03 = this.f();
            dz_02 = new dH(n, this.b.d, dz_02, dV.g, dz_03);
        }
        return dz_02;
    }

    private dz_0 f() {
        dz_0 dz_02 = this.g();
        while (this.a(new dV[]{dV.h})) {
            int n = this.b.c;
            dz_0 dz_03 = this.g();
            dz_02 = new dH(n, this.b.d, dz_02, dV.h, dz_03);
        }
        return dz_02;
    }

    private dz_0 g() {
        int n = this.b.c;
        dz_0 dz_02 = this.h();
        while (this.a(dV.i, dV.j)) {
            dV dV2 = this.b.a;
            dz_0 dz_03 = this.h();
            dz_02 = new dA(n, this.b.d, dz_02, dV2, dz_03);
        }
        return dz_02;
    }

    private dz_0 h() {
        int n = this.b.c;
        dz_0 dz_02 = this.i();
        while (this.a(dV.k, dV.l, dV.m, dV.n)) {
            dV dV2 = this.b.a;
            dz_0 dz_03 = this.i();
            dz_02 = new dA(n, this.b.d, dz_02, dV2, dz_03);
        }
        return dz_02;
    }

    private dz_0 i() {
        int n = this.b.c;
        dz_0 dz_02 = this.j();
        while (this.a(dV.o, dV.p)) {
            dV dV2 = this.b.a;
            dz_0 dz_03 = this.j();
            dz_02 = new dA(n, this.b.d, dz_02, dV2, dz_03);
        }
        return dz_02;
    }

    private dz_0 j() {
        int n = this.b.c;
        dz_0 dz_02 = this.k();
        while (this.a(dV.q, dV.r, dV.s, dV.t)) {
            dV dV2 = this.b.a;
            dz_0 dz_03 = this.k();
            dz_02 = new dA(n, this.b.d, dz_02, dV2, dz_03);
        }
        return dz_02;
    }

    private dz_0 k() {
        if (this.a(dV.u, dV.p)) {
            int n = this.b.c;
            dV dV2 = this.b.a;
            dz_0 dz_02 = this.k();
            return new dM(n, this.b.d, dV2, dz_02);
        }
        return this.l();
    }

    private dz_0 l() {
        dz_0 dz_02 = this.m();
        int n = this.b.c;
        while (true) {
            if (this.a(new dV[]{dV.z})) {
                dz_02 = this.a(dz_02);
                continue;
            }
            if (!this.a(new dV[]{dV.v})) break;
            if (!this.a(dV.b)) {
                dz_02 = new dF(n, this.c.d, dz_02, "");
            }
            dU dU2 = this.a(dV.b, "Expected field name after '.'.", dz_02);
            dz_02 = new dF(n, this.b.d, dz_02, dU2.b);
        }
        return dz_02;
    }

    private dz_0 a(dz_0 dz_02) {
        ArrayList<dz_0> arrayList = new ArrayList<dz_0>(2);
        if (!this.a(dV.A)) {
            do {
                arrayList.add(this.c());
            } while (this.a(new dV[]{dV.w}));
        }
        dD dD2 = new dD(dz_02.a, this.b.d, dz_02, arrayList);
        this.a(dV.A, "Expected ')' after function arguments.", dD2);
        return dD2;
    }

    private dz_0 m() {
        if (this.a(new dV[]{dV.d})) {
            return new dI(this.b.c, this.b.d);
        }
        if (this.a(new dV[]{dV.a})) {
            return new dL(this.b.c, this.b.d, this.b.b);
        }
        if (this.a(dV.e, dV.f)) {
            return new dC(this.b.c, this.b.d, this.b.b.equals("true"));
        }
        if (this.a(new dV[]{dV.c})) {
            return new dJ(this.b.c, this.b.d, Double.parseDouble(this.b.b));
        }
        if (this.a(new dV[]{dV.b})) {
            return new dN(this.b.c, this.b.d, this.b.b);
        }
        if (this.a(new dV[]{dV.z})) {
            int n = this.b.c;
            dz_0 dz_02 = this.b();
            dz_02 = new dG(n, this.b.d, dz_02);
            this.a(dV.A, "Expected ')' after expression.", dz_02);
            return dz_02;
        }
        if (this.d == 0 && this.a(new dV[]{dV.B})) {
            int n = this.b.c;
            ++this.d;
            dz_0 dz_03 = this.b();
            dz_03 = new dB(n, this.b.d, dz_03);
            this.a(dV.C, "Expected '}' after expression.", dz_03);
            --this.d;
            return dz_03;
        }
        this.a("Expected expression.", null);
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void n() {
        while (!this.p()) {
            if (this.a(new dV[]{dV.B})) {
                ++this.d;
                continue;
            }
            if (this.a(new dV[]{dV.C})) {
                --this.d;
                if (this.d != 0) continue;
                return;
            }
            this.o();
        }
        return;
    }

    private void a(String string, dz_0 dz_02) {
        throw new dS(new dX(this.c.e, this.c.f, this.c.g, string, dz_02));
    }

    private dU a(dV dV2, String string, dz_0 dz_02) {
        if (this.a(dV2)) {
            return this.o();
        }
        this.a(string, dz_02);
        return null;
    }

    private boolean a(dV ... dVArray) {
        for (dV dV2 : dVArray) {
            if (!this.a(dV2)) continue;
            this.o();
            return true;
        }
        return false;
    }

    private boolean a(dV dV2) {
        if (this.p()) {
            return false;
        }
        return this.c.a == dV2;
    }

    private dU o() {
        this.b.a(this.c);
        this.a.a();
        this.c.a(this.a.a, this.a.b, this.a.f, this.a.g, this.a.c, this.a.d, this.a.e);
        return this.b;
    }

    private boolean p() {
        return this.c.a == dV.F;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block22: {
                block21: {
                    block23: {
                        break block23;
lbl1:
                        // 1 sources

                        return;
                    }
                    dQ.field250 = 26961 ^ -12599;
                    dQ.field251 = -19492 ^ -12599;
                    dQ.h = new int[4][2];
                    var7 = new String[9];
                    var5_1 = 0;
                    var4_2 = "\u00b0\u0011\u00d3\u00ab\u00ees\u009a1F\u00b1M[O\u00e4jY\u00da8;\u00e6\u0007\u00c5+\u00a8\u00c3\u0016\u0086\u00e3(\u009c\u00c8J2; \u00c7\u001ej\u00c4\u00e9\u00b6:\u00bb(9Q%\fK\u00afn\u0096\u00fb\u00c0\u00c4W\u00b3.\u00a3|M7\u00ec\u008a\u0012\b\u00ffW\u00c1&\u0010\u00c3\u009a}\u00e2|\u0099\u00af\u0015Y\u00cfb#x\u0017\u0096\u00bf\u0017~v\u00c9\u0089f$\u000f^\u0016\u00cd\u0089\u00ed\u00e7G\u00ad+.\u008e\u0094\u00ca\u001e\u00fa\u00e6\u009aU\u00c7\u00ac\u00bf\u00ca\u00e2\u00ce\u00ca\u00b4\u00ce\u0019Z\u00e6\u00dc\u00cf\u00fb\u001b\u000e\u001b8 \u00d37\u00b5\u00b9]g\u001e\u00c6\u00e0\u001d\u00957\u00b4\u00a1\u00c9!\u00ef\u00f2\u00bb\u00cd\u00f7\u00b9\u0084*\u00c5\u00e4\u00e3\u0019\u00ff\u00e6h\u00cfmY\u008a\u000eh&\u008b&\u00b4M\u0002\u00af\u0007\u00aa\u00f5\u00c2(5\u0092)\u00d1\u00e0\u00ad\u000f\u00d5\u0000\u00c6\u0005\u009c/n\u00f9\\\u00b0\u0088\u00bccE\u0003\u00ad\u00e3\u00c9P\u00b5\u0004@[\u00df\u00a9";
                    var6_3 = "\u00b0\u0011\u00d3\u00ab\u00ees\u009a1F\u00b1M[O\u00e4jY\u00da8;\u00e6\u0007\u00c5+\u00a8\u00c3\u0016\u0086\u00e3(\u009c\u00c8J2; \u00c7\u001ej\u00c4\u00e9\u00b6:\u00bb(9Q%\fK\u00afn\u0096\u00fb\u00c0\u00c4W\u00b3.\u00a3|M7\u00ec\u008a\u0012\b\u00ffW\u00c1&\u0010\u00c3\u009a}\u00e2|\u0099\u00af\u0015Y\u00cfb#x\u0017\u0096\u00bf\u0017~v\u00c9\u0089f$\u000f^\u0016\u00cd\u0089\u00ed\u00e7G\u00ad+.\u008e\u0094\u00ca\u001e\u00fa\u00e6\u009aU\u00c7\u00ac\u00bf\u00ca\u00e2\u00ce\u00ca\u00b4\u00ce\u0019Z\u00e6\u00dc\u00cf\u00fb\u001b\u000e\u001b8 \u00d37\u00b5\u00b9]g\u001e\u00c6\u00e0\u001d\u00957\u00b4\u00a1\u00c9!\u00ef\u00f2\u00bb\u00cd\u00f7\u00b9\u0084*\u00c5\u00e4\u00e3\u0019\u00ff\u00e6h\u00cfmY\u008a\u000eh&\u008b&\u00b4M\u0002\u00af\u0007\u00aa\u00f5\u00c2(5\u0092)\u00d1\u00e0\u00ad\u000f\u00d5\u0000\u00c6\u0005\u009c/n\u00f9\\\u00b0\u0088\u00bccE\u0003\u00ad\u00e3\u00c9P\u00b5\u0004@[\u00df\u00a9".length();
                    var3_4 = 43;
                    var2_5 = -1;
lbl15:
                    // 2 sources

                    while (true) {
                        v0 = ++var2_5;
                        v1 = var4_2.substring(v0, v0 + var3_4);
                        v2 = -1;
                        break block21;
                        break;
                    }
lbl21:
                    // 1 sources

                    while (true) {
                        var7[var5_1++] = v3.intern();
                        if ((var2_5 += var3_4) < var6_3) {
                            var3_4 = var4_2.charAt(var2_5);
                            ** continue;
                        }
                        var4_2 = "\u0099\u00f8\u00f6\u0096J\u00d4\u000e\u00c5\u00d4m]\u009d\u0015\u0085,\u00f6\u00a97\u0096\u00f1\u001e\u008c#T\u00ed\u001e\u00bb\u0084(\u0085\u0092r?\u0007hc\u00c8\u00fb\n\u001f\u00a3\u0092\f\u00ab\u00c2\u00a1k\u00fb2\u0094\u0016";
                        var6_3 = "\u0099\u00f8\u00f6\u0096J\u00d4\u000e\u00c5\u00d4m]\u009d\u0015\u0085,\u00f6\u00a97\u0096\u00f1\u001e\u008c#T\u00ed\u001e\u00bb\u0084(\u0085\u0092r?\u0007hc\u00c8\u00fb\n\u001f\u00a3\u0092\f\u00ab\u00c2\u00a1k\u00fb2\u0094\u0016".length();
                        var3_4 = 20;
                        var2_5 = -1;
lbl31:
                        // 2 sources

                        while (true) {
                            v4 = ++var2_5;
                            v1 = var4_2.substring(v4, v4 + var3_4);
                            v2 = 0;
                            break block21;
                            break;
                        }
                        break;
                    }
lbl36:
                    // 1 sources

                    while (true) {
                        var7[var5_1++] = v3.intern();
                        if ((var2_5 += var3_4) < var6_3) {
                            var3_4 = var4_2.charAt(var2_5);
                            ** continue;
                        }
                        break block22;
                        break;
                    }
                }
                v5 = v1.toCharArray();
                var8_6 = 0;
                v6 = v5.length;
                v7 = v5;
                v8 = v6;
                if (v6 > 1) ** GOTO lbl86
                do {
                    v9 = v7;
                    v10 = v7;
                    v11 = var8_6;
                    while (true) {
                        v12 = v9[v11];
                        switch (var8_6 % 7) {
                            case 0: {
                                v13 = 98;
                                break;
                            }
                            case 1: {
                                v13 = 117;
                                break;
                            }
                            case 2: {
                                v13 = 20;
                                break;
                            }
                            case 3: {
                                v13 = 53;
                                break;
                            }
                            case 4: {
                                v13 = 11;
                                break;
                            }
                            case 5: {
                                v13 = 29;
                                break;
                            }
                            default: {
                                v13 = 76;
                            }
                        }
                        v9[v11] = (char)(v12 ^ v13);
                        ++var8_6;
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
                } while (v8 > var8_6);
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
            dQ.e = var7;
            dQ.f = new String[9];
            break block24;
lbl100:
            // 1 sources

            while (true) {
                dQ.g = 3361119609667389319L ^ var0_7;
                ** continue;
                break;
            }
        }
        var0_7 = 256729012034013048L;
        ** while (true)
    }
}

