/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package deobf.remapped.meteordevelopment.discordipc;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.invoke.LambdaMetafactory;
import java.lang.management.ManagementFactory;
import java.util.function.BiConsumer;
import deobf.remapped.meteordevelopment.discordipc.IPCUser;
import deobf.remapped.meteordevelopment.discordipc.Opcode;
import deobf.remapped.meteordevelopment.discordipc.Packet;
import deobf.remapped.meteordevelopment.discordipc.RichPresence;
import deobf.remapped.meteordevelopment.discordipc.connection.Connection;

public class DiscordIPC {
    private static final Gson a;
    private static BiConsumer b;
    private static Connection c;
    private static Runnable d;
    private static boolean e;
    private static JsonObject f;
    private static IPCUser g;
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
        c = Connection.a(DiscordIPC::a);
        if (c == null) {
            return false;
        }
        d = runnable;
        JsonObject jsonObject = new JsonObject();
        jsonObject.a("v", 1);
        jsonObject.a("client_id", Long.toString(l));
        c.a(Opcode.a, jsonObject);
        return true;
    }

    public static boolean a() {
        return c != null;
    }

    public static IPCUser b() {
        return g;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void a(RichPresence richPresence) {
        if (c == null) {
            return;
        }
        f = richPresence.a();
        if (!e) return;
        DiscordIPC.d();
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
        JsonObject jsonObject = new JsonObject();
        jsonObject.a("pid", DiscordIPC.getPID());
        jsonObject.a("activity", f);
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.a("cmd", "SET_ACTIVITY");
        jsonObject2.a("args", jsonObject);
        c.a(Opcode.b, jsonObject2);
        f = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void a(Packet packet) {
        if (packet.a() == Opcode.c) {
            if (b != null) {
                b.accept(packet.b().c("code").k(), packet.b().c("message").e());
            }
            DiscordIPC.c();
            return;
        }
        if (packet.a() != Opcode.b) return;
        if (packet.b().b("evt") && packet.b().c("evt").e().equals("ERROR")) {
            JsonObject jsonObject = packet.b().f("data");
            if (b == null) return;
            b.accept(jsonObject.c("code").k(), jsonObject.c("message").e());
            return;
        }
        if (!packet.b().b("cmd")) return;
        if (!packet.b().c("cmd").e().equals("DISPATCH")) return;
        e = true;
        g = (IPCUser)a.a((JsonElement)packet.b().f("data").f("user"), IPCUser.class);
        if (d != null) {
            d.run();
        }
        if (f == null) return;
        DiscordIPC.d();
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
        System.err.println(DiscordIPC.a((int)2032, (int)98) + n + " with message: " + string);
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
                    DiscordIPC.field270 = 7291 ^ -14437;
                    DiscordIPC.field271 = -23248 ^ -14437;
                    DiscordIPC.k = new int[4][1];
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
            DiscordIPC.h = var7;
            DiscordIPC.i = new String[20];
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
        DiscordIPC.j = -5422458999106214296L ^ var0_7;
        DiscordIPC.a = new Gson();
        DiscordIPC.b = (BiConsumer<Integer, String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, a(int java.lang.String ), (Ljava/lang/Integer;Ljava/lang/String;)V)();
        ** while (true)
    }
}

