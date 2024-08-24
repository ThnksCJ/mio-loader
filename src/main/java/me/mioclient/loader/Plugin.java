/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package me.mioclient.loader;

import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;

public class Plugin implements PreLaunchEntrypoint {
    public void onPreLaunch() {
        try {
            Mio.start();
        } catch (final Throwable _t) { Globals.warn(_t.getMessage()); }
    }
}

