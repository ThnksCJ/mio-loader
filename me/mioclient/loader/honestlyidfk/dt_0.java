/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.honestlyidfk;

/*
 * Renamed from me.mioclient.loader.honestlyidfk.dt
 */
public class dt_0 {
    private static final ThreadLocal d;
    public final int a;
    public final String b;
    public dt_0 c;
    public static final int[][] e;
    private static /* synthetic */ int field290;
    private static /* synthetic */ int field291;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public dt_0(int n, String string) {
        this.a = n;
        this.b = string;
    }

    public String toString() {
        StringBuilder stringBuilder = (StringBuilder)d.get();
        stringBuilder.setLength(0);
        dt_0 dt_02 = this;
        while (dt_02 != null) {
            stringBuilder.append(dt_02.b);
            dt_02 = dt_02.c;
        }
        return stringBuilder.toString();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field290 = 0x6909 ^ 0xFFFFAD57;
        field291 = 0xFFFFF45A ^ 0xFFFFAD57;
        e = new int[4][1];
        d = ThreadLocal.withInitial(StringBuilder::new);
    }
}

