/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;

public final class aA
extends Number {
    private final String a;
    private static final String b;
    public static final int[][] c;
    private static /* synthetic */ int field114;
    private static /* synthetic */ int field115;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public aA(String string) {
        this.a = string;
    }

    @Override
    public int intValue() {
        return Integer.parseInt(this.a);
    }

    @Override
    public long longValue() {
        return Long.parseLong(this.a);
    }

    @Override
    public float floatValue() {
        return Float.parseFloat(this.a);
    }

    @Override
    public double doubleValue() {
        return Double.parseDouble(this.a);
    }

    public String toString() {
        return this.a;
    }

    private Object a() {
        return new BigDecimal(this.a);
    }

    private void a(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException(b);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof aA) {
            aA aA2 = (aA)object;
            return this.a == aA2.a || this.a.equals(aA2.a);
        }
        return false;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n;
            int n2;
            char[] cArray2;
            int n3;
            block11: {
                field114 = 0x78D0 ^ 0xFFFFE317;
                field115 = 0xFFFFC96C ^ 0xFFFFE317;
                c = new int[3][3];
                char[] cArray3 = "\\P\u0016j*eet\\\u001fn,ekv\u0015\f|xyjk@\u0015\u007f7~p}Q".toCharArray();
                n3 = 0;
                int n4 = cArray3.length;
                cArray2 = cArray3;
                n2 = n4;
                if (n4 <= 1) break block11;
                cArray = cArray2;
                n = n2;
                if (n2 <= n3) break block12;
            }
            do {
                char[] cArray4 = cArray2;
                char[] cArray5 = cArray2;
                int n5 = n3;
                while (true) {
                    char c2 = cArray4[n5];
                    cArray4[n5] = (char)(c2 ^ (switch (n3 % 7) {
                        case 0 -> 24;
                        case 1 -> 53;
                        case 2 -> 101;
                        case 3 -> 15;
                        case 4 -> 88;
                        case 5 -> 12;
                        default -> 4;
                    }));
                    ++n3;
                    cArray2 = cArray5;
                    n2 = n2;
                    if (n2 != 0) break;
                    cArray5 = cArray2;
                    n = n2;
                    n5 = n2;
                    cArray4 = cArray2;
                }
                cArray = cArray2;
                n = n2;
            } while (n2 > n3);
        }
        b = new String(cArray).intern();
    }
}

