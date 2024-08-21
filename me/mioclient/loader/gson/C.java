/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.util.Map;
import java.util.Set;
import me.mioclient.loader.gson.B;
import me.mioclient.loader.gson.F;
import me.mioclient.loader.gson.JsonArray;
import me.mioclient.loader.gson.JsonElement;
import me.mioclient.loader.gson.aL;

public final class C
extends JsonElement {
    private final aL a = new aL();
    public static final int[][] b;
    private static /* synthetic */ int field30;
    private static /* synthetic */ int field31;

    public C a() {
        C c = new C();
        for (Map.Entry entry : this.a.entrySet()) {
            c.a((String)entry.getKey(), ((JsonElement)entry.getValue()).p());
        }
        return c;
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
    public void a(String string, Character c) {
        this.a(string, c == null ? B.a : new F(c));
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

    public C f(String string) {
        return (C)this.a.get(string);
    }

    public boolean equals(Object object) {
        return object == this || object instanceof C && ((C)object).a.equals(this.a);
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

