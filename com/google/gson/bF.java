/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.Gson;
import com.google.gson.H;
import com.google.gson.JsonElement;
import com.google.gson.JsonReader;
import com.google.gson.T;
import com.google.gson.V;
import com.google.gson.aW;
import com.google.gson.bH;
import com.google.gson.bI;
import com.google.gson.cJ;
import com.google.gson.cO;
import com.google.gson.y_0;

public final class bF
extends T {
    private final H b;
    private final y_0 c;
    final Gson a;
    private final cJ d;
    private final V e;
    private final bH f = new bH(this, null);
    private T g;
    public static final int[][] h;
    private static /* synthetic */ int field74;
    private static /* synthetic */ int field75;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public bF(H h, y_0 y_02, Gson gson, cJ cJ2, V v) {
        this.b = h;
        this.c = y_02;
        this.a = gson;
        this.d = cJ2;
        this.e = v;
    }

    @Override
    public Object b(JsonReader jsonReader) {
        if (this.c == null) {
            return this.b().b(jsonReader);
        }
        JsonElement jsonElement = aW.a(jsonReader);
        if (jsonElement.t()) {
            return null;
        }
        return this.c.a(jsonElement, this.d.b(), this.f);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(cO cO2, Object object) {
        if (this.b == null) {
            this.b().a(cO2, object);
            return;
        }
        if (object == null) {
            cO2.f();
            return;
        }
        JsonElement jsonElement = this.b.a(object, this.d.b(), this.f);
        aW.a(jsonElement, cO2);
    }

    private T b() {
        T t = this.g;
        return t != null ? t : (this.g = this.a.a(this.e, this.d));
    }

    public static V a(cJ cJ2, Object object) {
        return new bI(object, cJ2, false, null);
    }

    public static V b(cJ cJ2, Object object) {
        boolean bl = cJ2.b() == cJ2.a();
        return new bI(object, cJ2, bl, null);
    }

    public static V a(Class clazz, Object object) {
        return new bI(object, null, false, clazz);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field74 = 0x2FFF ^ 0xFFFF988E;
        field75 = 0xFFFFF2AA ^ 0xFFFF988E;
        h = new int[2][2];
    }
}

