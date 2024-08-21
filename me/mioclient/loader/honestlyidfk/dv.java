/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.honestlyidfk;

import java.util.Iterator;
import java.util.function.Supplier;
import me.mioclient.loader.honestlyidfk.dB;
import me.mioclient.loader.honestlyidfk.dF;
import me.mioclient.loader.honestlyidfk.dN;
import me.mioclient.loader.honestlyidfk.dQ;
import me.mioclient.loader.honestlyidfk.dT;
import me.mioclient.loader.honestlyidfk.dW;
import me.mioclient.loader.honestlyidfk.dX;
import me.mioclient.loader.honestlyidfk.dY;
import me.mioclient.loader.honestlyidfk.dZ;
import me.mioclient.loader.honestlyidfk.dq_0;
import me.mioclient.loader.honestlyidfk.dr;
import me.mioclient.loader.honestlyidfk.dt_0;
import me.mioclient.loader.honestlyidfk.dw_0;
import me.mioclient.loader.honestlyidfk.dz_0;
import me.mioclient.loader.honestlyidfk.ea;
import me.mioclient.loader.honestlyidfk.eb;
import me.mioclient.loader.honestlyidfk.ei;

public class dv {
    private final ei a = new ei();
    private final dZ b = new dZ();
    private static final String[] c;
    private static final String[] d;
    private static final long[] e;
    private static final Integer[] f;
    public static final int[][] g;
    private static /* synthetic */ int field294;
    private static /* synthetic */ int field295;

