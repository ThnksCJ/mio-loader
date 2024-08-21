/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader;

public class InvalidSizeException
extends RuntimeException {
    private String a;
    private static /* synthetic */ int field20;
    private static /* synthetic */ int field21;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public InvalidSizeException(String string) {
        this.a = string;
    }

    @Override
    public String getMessage() {
        return this.a;
    }
}

