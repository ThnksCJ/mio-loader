/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.ac_0;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/*
 * Renamed from com.google.gson.ad
 */
final class ad_0
implements Serializable,
GenericArrayType {
    private final Type a;
    private static final long b;
    private static final String c;
    public static final int[][] d;
    private static /* synthetic */ int field4;
    private static /* synthetic */ int field5;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public ad_0(Type type) {
        this.a = ac_0.d(type);
    }

    @Override
    public Type getGenericComponentType() {
        return this.a;
    }

    public boolean equals(Object object) {
        return object instanceof GenericArrayType && ac_0.a((Type)this, (GenericArrayType)object);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return ac_0.f(this.a) + c;
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
                field4 = 0x633D ^ 0xFFFFF1E7;
                field5 = 0xFFFFFD13 ^ 0xFFFFF1E7;
                d = new int[3][4];
                b = 0L;
                char[] cArray3 = "K6".toCharArray();
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
                        case 0 -> 16;
                        case 1 -> 107;
                        case 2 -> 126;
                        case 3 -> 84;
                        case 4 -> 57;
                        case 5 -> 25;
                        default -> 80;
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
        c = new String(cArray).intern();
    }
}

