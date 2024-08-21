/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import me.mioclient.loader.gson.JsonReader;
import me.mioclient.loader.gson.JsonToken;
import me.mioclient.loader.gson.T;
import me.mioclient.loader.gson.V;
import me.mioclient.loader.gson.aU;
import me.mioclient.loader.gson.ay_0;
import me.mioclient.loader.gson.bj_0;
import me.mioclient.loader.gson.cO;
import me.mioclient.loader.gson.cw;

/*
 * Renamed from me.mioclient.loader.gson.bi
 */
public final class bi_0
extends T {
    public static final V a;
    private final List b = new ArrayList();
    public static final int[][] c;
    private static /* synthetic */ int field74;
    private static /* synthetic */ int field75;

    /*
     * Enabled aggressive block sorting
     */
    public bi_0() {
        this.b.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.b.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (!ay_0.b()) return;
        this.b.add(aU.a(2, 2));
    }

    public Date a(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.i) {
            jsonReader.j();
            return null;
        }
        return this.b(jsonReader.h());
    }

    private synchronized Date b(String string) {
        Iterator iterator = this.b.iterator();
        if (iterator.hasNext()) {
            DateFormat dateFormat = (DateFormat)iterator.next();
            return dateFormat.parse(string);
        }
        return cw.a(string, new ParsePosition(0));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public synchronized void a(cO cO2, Date date) {
        if (date == null) {
            cO2.f();
            return;
        }
        String string = ((DateFormat)this.b.get(0)).format(date);
        cO2.b(string);
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
        field74 = 0x6DDE ^ 0xFFFFC30B;
        field75 = 0xFFFFEC37 ^ 0xFFFFC30B;
        c = new int[4][1];
        a = new bj_0();
    }
}

