/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package deobf.remapped.meteordevelopment.discordipc.connection;

import com.google.gson.JsonObject;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.function.Consumer;
import deobf.remapped.meteordevelopment.discordipc.Opcode;
import deobf.remapped.meteordevelopment.discordipc.connection.UnixConnection;
import deobf.remapped.meteordevelopment.discordipc.connection.WinConnection;

public abstract class Connection {
    private static final String[] a;
    private static final String[] d;
    private static final String[] e;
    private static final long[] g;
    private static final Integer[] h;
    public static final int[][] b;
    private static /* synthetic */ int field282;
    private static /* synthetic */ int field283;

    public static Connection a(Consumer consumer) {
        String string = System.getProperty("os.name").toLowerCase();
        if (string.contains("win")) {
            int n = 0;
            if (n < 10) {
                return new WinConnection("\\\\?\\pipe\\discord-ipc-" + n, consumer);
            }
        } else {
            String string2;
            Object object = null;
            String[] stringArray = a;
            int n = stringArray.length;
            for (int i = 0; i < n && (object = System.getenv(string2 = stringArray[i])) == null; ++i) {
            }
            if (object == null) {
                object = "/tmp";
            }
            object = (String)object + "/discord-ipc-";
            int n2 = 0;
            if (n2 < 10) {
                return new UnixConnection((String)object + n2, consumer);
            }
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(Opcode opcode, JsonObject jsonObject) {
        jsonObject.a("nonce", UUID.randomUUID().toString());
        byte[] byArray = jsonObject.toString().getBytes();
        ByteBuffer byteBuffer = ByteBuffer.allocate(byArray.length + 8);
        byteBuffer.putInt(Integer.reverseBytes(opcode.ordinal()));
        byteBuffer.putInt(Integer.reverseBytes(byArray.length));
        byteBuffer.put(byArray);
        byteBuffer.rewind();
        this.a(byteBuffer);
    }

    protected abstract void a(ByteBuffer var1);

    public abstract void a();

    /*
     * Unable to fully structure code
     */
    static {
        block25: {
            block24: {
                block23: {
                    block22: {
                        block26: {
                            break block26;
lbl1:
                            // 1 sources

                            return;
                        }
                        Connection.field282 = 27259 ^ -25803;
                        Connection.field283 = -29204 ^ -25803;
                        Connection.b = new int[4][1];
                        var13 = new String[10];
                        var11_1 = 0;
                        var10_2 = "d\u0096|\u00c6\u00f3c\u00bb\u0013\u00bb\u00b0\u0000j\u009a\u000f\u00a0\u00aeS\u00c9\u00cc\u0011w\u0010\u00fd\u00c2\u0015\u00b8\u00c2R_\u0015\u00f2)\u00e5!OS_\u00d2\u0014\u00a4\u00b3T\u0098@\u00f73\u00bch4\u00e3m\u00040\u00c2\u00f2]\u0003\u009fMW\u0007\u00d2\u00e2\u00a5\u00a0e\u0013<\u0006\u008e\u0093\f]\u00c9\u00fc\u0004Vq\n\u001c";
                        var12_3 = "d\u0096|\u00c6\u00f3c\u00bb\u0013\u00bb\u00b0\u0000j\u009a\u000f\u00a0\u00aeS\u00c9\u00cc\u0011w\u0010\u00fd\u00c2\u0015\u00b8\u00c2R_\u0015\u00f2)\u00e5!OS_\u00d2\u0014\u00a4\u00b3T\u0098@\u00f73\u00bch4\u00e3m\u00040\u00c2\u00f2]\u0003\u009fMW\u0007\u00d2\u00e2\u00a5\u00a0e\u0013<\u0006\u008e\u0093\f]\u00c9\u00fc\u0004Vq\n\u001c".length();
                        var9_4 = 13;
                        var8_5 = -1;
lbl15:
                        // 2 sources

                        while (true) {
                            v0 = ++var8_5;
                            v1 = var10_2.substring(v0, v0 + var9_4);
                            v2 = -1;
                            break block22;
                            break;
                        }
lbl21:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v3.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "=\u00f5z\u0005o\u00c9sW\u00f3";
                            var12_3 = "=\u00f5z\u0005o\u00c9sW\u00f3".length();
                            var9_4 = 3;
                            var8_5 = -1;
lbl31:
                            // 2 sources

                            while (true) {
                                v4 = ++var8_5;
                                v1 = var10_2.substring(v4, v4 + var9_4);
                                v2 = 0;
                                break block22;
                                break;
                            }
                            break;
                        }
lbl36:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v3.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            break block23;
                            break;
                        }
                    }
                    v5 = v1.toCharArray();
                    var14_6 = 0;
                    v6 = v5.length;
                    v7 = v5;
                    v8 = v6;
                    if (v6 > 1) ** GOTO lbl86
                    do {
                        v9 = v7;
                        v10 = v7;
                        v11 = var14_6;
                        while (true) {
                            v12 = v9[v11];
                            switch (var14_6 % 7) {
                                case 0: {
                                    v13 = 17;
                                    break;
                                }
                                case 1: {
                                    v13 = 31;
                                    break;
                                }
                                case 2: {
                                    v13 = 113;
                                    break;
                                }
                                case 3: {
                                    v13 = 108;
                                    break;
                                }
                                case 4: {
                                    v13 = 117;
                                    break;
                                }
                                case 5: {
                                    v13 = 68;
                                    break;
                                }
                                default: {
                                    v13 = 22;
                                }
                            }
                            v9[v11] = (char)(v12 ^ v13);
                            ++var14_6;
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
                    } while (v8 > var14_6);
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
                Connection.d = var13;
                Connection.e = new String[10];
                var0_7 = 6120955818398662869L;
                var6_8 = new long[3];
                var3_9 = 0;
                var4_10 = "\u000eJ\u00e5\u00a96\u00a3\u00b3\u00a8\u00db\u0000;n\u00f3\u00bd\u00bb\u000f\u00e1\u008a\u0013\u009b\u0000\u00f8?C";
                var5_11 = "\u000eJ\u00e5\u00a96\u00a3\u00b3\u00a8\u00db\u0000;n\u00f3\u00bd\u00bb\u000f\u00e1\u008a\u0013\u009b\u0000\u00f8?C".length();
                var2_12 = 0;
                while (true) {
                    break block24;
                    break;
                }
lbl107:
                // 1 sources

                while (true) {
                    var6_8[v16] = (((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L) ^ var0_7;
                    if (var2_12 < var5_11) ** continue;
                    break block25;
                    break;
                }
            }
            var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
            v16 = var3_9++;
            ** while (true)
        }
        Connection.g = var6_8;
        Connection.h = new Integer[3];
        Connection.a = new String[]{"XDG_RUNTIME_DIR", "TMPDIR", "TMP", "TEMP"};
        ** while (true)
    }
}

