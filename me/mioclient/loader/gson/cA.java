/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import me.mioclient.loader.gson.JsonReader;
import me.mioclient.loader.gson.JsonToken;
import me.mioclient.loader.gson.T;
import me.mioclient.loader.gson.V;
import me.mioclient.loader.gson.cB;
import me.mioclient.loader.gson.cO;

final class cA
extends T {
    static final V a;
    private final DateFormat b = new SimpleDateFormat(c);
    private static final String c;
    public static final int[][] d;
    private static /* synthetic */ int field74;
    private static /* synthetic */ int field75;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private cA() {
    }

    public synchronized Date a(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.i) {
            jsonReader.j();
            return null;
        }
        long l = this.b.parse(jsonReader.h()).getTime();
        return new Date(l);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public synchronized void a(cO cO2, Date date) {
        cO2.b(date == null ? null : this.b.format(date));
    }

    @Override
    public /* synthetic */ Object b(JsonReader jsonReader) {
        return this.a(jsonReader);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    /* synthetic */ cA(cB cB2) {
        this();
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n;
            int n2;
            char[] cArray2;
            int n3;
            block11: {
                field74 = 0x419A ^ 0xFFFFDBF8;
                field75 = 0xFFFFACC8 ^ 0xFFFFDBF8;
                d = new int[2][3];
                char[] cArray3 = "\u0005(.\u001c\u001ea(1\u001c\u001aE".toCharArray();
                n3 = 0;
                int n4 = cArray3.length;
                cArray2 = cArray3;
                n2 = n4;
                if (n4 <= 1) break block11;
                cArray = cArray2;
                n = n2;
                if (n2 <= n3) break block12;
            }
            do {
                char[] cArray4 = cArray2;
                char[] cArray5 = cArray2;
                int n5 = n3;
                while (true) {
                    char c = cArray4[n5];
                    cArray4[n5] = (char)(c ^ (switch (n3 % 7) {
                        case 0 -> 72;
                        case 1 -> 101;
                        case 2 -> 99;
                        case 3 -> 60;
                        case 4 -> 122;
                        case 5 -> 77;
                        default -> 8;
                    }));
                    ++n3;
                    cArray2 = cArray5;
                    n2 = n2;
                    if (n2 != 0) break;
                    cArray5 = cArray2;
                    n = n2;
                    n5 = n2;
                    cArray4 = cArray2;
                }
                cArray = cArray2;
                n = n2;
            } while (n2 > n3);
        }
        c = new String(cArray).intern();
        a = new cB();
    }
}

