/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.ClientModInitializer
 *  net.fabricmc.api.ModInitializer
 */
package deobf.remapped.me.mioclient.loader;

import deobf.remapped.me.mioclient.loader.Native;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;

public class EntryPoint
implements ClientModInitializer,
ModInitializer {
    public void onInitialize() {
        Native.a();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void onInitializeClient() {
        Native.b();
    }
}

