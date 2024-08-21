/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.io.Writer;
import me.mioclient.loader.gson.JsonElement;
import me.mioclient.loader.gson.JsonReader;
import me.mioclient.loader.gson.aX;
import me.mioclient.loader.gson.bK;
import me.mioclient.loader.gson.cO;

public final class aW {
    public static final int[][] a;
    private static /* synthetic */ int field168;
    private static /* synthetic */ int field169;

    private aW() {
        throw new UnsupportedOperationException();
    }

    public static JsonElement a(JsonReader jsonReader) {
        boolean bl = true;
        jsonReader.peek();
        bl = false;
        return (JsonElement)bK.U.b(jsonReader);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void a(JsonElement jsonElement, cO cO2) {
        bK.U.a(cO2, (Object)jsonElement);
    }

    public static Writer a(Appendable appendable) {
        return appendable instanceof Writer ? (Writer)appendable : new aX(appendable);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field168 = 0x4530 ^ 0xFFFFF521;
        field169 = 0xFFFFD138 ^ 0xFFFFF521;
        a = new int[1][3];
    }
}

