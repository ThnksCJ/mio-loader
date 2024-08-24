/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.Gson;
import com.google.gson.T;
import com.google.gson.V;
import com.google.gson.X;
import com.google.gson.Y;
import com.google.gson.aT;
import com.google.gson.aV;
import com.google.gson.ac_0;
import com.google.gson.ag_0;
import com.google.gson.av_0;
import com.google.gson.bC;
import com.google.gson.bD;
import com.google.gson.bE;
import com.google.gson.bo_0;
import com.google.gson.cJ;
import com.google.gson.cy;
import com.google.gson.l_0;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class bB
implements V {
    private final ag_0 a;
    private final l_0 b;
    private final av_0 c;
    private final bo_0 d;
    private final cy e = cy.a();
    private static final String f;
    public static final int[][] g;
    private static /* synthetic */ int field94;
    private static /* synthetic */ int field95;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public bB(ag_0 ag_02, l_0 l_02, av_0 av_02, bo_0 bo_02) {
        this.a = ag_02;
        this.b = l_02;
        this.c = av_02;
        this.d = bo_02;
    }

    public boolean a(Field field, boolean bl) {
        return bB.a(field, bl, this.c);
    }

    static boolean a(Field field, boolean bl, av_0 av_02) {
        return !av_02.a(field.getType(), bl) && !av_02.a(field, bl);
    }

    private List a(Field field) {
        Y y = field.getAnnotation(Y.class);
        if (y == null) {
            String string = this.b.a(field);
            return Collections.singletonList(string);
        }
        String string = y.a();
        String[] stringArray = y.b();
        if (stringArray.length == 0) {
            return Collections.singletonList(string);
        }
        ArrayList<String> arrayList = new ArrayList<String>(stringArray.length + 1);
        arrayList.add(string);
        for (String string2 : stringArray) {
            arrayList.add(string2);
        }
        return arrayList;
    }

    @Override
    public T a(Gson gson, cJ cJ2) {
        Class clazz = cJ2.a();
        if (!Object.class.isAssignableFrom(clazz)) {
            return null;
        }
        aT aT2 = this.a.a(cJ2);
        return new bD(aT2, this.a(gson, cJ2, clazz));
    }

    private bE a(Gson gson, Field field, String string, cJ cJ2, boolean bl, boolean bl2) {
        boolean bl3;
        boolean bl4 = aV.a((Type)cJ2.a());
        X x = field.getAnnotation(X.class);
        T t = null;
        if (x != null) {
            t = this.d.a(this.a, gson, cJ2, x);
        }
        boolean bl5 = bl3 = t != null;
        if (t == null) {
            t = gson.a(cJ2);
        }
        T t2 = t;
        return new bC(this, string, bl, bl2, field, bl3, t2, gson, cJ2, bl4);
    }

    private Map a(Gson gson, cJ cJ2, Class clazz) {
        LinkedHashMap<String, bE> linkedHashMap = new LinkedHashMap<String, bE>();
        if (clazz.isInterface()) {
            return linkedHashMap;
        }
        Type type = cJ2.b();
        while (clazz != Object.class) {
            Field[] fieldArray;
            for (Field field : fieldArray = clazz.getDeclaredFields()) {
                boolean bl = this.a(field, true);
                boolean bl2 = this.a(field, false);
                if (!bl && !bl2) continue;
                this.e.a(field);
                Type type2 = ac_0.a(cJ2.b(), clazz, field.getGenericType());
                List list = this.a(field);
                bE bE2 = null;
                int n = list.size();
                for (int i = 0; i < n; ++i) {
                    String string = (String)list.get(i);
                    if (i != 0) {
                        bl = false;
                    }
                    bE bE3 = this.a(gson, field, string, cJ.b(type2), bl, bl2);
                    bE bE4 = linkedHashMap.put(string, bE3);
                    if (bE2 != null) continue;
                    bE2 = bE4;
                }
                if (bE2 == null) continue;
                throw new IllegalArgumentException(type + f + bE2.h);
            }
            cJ2 = cJ.b(ac_0.a(cJ2.b(), clazz, clazz.getGenericSuperclass()));
            clazz = cJ2.a();
        }
        return linkedHashMap;
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
                field94 = 0x5ACE ^ 0xFFFF887E;
                field95 = 0xFFFFEBCE ^ 0xFFFF887E;
                g = new int[2][1];
                char[] cArray3 = "\";k0-Y9g,.>4T?k/b6ar\u0018M\u0011.5(]'f,.= U.f\u007f".toCharArray();
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
                        case 0 -> 2;
                        case 1 -> 95;
                        case 2 -> 14;
                        case 3 -> 83;
                        case 4 -> 65;
                        case 5 -> 56;
                        default -> 75;
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
        f = new String(cArray).intern();
    }
}

