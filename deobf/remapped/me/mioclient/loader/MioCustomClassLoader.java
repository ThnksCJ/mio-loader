/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 * 
 * Could not load the following classes:
 *  net.fabricmc.loader.impl.launch.knot.Knot
 */
package deobf.remapped.me.mioclient.loader;

import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.SecureClassLoader;
import java.util.HashMap;
import java.util.Map;
import deobf.remapped.me.mioclient.loader.ClassUtil;
import deobf.remapped.me.mioclient.loader.MioInputStream;
import deobf.remapped.me.mioclient.loader.MioStreamHandler;
import deobf.remapped.me.mioclient.loader.Native;
import net.fabricmc.loader.impl.launch.knot.Knot;

public class MioCustomClassLoader
extends SecureClassLoader {
    private ClassLoader d;
    private ClassLoader e;
    private Map f = new HashMap();
    private Map a = new HashMap();
    private Map b = new HashMap();
    private Map c = new HashMap();

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public MioCustomClassLoader(ClassLoader classLoader, ClassLoader classLoader2) {
        super(classLoader);
        this.d = classLoader;
        this.e = classLoader2;
    }

    public Class loadClass(String string) {
        if (this.f.containsKey(string)) {
            return (Class)this.f.get(string);
        }
        long l = ClassUtil.a(string.getBytes(StandardCharsets.UTF_8));
        if (this.a.containsKey(l)) {
            Object object = super.getClassLoadingLock(string);
            synchronized (object) {
                Class clazz = Native.c(string.replace('.', '/'), (byte[])this.a.get(l), Knot.getLauncher().getTargetClassLoader());
                this.f.put(string, clazz);
                return clazz;
            }
        }
        if (this.c.containsKey(l)) {
            Object object = super.getClassLoadingLock(string);
            synchronized (object) {
                Class clazz = Native.f(string.replace('.', '/'), (byte[])Native.e(l), Knot.getLauncher().getTargetClassLoader());
                this.f.put(string, clazz);
                return clazz;
            }
        }
        return this.e.loadClass(string);
    }

    protected Class findClass(String string) {
        if (this.f.containsKey(string)) {
            return (Class)this.f.get(string);
        }
        return super.findClass(string);
    }

    @Override
    public URL getResource(String string) {
        URL uRL = this.e.getResource(string);
        if (uRL == null) {
            throw new RuntimeException();
        }
        return uRL;
    }

    @Override
    public InputStream getResourceAsStream(String string) {
        InputStream inputStream = this.e.getResourceAsStream(string);
        if (inputStream != null) {
            return inputStream;
        }
        long l = ClassUtil.a(string.getBytes(StandardCharsets.UTF_8));
        if (this.b.containsKey(l)) {
            return new MioInputStream(Native.d(l));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private URL createURL(Object object) {
        void v1;
        return new URL(null, "mioclient", new MioStreamHandler((byte[])v1));
    }
}

