/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package me.mioclient.loader;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;

public class EntryPoint implements ClientModInitializer, ModInitializer {
    public void onInitialize() {
        Native.a();
    }

    public void onInitializeClient() {
        Native.b();
    }
}

