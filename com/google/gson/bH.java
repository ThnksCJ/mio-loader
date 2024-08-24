/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 * 
 * Could not load the following classes:
 *  me.mioclient.loader.bG
 */
package com.google.gson;

import com.google.gson.G;
import com.google.gson.JsonElement;
import com.google.gson.bF;
import com.google.gson.x_0;
import java.lang.reflect.Type;
import me.mioclient.loader.bG;

final class bH
implements G,
x_0 {
    final /* synthetic */ bF a;
    public static final int[][] b;
    private static /* synthetic */ int field40;
    private static /* synthetic */ int field41;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private bH(bF bF2) {
        this.a = bF2;
    }

    @Override
    public JsonElement a(Object object) {
        return this.a.a.a(object);
    }

    @Override
    public JsonElement a(Object object, Type type) {
        return this.a.a.a(object, type);
    }

    @Override
    public Object a(JsonElement jsonElement, Type type) {
        return this.a.a.a(jsonElement, type);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    /* synthetic */ bH(bF bF2, bG bG2) {
        this(bF2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field40 = 0x1393 ^ 0xFFFFCC5E;
        field41 = 0xFFFF8DA9 ^ 0xFFFFCC5E;
        b = new int[3][4];
    }
}

