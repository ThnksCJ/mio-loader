/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import me.mioclient.loader.gson.GSONBuilder;
import me.mioclient.loader.gson.JsonReader;
import me.mioclient.loader.gson.T;
import me.mioclient.loader.gson.bD;
import me.mioclient.loader.gson.cJ;
import me.mioclient.loader.gson.cO;

final class bJ
extends T {
    private final GSONBuilder a;
    private final T b;
    private final Type c;
    public static final int[][] d;
    private static /* synthetic */ int field74;
    private static /* synthetic */ int field75;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    bJ(GSONBuilder gSONBuilder, T t, Type type) {
        this.a = gSONBuilder;
        this.b = t;
        this.c = type;
    }

    @Override
    public Object b(JsonReader jsonReader) {
        return this.b.b(jsonReader);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(cO cO2, Object object) {
        T t = this.b;
        Type type = this.a(this.c, object);
        if (type != this.c) {
            T t2 = this.a.a(cJ.b(type));
            t = !(t2 instanceof bD) ? t2 : (!(this.b instanceof bD) ? this.b : t2);
        }
        t.a(cO2, object);
    }

    private Type a(Type clazz, Object object) {
        if (object != null && (clazz == Object.class || clazz instanceof TypeVariable || clazz instanceof Class)) {
            clazz = object.getClass();
        }
        return clazz;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field74 = 0x3574 ^ 0xFFFFF904;
        field75 = 0xFFFF8642 ^ 0xFFFFF904;
        d = new int[2][3];
    }
}

