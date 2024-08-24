/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package me.mioclient.loader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class AuthToken {
    public static boolean exists() throws IOException {
        final File file = new File(System.getProperty("user.home") + File.separator + "Mio" + File.separator + ".authtoken");
        final FileInputStream stream = new FileInputStream(file);

        if (!file.exists()) {
            stream.close();
            return false;
        }

        stream.readAllBytes();
        stream.close();

        return true;
    }
}

