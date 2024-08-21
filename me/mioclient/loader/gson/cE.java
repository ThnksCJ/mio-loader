/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.sql.Timestamp;
import java.util.Date;
import me.mioclient.loader.gson.JsonReader;
import me.mioclient.loader.gson.T;
import me.mioclient.loader.gson.V;
import me.mioclient.loader.gson.cF;
import me.mioclient.loader.gson.cO;

class cE
extends T {
    static final V a;
    private final T b;
    public static final int[][] c;
    private static /* synthetic */ int field74;
    private static /* synthetic */ int field75;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private cE(T t) {
        this.b = t;
    }

    public Timestamp a(JsonReader jsonReader) {
        Date date = (Date)this.b.b(jsonReader);
        return date != null ? new Timestamp(date.getTime()) : null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(cO cO2, Timestamp timestamp) {
        this.b.a(cO2, (Object)timestamp);
    }

    @Override
    public /* synthetic */ Object b(JsonReader jsonReader) {
        return this.a(jsonReader);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    /* synthetic */ cE(T t, cF cF2) {
        this(t);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field74 = 0x20A ^ 0xFFFFF6B3;
        field75 = 0xFFFFEAE2 ^ 0xFFFFF6B3;
        c = new int[4][4];
        a = new cF();
    }
}

