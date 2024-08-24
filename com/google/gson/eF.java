/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.et;
import java.util.Enumeration;
import java.util.Properties;

public class eF {
    public static final int[][] a;
    private static /* synthetic */ int field306;
    private static /* synthetic */ int field307;

    public static et a(Properties properties) {
        et et2 = new et();
        if (properties != null && !properties.isEmpty()) {
            Enumeration<?> enumeration = properties.propertyNames();
            while (enumeration.hasMoreElements()) {
                String string = (String)enumeration.nextElement();
                et2.c(string, properties.getProperty(string));
            }
        }
        return et2;
    }

    public static Properties a(et et2) {
        Properties properties = new Properties();
        if (et2 != null) {
            for (String string : et2.c()) {
                Object object = et2.p(string);
                if (et.b.equals(object)) continue;
                properties.put(string, object.toString());
            }
        }
        return properties;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field306 = 0x5927 ^ 0xFFFFBCBA;
        field307 = 0xFFFFA82B ^ 0xFFFFBCBA;
        a = new int[2][1];
    }
}

