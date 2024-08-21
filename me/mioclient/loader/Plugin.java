/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint
 */
package me.mioclient.loader;

import me.mioclient.loader.MioShitter;
import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;

public class Plugin
implements PreLaunchEntrypoint {
    public static final int[][] a;
    private static /* synthetic */ int field72;
    private static /* synthetic */ int field73;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void onPreLaunch() {
        MioShitter.startmonkey();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field72 = 0x2127 ^ 0xFFFF8489;
        field73 = 0xFFFFA92D ^ 0xFFFF8489;
        a = new int[2][1];
    }
}

