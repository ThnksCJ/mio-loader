/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package me.mioclient.loader;

import net.fabricmc.loader.impl.launch.knot.Knot;

import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.SecureClassLoader;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("all")
public class MioClassLoader extends SecureClassLoader {
    private final ClassLoader loader;
    private final Map<String, Class<?>> class_map1 = new HashMap<>();
    private final Map<String, byte[]> class_map2 = new HashMap<>();
    private final Map<Long, ?> resource_map = new HashMap<>();
    private final Map<String, Class<?>> class_map3 = new HashMap<>();

    public MioClassLoader(final ClassLoader loader, final ClassLoader loader2) {
        super(loader);
        this.loader = loader2;
    }

    public Class<?> loadClass(final String klass) throws ClassNotFoundException {
        if (this.class_map1.containsKey(klass))
            return this.class_map1.get(klass);

        long l = ClassUtil.hash(klass.getBytes(StandardCharsets.UTF_8));

        if (this.class_map2.containsKey(l)) {
            synchronized (super.getClassLoadingLock(klass)) {
                final Class<?> clazz = Native.c(klass.replace('.', '/'), (byte[])this.class_map2.get(l), Knot.getLauncher().getTargetClassLoader());
                this.class_map1.put(klass, clazz);
                return clazz;
            }
        }

        if (this.class_map3.containsKey(l)) {
            synchronized (super.getClassLoadingLock(klass)) {
                final Class<?> clazz = Native.f(klass.replace('.', '/'), (byte[])Native.e(l), Knot.getLauncher().getTargetClassLoader());
                this.class_map1.put(klass, clazz);
                return clazz;
            }
        }

        return this.loader.loadClass(klass);
    }

    protected Class<?> findClass(final String string) throws ClassNotFoundException {
        if (this.class_map1.containsKey(string)) return this.class_map1.get(string);
        return super.findClass(string);
    }

    @Override
    public URL getResource(final String string) {
        final URL url = this.loader.getResource(string);
        if (url == null) throw new RuntimeException();
        return url;
    }

    @Override
    public InputStream getResourceAsStream(final String string) {
        final InputStream stream = this.loader.getResourceAsStream(string);

        if (stream != null) return stream;

        long l = ClassUtil.hash(string.getBytes(StandardCharsets.UTF_8));

        if (this.resource_map.containsKey(l))
            return new MioInputStream(Native.d(l));

        return null;
    }
}

