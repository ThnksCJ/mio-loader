/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader;

import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import me.mioclient.loader.MioURLConnection;

public class MioStreamHandler
extends URLStreamHandler {
    private byte[] a;
    private static /* synthetic */ int field228;
    private static /* synthetic */ int field229;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public MioStreamHandler(byte[] byArray) {
        this.a = byArray;
    }

    @Override
    protected URLConnection openConnection(URL uRL) {
        return new MioURLConnection(uRL, this.a);
    }
}

