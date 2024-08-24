/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.B;
import com.google.gson.F;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.aL;
import java.util.Map;
import java.util.Set;

public final class JsonObject
extends JsonElement {
    private final aL a = new aL();
    public static final int[][] b;
    private static /* synthetic */ int field30;
    private static /* synthetic */ int field31;

    public JsonObject a() {
        JsonObject jsonObject = new JsonObject();
        for (Map.Entry entry : this.a.entrySet()) {
            jsonObject.a((String)entry.getKey(), ((JsonElement)entry.getValue()).p());
        }
        return jsonObject;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(String string, JsonElement jsonElement) {
        this.a.put(string, jsonElement == null ? B.a : jsonElement);
    }

    public JsonElement a(String string) {
        return (JsonElement)this.a.remove(string);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(String string, String string2) {
        this.a(string, string2 == null ? B.a : new F(string2));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(String string, Number number) {
        this.a(string, number == null ? B.a : new F(number));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(String string, Boolean bl) {
        this.a(string, bl == null ? B.a : new F(bl));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(String string, Character c2) {
        this.a(string, c2 == null ? B.a : new F(c2));
    }

    public Set b() {
        return this.a.entrySet();
    }

    public Set c() {
        return this.a.keySet();
    }

    public int y() {
        return this.a.size();
    }

    public boolean b(String string) {
        return this.a.containsKey(string);
    }

    public JsonElement c(String string) {
        return (JsonElement)this.a.get(string);
    }

    public F d(String string) {
        return (F)this.a.get(string);
    }

    public JsonArray e(String string) {
        return (JsonArray)this.a.get(string);
    }

    public JsonObject f(String string) {
        return (JsonObject)this.a.get(string);
    }

    public boolean equals(Object object) {
        return object == this || object instanceof JsonObject && ((JsonObject)object).a.equals(this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public /* synthetic */ JsonElement p() {
        return this.a();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field30 = 0x37C2 ^ 0xFFFFD653;
        field31 = 0xFFFF98E2 ^ 0xFFFFD653;
        b = new int[3][4];
    }
}

