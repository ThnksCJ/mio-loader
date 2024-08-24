/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package me.mioclient.loader;

import java.lang.reflect.Field;
import me.mioclient.loader.MioCustomClassLoader;
import me.mioclient.loader.Plugin;

public class KnotLoaderSwap {
    public MioCustomClassLoader hotswap() {
        ClassLoader classLoader = Plugin.class.getClassLoader();
        Field field = classLoader.getClass().getDeclaredField("delegate");
        field.setAccessible(true);
        Object object = field.get(classLoader);
        Field field2 = classLoader.getClass().getDeclaredField("originalLoader");
        field2.setAccessible(true);
        ClassLoader classLoader2 = (ClassLoader)field2.get(classLoader);
        Field field3 = object.getClass().getDeclaredField("parentClassLoader");
        field3.setAccessible(true);
        ClassLoader classLoader3 = (ClassLoader)field3.get(object);
        MioCustomClassLoader mioCustomClassLoader = new MioCustomClassLoader(classLoader3, classLoader2);
        field2.set(classLoader, mioCustomClassLoader);
        field3.set(object, mioCustomClassLoader);
        return mioCustomClassLoader;
    }
}

