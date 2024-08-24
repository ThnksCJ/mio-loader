/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package me.mioclient.loader;

import net.fabricmc.loader.api.ModContainer;
import net.fabricmc.loader.impl.FabricLoaderImpl;

import javax.swing.*;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Optional;

public class Mio {
    public static void start() throws Throwable {
        final String os = System.getProperty("os.name");
        if (!os.toLowerCase().contains("win")) {
            String error_msg = "Mio only works on Windows (you're running %s). Please contact us at https://mioclient.me/support".formatted(os);
            Globals.warn(error_msg);
            Mio.error(error_msg);
            Mio.exit();
            return;
        }

        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        final String fabric_version = Mio.getFabricVersion();
        if (fabric_version != null) {
            Mio.error("Fabric version %s is currently not supported.\nPlease downgrade Fabric to version 0.15.11 or below.".formatted(fabric_version));
            Mio.exit();
            return;
        }

        if (!AuthToken.exists()) {
            Mio.error("No auth token found, please open the installer and log in.");
            Mio.exit();
            return;
        }

        final File file = new File("mio-fabric");

        if (!(file.exists() && file.isDirectory() || file.mkdir()))
            throw new RuntimeException("Failed to create the mio-fabric directory");

        SocketConnection.start();

        final int jdk_version = AuthHandler.getJdkVersion();
        if (jdk_version != 17) {
            Mio.error("Only Java 17 is supported (you're running Java %d).".formatted(jdk_version));
            Mio.exit();
            return;
        }

        final String vendor = System.getProperty("java.vm.vendor").toLowerCase();
        if (vendor.contains("eclipse adoptium")) {
            Mio.error("Eclipse Adoptium is not supported, please switch to a different Java.");
            Mio.exit();
            return;
        }

        final String vm = System.getProperty("java.vendor.version");
        if (vm != null && vm.toLowerCase().contains("graalvm")) {
            Mio.error("GraalVM is not supported, please switch to a different Java.");
            Mio.exit();
            return;
        }

        final String launcher = LauncherUtil.getNonSupported();
        if (launcher != null) {
            Mio.error("%s is not a supported launcher.\n\nIf you need a cracked launcher, you can try these alternatives:\n%s\n%s\n%s".formatted(launcher, "1. Legacy Launcher (https://llaun.ch/)", "2. Prism Launcher (cracked) (https://tinyurl.com/prismdownload)", "3. TLauncher (https://tlauncher.org/)"));
            Mio.exit();
            return;
        }

        Mio.resetMixins();
        System.load(new File("mio-fabric" + File.separator + "turbonative.dll").getAbsolutePath());
    }

    private static void exit() {
        Runtime.getRuntime().halt(0);
        throw new RuntimeException();
    }

    public static void error(String string) {
        final JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        JOptionPane.showMessageDialog(frame, string, "turboloader", JOptionPane.ERROR_MESSAGE);
    }

    public static void resetMixins() throws Throwable {
        final ClassLoader loader = Plugin.class.getClassLoader();
        final Field f1 = loader.getClass().getDeclaredField("delegate");
        f1.setAccessible(true);
        final Object delegate = f1.get(loader);
        final Field f2 = delegate.getClass().getDeclaredField("mixinTransformer");
        f2.setAccessible(true);
        final Object transformer = f2.get(delegate);
        final Class<?> clazz = transformer.getClass();
        if (!clazz.getName().contains("spongepowered")) return;
        final Field f3 = clazz.getDeclaredField("processor");
        f3.setAccessible(true);
        final Object processor = f3.get(transformer);
        final Field f4 = processor.getClass().getDeclaredField("transformedCount");
        f4.setAccessible(true);
        f4.setInt(processor, 0);
    }

    private static String getFabricVersion() {
        final Optional<ModContainer> optional = FabricLoaderImpl.INSTANCE.getModContainer("fabricloader");
        if (optional.isEmpty()) return null;
        String string = optional.get().getMetadata().getVersion().getFriendlyString();
        if (string.startsWith("0.16")) return string;
        return null;
    }
}