    public dt_0 a(dr dr2, StringBuilder stringBuilder) {
        this.b.a();
        stringBuilder.setLength(0);
        int n = 0;
        dt_0 dt_02 = null;
        dt_0 dt_03 = null;
        int n2 = 0;
        block37: while (true) {
            switch (dw_0.a[dq_0.a(dr2.a[n++]).ordinal()]) {
                case 1: {
                    this.a((eb)dr2.b.get(dr2.a[n++]));
                    continue block37;
                }
                case 2: {
                    this.a(eb.a());
                    continue block37;
                }
                case 3: {
                    this.a(eb.a(true));
                    continue block37;
                }
                case 4: {
                    this.a(eb.a(false));
                    continue block37;
                }
                case 5: {
                    eb eb2 = this.a();
                    Object object = this.a();
                    if (((eb)object).d() && eb2.d()) {
                        this.a(eb.a(((eb)object).i() + eb2.i()));
                        continue block37;
                    }
                    if (((eb)object).e()) {
                        this.a(eb.a(((eb)object).j() + eb2.toString()));
                        continue block37;
                    }
                    this.a("Can only add 2 numbers or 1 string and other value.", new Object[0]);
                    continue block37;
                }
                case 6: {
                    eb eb3 = this.a();
                    Object object = this.a();
                    if (((eb)object).d() && eb3.d()) {
                        this.a(eb.a(((eb)object).i() - eb3.i()));
                        continue block37;
                    }
                    this.a("Can only subtract 2 numbers.", new Object[0]);
                    continue block37;
                }
                case 7: {
                    eb eb4 = this.a();
                    Object object = this.a();
                    if (((eb)object).d() && eb4.d()) {
                        this.a(eb.a(((eb)object).i() * eb4.i()));
                        continue block37;
                    }
                    this.a("Can only multiply 2 numbers.", new Object[0]);
                    continue block37;
                }
                case 8: {
                    eb eb5 = this.a();
                    Object object = this.a();
                    if (((eb)object).d() && eb5.d()) {
                        this.a(eb.a(((eb)object).i() / eb5.i()));
                        continue block37;
                    }
                    this.a("Can only divide 2 numbers.", new Object[0]);
                    continue block37;
                }
                case 9: {
                    eb eb6 = this.a();
                    Object object = this.a();
                    if (((eb)object).d() && eb6.d()) {
                        this.a(eb.a(((eb)object).i() % eb6.i()));
                        continue block37;
                    }
                    this.a("Can only modulo 2 numbers.", new Object[0]);
                    continue block37;
                }
                case 10: {
                    eb eb7 = this.a();
                    Object object = this.a();
                    if (((eb)object).d() && eb7.d()) {
                        this.a(eb.a(Math.pow(((eb)object).i(), eb7.i())));
                        continue block37;
                    }
                    this.a("Can only power 2 numbers.", new Object[0]);
                    continue block37;
                }
                case 11: {
                    eb eb8 = (eb)dr2.b.get(dr2.a[n++]);
                    Object object = this.a();
                    if (((eb)object).d() && eb8.d()) {
                        this.a(eb.a(((eb)object).i() + eb8.i()));
                        continue block37;
                    }
                    if (((eb)object).e()) {
                        this.a(eb.a(((eb)object).j() + eb8.toString()));
                        continue block37;
                    }
                    this.a("Can only add 2 numbers or 1 string and other value.", new Object[0]);
                    continue block37;
                }
                case 12: {
                    this.a();
                    continue block37;
                }
                case 13: {
                    this.a(eb.a(!this.a().m()));
                    continue block37;
                }
                case 14: {
                    eb eb9 = this.a();
                    if (eb9.d()) {
                        this.a(eb.a(-eb9.i()));
                        continue block37;
                    }
                    this.a("This operation requires a number.", new Object[0]);
                    continue block37;
                }
                case 15: {
                    this.a(eb.a(this.a().equals(this.a())));
                    continue block37;
                }
                case 16: {
                    this.a(eb.a(!this.a().equals(this.a())));
                    continue block37;
                }
                case 17: {
                    eb eb10 = this.a();
                    Object object = this.a();
                    if (((eb)object).d() && eb10.d()) {
                        this.a(eb.a(((eb)object).i() > eb10.i()));
                        continue block37;
                    }
                    this.a("This operation requires 2 number.", new Object[0]);
                    continue block37;
                }
                case 18: {
                    eb eb11 = this.a();
                    Object object = this.a();
                    if (((eb)object).d() && eb11.d()) {
                        this.a(eb.a(((eb)object).i() >= eb11.i()));
                        continue block37;
                    }
                    this.a("This operation requires 2 number.", new Object[0]);
                    continue block37;
                }
                case 19: {
                    eb eb12 = this.a();
                    Object object = this.a();
                    if (((eb)object).d() && eb12.d()) {
                        this.a(eb.a(((eb)object).i() < eb12.i()));
                        continue block37;
                    }
                    this.a("This operation requires 2 number.", new Object[0]);
                    continue block37;
                }
                case 20: {
                    eb eb13 = this.a();
                    Object object = this.a();
                    if (((eb)object).d() && eb13.d()) {
                        this.a(eb.a(((eb)object).i() <= eb13.i()));
                        continue block37;
                    }
                    this.a("This operation requires 2 number.", new Object[0]);
                    continue block37;
                }
                case 21: {
                    String string = ((eb)dr2.b.get(dr2.a[n++])).j();
                    Object object = this.a.a(string);
                    this.a(object != null ? (eb)object.get() : eb.a());
                    continue block37;
                }
                case 22: {
                    String string = ((eb)dr2.b.get(dr2.a[n++])).j();
                    Object object = this.a();
                    if (!((eb)object).g()) {
                        this.a(eb.a());
                        continue block37;
                    }
                    Object object2 = ((eb)object).l().a(string);
                    this.a(object2 != null ? (eb)object2.get() : eb.a());
                    continue block37;
                }
                case 23: {
                    Object object2;
                    byte by = dr2.a[n++];
                    Object object = this.a(by);
                    if (((eb)object).f()) {
                        object2 = ((eb)object).k().run(this, by);
                        this.a();
                        this.a((eb)object2);
                        continue block37;
                    }
                    this.a("Tried to call a %s, can only call functions.", new Object[]{((eb)object).a});
                    continue block37;
                }
                case 24: {
                    int n3 = dr2.a[n++] << 8 | dr2.a[n++];
                    n += n3;
                    continue block37;
                }
                case 25: {
                    int n4 = dr2.a[n++] << 8 | dr2.a[n++];
                    if (!this.b().m()) continue block37;
                    n += n4;
                    continue block37;
                }
                case 26: {
                    int n5 = dr2.a[n++] << 8 | dr2.a[n++];
                    if (this.b().m()) continue block37;
                    n += n5;
                    continue block37;
                }
                case 27: {
                    dt_03 = dt_02 == null ? (dt_02 = new dt_0(n2, stringBuilder.toString())) : (dt_03.c = new dt_0(n2, stringBuilder.toString()));
                    stringBuilder.setLength(0);
                    n2 = dr2.a[n++];
                    continue block37;
                }
                case 28: {
                    stringBuilder.append(this.a().toString());
                    continue block37;
                }
                case 29: {
                    stringBuilder.append(((eb)dr2.b.get(dr2.a[n++])).toString());
                    continue block37;
                }
                case 30: {
                    Supplier supplier = this.a.a(((eb)dr2.b.get(dr2.a[n++])).j());
                    stringBuilder.append((supplier == null ? eb.a() : (eb)supplier.get()).toString());
                    continue block37;
                }
                case 31: {
                    String string = ((eb)dr2.b.get(dr2.a[n++])).j();
                    Object object = this.a();
                    if (!((eb)object).g()) {
                        stringBuilder.append(eb.a());
                        continue block37;
                    }
                    Object object2 = ((eb)object).l().a(string);
                    stringBuilder.append((object2 != null ? (eb)object2.get() : eb.a()).toString());
                    continue block37;
                }
                case 32: {
                    Object object2;
                    byte by = dr2.a[n++];
                    Object object = this.a(by);
                    if (((eb)object).f()) {
                        object2 = ((eb)object).k().run(this, by);
                        this.a();
                        stringBuilder.append(((eb)object2).toString());
                        continue block37;
                    }
                    this.a("Tried to call a %s, can only call functions.", new Object[]{((eb)object).a});
                    continue block37;
                }
                case 33: {
                    Object object = ((eb)dr2.b.get(dr2.a[n++])).j();
                    Object object2 = this.a.a((String)object);
                    eb eb14 = object2 != null ? (eb)object2.get() : eb.a();
                    object = ((eb)dr2.b.get(dr2.a[n++])).j();
                    if (!eb14.g()) {
                        this.a(eb.a());
                        continue block37;
                    }
                    object2 = eb14.l().a((String)object);
                    this.a(object2 != null ? (eb)object2.get() : eb.a());
                    continue block37;
                }
                case 34: {
                    Object object = ((eb)dr2.b.get(dr2.a[n++])).j();
                    Object object2 = this.a.a((String)object);
                    eb eb15 = object2 != null ? (eb)object2.get() : eb.a();
                    object = ((eb)dr2.b.get(dr2.a[n++])).j();
                    if (!eb15.g()) {
                        this.a(eb.a());
                        continue block37;
                    }
                    object2 = eb15.l().a((String)object);
                    eb15 = object2 != null ? (eb)object2.get() : eb.a();
                    stringBuilder.append(eb15.toString());
                    continue block37;
                }
                case 35: {
                    break block37;
                }
                default: {
                    throw new UnsupportedOperationException("Unknown instruction '" + (Object)((Object)dq_0.a(dr2.a[n])) + "'");
                }
            }
            break;
        }
        if (dt_02 != null) {
            dt_03.c = new dt_0(n2, stringBuilder.toString());
            return dt_02;
        }
        return new dt_0(n2, stringBuilder.toString());
    }

