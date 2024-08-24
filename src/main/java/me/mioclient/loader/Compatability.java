/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package me.mioclient.loader;

import javax.swing.*;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class Compatability {
    private static boolean exists = new File(System.getProperty("user.home") + File.separator + "Mio" + File.separator + "mod_warnings_disabled").exists();

    public static void verify(final String mod) throws Throwable {
        Globals.warn("Mod '%s' is incompatible with Mio".formatted(mod));
        if (exists) return;
        final JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        JCheckBox checkbox = new JCheckBox("Do not show this again");
        final String error = "Mod '%s' is incompatible with Mio. You may continue but any compatibility related reports from you will be ignored.".formatted(mod);
        final Object[] arr = new Object[]{error, checkbox};
        JOptionPane.showMessageDialog(frame, arr, "turboloader", JOptionPane.INFORMATION_MESSAGE);
        if (!checkbox.isSelected()) return;
        exists = true;
        final File file = new File(System.getProperty("user.home") + File.separator + "Mio" + File.separator + "mod_warnings_disabled");
        final FileOutputStream stream = new FileOutputStream(file);
        stream.write("Delete this file to turn mod warnings back on".getBytes(StandardCharsets.UTF_8));
        stream.close();
        Globals.warn("Disabled mod warnings. You can enable them back on by deleting file " + file.getAbsolutePath());
    }
}

