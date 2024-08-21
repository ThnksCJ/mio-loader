/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import me.mioclient.loader.gson.GSONBuilder;
import me.mioclient.loader.gson.JsonReader;
import me.mioclient.loader.gson.T;
import me.mioclient.loader.gson.av_0;
import me.mioclient.loader.gson.cJ;
import me.mioclient.loader.gson.cO;

/*
 * Renamed from me.mioclient.loader.gson.aw
 */
class aw_0
extends T {
    private T f;
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ GSONBuilder c;
    final /* synthetic */ cJ d;
    final /* synthetic */ av_0 e;
    public static final int[][] g;
    private static /* synthetic */ int field74;
    private static /* synthetic */ int field75;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    aw_0(av_0 av_02, boolean bl, boolean bl2, GSONBuilder gSONBuilder, cJ cJ2) {
        this.e = av_02;
        this.a = bl;
        this.b = bl2;
        this.c = gSONBuilder;
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

