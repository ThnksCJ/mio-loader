/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package me.mioclient.loader;

import java.io.File;
import java.io.FileInputStream;

public class AuthToken {
    public static boolean exists() {
        block4: {
            FileInputStream fileInputStream = null;
            File file = new File(System.getProperty("user.home") + File.separator + "Mio" + File.separator + ".authtoken");
            if (!file.exists()) {
                boolean bl2 = false;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                return bl2;
            }
            if (file.length() <= c) {
                boolean bl3 = false;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                return bl3;
            }
            fileInputStream = new FileInputStream(file);
            fileInputStream.readAllBytes();
            if (fileInputStream == null) break block4;
            fileInputStream.close();
        }
        return true;
    }
}

