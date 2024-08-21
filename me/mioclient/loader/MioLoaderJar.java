/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader;

import java.io.File;

public class MioLoaderJar {
    public static final int[][] a;
    private static /* synthetic */ int field264;
    private static /* synthetic */ int field265;

    public static File getCurrentPath() {
        return new File(MioLoaderJar.class.getProtectionDomain().getCodeSource().getLocation().toURI());
    }
}

