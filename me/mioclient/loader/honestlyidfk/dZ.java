/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.honestlyidfk;

public class dZ {
    private Object[] a = new Object[(int)c];
    private int b;
    private static final long c;
    public static final int[][] d;
    private static /* synthetic */ int field260;
    private static /* synthetic */ int field261;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a() {
        for (int i = 0; i < this.b; ++i) {
            this.a[i] = null;
        }
        this.b = 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(Object object) {
        if (this.b >= this.a.length) {
            Object[] objectArray = new Object[this.a.length * 2];
            System.arraycopy(this.a, 0, objectArray, 0, this.a.length);
            this.a = objectArray;
        }
        this.a[this.b++] = object;
    }

    public Object b() {
        Object object = this.a[--this.b];
        this.a[this.b] = null;
        return object;
    }

    public Object c() {
        return this.a[this.b - 1];
    }

    public Object a(int n) {
        return this.a[this.b - 1 - n];
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        field260 = 0x1E27 ^ 0xFFFF8F8B;
        field261 = 0xFFFFF101 ^ 0xFFFF8F8B;
        d = new int[1][2];
        long l = 685956184280317561L;
        c = 0x45CECFA0E782BE71L ^ l;
    }
}

