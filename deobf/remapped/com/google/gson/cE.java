/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.JsonReader;
import com.google.gson.T;
import com.google.gson.V;
import com.google.gson.cF;
import com.google.gson.cO;
import java.sql.Timestamp;
import java.util.Date;

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

