/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package me.mioclient.loader;

public class InvalidSizeException
extends RuntimeException {
    private String a;

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

