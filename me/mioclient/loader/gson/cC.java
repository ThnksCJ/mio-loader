/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import me.mioclient.loader.gson.JsonReader;
import me.mioclient.loader.gson.JsonToken;
import me.mioclient.loader.gson.T;
import me.mioclient.loader.gson.V;
import me.mioclient.loader.gson.cD;
import me.mioclient.loader.gson.cO;

final class cC
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
    private cC() {
    }

    public synchronized Time a(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.i) {
            jsonReader.j();
            return null;
        }
        Date date = this.b.parse(jsonReader.h());
        return new Time(date.getTime());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public synchronized void a(cO cO2, Time time) {
        cO2.b(time == null ? null : this.b.format(time));
    }

    @Override
    public /* synthetic */ Object b(JsonReader jsonReader) {
        return this.a(jsonReader);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    /* synthetic */ cC(cD cD2) {
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
                field74 = 0x3696 ^ 0xFFFFD87D;
                field75 = 0xFFFF94C1 ^ 0xFFFFD87D;
                d = new int[2][4];
                char[] cArray3 = "kA]UB('p\t\u0006".toCharArray();
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
                        case 0 -> 3;
                        case 1 -> 41;
                        case 2 -> 103;
                        case 3 -> 56;
                        case 4 -> 47;
                        case 5 -> 18;
                        default -> 84;
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
        a = new cD();
    }
}

