/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.Gson;
import com.google.gson.T;
import com.google.gson.V;
import com.google.gson.W;
import com.google.gson.Z;
import com.google.gson.a;
import com.google.gson.aa_0;
import com.google.gson.aw_0;
import com.google.gson.b_0;
import com.google.gson.cJ;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from com.google.gson.av
 */
public final class av_0
implements Cloneable,
V {
    private static final double b;
    public static final av_0 a;
    private double c = -1.0;
    private int d = 136;
    private boolean e = true;
    private boolean f;
    private List g = Collections.emptyList();
    private List h = Collections.emptyList();
    private static final long[] i;
    private static final Integer[] j;
    public static final int[][] k;
    private static /* synthetic */ int field80;
    private static /* synthetic */ int field81;

    protected av_0 a() {
        return (av_0)super.clone();
    }

    public av_0 a(double d2) {
        av_0 av_02 = this.a();
        av_02.c = d2;
        return av_02;
    }

    public av_0 a(int ... nArray) {
        av_0 av_02 = this.a();
        av_02.d = 0;
        for (int n : nArray) {
            av_02.d |= n;
        }
        return av_02;
    }

    public av_0 b() {
        av_0 av_02 = this.a();
        av_02.e = false;
        return av_02;
    }

    public av_0 c() {
        av_0 av_02 = this.a();
        av_02.f = true;
        return av_02;
    }

    public av_0 a(a a2, boolean bl, boolean bl2) {
        av_0 av_02;
        block1: {
            av_02 = this.a();
            if (bl) {
                av_02.g = new ArrayList(this.g);
                av_02.g.add(a2);
            }
            if (!bl2) break block1;
            av_02.h = new ArrayList(this.h);
            av_02.h.add(a2);
        }
        return av_02;
    }

    @Override
    public T a(Gson gson, cJ cJ2) {
        boolean bl;
        Class clazz = cJ2.a();
        boolean bl2 = this.a(clazz);
        boolean bl3 = bl2 || this.b(clazz, true);
        boolean bl4 = bl = bl2 || this.b(clazz, false);
        if (!bl3 && !bl) {
            return null;
        }
        return new aw_0(this, bl, bl3, gson, cJ2);
    }

    public boolean a(Field field, boolean bl) {
        Object object;
        if ((this.d & field.getModifiers()) != 0) {
            return true;
        }
        if (this.c != -1.0 && !this.a(field.getAnnotation(Z.class), field.getAnnotation(aa_0.class))) {
            return true;
        }
        if (field.isSynthetic()) {
            return true;
        }
        if (this.f && ((object = field.getAnnotation(W.class)) == null || (bl ? !object.a() : !object.b()))) {
            return true;
        }
        if (!this.e && this.c(field.getType())) {
            return true;
        }
        if (this.b(field.getType())) {
            return true;
        }
        Object object2 = object = bl ? this.g : this.h;
        if (!object.isEmpty()) {
            b_0 b_02 = new b_0(field);
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                a a2 = (a)iterator.next();
                if (!a2.a(b_02)) continue;
                return true;
            }
        }
        return false;
    }

    private boolean a(Class clazz) {
        if (this.c != -1.0 && !this.a(clazz.getAnnotation(Z.class), clazz.getAnnotation(aa_0.class))) {
            return true;
        }
        if (!this.e && this.c(clazz)) {
            return true;
        }
        return this.b(clazz);
    }

    public boolean a(Class clazz, boolean bl) {
        return this.a(clazz) || this.b(clazz, bl);
    }

    private boolean b(Class clazz, boolean bl) {
        List list = bl ? this.g : this.h;
        for (a a2 : list) {
            if (!a2.a(clazz)) continue;
            return true;
        }
        return false;
    }

    private boolean b(Class clazz) {
        return !Enum.class.isAssignableFrom(clazz) && !this.d(clazz) && (clazz.isAnonymousClass() || clazz.isLocalClass());
    }

    private boolean c(Class clazz) {
        return clazz.isMemberClass() && !this.d(clazz);
    }

    private boolean d(Class clazz) {
        return clazz.getModifiers() != 0;
    }

    private boolean a(Z z, aa_0 aa_02) {
        return this.a(z) && this.a(aa_02);
    }

    private boolean a(Z z) {
        double d2;
        return z == null || !((d2 = z.a()) > this.c);
    }

    private boolean a(aa_0 aa_02) {
        double d2;
        return aa_02 == null || !((d2 = aa_02.a()) <= this.c);
    }

    protected /* synthetic */ Object clone() {
        return this.a();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        field80 = 0x587A ^ 0xFFFFC53A;
        field81 = 0xFFFFF5CA ^ 0xFFFFC53A;
        k = new int[1][4];
        b = -1.0;
        long l = 8188561122260658527L;
        long[] lArray = new long[2];
        int n = 0;
        String string = "K\u00b6u\u0092\u00c1\u00bdo\u009cYO\u00af2I\u0095>\u00d7";
        int n2 = "K\u00b6u\u0092\u00c1\u00bdo\u009cYO\u00af2I\u0095>\u00d7".length();
        int n3 = 0;
        do {
            byte[] byArray = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            lArray[n4] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l;
        } while (n3 < n2);
        i = lArray;
        j = new Integer[2];
        a = new av_0();
    }
}

