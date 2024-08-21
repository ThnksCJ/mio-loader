/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

public class es {
    public static final int a;
    public static final int b;
    public static final es c;
    public static final es d;
    private boolean e;
    private int f = 512;
    private static final long[] g;
    private static final Integer[] h;
    public static final int[][] i;
    private static /* synthetic */ int field328;
    private static /* synthetic */ int field329;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public es() {
        this.e = false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private es(boolean bl2, int n) {
        this.e = bl2;
        this.f = n;
    }

    protected es a() {
        return new es(this.e, this.f);
    }

    public boolean b() {
        return this.e;
    }

    public es a(boolean bl2) {
        es es2 = this.a();
        es2.e = bl2;
        return es2;
    }

    public int c() {
        return this.f;
    }

    public es a(int n) {
        es es2 = this.a();
        es2.f = n > -1 ? n : -1;
        return es2;
    }

    protected /* synthetic */ Object clone() {
        return this.a();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        field328 = 0x7FD7 ^ 0xFFFF8D34;
        field329 = 0xFFFFF336 ^ 0xFFFF8D34;
        i = new int[1][3];
        a = -1;
        long l = 8450103229272085159L;
        long[] lArray = new long[3];
        int n = 0;
        String string = "x\u0095\u00a2aY\u0016\u00e7\u0005n\u00af'\u00f0kLh4<\u00c4i\u009e\u00c0D\u00c1\u0013";
        int n2 = "x\u0095\u00a2aY\u0016\u00e7\u0005n\u00af'\u00f0kLh4<\u00c4i\u009e\u00c0D\u00c1\u0013".length();
        int n3 = 0;
        do {
            byte[] byArray = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            lArray[n4] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l;
        } while (n3 < n2);
        g = lArray;
        h = new Integer[3];
        b = 512;
        c = new es();
        d = new es().a(true);
    }
}

