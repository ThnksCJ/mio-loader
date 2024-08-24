/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.JsonParseException;

public final class JsonSyntaxException
extends JsonParseException {
    private static final long b;
    public static final int[][] a;
    private static /* synthetic */ int field0;
    private static /* synthetic */ int field1;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public JsonSyntaxException(String string) {
        super(string);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public JsonSyntaxException(String string, Throwable throwable) {
        super(string, throwable);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public JsonSyntaxException(Throwable throwable) {
        super(throwable);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field0 = 0x4B05 ^ 0xFFFFD7A8;
        field1 = 0xFFFFEE3F ^ 0xFFFFD7A8;
        a = new int[4][4];
        b = 1L;
    }
}

