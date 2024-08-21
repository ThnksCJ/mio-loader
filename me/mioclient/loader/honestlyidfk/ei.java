/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.honestlyidfk;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;
import me.mioclient.loader.honestlyidfk.dY;
import me.mioclient.loader.honestlyidfk.eb;

public class ei {
    private final Map a = new HashMap();
    public static final int[][] b;
    private static /* synthetic */ int field316;
    private static /* synthetic */ int field317;

    public ei a(String string, Supplier supplier) {
        this.a.put(string, supplier);
        return this;
    }

    public ei a(String string, eb eb2) {
        this.a(string, () -> eb2);
        return this;
    }

    public ei a(String string, boolean bl2) {
        return this.a(string, eb.a(bl2));
    }

    public ei a(String string, double d2) {
        return this.a(string, eb.a(d2));
    }

    public ei a(String string, String string2) {
        return this.a(string, eb.a(string2));
    }

    public ei a(String string, dY dY2) {
        return this.a(string, eb.a(dY2));
    }

    public ei a(String string, ei ei2) {
        return this.a(string, eb.a(ei2));
    }

    public Supplier a(String string) {
        return (Supplier)this.a.get(string);
    }

    public Set a() {
        return this.a.keySet();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field316 = 0x6634 ^ 0xFFFFFE90;
        field317 = 0xFFFF86C5 ^ 0xFFFFFE90;
        b = new int[1][1];
    }
}

