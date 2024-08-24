/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

/*
 * Renamed from com.google.gson.ay
 */
public final class ay_0 {
    private static final int a;
    private static final String[] b;
    private static final String[] c;
    private static final long[] d;
    private static final Integer[] e;
    public static final int[][] f;
    private static /* synthetic */ int field190;
    private static /* synthetic */ int field191;

    private static int c() {
        String string = System.getProperty("java.version");
        return ay_0.a(string);
    }

    static int a(String string) {
        int n = ay_0.b(string);
        if (n == -1) {
            n = ay_0.c(string);
        }
        if (n == -1) {
            return 6;
        }
        return n;
    }

    private static int b(String string) {
        String[] stringArray = string.split("[._]");
        int n = Integer.parseInt(stringArray[0]);
        if (n == 1 && stringArray.length > 1) {
            return Integer.parseInt(stringArray[1]);
        }
        return n;
    }

    private static int c(String string) {
        char c2;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length() && Character.isDigit(c2 = string.charAt(i)); ++i) {
            stringBuilder.append(c2);
        }
        return Integer.parseInt(stringBuilder.toString());
    }

    public static int a() {
        return a;
    }

    public static boolean b() {
        return a >= 9;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private ay_0() {
    }
}

