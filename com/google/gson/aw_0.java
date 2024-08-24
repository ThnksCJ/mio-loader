/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.Gson;
import com.google.gson.JsonReader;
import com.google.gson.T;
import com.google.gson.av_0;
import com.google.gson.cJ;
import com.google.gson.cO;

/*
 * Renamed from com.google.gson.aw
 */
class aw_0
extends T {
    private T f;
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ Gson c;
    final /* synthetic */ cJ d;
    final /* synthetic */ av_0 e;
    public static final int[][] g;
    private static /* synthetic */ int field74;
    private static /* synthetic */ int field75;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    aw_0(av_0 av_02, boolean bl, boolean bl2, Gson gson, cJ cJ2) {
        this.e = av_02;
        this.a = bl;
        this.b = bl2;
        this.c = gson;
        this.d = cJ2;
    }

    @Override
    public Object b(JsonReader jsonReader) {
        if (this.a) {
            jsonReader.o();
            return null;
        }
        return this.b().b(jsonReader);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(cO cO2, Object object) {
        if (this.b) {
            cO2.f();
            return;
        }
        this.b().a(cO2, object);
    }

    private T b() {
        T t = this.f;
        return t != null ? t : (this.f = this.c.a(this.e, this.d));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field74 = 0x128F ^ 0xFFFFB9F8;
        field75 = 0xFFFF8A7D ^ 0xFFFFB9F8;
        g = new int[1][1];
    }
}

