/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package me.mioclient.loader;

import java.io.File;
import java.net.URISyntaxException;

public class Jar {
    public static File getCurrentPath() throws URISyntaxException {
        return new File(Jar.class.getProtectionDomain().getCodeSource().getLocation().toURI());
    }
}

