/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import me.mioclient.loader.gson.JsonElement;
import me.mioclient.loader.gson.T;
import me.mioclient.loader.gson.V;
import me.mioclient.loader.gson.bL;
import me.mioclient.loader.gson.bM;
import me.mioclient.loader.gson.bN;
import me.mioclient.loader.gson.bO;
import me.mioclient.loader.gson.bP;
import me.mioclient.loader.gson.bQ;
import me.mioclient.loader.gson.bR;
import me.mioclient.loader.gson.bS;
import me.mioclient.loader.gson.bT;
import me.mioclient.loader.gson.bU;
import me.mioclient.loader.gson.bV;
import me.mioclient.loader.gson.bW;
import me.mioclient.loader.gson.bX;
import me.mioclient.loader.gson.bY;
import me.mioclient.loader.gson.bZ;
import me.mioclient.loader.gson.cJ;
import me.mioclient.loader.gson.ca_0;
import me.mioclient.loader.gson.cb_0;
import me.mioclient.loader.gson.cc_0;
import me.mioclient.loader.gson.cd_0;
import me.mioclient.loader.gson.ce_0;
import me.mioclient.loader.gson.cf_0;
import me.mioclient.loader.gson.cg_0;
import me.mioclient.loader.gson.ch_0;
import me.mioclient.loader.gson.ci_0;
import me.mioclient.loader.gson.cj_0;
import me.mioclient.loader.gson.ck;
import me.mioclient.loader.gson.cl_0;
import me.mioclient.loader.gson.co_0;
import me.mioclient.loader.gson.cp_0;
import me.mioclient.loader.gson.cq;
import me.mioclient.loader.gson.cr;
import me.mioclient.loader.gson.cs;
import me.mioclient.loader.gson.ct;

public final class bK {
    public static final T a;
    public static final V b;
    public static final T c;
    public static final V d;
    public static final T e;
    public static final T f;
    public static final V g;
    public static final T h;
    public static final V i;
    public static final T j;
    public static final V k;
    public static final T l;
    public static final V m;
    public static final T n;
    public static final V o;
    public static final T p;
    public static final V q;
    public static final T r;
    public static final V s;
    public static final T t;
    public static final T u;
    public static final T v;
    public static final T w;
    public static final V x;
    public static final T y;
    public static final T z;
    public static final T A;
    public static final V B;
    public static final T C;
    public static final V D;
    public static final T E;
    public static final V F;
    public static final T G;
    public static final V H;
    public static final T I;
    public static final V J;
    public static final T K;
    public static final V L;
    public static final T M;
    public static final V N;
    public static final T O;
    public static final V P;
    public static final T Q;
    public static final V R;
    public static final T S;
    public static final V T;
    public static final T U;
    public static final V V;
    public static final V W;
    public static final int[][] X;
    private static /* synthetic */ int field204;
    private static /* synthetic */ int field205;

    private bK() {
        throw new UnsupportedOperationException();
    }

    public static V a(cJ cJ2, T t) {
        return new cg_0(cJ2, t);
    }

    public static V a(Class clazz, T t) {
        return new ci_0(clazz, t);
    }

    public static V a(Class clazz, Class clazz2, T t) {
        return new cj_0(clazz, clazz2, t);
    }

    public static V b(Class clazz, Class clazz2, T t) {
        return new ck(clazz, clazz2, t);
    }

    public static V b(Class clazz, T t) {
        return new cl_0(clazz, t);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field204 = 0x1086 ^ 0xFFFF95B9;
        field205 = 0xFFFFF807 ^ 0xFFFF95B9;
        X = new int[3][1];
        a = new bL().a();
        b = bK.a(Class.class, a);
        c = new bW().a();
        d = bK.a(BitSet.class, c);
        e = new ch_0();
        f = new co_0();
        g = bK.a(Boolean.TYPE, Boolean.class, e);
        h = new cp_0();
        i = bK.a(Byte.TYPE, Byte.class, h);
        j = new cq();
        k = bK.a(Short.TYPE, Short.class, j);
        l = new cr();
        m = bK.a(Integer.TYPE, Integer.class, l);
        n = new cs().a();
        o = bK.a(AtomicInteger.class, n);
        p = new ct().a();
        q = bK.a(AtomicBoolean.class, p);
        r = new bM().a();
        s = bK.a(AtomicIntegerArray.class, r);
        t = new bN();
        u = new bO();
        v = new bP();
        w = new bQ();
        x = bK.a(Character.TYPE, Character.class, w);
        y = new bR();
        z = new bS();
        A = new bT();
        B = bK.a(String.class, y);
        C = new bU();
        D = bK.a(StringBuilder.class, C);
        E = new bV();
        F = bK.a(StringBuffer.class, E);
        G = new bX();
        H = bK.a(URL.class, G);
        I = new bY();
        J = bK.a(URI.class, I);
        K = new bZ();
        L = bK.b(InetAddress.class, K);
        M = new ca_0();
        N = bK.a(UUID.class, M);
        O = new cb_0().a();
        P = bK.a(Currency.class, O);
        Q = new cc_0();
        R = bK.b(Calendar.class, GregorianCalendar.class, Q);
        S = new cd_0();
        T = bK.a(Locale.class, S);
        U = new ce_0();
        V = bK.b(JsonElement.class, U);
        W = new cf_0();
    }
}

