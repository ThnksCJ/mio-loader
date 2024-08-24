/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package deobf.remapped.me.mioclient.loader;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import deobf.remapped.me.mioclient.loader.MioInputStream;

public class MioURLConnection
extends URLConnection {
    private byte[] a;

    public MioURLConnection(URL uRL, byte[] byArray) {
        super(uRL);
        this.a = byArray;
    }

    @Override
    public void connect() {
    }

    @Override
    public InputStream getInputStream() {
        return new MioInputStream(this.a);
    }
}

