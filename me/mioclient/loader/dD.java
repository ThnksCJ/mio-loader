/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import me.mioclient.loader.dO;
import me.mioclient.loader.honestlyidfk.dz_0;

public class dD
extends dz_0 {
    public final dz_0 c;
    public final List d;
    private static /* synthetic */ int field244;
    private static /* synthetic */ int field245;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public dD(int n, int n2, dz_0 dz_02, List list) {
        super(n, n2);
        this.c = dz_02;
        this.d = list;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(dO dO2) {
        dO2.a(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void a(Consumer consumer) {
        consumer.accept(this.c);
        Iterator iterator = this.d.iterator();
        while (iterator.hasNext()) {
            dz_0 dz_02 = (dz_0)iterator.next();
            consumer.accept(dz_02);
        }
        return;
    }
}

