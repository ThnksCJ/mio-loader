/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.JsonReader;
import com.google.gson.T;
import com.google.gson.cO;
import java.util.Currency;

/*
 * Renamed from com.google.gson.cb
 */
class cb_0
extends T {
    public static final int[][] a;
    private static /* synthetic */ int field74;
    private static /* synthetic */ int field75;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    cb_0() {
    }

    public Currency a(JsonReader jsonReader) {
        return Currency.getInstance(jsonReader.h());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(cO cO2, Currency currency) {
        cO2.b(currency.getCurrencyCode());
    }

    @Override
    public /* synthetic */ Object b(JsonReader jsonReader) {
        return this.a(jsonReader);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field74 = 0x5D8B ^ 0xFFFF913D;
        field75 = 0xFFFFCB7F ^ 0xFFFF913D;
        a = new int[4][2];
    }
}

