/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package deobf.remapped.me.mioclient.loader;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import deobf.remapped.me.mioclient.loader.Globals;

public class CompatibilityCheck {
    private static boolean exists;

    public static void a(String string) {
        Globals.printWarn("Mod '%s' is incompatible with Mio".formatted(string));
        if (exists) {
            return;
        }
        JFrame jFrame = new JFrame();
        jFrame.setAlwaysOnTop(true);
        JCheckBox jCheckBox = new JCheckBox("Do not show this again");
        String string2 = "Mod '%s' is incompatible with Mio. You may continue but any compatibility related reports from you will be ignored.".formatted(string);
        Object[] objectArray = new Object[]{string2, jCheckBox};
        JOptionPane.showMessageDialog(jFrame, objectArray, "turboloader", 1);
        if (!jCheckBox.isSelected()) return;
        exists = true;
        File file = new File(System.getProperty("user.home") + File.separator + "Mio" + File.separator + "mod_warnings_disabled");
        FileOutputStream fileOutputStream = null;
        boolean bl2 = false;
        fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write("Delete this file to turn mod warnings back on".getBytes(StandardCharsets.UTF_8));
        bl2 = true;
        fileOutputStream.close();
        if (!bl2) return;
        Globals.printWarn("Disabled mod warnings. You can enable them back on by deleting file " + file.getAbsolutePath());
    }

    static {
        File v7 = new File(System.getProperty("user.home") + File.separator + "Mio" + File.separator + "mod_warnings_disabled");
        exists = v7.exists();
    }
}

