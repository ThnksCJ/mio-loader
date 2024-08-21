/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package me.mioclient.loader;

import java.io.PrintWriter;
import java.io.StringWriter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Globals {
    private static Logger logger = LogManager.getLogger((String)"turboloader");
    private static /* synthetic */ int field42;
    private static /* synthetic */ int field43;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void printMessage(String string) {
        logger.info("[turboloader] " + string);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void printWarn(String string) {
        logger.warn("[turboloader] " + string);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void printException(Exception exception) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        exception.printStackTrace(printWriter);
        logger.error(stringWriter.toString());
    }
}

