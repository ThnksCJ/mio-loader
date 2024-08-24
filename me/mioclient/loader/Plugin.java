/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 * 
 * Could not load the following classes:
 *  net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint
 */
package me.mioclient.loader;

import me.mioclient.loader.MioShitter;
import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;

public class Plugin
implements PreLaunchEntrypoint {
    public void onPreLaunch() {
        MioShitter.startmonkey();
    }
}

