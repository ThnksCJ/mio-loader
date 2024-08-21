/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import me.mioclient.loader.gson.JsonElement;
import me.mioclient.loader.gson.JsonReader;
import me.mioclient.loader.gson.JsonTreeReader;
import me.mioclient.loader.gson.U;
import me.mioclient.loader.gson.br_0;
import me.mioclient.loader.gson.cO;

public abstract class T {
    public static final int[][] a;
    private static /* synthetic */ int field74;
    private static /* synthetic */ int field75;

    public abstract void a(cO var1, Object var2);

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void a(Writer writer, Object object) {
        cO cO2 = new cO(writer);
        this.a(cO2, object);
    }

    public final T a() {
        return new U(this);
    }

    public final String a(Object object) {
        StringWriter stringWriter = new StringWriter();
        this.a(stringWriter, object);
        return stringWriter.toString();
    }

    public final JsonElement b(Object object) {
        br_0 br_02 = new br_0();
        this.a(br_02, object);
        return br_02.a();
    }

    public abstract Object b(JsonReader var1);

    public final Object a(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        return this.b(jsonReader);
    }

    public final Object a(String string) {
        return this.a(new StringReader(string));
    }

    public final Object a(JsonElement jsonElement) {
        JsonTreeReader jsonTreeReader = new JsonTreeReader(jsonElement);
        return this.b(jsonTreeReader);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field74 = 0x2CAE ^ 0xFFFF9C84;
        field75 = 0xFFFFF203 ^ 0xFFFF9C84;
        a = new int[1][4];
    }
}

