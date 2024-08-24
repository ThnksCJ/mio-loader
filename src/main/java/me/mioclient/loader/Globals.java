/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package me.mioclient.loader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.PrintWriter;
import java.io.StringWriter;

public class Globals {
    private static final Logger logger = LogManager.getLogger("turboloader");

    public static void printMessage(String string) {
        logger.info("[turboloader] {}", string);
    }

    public static void warn(String string) {
        logger.warn("[turboloader] {}", string);
    }

    public static void printException(Exception exception) {
        final PrintWriter writer = new PrintWriter(new StringWriter());
        exception.printStackTrace(writer);
        logger.error(writer.toString());
    }
}

