/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package deobf.remapped.me.mioclient.loader;

import java.io.PrintWriter;
import java.io.StringWriter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Globals {
    private static Logger logger = LogManager.getLogger((String)"turboloader");

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

