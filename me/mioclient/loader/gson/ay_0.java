/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

/*
 * Renamed from me.mioclient.loader.gson.ay
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
        char c;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length() && Character.isDigit(c = string.charAt(i)); ++i) {
            stringBuilder.append(c);
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

