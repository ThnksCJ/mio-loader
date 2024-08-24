/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package me.mioclient.loader;

import java.io.File;

public class MioLoaderJar {
    public static File getCurrentPath() {
        return new File(MioLoaderJar.class.getProtectionDomain().getCodeSource().getLocation().toURI());
    }
}