    public dt_0 a(dr dr2) {
        return this.a(dr2, new StringBuilder());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(eb eb2) {
        this.b.a(eb2);
    }

    public eb a() {
        return (eb)this.b.b();
    }

    public eb b() {
        return (eb)this.b.c();
    }

    public eb a(int n) {
        return (eb)this.b.a(n);
    }

    public boolean a(String string) {
        eb eb2;
        block0: {
            eb2 = this.a();
            if (eb2.c()) break block0;
            this.a(string, new Object[0]);
        }
        return eb2.h();
    }

    public double b(String string) {
        eb eb2;
        block0: {
            eb2 = this.a();
            if (eb2.d()) break block0;
            this.a(string, new Object[0]);
        }
        return eb2.i();
    }

    public String c(String string) {
        eb eb2;
        block0: {
            eb2 = this.a();
            if (eb2.e()) break block0;
            this.a(string, new Object[0]);
        }
        return eb2.j();
    }

    public void a(String string, Object ... objectArray) {
        throw new ea(String.format(string, objectArray));
    }

    public ei a(String string, Supplier supplier) {
        return this.a.a(string, supplier);
    }

    public ei a(String string, eb eb2) {
        return this.a.a(string, eb2);
    }

    public ei a(String string, boolean bl2) {
        return this.a.a(string, bl2);
    }

    public ei a(String string, double d2) {
        return this.a.a(string, d2);
    }

    public ei a(String string, String string2) {
        return this.a.a(string, string2);
    }

    public ei a(String string, dY dY2) {
        return this.a.a(string, dY2);
    }

    public ei a(String string, ei ei2) {
        return this.a.a(string, ei2);
    }

    public ei c() {
        return this.a;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(String string, int n, dW dW2) {
        dT dT2 = dQ.a(string);
        for (Object object : dT2.a) {
            this.a(string, n, (dz_0)object, dW2);
        }
        Iterator iterator = dT2.b.iterator();
        while (iterator.hasNext()) {
            Object object;
            object = (dX)iterator.next();
            if (((dX)object).e == null) continue;
            this.a(string, n, ((dX)object).e, dW2);
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(String string, int n, dz_0 dz_03, dW dW2) {
        if (n < dz_03.a) return;
        if (n > dz_03.b && n != string.length()) {
            return;
        }
        if (dz_03 instanceof dN) {
            dN dN2 = (dN)dz_03;
            String string2 = string.substring(((dz_0)dN2).a, n);
            Iterator iterator = this.a.a().iterator();
            while (iterator.hasNext()) {
                String string3 = (String)iterator.next();
                if (string3.startsWith("_") || !string3.startsWith(string2)) continue;
                dW2.a(string3, ((eb)this.a.a(string3).get()).f());
            }
            return;
        }
        if (dz_03 instanceof dF) {
            dF dF2 = (dF)dz_03;
            if (n < dF2.b - dF2.d.length()) {
                dz_03.a((T dz_02) -> this.a(string, n, (dz_0)dz_02, dW2));
                return;
            }
            eb eb2 = this.a(dF2.c);
            if (eb2 == null) return;
            if (!eb2.g()) return;
            String string4 = string.substring(dF2.c.b + 1, n);
            Iterator iterator = eb2.l().a().iterator();
            while (iterator.hasNext()) {
                String string5 = (String)iterator.next();
                if (string5.startsWith("_") || !string5.startsWith(string4)) continue;
                dW2.a(string5, ((eb)eb2.l().a(string5).get()).f());
            }
            return;
        }
        if (!(dz_03 instanceof dB)) {
            dz_03.a((T dz_02) -> this.a(string, n, (dz_0)dz_02, dW2));
            return;
        }
        if (((dB)dz_03).c != null) {
            dz_03.a((T dz_02) -> this.a(string, n, (dz_0)dz_02, dW2));
            return;
        }
        Iterator iterator = this.a.a().iterator();
        while (iterator.hasNext()) {
            String string6 = (String)iterator.next();
            if (string6.startsWith("_")) continue;
            dW2.a(string6, ((eb)this.a.a(string6).get()).f());
        }
    }

    private eb a(dz_0 dz_02) {
        if (dz_02 instanceof dN) {
            Supplier supplier = this.a.a(((dN)dz_02).c);
            return supplier != null ? (eb)supplier.get() : null;
        }
        if (dz_02 instanceof dF) {
            eb eb2 = this.a(((dF)dz_02).c);
            if (eb2 == null || !eb2.g()) {
                return null;
            }
            Supplier supplier = eb2.l().a(((dF)dz_02).d);
            return supplier != null ? (eb)supplier.get() : null;
        }
        return null;
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
                    dv.field294 = 30718 ^ -5159;
                    dv.field295 = -15135 ^ -5159;
                    dv.g = new int[2][4];
                    var13 = new String[13];
                    var11_1 = 0;
                    var10_2 = "\"o\u00ec@&\u00d8za\u00e4\u00f3\u0011\u0097\u0095~3mpic\u00e6\u00f2\u00c5\u0091\tHD\u001c\u00e7\u001aT\u00ee1\r\u0098\u00db\u00b8\u00b3\u0086~\u00e5\u00c3\u0087M$F;V-;\u00013EM\u0088\u00eb\u001a\u00a4\u00b3<\u00db<\u00ab9\u000f\u008c7\u001a5.r\u00d1\u00e5gx\u0081\u00c4\u00ae\u0081\u001a\u00819U!;\u00c7=.\u00b4-\u0092\u00e24\u0019\u000ep\u00cet\u00db5\u00d7+1\u00c9\u00df\u00b8\u00de\u00134\u0011\u0006#\u00ae\u00b7\u009dj#3\u00fe\u00baw\u00faU\u008f\u0014\u008b)\u00ab\u00a5+\u00e6\u00efx\u008d\u00b3\u00bf\u00b8\u00c8\u001b\u0003\u0015\u00ff4*\u0011\u0011\u00e6\u0018^P\u00ee\u00b3\u000e<\u00e1C\u007f\u0098%\u00a9\u009bHw\u0083\u00dc>\u00f3\u00e3\u00e13\u00b8\u009b\u00bf\u00deL\u000b7\u001bM\u00b9)iw\u00a7J\u0084\u00f5\u009ep\u00ec\u0002\u00876oP8\u009dSwPlY\u00a8\u0092\u00c6\u0018\u00f8\u00c7\\\bA\u00bb\u0017\n\u00e6\u00cb\u00ee7\u00b5\u00c2)!\u0018#Y\u00b28\u00be\u0003\u0090\u0006WH\u00b9\u0006M\u00c2\u0012\u00f4\u00cfUUS+Oa\u0006_@\u00eaf\u008e\u0084M\u0000,\u000b:;\u00de0\u00a8\u00ca\u00fe\u00e9\u00d3\u00b8n\u00ac\\\u00b5\u00e53+\u00bc\u00c2\r\u00bd\u00aa7Y\u00db_\u00f1\u008aa\u00f9\u008fi\u00aa\u00fa\u00a4\u00f1\u00c1))*_\u0014\f\u001c\u00b7\u000f^LpY\u00b0Q\u00bd\u00fc&D\u00f1P\u0014Hh\b\u001e\u009f\u0089\u0002\u0095\u0014\u00d7\u00a9\u00daw,\u0000KZ\u00f0\u001cmOFY\u00c4\u00ae\u008cn\u0000\u00edn8Z\u00dd\u00ec!x/\u008f\u00e9\u00ccI\u0013H=\u00a1\u0004b\u00db\u009b\u008a\u00dd\u0004\u00ac\u0091\u009aH\u0002\u00ee\u0019 M\u00ac\u0004.P{p\u00c4\u00c5\u0013\u00c6\u001fc\u00aa\b\u00bc\u00db\u00b1/\u00df\u00e0\u00cdKk";
                    var12_3 = "\"o\u00ec@&\u00d8za\u00e4\u00f3\u0011\u0097\u0095~3mpic\u00e6\u00f2\u00c5\u0091\tHD\u001c\u00e7\u001aT\u00ee1\r\u0098\u00db\u00b8\u00b3\u0086~\u00e5\u00c3\u0087M$F;V-;\u00013EM\u0088\u00eb\u001a\u00a4\u00b3<\u00db<\u00ab9\u000f\u008c7\u001a5.r\u00d1\u00e5gx\u0081\u00c4\u00ae\u0081\u001a\u00819U!;\u00c7=.\u00b4-\u0092\u00e24\u0019\u000ep\u00cet\u00db5\u00d7+1\u00c9\u00df\u00b8\u00de\u00134\u0011\u0006#\u00ae\u00b7\u009dj#3\u00fe\u00baw\u00faU\u008f\u0014\u008b)\u00ab\u00a5+\u00e6\u00efx\u008d\u00b3\u00bf\u00b8\u00c8\u001b\u0003\u0015\u00ff4*\u0011\u0011\u00e6\u0018^P\u00ee\u00b3\u000e<\u00e1C\u007f\u0098%\u00a9\u009bHw\u0083\u00dc>\u00f3\u00e3\u00e13\u00b8\u009b\u00bf\u00deL\u000b7\u001bM\u00b9)iw\u00a7J\u0084\u00f5\u009ep\u00ec\u0002\u00876oP8\u009dSwPlY\u00a8\u0092\u00c6\u0018\u00f8\u00c7\\\bA\u00bb\u0017\n\u00e6\u00cb\u00ee7\u00b5\u00c2)!\u0018#Y\u00b28\u00be\u0003\u0090\u0006WH\u00b9\u0006M\u00c2\u0012\u00f4\u00cfUUS+Oa\u0006_@\u00eaf\u008e\u0084M\u0000,\u000b:;\u00de0\u00a8\u00ca\u00fe\u00e9\u00d3\u00b8n\u00ac\\\u00b5\u00e53+\u00bc\u00c2\r\u00bd\u00aa7Y\u00db_\u00f1\u008aa\u00f9\u008fi\u00aa\u00fa\u00a4\u00f1\u00c1))*_\u0014\f\u001c\u00b7\u000f^LpY\u00b0Q\u00bd\u00fc&D\u00f1P\u0014Hh\b\u001e\u009f\u0089\u0002\u0095\u0014\u00d7\u00a9\u00daw,\u0000KZ\u00f0\u001cmOFY\u00c4\u00ae\u008cn\u0000\u00edn8Z\u00dd\u00ec!x/\u008f\u00e9\u00ccI\u0013H=\u00a1\u0004b\u00db\u009b\u008a\u00dd\u0004\u00ac\u0091\u009aH\u0002\u00ee\u0019 M\u00ac\u0004.P{p\u00c4\u00c5\u0013\u00c6\u001fc\u00aa\b\u00bc\u00db\u00b1/\u00df\u00e0\u00cdKk".length();
                    var9_4 = 26;
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
                        var10_2 = "H{S\u00b9y\u00df+\u00bc\u0003\u00d2\u00e8\t\u0012[@\u00d0\u00a4\u0097_^\u0012JgMP\u00da\u00b3Z\u0018\u0098K\u008f\u00f9\u0015\u00df\u0081\u0082=N\u00e9u$\u000e#6\u00c43G\u0099-\u00b8\u00f0J&\u009d";
                        var12_3 = "H{S\u00b9y\u00df+\u00bc\u0003\u00d2\u00e8\t\u0012[@\u00d0\u00a4\u0097_^\u0012JgMP\u00da\u00b3Z\u0018\u0098K\u008f\u00f9\u0015\u00df\u0081\u0082=N\u00e9u$\u000e#6\u00c43G\u0099-\u00b8\u00f0J&\u009d".length();
                        var9_4 = 33;
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
                                v13 = 102;
                                break;
                            }
                            case 1: {
                                v13 = 45;
                                break;
                            }
                            case 2: {
                                v13 = 33;
                                break;
                            }
                            case 3: {
                                v13 = 101;
                                break;
                            }
                            case 4: {
                                v13 = 83;
                                break;
                            }
                            case 5: {
                                v13 = 54;
                                break;
                            }
                            default: {
                                v13 = 58;
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
            dv.c = var13;
            dv.d = new String[13];
            var0_7 = 7789566548547980037L;
            var6_8 = new long[4];
            var3_9 = 0;
            var4_10 = "M\u0081O\u00b9C\u00eds\u0019\u009f\u00ef*\u00de\u00fc\u0080M\u00df";
            var5_11 = "M\u0081O\u00b9C\u00eds\u0019\u009f\u00ef*\u00de\u00fc\u0080M\u00df".length();
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
                var4_10 = "'\u00cbK\u00bf,o\u00cd3\u00d8\u00b1`\u00d2\u00e7}\u00ed\u009a";
                var5_11 = "'\u00cbK\u00bf,o\u00cd3\u00d8\u00b1`\u00d2\u00e7}\u00ed\u009a".length();
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
                dv.e = var6_8;
                dv.f = new Integer[4];
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

