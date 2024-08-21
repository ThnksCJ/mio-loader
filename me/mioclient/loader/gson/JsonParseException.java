/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

public class JsonParseException
extends RuntimeException {
    static final long a;
    public static final int[][] b;
    private static /* synthetic */ int field2;
    private static /* synthetic */ int field3;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public JsonParseException(String string) {
        super(string);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public JsonParseException(String string, Throwable throwable) {
        super(string, throwable);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public JsonParseException(Throwable throwable) {
        super(throwable);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l;
        field2 = 0x2B9B ^ 0xFFFF9734;
        field3 = 0xFFFFCFF4 ^ 0xFFFF9734;
        b = new int[3][1];
        long l2 = 6275465945804531335L;
        a = l = 0x905FEBBADBC517A5L ^ l2;
    }
}

