/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.math.BigDecimal;
import java.math.BigInteger;
import me.mioclient.loader.gson.JsonElement;
import me.mioclient.loader.gson.aA;
import me.mioclient.loader.gson.ab_0;

public final class F
extends JsonElement {
    private final Object a;
    private static final long[] d;
    private static final Integer[] e;
    public static final int[][] b;
    private static /* synthetic */ int field30;
    private static /* synthetic */ int field31;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public F(Boolean bl) {
        this.a = ab_0.a(bl);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public F(Number number) {
        this.a = ab_0.a(number);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public F(String string) {
        this.a = ab_0.a(string);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public F(Character c) {
        this.a = ((Character)ab_0.a(c)).toString();
    }

    public F a() {
        return this;
    }

    public boolean b() {
        return this.a instanceof Boolean;
    }

    @Override
    public boolean o() {
        if (this.b()) {
            return (Boolean)this.a;
        }
        return Boolean.parseBoolean(this.e());
    }

    public boolean c() {
        return this.a instanceof Number;
    }

    @Override
    public Number d() {
        return this.a instanceof String ? new aA((String)this.a) : (Number)this.a;
    }

    public boolean y() {
        return this.a instanceof String;
    }

    @Override
    public String e() {
        if (this.c()) {
            return this.d().toString();
        }
        if (this.b()) {
            return ((Boolean)this.a).toString();
        }
        return (String)this.a;
    }

    @Override
    public double f() {
        return this.c() ? this.d().doubleValue() : Double.parseDouble(this.e());
    }

    @Override
    public BigDecimal g() {
        return this.a instanceof BigDecimal ? (BigDecimal)this.a : new BigDecimal(this.a.toString());
    }

    @Override
    public BigInteger h() {
        return this.a instanceof BigInteger ? (BigInteger)this.a : new BigInteger(this.a.toString());
    }

    @Override
    public float i() {
        return this.c() ? this.d().floatValue() : Float.parseFloat(this.e());
    }

    @Override
    public long j() {
        return this.c() ? this.d().longValue() : Long.parseLong(this.e());
    }

    @Override
    public short n() {
        return this.c() ? this.d().shortValue() : Short.parseShort(this.e());
    }

    @Override
    public int k() {
        return this.c() ? this.d().intValue() : Integer.parseInt(this.e());
    }

    @Override
    public byte l() {
        return this.c() ? this.d().byteValue() : Byte.parseByte(this.e());
    }

    @Override
    public char m() {
        return this.e().charAt(0);
    }

    public int hashCode() {
        if (this.a == null) {
            return 31;
        }
        if (F.a(this)) {
            long l = this.d().longValue();
            return (int)(l ^ l >>> 32);
        }
        if (this.a instanceof Number) {
            long l = Double.doubleToLongBits(this.d().doubleValue());
            return (int)(l ^ l >>> 32);
        }
        return this.a.hashCode();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        F f = (F)object;
        if (this.a == null) {
            return f.a == null;
        }
        if (F.a(this) && F.a(f)) {
            return this.d().longValue() == f.d().longValue();
        }
        if (this.a instanceof Number && f.a instanceof Number) {
            double d2;
            double d3 = this.d().doubleValue();
            return d3 == (d2 = f.d().doubleValue()) || Double.isNaN(d3) && Double.isNaN(d2);
        }
        return this.a.equals(f.a);
    }

    private static boolean a(F f) {
        if (f.a instanceof Number) {
            Number number = (Number)f.a;
            return number instanceof BigInteger || number instanceof Long || number instanceof Integer || number instanceof Short || number instanceof Byte;
        }
        return false;
    }

    @Override
    public /* synthetic */ JsonElement p() {
        return this.a();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        field30 = 0x6F50 ^ 0xFFFF924A;
        field31 = 0xFFFFFAD4 ^ 0xFFFF924A;
        b = new int[2][4];
        long l = 4594729088810918698L;
        long[] lArray = new long[3];
        int n = 0;
        String string = "\u0004\u00db\u00e3e\u007f\u0001\u00af\u00f2 \u0007\u00f7\"z|x\u00fd\u000be&x8\u0098\u0085\u001b";
        int n2 = "\u0004\u00db\u00e3e\u007f\u0001\u00af\u00f2 \u0007\u00f7\"z|x\u00fd\u000be&x8\u0098\u0085\u001b".length();
        int n3 = 0;
        do {
            byte[] byArray = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            lArray[n4] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l;
        } while (n3 < n2);
        d = lArray;
        e = new Integer[3];
    }
}

