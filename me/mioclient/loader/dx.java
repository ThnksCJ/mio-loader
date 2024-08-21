/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader;

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
import me.mioclient.loader.dO;
import me.mioclient.loader.dV;
import me.mioclient.loader.dy;
import me.mioclient.loader.honestlyidfk.dB;
import me.mioclient.loader.honestlyidfk.dF;
import me.mioclient.loader.honestlyidfk.dN;
import me.mioclient.loader.honestlyidfk.dT;
import me.mioclient.loader.honestlyidfk.dq_0;
import me.mioclient.loader.honestlyidfk.dr;
import me.mioclient.loader.honestlyidfk.dz_0;
import me.mioclient.loader.honestlyidfk.eb;

public class dx
implements dO {
    private final dr a = new dr();
    private int b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    public static final int[][] g;
    private static /* synthetic */ int field246;
    private static /* synthetic */ int field247;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private dx() {
    }

    public static dr a(dT dT2) {
        dx dx2 = new dx();
        for (dz_0 dz_02 : dT2.a) {
            dx2.a(dz_02);
        }
        dx2.a.a(dq_0.I);
        return dx2.a;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(dI dI2) {
        this.a.a(dq_0.b);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(dL dL2) {
        this.a.a(this.b == 0 || this.c ? dq_0.C : dq_0.a, eb.a(dL2.c));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(dJ dJ2) {
        this.a.a(dq_0.a, eb.a(dJ2.c));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(dC dC2) {
        this.a.a(dC2.c ? dq_0.c : dq_0.d);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(dB dB2) {
        ++this.b;
        if (dB2.c instanceof dL) {
            this.c = true;
        } else if (dB2.c instanceof dN) {
            this.d = true;
        } else if (dB2.c instanceof dF) {
            this.e = true;
        } else if (dB2.c instanceof dD) {
            this.f = true;
        }
        this.a(dB2.c);
        if (!(this.c || this.d || this.e || this.f)) {
            this.a.a(dq_0.B);
        } else {
            this.c = false;
            this.d = false;
            this.e = false;
            this.f = false;
        }
        --this.b;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(dG dG2) {
        this.a(dG2.c);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(dA dA2) {
        this.a(dA2.c);
        if (dA2.d == dV.o && (dA2.e instanceof dL || dA2.e instanceof dJ)) {
            this.a.a(dq_0.k, dA2.e instanceof dL ? eb.a(((dL)dA2.e).c) : eb.a(((dJ)dA2.e).c));
            return;
        }
        this.a(dA2.e);
        switch (dy.a[dA2.d.ordinal()]) {
            case 1: {
                this.a.a(dq_0.e);
                return;
            }
            case 2: {
                this.a.a(dq_0.f);
                return;
            }
            case 3: {
                this.a.a(dq_0.g);
                return;
            }
            case 4: {
                this.a.a(dq_0.h);
                return;
            }
            case 5: {
                this.a.a(dq_0.i);
                return;
            }
            case 6: {
                this.a.a(dq_0.j);
                return;
            }
            case 7: {
                this.a.a(dq_0.o);
                return;
            }
            case 8: {
                this.a.a(dq_0.p);
                return;
            }
            case 9: {
                this.a.a(dq_0.q);
                return;
            }
            case 10: {
                this.a.a(dq_0.r);
                return;
            }
            case 11: {
                this.a.a(dq_0.s);
                return;
            }
            case 12: {
                this.a.a(dq_0.t);
                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void a(dM dM2) {
        this.a(dM2.d);
        if (dM2.c == dV.u) {
            this.a.a(dq_0.m);
            return;
        }
        if (dM2.c != dV.p) return;
        this.a.a(dq_0.n);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(dN dN2) {
        this.a.a(this.d ? dq_0.D : dq_0.u, eb.a(dN2.c));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(dF dF2) {
        boolean bl = this.e;
        this.e = false;
        boolean bl2 = dF2.c instanceof dN;
        if (!bl2) {
            this.a(dF2.c);
        }
        this.e = bl;
        if (bl2) {
            this.a.a(this.e ? dq_0.H : dq_0.G, eb.a(((dN)dF2.c).c));
            this.a.a(eb.a(dF2.d));
            return;
        }
        this.a.a(this.e ? dq_0.E : dq_0.v, eb.a(dF2.d));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(dD dD2) {
        boolean bl = this.f;
        this.a(dD2.c);
        this.f = false;
        for (dz_0 dz_02 : dD2.d) {
            this.a(dz_02);
        }
        this.f = bl;
        this.a.a(this.f ? dq_0.F : dq_0.w, dD2.d.size());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(dH dH2) {
        this.a(dH2.c);
        int n = this.a.b(dH2.d == dV.g ? dq_0.z : dq_0.y);
        this.a.a(dq_0.l);
        this.a(dH2.e);
        this.a.a(n);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(dE dE2) {
        this.a(dE2.c);
        int n = this.a.b(dq_0.z);
        this.a.a(dq_0.l);
        this.a(dE2.d);
        int n2 = this.a.b(dq_0.x);
        this.a.a(n);
        this.a.a(dq_0.l);
        this.a(dE2.e);
        this.a.a(n2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(dK dK2) {
        this.a.a(dq_0.A, dK2.c);
        this.a(dK2.d);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void a(dz_0 dz_02) {
        if (dz_02 == null) {
            return;
        }
        dz_02.a(this);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field246 = 0x5253 ^ 0xFFFFDEA0;
        field247 = 0xFFFF877E ^ 0xFFFFDEA0;
        g = new int[1][1];
    }
}

