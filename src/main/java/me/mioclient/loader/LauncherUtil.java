/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package me.mioclient.loader;

import java.lang.management.ManagementFactory;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Locale;

public class LauncherUtil {
    public static String getNonSupported() throws URISyntaxException {
        final String string = Jar.getCurrentPath().getAbsolutePath();

        if (string.contains("Crystal Launcher") || string.contains("Crystal-Launcher"))
            return "Crystal Launcher";

        final List<String> args = ManagementFactory.getRuntimeMXBean().getInputArguments();

        for (final String arg : args) {
            final String lowercase = arg.toLowerCase(Locale.ROOT);
            if (!lowercase.contains("javaagent") || !lowercase.contains("sklauncher")) continue;
            return "SKlauncher";
        }

        return null;
    }
}

