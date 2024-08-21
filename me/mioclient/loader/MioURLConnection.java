/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import me.mioclient.loader.MioInputStream;

public class MioURLConnection
extends URLConnection {
    private byte[] a;
    private static /* synthetic */ int field226;
    private static /* synthetic */ int field227;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
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

