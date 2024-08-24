/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.Gson;
import com.google.gson.JsonReader;
import com.google.gson.T;
import com.google.gson.bB;
import com.google.gson.bE;
import com.google.gson.bJ;
import com.google.gson.cJ;
import com.google.gson.cO;
import java.lang.reflect.Field;

class bC
extends bE {
    final /* synthetic */ Field a;
    final /* synthetic */ boolean b;
    final /* synthetic */ T c;
    final /* synthetic */ Gson d;
    final /* synthetic */ cJ e;
    final /* synthetic */ boolean f;
    final /* synthetic */ bB g;
    public static final int[][] h;
    private static /* synthetic */ int field198;
    private static /* synthetic */ int field199;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    bC(bB bB2, String string, boolean bl, boolean bl2, Field field, boolean bl3, T t, Gson gson, cJ cJ2, boolean bl4) {
        this.g = bB2;
        this.a = field;
        this.b = bl3;
        this.c = t;
        this.d = gson;
        this.e = cJ2;
        this.f = bl4;
        super(string, bl, bl2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    void a(cO cO2, Object object) {
        Object object2 = this.a.get(object);
        T t = this.b ? this.c : new bJ(this.d, this.c, this.e.b());
        t.a(cO2, object2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    void a(JsonReader jsonReader, Object object) {
        Object object2 = this.c.b(jsonReader);
        if (object2 == null && this.f) {
            return;
        }
        this.a.set(object, object2);
    }

    @Override
    public boolean a(Object object) {
        if (!this.i) {
            return false;
        }
        Object object2 = this.a.get(object);
        return object2 != object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field198 = 0x7CFA ^ 0xFFFF98B2;
        field199 = 0xFFFFDDDC ^ 0xFFFF98B2;
        h = new int[4][4];
    }
}

