/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.discordipc;

import java.lang.invoke.LambdaMetafactory;
import java.lang.management.ManagementFactory;
import java.util.function.BiConsumer;
import me.mioclient.loader.discordipc.Pipe;
import me.mioclient.loader.discordipc.df;
import me.mioclient.loader.discordipc.dg;
import me.mioclient.loader.discordipc.dh;
import me.mioclient.loader.discordipc.di;
import me.mioclient.loader.gson.C;
import me.mioclient.loader.gson.GSONBuilder;
import me.mioclient.loader.gson.JsonElement;

public class IPCClient {
    private static final GSONBuilder a;
    private static BiConsumer b;
    private static Pipe c;
    private static Runnable d;
    private static boolean e;
    private static C f;
    private static df g;
    private static final String[] h;
    private static final String[] i;
    private static final long j;
    public static final int[][] k;
    private static /* synthetic */ int field270;
    private static /* synthetic */ int field271;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void a(BiConsumer biConsumer) {
        b = biConsumer;
    }

    public static boolean a(long l, Runnable runnable) {
        c = Pipe.a(IPCClient::a);
        if (c == null) {
            return false;
        }
        d = runnable;
        C c = new C();
        c.a("v", 1);
        c.a("client_id", Long.toString(l));
        IPCClient.c.a(dg.a, c);
        return true;
    }

    public static boolean a() {
        return c != null;
    }

