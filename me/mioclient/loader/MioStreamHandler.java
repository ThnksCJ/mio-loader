/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package me.mioclient.loader;

import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import me.mioclient.loader.MioURLConnection;

public class MioStreamHandler
extends URLStreamHandler {
    private byte[] a;

    public MioStreamHandler(byte[] byArray) {
        this.a = byArray;
    }

    @Override
    protected URLConnection openConnection(URL uRL) {
        return new MioURLConnection(uRL, this.a);
    }
}

