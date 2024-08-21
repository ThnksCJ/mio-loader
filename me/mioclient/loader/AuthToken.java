/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader;

import java.io.File;
import java.io.FileInputStream;

public class AuthToken {
    private static /* synthetic */ int field262;
    private static /* synthetic */ int field263;

    public static boolean exists() {
        block4: {
            FileInputStream fileInputStream = null;
            File file = new File(System.getProperty("user.home") + File.separator + "Mio" + File.separator + ".authtoken");
            if (!file.exists()) {
                boolean bl = false;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                return bl;
            }
            if (file.length() <= c) {
                boolean bl = false;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                return bl;
            }
            fileInputStream = new FileInputStream(file);
            fileInputStream.readAllBytes();
            if (fileInputStream == null) break block4;
            fileInputStream.close();
        }
        return true;
    }
}

