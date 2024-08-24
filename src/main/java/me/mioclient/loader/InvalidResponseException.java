/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package me.mioclient.loader;

public class InvalidResponseException extends RuntimeException {
    private final String msg;

    public InvalidResponseException(final String msg) {
        this.msg = msg;
    }

    @Override
    public String getMessage() {
        return this.msg;
    }
}

