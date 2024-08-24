/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package me.mioclient.loader;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class MioURLConnection extends URLConnection {
    private final byte[] data;

    public MioURLConnection(final URL url, final byte[] data) {
        super(url);
        this.data = data;
    }

    @Override public void connect() {}

    @Override
    public InputStream getInputStream() {
        return new MioInputStream(this.data);
    }
}

