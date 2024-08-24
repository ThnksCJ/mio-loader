/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.B;
import com.google.gson.F;
import com.google.gson.JsonElement;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class JsonArray
extends JsonElement
implements Iterable {
    private final List a;
    public static final int[][] b;
    private static /* synthetic */ int field30;
    private static /* synthetic */ int field31;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public JsonArray() {
        this.a = new ArrayList();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public JsonArray(int n) {
        this.a = new ArrayList(n);
    }

    public JsonArray a() {
        if (!this.a.isEmpty()) {
            JsonArray jsonArray = new JsonArray(this.a.size());
            for (JsonElement jsonElement : this.a) {
                jsonArray.a(jsonElement.p());
            }
            return jsonArray;
        }
        return new JsonArray();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(Boolean bl) {
        this.a.add(bl == null ? B.a : new F(bl));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(Character c2) {
        this.a.add(c2 == null ? B.a : new F(c2));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(Number number) {
        this.a.add(number == null ? B.a : new F(number));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(String string) {
        this.a.add(string == null ? B.a : new F(string));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(JsonElement jsonElement) {
        if (jsonElement == null) {
            jsonElement = B.a;
        }
        this.a.add(jsonElement);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(JsonArray jsonArray) {
        this.a.addAll(jsonArray.a);
    }

    public JsonElement a(int n, JsonElement jsonElement) {
        return this.a.set(n, jsonElement);
    }

    public boolean b(JsonElement jsonElement) {
        return this.a.remove(jsonElement);
    }

    public JsonElement a(int n) {
        return (JsonElement)this.a.remove(n);
    }

    public boolean c(JsonElement jsonElement) {
        return this.a.contains(jsonElement);
    }

    public int b() {
        return this.a.size();
    }

    public boolean c() {
        return this.a.isEmpty();
    }

    public Iterator iterator() {
        return this.a.iterator();
    }

    public JsonElement b(int n) {
        return (JsonElement)this.a.get(n);
    }

    @Override
    public Number d() {
        if (this.a.size() == 1) {
            return ((JsonElement)this.a.get(0)).d();
        }
        throw new IllegalStateException();
    }

    @Override
    public String e() {
        if (this.a.size() == 1) {
            return ((JsonElement)this.a.get(0)).e();
        }
        throw new IllegalStateException();
    }

    @Override
    public double f() {
        if (this.a.size() == 1) {
            return ((JsonElement)this.a.get(0)).f();
        }
        throw new IllegalStateException();
    }

    @Override
    public BigDecimal g() {
        if (this.a.size() == 1) {
            return ((JsonElement)this.a.get(0)).g();
        }
        throw new IllegalStateException();
    }

    @Override
    public BigInteger h() {
        if (this.a.size() == 1) {
            return ((JsonElement)this.a.get(0)).h();
        }
        throw new IllegalStateException();
    }

    @Override
    public float i() {
        if (this.a.size() == 1) {
            return ((JsonElement)this.a.get(0)).i();
        }
        throw new IllegalStateException();
    }

    @Override
    public long j() {
        if (this.a.size() == 1) {
            return ((JsonElement)this.a.get(0)).j();
        }
        throw new IllegalStateException();
    }

    @Override
    public int k() {
        if (this.a.size() == 1) {
            return ((JsonElement)this.a.get(0)).k();
        }
        throw new IllegalStateException();
    }

    @Override
    public byte l() {
        if (this.a.size() == 1) {
            return ((JsonElement)this.a.get(0)).l();
        }
        throw new IllegalStateException();
    }

    @Override
    public char m() {
        if (this.a.size() == 1) {
            return ((JsonElement)this.a.get(0)).m();
        }
        throw new IllegalStateException();
    }

    @Override
    public short n() {
        if (this.a.size() == 1) {
            return ((JsonElement)this.a.get(0)).n();
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean o() {
        if (this.a.size() == 1) {
            return ((JsonElement)this.a.get(0)).o();
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object object) {
        return object == this || object instanceof JsonArray && ((JsonArray)object).a.equals(this.a);
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
        field30 = 0x1640 ^ 0xFFFF8736;
        field31 = 0xFFFFE4AF ^ 0xFFFF8736;
        b = new int[1][2];
    }
}

