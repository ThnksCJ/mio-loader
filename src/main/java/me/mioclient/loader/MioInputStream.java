/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package me.mioclient.loader;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Objects;

// wow skidding jdk
public class MioInputStream extends InputStream {
    protected byte[] buf;
    protected int pos;
    protected int mark = 0;
    protected int count;

    public MioInputStream(final byte[] data) {
        this.buf = data;
        this.pos = 0;
        this.count = data.length;
    }

    public MioInputStream(final byte[] data, int pos, int len) {
        this.buf = data;
        this.pos = pos;
        this.count = Math.min(pos + len, data.length);
        this.mark = pos;
    }

    @Override
    public synchronized int read() {
        return this.pos < this.count ? this.buf[this.pos++] & 0xFF : -1;
    }

    @Override
    public synchronized int read(final byte[] data, int off, int len) {
        Objects.checkFromIndexSize(off, len, data.length);

        if (pos >= count) return -1;

        int available = count - pos;
        if (len > available) len = available;
        if (len <= 0) return 0;
        System.arraycopy(buf, pos, data, off, len);
        pos += len;
        return len;
    }

    @Override
    public synchronized byte[] readAllBytes() {
        final byte[] data = Arrays.copyOfRange(this.buf, this.pos, this.count);
        this.pos = this.count;
        return data;
    }

    @Override
    public int readNBytes(final byte[] b, int off, int len) {
        int n = read(b, off, len);
        return n == -1 ? 0 : n;
    }

    @Override
    public synchronized long transferTo(final OutputStream stream) throws IOException {
        int len = count - pos;
        stream.write(buf, pos, len);
        pos = count;
        return len;
    }

    @Override
    public synchronized long skip(long n) {
        long available = count - pos;
        if (n < available) available = n < 0 ? 0 : n;
        pos += (int) available;
        return available;
    }

    @Override
    public synchronized int available() {
        return this.count - this.pos;
    }

    @Override
    public boolean markSupported() {
        return true;
    }

    @Override
    public void mark(int n) {
        this.mark = this.pos;
    }

    @Override
    public synchronized void reset() {
        this.pos = this.mark;
    }

    @Override public void close() {}
}

