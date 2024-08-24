/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package deobf.remapped.meteordevelopment.discordipc.connection;

import com.google.gson.JsonParser;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.function.Consumer;
import deobf.remapped.meteordevelopment.discordipc.Opcode;
import deobf.remapped.meteordevelopment.discordipc.Packet;
import deobf.remapped.meteordevelopment.discordipc.connection.Connection;

public class WinConnection
extends Connection {
    private final RandomAccessFile a;
    private final Consumer b;
    private static final String[] c;
    private static final String[] f;
    private static final long i;
    public static final int[][] d;
    private static /* synthetic */ int field282;
    private static /* synthetic */ int field283;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    WinConnection(String string, Consumer consumer) {
        this.a = new RandomAccessFile(string, "rw");
        this.b = consumer;
        Thread thread = new Thread(this::b);
        thread.setName("Discord IPC - Read thread");
        thread.start();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected void a(ByteBuffer byteBuffer) {
        this.a.write(byteBuffer.array());
    }

    private void b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        while (true) {
            this.b(byteBuffer);
            Opcode opcode = Opcode.a(Integer.reverseBytes(byteBuffer.getInt(0)));
            this.b(byteBuffer);
            int n = Integer.reverseBytes(byteBuffer.getInt(0));
            ByteBuffer byteBuffer2 = ByteBuffer.allocate(n);
            this.b(byteBuffer2);
            String string = Charset.defaultCharset().decode(byteBuffer2.rewind()).toString();
            this.b.accept(new Packet(opcode, JsonParser.a(string).u()));
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void b(ByteBuffer byteBuffer) {
        byteBuffer.rewind();
        while (this.a.length() < (long)byteBuffer.remaining()) {
            Thread.onSpinWait();
            Thread.sleep(i);
        }
        while (byteBuffer.hasRemaining()) {
            this.a.getChannel().read(byteBuffer);
        }
        return;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a() {
        this.a.close();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block17: {
            block15: {
                block16: {
                    break block16;
lbl1:
                    // 1 sources

                    return;
                }
                WinConnection.field282 = 10407 ^ -14310;
                WinConnection.field283 = -14654 ^ -14310;
                WinConnection.d = new int[1][3];
                var7 = new String[2];
                var5_1 = 0;
                var4_2 = "\u0004@\u0019\u00fd\u00b0+U2E\\\u00cdF\u00e6\u008f\u0083e\u0088\u000f<\u00b3N>\u00c7w\t\u0082W\u0099";
                var6_3 = "\u0004@\u0019\u00fd\u00b0+U2E\\\u00cdF\u00e6\u008f\u0083e\u0088\u000f<\u00b3N>\u00c7w\t\u0082W\u0099".length();
                var3_4 = 2;
                var2_5 = -1;
lbl15:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
lbl17:
                // 1 sources

                while (true) {
                    var7[var5_1++] = new String(v0).intern();
                    if ((var2_5 += var3_4) < var6_3) {
                        var3_4 = var4_2.charAt(var2_5);
                        ** continue;
                    }
                    break block15;
                    break;
                }
                v1 = ++var2_5;
                v2 = var4_2.substring(v1, v1 + var3_4).toCharArray();
                var8_6 = 0;
                v3 = v2.length;
                v4 = v2;
                v5 = v3;
                if (v3 > 1) ** GOTO lbl68
                do {
                    v6 = v4;
                    v7 = v4;
                    v8 = var8_6;
                    while (true) {
                        v9 = v6[v8];
                        switch (var8_6 % 7) {
                            case 0: {
                                v10 = 27;
                                break;
                            }
                            case 1: {
                                v10 = 67;
                                break;
                            }
                            case 2: {
                                v10 = 72;
                                break;
                            }
                            case 3: {
                                v10 = 12;
                                break;
                            }
                            case 4: {
                                v10 = 44;
                                break;
                            }
                            case 5: {
                                v10 = 19;
                                break;
                            }
                            default: {
                                v10 = 121;
                            }
                        }
                        v6[v8] = (char)(v9 ^ v10);
                        ++var8_6;
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
                } while (v5 > var8_6);
                ** while (true)
            }
            WinConnection.c = var7;
            WinConnection.f = new String[2];
            break block17;
lbl78:
            // 1 sources

            while (true) {
                WinConnection.i = 1385882223152922738L ^ var0_7;
                ** continue;
                break;
            }
        }
        var0_7 = 1385882223152922646L;
        ** while (true)
    }
}

