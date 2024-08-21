/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import me.mioclient.loader.gson.JsonElement;
import me.mioclient.loader.gson.JsonReader;
import me.mioclient.loader.gson.JsonToken;
import me.mioclient.loader.gson.aW;

public final class I
implements Iterator {
    private final JsonReader a;
    private final Object b;
    private static final String[] c;
    private static final String[] d;
    public static final int[][] e;
    private static /* synthetic */ int field44;
    private static /* synthetic */ int field45;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public I(String string) {
        this(new StringReader(string));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public I(Reader reader) {
        this.a = new JsonReader(reader);
        this.a.a(true);
        this.b = new Object();
    }

    public JsonElement a() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        return aW.a(this.a);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean hasNext() {
        Object object = this.b;
        synchronized (object) {
            if (this.a.peek() == JsonToken.END_DOCUMENT) return false;
            return true;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ Object next() {
        return this.a();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            break block14;
lbl1:
            // 1 sources

            return;
        }
        I.field44 = 3947 ^ -20408;
        I.field45 = -13416 ^ -20408;
        I.e = new int[4][2];
        var5 = new String[2];
        var3_1 = 0;
        var2_2 = "\u00dd\u0005\u009dS3\u0002\u00fe\u00e8`\u00d0\u00e0\u00ee\u0082\u008f\u00e3\u00ca\u00ca\u00c7\u008f\u0093t\t\u001c\u0010\u00e9\u00fa\u00ff\u0093\u0084R\u0099\u00cf\u00feg\"E\u00d4\u008eiQE\u00b2\u0000\u00e9\u00cd\u00d1M\u00a4\u00fb'DR\u0016\u009c\u00a9\u0016NP\u00f8`\u00e7\u00ce0\u00a2&]Af\u00b6";
        var4_3 = "\u00dd\u0005\u009dS3\u0002\u00fe\u00e8`\u00d0\u00e0\u00ee\u0082\u008f\u00e3\u00ca\u00ca\u00c7\u008f\u0093t\t\u001c\u0010\u00e9\u00fa\u00ff\u0093\u0084R\u0099\u00cf\u00feg\"E\u00d4\u008eiQE\u00b2\u0000\u00e9\u00cd\u00d1M\u00a4\u00fb'DR\u0016\u009c\u00a9\u0016NP\u00f8`\u00e7\u00ce0\u00a2&]Af\u00b6".length();
        var1_4 = 34;
        var0_5 = -1;
lbl15:
        // 2 sources

        while (true) {
            continue;
            break;
        }
lbl17:
        // 1 sources

        while (true) {
            var5[var3_1++] = new String(v0).intern();
            if ((var0_5 += var1_4) < var4_3) {
                var1_4 = var2_2.charAt(var0_5);
                ** continue;
            }
            I.c = var5;
            I.d = new String[2];
            ** continue;
            break;
        }
        v1 = ++var0_5;
        v2 = var2_2.substring(v1, v1 + var1_4).toCharArray();
        var6_6 = 0;
        v3 = v2.length;
        v4 = v2;
        v5 = v3;
        if (v3 > 1) ** GOTO lbl70
        do {
            v6 = v4;
            v7 = v4;
            v8 = var6_6;
            while (true) {
                v9 = v6[v8];
                switch (var6_6 % 7) {
                    case 0: {
                        v10 = 124;
                        break;
                    }
                    case 1: {
                        v10 = 117;
                        break;
                    }
                    case 2: {
                        v10 = 78;
                        break;
                    }
                    case 3: {
                        v10 = 124;
                        break;
                    }
                    case 4: {
                        v10 = 104;
                        break;
                    }
                    case 5: {
                        v10 = 98;
                        break;
                    }
                    default: {
                        v10 = 124;
                    }
                }
                v6[v8] = (char)(v9 ^ v10);
                ++var6_6;
                v4 = v7;
                v5 = v5;
                if (v5 != 0) break;
                v7 = v4;
                v11 = v5;
                v8 = v5;
                v6 = v4;
            }
lbl70:
            // 2 sources

            v0 = v4;
            v11 = v5;
        } while (v5 > var6_6);
        ** while (true)
    }
}

