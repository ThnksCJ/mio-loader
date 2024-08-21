/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.discordipc;

import java.net.UnixDomainSocketAddress;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.function.Consumer;
import me.mioclient.loader.discordipc.Pipe;
import me.mioclient.loader.discordipc.dg;
import me.mioclient.loader.discordipc.dh;
import me.mioclient.loader.discordipc.dn;
import me.mioclient.loader.do_0;
import me.mioclient.loader.gson.DocumentConsumer;

public class UnixPipe
extends Pipe {
    private final Selector a = Selector.open();
    private final SocketChannel b;
    private final Consumer c;
    private static final String f;
    public static final int[][] d;
    private static /* synthetic */ int field282;
    private static /* synthetic */ int field283;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public UnixPipe(String string, Consumer consumer) {
        this.b = SocketChannel.open(UnixDomainSocketAddress.of(string));
        this.c = consumer;
        this.b.configureBlocking(false);
        this.b.register(this.a, 1);
        Thread thread = new Thread(this::b);
        thread.setName(f);
        thread.start();
    }

    private void b() {
        do_0 do_02 = do_0.a;
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        Buffer buffer = null;
        dg dg2 = null;
        block5: while (true) {
            this.a.select();
            switch (dn.a[do_02.ordinal()]) {
                case 1: {
                    this.b.read(byteBuffer);
                    if (byteBuffer.hasRemaining()) continue block5;
                    dg2 = dg.a(Integer.reverseBytes(byteBuffer.getInt(0)));
                    do_02 = do_0.b;
                    byteBuffer.rewind();
                    break;
                }
                case 2: {
                    this.b.read(byteBuffer);
                    if (byteBuffer.hasRemaining()) continue block5;
                    buffer = ByteBuffer.allocate(Integer.reverseBytes(byteBuffer.getInt(0)));
                    do_02 = do_0.c;
                    byteBuffer.rewind();
                    break;
                }
                case 3: {
                    this.b.read((ByteBuffer)buffer);
                    if (buffer.hasRemaining()) continue block5;
                    String string = Charset.defaultCharset().decode(((ByteBuffer)buffer).rewind()).toString();
                    this.c.accept(new dh(dg2, DocumentConsumer.a(string).u()));
                    buffer = null;
                    do_02 = do_0.a;
                }
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected void a(ByteBuffer byteBuffer) {
        this.b.write(byteBuffer);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a() {
        this.a.close();
        this.b.close();
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
                field282 = 0x18D9 ^ 0xFFFFA30F;
                field283 = 0xFFFFCDDB ^ 0xFFFFA30F;
                d = new int[2][2];
                char[] cArray3 = "\u001a\u0007J\u0001\u0016\u00164~'i!YIp\f\u000bX\u0006Y\u00108,\u000bX\u0006".toCharArray();
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
                        case 0 -> 94;
                        case 1 -> 110;
                        case 2 -> 57;
                        case 3 -> 98;
                        case 4 -> 121;
                        case 5 -> 100;
                        default -> 80;
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
        f = new String(cArray).intern();
    }
}

