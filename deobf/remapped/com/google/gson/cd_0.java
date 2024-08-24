/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.JsonReader;
import com.google.gson.JsonToken;
import com.google.gson.T;
import com.google.gson.cO;
import java.util.Locale;
import java.util.StringTokenizer;

/*
 * Renamed from com.google.gson.cd
 */
class cd_0
extends T {
    public static final int[][] a;
    private static /* synthetic */ int field74;
    private static /* synthetic */ int field75;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    cd_0() {
    }

    public Locale a(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.i) {
            jsonReader.j();
            return null;
        }
        String string = jsonReader.h();
        StringTokenizer stringTokenizer = new StringTokenizer(string, "_");
        String string2 = null;
        String string3 = null;
        String string4 = null;
        if (stringTokenizer.hasMoreElements()) {
            string2 = stringTokenizer.nextToken();
        }
        if (stringTokenizer.hasMoreElements()) {
            string3 = stringTokenizer.nextToken();
        }
        if (stringTokenizer.hasMoreElements()) {
            string4 = stringTokenizer.nextToken();
        }
        if (string3 == null && string4 == null) {
            return new Locale(string2);
        }
        if (string4 == null) {
            return new Locale(string2, string3);
        }
        return new Locale(string2, string3, string4);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(cO cO2, Locale locale) {
        cO2.b(locale == null ? null : locale.toString());
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
        field74 = 0x5033 ^ 0xFFFFE246;
        field75 = 0xFFFF8A54 ^ 0xFFFFE246;
        a = new int[1][1];
    }
}

