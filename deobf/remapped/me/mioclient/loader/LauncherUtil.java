/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package deobf.remapped.me.mioclient.loader;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.Locale;
import deobf.remapped.me.mioclient.loader.MioLoaderJar;

public class LauncherUtil {
    public static String getNonSupported() {
        String string = null;
        string = MioLoaderJar.getCurrentPath().getAbsolutePath();
        if (string == null) {
            return null;
        }
        if (string.contains("Crystal Launcher") || string.contains("Crystal-Launcher")) {
            return "Crystal Launcher";
        }
        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        for (String string2 : runtimeMXBean.getInputArguments()) {
            String string3 = string2.toLowerCase(Locale.ROOT);
            if (!string3.contains("javaagent") || !string3.contains("sklauncher")) continue;
            return "SKlauncher";
        }
        return null;
    }
}

