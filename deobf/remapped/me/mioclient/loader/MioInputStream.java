/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package deobf.remapped.me.mioclient.loader;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Objects;

public class MioInputStream
extends InputStream {
    protected byte[] a;
    protected int b;
    protected int c = 0;
    protected int d;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public MioInputStream(Object object) {
        byte[] byArray = (byte[])object;
        this.a = byArray;
        this.b = 0;
        this.d = byArray.length;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public MioInputStream(byte[] byArray, int n, int n2) {
        this.a = byArray;
        this.b = n;
        this.d = Math.min(n + n2, byArray.length);
        this.c = n;
    }

    @Override
    public synchronized int read() {
        return this.b < this.d ? this.a[this.b++] & (int)e : -1;
    }

    @Override
    public synchronized int read(byte[] byArray, int n, int n2) {
        Objects.checkFromIndexSize(n, n2, byArray.length);
        if (this.b >= this.d) {
            return -1;
        }
        int n3 = this.d - this.b;
        if (n2 > n3) {
            n2 = n3;
        }
        if (n2 <= 0) {
            return 0;
        }
        System.arraycopy(this.a, this.b, byArray, n, n2);
        this.b += n2;
        return n2;
    }

    @Override
    public synchronized byte[] readAllBytes() {
        byte[] byArray = Arrays.copyOfRange(this.a, this.b, this.d);
        this.b = this.d;
        return byArray;
    }

    @Override
    public int readNBytes(byte[] byArray, int n, int n2) {
        int n3 = this.read(byArray, n, n2);
        return n3 == -1 ? 0 : n3;
    }

    @Override
    public synchronized long transferTo(OutputStream outputStream) {
        int n = this.d - this.b;
        outputStream.write(this.a, this.b, n);
        this.b = this.d;
        return n;
    }

    @Override
    public synchronized long skip(long l) {
        long l2 = this.d - this.b;
        if (l < l2) {
            l2 = l < 0L ? 0L : l;
        }
        this.b = (int)((long)this.b + l2);
        return l2;
    }

    @Override
    public synchronized int available() {
        return this.d - this.b;
    }

    @Override
    public boolean markSupported() {
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void mark(int n) {
        this.c = this.b;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public synchronized void reset() {
        this.b = this.c;
    }

    @Override
    public void close() {
    }
}

