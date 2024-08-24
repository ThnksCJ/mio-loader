/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package me.mioclient.loader;

import java.lang.reflect.Field;

public class KnotLoaderSwap {
    public MioClassLoader hotswap() throws Throwable {
        final ClassLoader loader = Plugin.class.getClassLoader();
        final Field f1 = loader.getClass().getDeclaredField("delegate");
        f1.setAccessible(true);
        final Object delegate = f1.get(loader);
        final Field f2 = loader.getClass().getDeclaredField("originalLoader");
        f2.setAccessible(true);
        final ClassLoader original = (ClassLoader)f2.get(loader);
        final Field f3 = delegate.getClass().getDeclaredField("parentClassLoader");
        f3.setAccessible(true);
        final ClassLoader parent = (ClassLoader)f3.get(delegate);
        final MioClassLoader mioloader = new MioClassLoader(parent, original);
        f2.set(loader, mioloader);
        f3.set(delegate, mioloader);
        return mioloader;
    }
}

