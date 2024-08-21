/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.loader.api.ModContainer
 *  net.fabricmc.loader.impl.FabricLoaderImpl
 */
package me.mioclient.loader;

import java.io.File;
import java.lang.reflect.Field;
import java.util.Optional;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import me.mioclient.loader.AuthHandler;
import me.mioclient.loader.AuthToken;
import me.mioclient.loader.Globals;
import me.mioclient.loader.LauncherUtil;
import me.mioclient.loader.Plugin;
import me.mioclient.loader.SocketConnection;
import net.fabricmc.loader.api.ModContainer;
import net.fabricmc.loader.impl.FabricLoaderImpl;

public class MioShitter {
    private static final String[] a;
    private static final String[] b;
    private static final long c;
    public static final int[][] d;
    private static /* synthetic */ int field224;
    private static /* synthetic */ int field225;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void startmonkey() {
        String string = System.getProperty("os.name");
        if (!string.toLowerCase().contains("win")) {
            String string2 = "Mio only works on Windows (you're running %s). Please contact us at https://mioclient.me/support".formatted(string);
            Globals.printWarn(string2);
            MioShitter.anotherfuckingpopup(string2);
            MioShitter.killDaJVMER();
            return;
        }
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        String string3 = MioShitter.getfabricversion();
        if (string3 != null) {
            MioShitter.anotherfuckingpopup("Fabric version %s is currently not supported.\nPlease downgrade Fabric to version 0.15.11 or below.".formatted(string3));
            MioShitter.killDaJVMER();
            return;
        }
        if (!AuthToken.exists()) {
            MioShitter.anotherfuckingpopup("No auth token found, please open the installer and log in.");
            MioShitter.killDaJVMER();
            return;
        }
        File file = new File("mio-fabric");
        if (!(file.exists() && file.isDirectory() || file.mkdir())) {
            throw new RuntimeException("Failed to create the mio-fabric directory");
        }
        SocketConnection.startConnection();
        int n = AuthHandler.c();
        if (n != (int)c) {
            MioShitter.anotherfuckingpopup("Only Java 17 is supported (you're running Java %d).".formatted(n));
            MioShitter.killDaJVMER();
            return;
        }
        String string4 = System.getProperty("java.vm.vendor").toLowerCase();
        if (string4.contains("eclipse adoptium")) {
            MioShitter.anotherfuckingpopup("Eclipse Adoptium is not supported, please switch to a different Java.");
            MioShitter.killDaJVMER();
            return;
        }
        String string5 = System.getProperty("java.vendor.version");
        if (string5 != null && (string5 = string5.toLowerCase()).contains("graalvm")) {
            MioShitter.anotherfuckingpopup("GraalVM is not supported, please switch to a different Java.");
            MioShitter.killDaJVMER();
            return;
        }
        String string6 = LauncherUtil.getNonSupported();
        if (string6 != null) {
            MioShitter.anotherfuckingpopup("%s is not a supported launcher.\n\nIf you need a cracked launcher, you can try these alternatives:\n%s\n%s\n%s".formatted(string6, "1. Legacy Launcher (https://llaun.ch/)", "2. Prism Launcher (cracked) (https://tinyurl.com/prismdownload)", "3. TLauncher (https://tlauncher.org/)"));
            MioShitter.killDaJVMER();
            return;
        }
        String string7 = "mio-fabric" + File.separator + "turbonative.dll";
        MioShitter.giggleTheShitter();
        File file2 = new File(string7);
        System.load(file2.getAbsolutePath());
    }

    private static void killDaJVMER() {
        Runtime.getRuntime().halt(0);
        throw new RuntimeException();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void aFuckingpopup(String string) {
        JFrame jFrame = new JFrame();
        jFrame.setAlwaysOnTop(true);
        JOptionPane.showMessageDialog(jFrame, string, "turboloader", 1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void anotherfuckingpopup(String string) {
        JFrame jFrame = new JFrame();
        jFrame.setAlwaysOnTop(true);
        JOptionPane.showMessageDialog(jFrame, string, "turboloader", 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void giggleTheShitter() {
        Class<?> clazz = null;
        ClassLoader classLoader = Plugin.class.getClassLoader();
        Field field = classLoader.getClass().getDeclaredField("delegate");
        field.setAccessible(true);
        Object object = field.get(classLoader);
        Field field2 = object.getClass().getDeclaredField("mixinTransformer");
        field2.setAccessible(true);
        Object object2 = field2.get(object);
        clazz = object2.getClass();
        if (!clazz.getName().contains("spongepowered")) {
            return;
        }
        Field field3 = clazz.getDeclaredField("processor");
        field3.setAccessible(true);
        Object object3 = field3.get(object2);
        Field field4 = object3.getClass().getDeclaredField("transformedCount");
        field4.setAccessible(true);
        field4.setInt(object3, 0);
    }

    private static String getfabricversion() {
        Optional optional = FabricLoaderImpl.INSTANCE.getModContainer("fabricloader");
        if (optional.isEmpty()) {
            return null;
        }
        String string = ((ModContainer)optional.get()).getMetadata().getVersion().getFriendlyString();
        if (string.startsWith("0.16")) {
            return string;
        }
        return null;
    }
}

