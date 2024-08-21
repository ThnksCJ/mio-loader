/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import me.mioclient.loader.gson.aK;

final class aD {
    private aK a;
    private int b;
    private int c;
    private int d;
    public static final int[][] e;
    private static /* synthetic */ int field120;
    private static /* synthetic */ int field121;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    aD() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    void a(int n) {
        int n2 = Integer.highestOneBit(n) * 2 - 1;
        this.b = n2 - n;
        this.d = 0;
        this.c = 0;
        this.a = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    void a(aK aK2) {
        aK2.c = null;
        aK2.a = null;
        aK2.b = null;
        aK2.i = 1;
        if (this.b > 0 && (this.d & 1) == 0) {
            ++this.d;
            --this.b;
            ++this.c;
        }
        aK2.a = this.a;
        this.a = aK2;
        ++this.d;
        if (this.b > 0 && (this.d & 1) == 0) {
            ++this.d;
            --this.b;
            ++this.c;
        }
        int n = 4;
        while ((this.d & n - 1) == n - 1) {
            if (this.c == 0) {
                var3_3 = this.a;
                var4_4 = var3_3.a;
                aK aK3 = var4_4.a;
                var4_4.a = aK3.a;
                this.a = var4_4;
                var4_4.b = aK3;
                var4_4.c = var3_3;
                var4_4.i = var3_3.i + 1;
                aK3.a = var4_4;
                var3_3.a = var4_4;
            } else if (this.c == 1) {
                var3_3 = this.a;
                this.a = var4_4 = var3_3.a;
                var4_4.c = var3_3;
                var4_4.i = var3_3.i + 1;
                var3_3.a = var4_4;
                this.c = 0;
            } else if (this.c == 2) {
                this.c = 0;
            }
            n *= 2;
        }
        return;
    }

    aK a() {
        aK aK2 = this.a;
        if (aK2.a != null) {
            throw new IllegalStateException();
        }
        return aK2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field120 = 0x10F9 ^ 0xFFFFBEB1;
        field121 = 0xFFFFF5AC ^ 0xFFFFBEB1;
        e = new int[2][2];
    }
}

