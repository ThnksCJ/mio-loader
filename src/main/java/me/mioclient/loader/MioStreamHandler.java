/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package me.mioclient.loader;

import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

public class MioStreamHandler extends URLStreamHandler {
    private final byte[] data;

    public MioStreamHandler(final byte[] data) {
        this.data = data;
    }

    @Override
    protected URLConnection openConnection(final URL url) {
        return new MioURLConnection(url, this.data);
    }
}