    public static df b() {
        return g;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void a(di di2) {
        if (c == null) {
            return;
        }
        f = di2.a();
        if (!e) return;
        IPCClient.d();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void c() {
        if (c == null) {
            return;
        }
        c.a();
        c = null;
        d = null;
        e = false;
        f = null;
        g = null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void d() {
        C c = new C();
        c.a("pid", IPCClient.getPID());
        c.a("activity", f);
        C c2 = new C();
        c2.a("cmd", "SET_ACTIVITY");
        c2.a("args", c);
        IPCClient.c.a(dg.b, c2);
        f = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void a(dh dh2) {
        if (dh2.a() == dg.c) {
            if (b != null) {
                b.accept(dh2.b().c("code").k(), dh2.b().c("message").e());
            }
            IPCClient.c();
            return;
        }
        if (dh2.a() != dg.b) return;
        if (dh2.b().b("evt") && dh2.b().c("evt").e().equals("ERROR")) {
            C c = dh2.b().f("data");
            if (b == null) return;
            b.accept(c.c("code").k(), c.c("message").e());
            return;
        }
        if (!dh2.b().b("cmd")) return;
        if (!dh2.b().c("cmd").e().equals("DISPATCH")) return;
        e = true;
        g = (df)a.a((JsonElement)dh2.b().f("data").f("user"), df.class);
        if (d != null) {
            d.run();
        }
        if (f == null) return;
        IPCClient.d();
    }

    private static int getPID() {
        String string = ManagementFactory.getRuntimeMXBean().getName();
        return Integer.parseInt(string.substring(0, string.indexOf((int)j)));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void a(int n, String string) {
        System.err.println(IPCClient.a((int)2032, (int)98) + n + " with message: " + string);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block22: {
                block21: {
                    block23: {
                        break block23;
lbl1:
                        // 1 sources

                        return;
                    }
                    IPCClient.field270 = 7291 ^ -14437;
                    IPCClient.field271 = -23248 ^ -14437;
                    IPCClient.k = new int[4][1];
                    var7 = new String[20];
                    var5_1 = 0;
                    var4_2 = "\u0094\u000f\u00fa\u0010\t\u001bRGp\u00f1<^d$\u0012\u00e3\u00a9\u0081\u00acqgT\u0080\u0014&\u001f\u008d\"{\u008f\u0003\u00fd|\u0004-\u00f4\u008c\u00c7\u00044.XW\u0003K\u00ec\u0096\b9\u0018\\\u00db4\u00d9\u00d6v\u0007\b\u0086\u00f0\u00d4Qo\u009e\b\u00bc!J\u00aa\u0002\u00d4\u00f6|\u0004\u00e6Z\u0002\u00d9\u0007\u00eb_\u008c\u00ef\u00de\bo\fV\u00a9\u00e59\u0010_\u00a3\u00f9\u00c3T\u000e\u0080\u000fKBf\u001b\u00d36\u00ee\u00f7Q\u0006\u00e8\u0089\u00ba\u001c\u00ce\u0003\\\u00a5\u00a2\u0003I\u000f\u0000\u0005\u009d\u0098N\u00fa\u00b0\u0003P\u00d4\u00f5\u0003i]u";
                    var6_3 = "\u0094\u000f\u00fa\u0010\t\u001bRGp\u00f1<^d$\u0012\u00e3\u00a9\u0081\u00acqgT\u0080\u0014&\u001f\u008d\"{\u008f\u0003\u00fd|\u0004-\u00f4\u008c\u00c7\u00044.XW\u0003K\u00ec\u0096\b9\u0018\\\u00db4\u00d9\u00d6v\u0007\b\u0086\u00f0\u00d4Qo\u009e\b\u00bc!J\u00aa\u0002\u00d4\u00f6|\u0004\u00e6Z\u0002\u00d9\u0007\u00eb_\u008c\u00ef\u00de\bo\fV\u00a9\u00e59\u0010_\u00a3\u00f9\u00c3T\u000e\u0080\u000fKBf\u001b\u00d36\u00ee\u00f7Q\u0006\u00e8\u0089\u00ba\u001c\u00ce\u0003\\\u00a5\u00a2\u0003I\u000f\u0000\u0005\u009d\u0098N\u00fa\u00b0\u0003P\u00d4\u00f5\u0003i]u".length();
                    var3_4 = 4;
                    var2_5 = -1;
lbl15:
                    // 2 sources

                    while (true) {
                        v0 = ++var2_5;
                        v1 = var4_2.substring(v0, v0 + var3_4);
                        v2 = -1;
                        break block21;
                        break;
                    }
lbl21:
                    // 1 sources

                    while (true) {
                        var7[var5_1++] = v3.intern();
                        if ((var2_5 += var3_4) < var6_3) {
                            var3_4 = var4_2.charAt(var2_5);
                            ** continue;
                        }
                        var4_2 = "\u0003\u00e6\u009c\r\u0004\u00e0q5w";
                        var6_3 = "\u0003\u00e6\u009c\r\u0004\u00e0q5w".length();
                        var3_4 = 4;
                        var2_5 = -1;
lbl31:
                        // 2 sources

                        while (true) {
                            v4 = ++var2_5;
                            v1 = var4_2.substring(v4, v4 + var3_4);
                            v2 = 0;
                            break block21;
                            break;
                        }
                        break;
                    }
lbl36:
                    // 1 sources

                    while (true) {
                        var7[var5_1++] = v3.intern();
                        if ((var2_5 += var3_4) < var6_3) {
                            var3_4 = var4_2.charAt(var2_5);
                            ** continue;
                        }
                        break block22;
                        break;
                    }
                }
                v5 = v1.toCharArray();
                var8_6 = 0;
                v6 = v5.length;
                v7 = v5;
                v8 = v6;
                if (v6 > 1) ** GOTO lbl86
                do {
                    v9 = v7;
                    v10 = v7;
                    v11 = var8_6;
                    while (true) {
                        v12 = v9[v11];
                        switch (var8_6 % 7) {
                            case 0: {
                                v13 = 81;
                                break;
                            }
                            case 1: {
                                v13 = 84;
                                break;
                            }
                            case 2: {
                                v13 = 104;
                                break;
                            }
                            case 3: {
                                v13 = 52;
                                break;
                            }
                            case 4: {
                                v13 = 62;
                                break;
                            }
                            case 5: {
                                v13 = 9;
                                break;
                            }
                            default: {
                                v13 = 91;
                            }
                        }
                        v9[v11] = (char)(v12 ^ v13);
                        ++var8_6;
                        v7 = v10;
                        v8 = v8;
                        if (v8 != 0) break;
                        v10 = v7;
                        v14 = v8;
                        v11 = v8;
                        v9 = v7;
                    }
lbl86:
                    // 2 sources

                    v15 = v7;
                    v14 = v8;
                } while (v8 > var8_6);
                v3 = new String(v15);
                switch (v2) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl95:
                    // 1 sources

                    ** continue;
                }
            }
            IPCClient.h = var7;
            IPCClient.i = new String[20];
            break block24;
lbl100:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 4573493610378913320L;
        ** while (true)
        IPCClient.j = -5422458999106214296L ^ var0_7;
        IPCClient.a = new GSONBuilder();
        IPCClient.b = (BiConsumer<Integer, String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, a(int java.lang.String ), (Ljava/lang/Integer;Ljava/lang/String;)V)();
        ** while (true)
    }
}

