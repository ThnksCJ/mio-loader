/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 * 
 * Could not load the following classes:
 *  me.mioclient.loader.bl
 */
package com.google.gson;

import com.google.gson.JsonReader;
import com.google.gson.JsonToken;
import com.google.gson.T;
import com.google.gson.aU;
import com.google.gson.ab_0;
import com.google.gson.ay_0;
import com.google.gson.bm_0;
import com.google.gson.cO;
import com.google.gson.cw;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import deobf.remapped.me.mioclient.loader.bl;

/*
 * Renamed from com.google.gson.bk
 */
public final class bk_0
extends T {
    private static final String a;
    private final bm_0 b;
    private final List c = new ArrayList();
    private static final String[] d;
    private static final String[] e;
    private static final long[] f;
    private static final Integer[] g;
    public static final int[][] h;
    private static /* synthetic */ int field74;
    private static /* synthetic */ int field75;

    /*
     * Enabled aggressive block sorting
     */
    private bk_0(bm_0 bm_02, String string) {
        this.b = (bm_0)ab_0.a(bm_02);
        this.c.add(new SimpleDateFormat(string, Locale.US));
        if (Locale.getDefault().equals(Locale.US)) return;
        this.c.add(new SimpleDateFormat(string));
    }

    /*
     * Enabled aggressive block sorting
     */
    private bk_0(bm_0 bm_02, int n) {
        this.b = (bm_0)ab_0.a(bm_02);
        this.c.add(DateFormat.getDateInstance(n, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.c.add(DateFormat.getDateInstance(n));
        }
        if (!ay_0.b()) return;
        this.c.add(aU.a(n));
    }

    /*
     * Enabled aggressive block sorting
     */
    private bk_0(bm_0 bm_02, int n, int n2) {
        this.b = (bm_0)ab_0.a(bm_02);
        this.c.add(DateFormat.getDateTimeInstance(n, n2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.c.add(DateFormat.getDateTimeInstance(n, n2));
        }
        if (!ay_0.b()) return;
        this.c.add(aU.a(n, n2));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(cO cO2, Date date) {
        if (date == null) {
            cO2.f();
            return;
        }
        List list = this.c;
        synchronized (list) {
            String string = ((DateFormat)this.c.get(0)).format(date);
            cO2.b(string);
            return;
        }
    }

    public Date a(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.i) {
            jsonReader.j();
            return null;
        }
        Date date = this.b(jsonReader.h());
        return this.b.a(date);
    }

    private Date b(String string) {
        List list = this.c;
        synchronized (list) {
            Iterator iterator = this.c.iterator();
            if (iterator.hasNext()) {
                DateFormat dateFormat = (DateFormat)iterator.next();
                return dateFormat.parse(string);
            }
            return cw.a(string, new ParsePosition(0));
        }
    }

    public String toString() {
        DateFormat dateFormat = (DateFormat)this.c.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat)dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    @Override
    public /* synthetic */ Object b(JsonReader jsonReader) {
        return this.a(jsonReader);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    /* synthetic */ bk_0(bm_0 bm_02, String string, bl bl2) {
        this(bm_02, string);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    /* synthetic */ bk_0(bm_0 bm_02, int n, bl bl2) {
        this(bm_02, n);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    /* synthetic */ bk_0(bm_0 bm_02, int n, int n2, bl bl2) {
        this(bm_02, n, n2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block17: {
            block16: {
                block18: {
                    break block18;
lbl1:
                    // 1 sources

                    return;
                }
                bk_0.field74 = 12576 ^ -20293;
                bk_0.field75 = -32295 ^ -20293;
                bk_0.h = new int[2][1];
                var13 = new String[3];
                var11_1 = 0;
                var10_2 = "*\u0013\u00ff\u00bf\u0010q\u00bbG\u00b9@j\u0096Zj\u00b4'+\u0099\u00cd\u00ad\u00b4\u00f1\"\u0016o0W\u00db\u0005\u00fd\u0019\u00d6\u00edr\u00e0\u00d0\u000b\u00a2\u009e>n\u00bae\u00c9\u00a1}\u0017\u00d4y \u00f2\u00eb\u00d8\u00c4rV\u00e6\u0097B\u00e5\u00f0Ct\u00d5\u00f3\u0012\u00e0OX]";
                var12_3 = "*\u0013\u00ff\u00bf\u0010q\u00bbG\u00b9@j\u0096Zj\u00b4'+\u0099\u00cd\u00ad\u00b4\u00f1\"\u0016o0W\u00db\u0005\u00fd\u0019\u00d6\u00edr\u00e0\u00d0\u000b\u00a2\u009e>n\u00bae\u00c9\u00a1}\u0017\u00d4y \u00f2\u00eb\u00d8\u00c4rV\u00e6\u0097B\u00e5\u00f0Ct\u00d5\u00f3\u0012\u00e0OX]".length();
                var9_4 = 23;
                var8_5 = -1;
lbl15:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
lbl17:
                // 1 sources

                while (true) {
                    var13[var11_1++] = new String(v0).intern();
                    if ((var8_5 += var9_4) < var12_3) {
                        var9_4 = var10_2.charAt(var8_5);
                        ** continue;
                    }
                    break block16;
                    break;
                }
                v1 = ++var8_5;
                v2 = var10_2.substring(v1, v1 + var9_4).toCharArray();
                var14_6 = 0;
                v3 = v2.length;
                v4 = v2;
                v5 = v3;
                if (v3 > 1) ** GOTO lbl68
                do {
                    v6 = v4;
                    v7 = v4;
                    v8 = var14_6;
                    while (true) {
                        v9 = v6[v8];
                        switch (var14_6 % 7) {
                            case 0: {
                                v10 = 64;
                                break;
                            }
                            case 1: {
                                v10 = 91;
                                break;
                            }
                            case 2: {
                                v10 = 24;
                                break;
                            }
                            case 3: {
                                v10 = 30;
                                break;
                            }
                            case 4: {
                                v10 = 51;
                                break;
                            }
                            case 5: {
                                v10 = 100;
                                break;
                            }
                            default: {
                                v10 = 112;
                            }
                        }
                        v6[v8] = (char)(v9 ^ v10);
                        ++var14_6;
                        v4 = v7;
                        v5 = v5;
                        if (v5 != 0) break;
                        v7 = v4;
                        v11 = v5;
                        v8 = v5;
                        v6 = v4;
                    }
lbl68:
                    // 2 sources

                    v0 = v4;
                    v11 = v5;
                } while (v5 > var14_6);
                ** while (true)
            }
            bk_0.d = var13;
            bk_0.e = new String[3];
            bk_0.a = "DefaultDateTypeAdapter";
            var0_7 = 2515950418520645672L;
            var6_8 = new long[2];
            var3_9 = 0;
            var4_10 = "I\u00cf\u00e9E\u0083AZj\r\u00d3\u0088'\u00ea\u00c25I";
            var5_11 = "I\u00cf\u00e9E\u0083AZj\r\u00d3\u0088'\u00ea\u00c25I".length();
            var2_12 = 0;
            while (true) {
                break block17;
                break;
            }
lbl86:
            // 1 sources

            while (true) {
                var6_8[v12] = (((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L) ^ var0_7;
                if (var2_12 < var5_11) ** continue;
                bk_0.f = var6_8;
                bk_0.g = new Integer[2];
                ** continue;
                break;
            }
        }
        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
        v12 = var3_9++;
        ** while (true)
    }
}

