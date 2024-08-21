/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import me.mioclient.loader.gson.aT;
import me.mioclient.loader.gson.ah_0;
import me.mioclient.loader.gson.ai_0;
import me.mioclient.loader.gson.aj_0;
import me.mioclient.loader.gson.ak_0;
import me.mioclient.loader.gson.al_0;
import me.mioclient.loader.gson.am_0;
import me.mioclient.loader.gson.an_0;
import me.mioclient.loader.gson.ao_0;
import me.mioclient.loader.gson.ap_0;
import me.mioclient.loader.gson.aq_0;
import me.mioclient.loader.gson.ar_0;
import me.mioclient.loader.gson.as_0;
import me.mioclient.loader.gson.at_0;
import me.mioclient.loader.gson.au_0;
import me.mioclient.loader.gson.cJ;
import me.mioclient.loader.gson.cy;
import me.mioclient.loader.gson.u_0;

/*
 * Renamed from me.mioclient.loader.gson.ag
 */
public final class ag_0 {
    private final Map a;
    private final cy b = cy.a();
    public static final int[][] c;
    private static /* synthetic */ int field186;
    private static /* synthetic */ int field187;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public ag_0(Map map) {
        this.a = map;
    }

    public aT a(cJ cJ2) {
        Type type = cJ2.b();
        Class clazz = cJ2.a();
        u_0 u_02 = (u_0)this.a.get(type);
        if (u_02 != null) {
            return new ah_0(this, u_02, type);
        }
        u_0 u_03 = (u_0)this.a.get(clazz);
        if (u_03 != null) {
            return new an_0(this, u_03, type);
        }
        aT aT2 = this.a(clazz);
        if (aT2 != null) {
            return aT2;
        }
        aT aT3 = this.a(type, clazz);
        if (aT3 != null) {
            return aT3;
        }
        return this.b(type, clazz);
    }

    private aT a(Class clazz) {
        Constructor constructor = clazz.getDeclaredConstructor(new Class[0]);
        if (!constructor.isAccessible()) {
            this.b.a(constructor);
        }
        return new ao_0(this, constructor);
    }

    private aT a(Type type, Class clazz) {
        if (Collection.class.isAssignableFrom(clazz)) {
            if (SortedSet.class.isAssignableFrom(clazz)) {
                return new ap_0(this);
            }
            if (EnumSet.class.isAssignableFrom(clazz)) {
                return new aq_0(this, type);
            }
            if (Set.class.isAssignableFrom(clazz)) {
                return new ar_0(this);
            }
            if (Queue.class.isAssignableFrom(clazz)) {
                return new as_0(this);
            }
            return new at_0(this);
        }
        if (Map.class.isAssignableFrom(clazz)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(clazz)) {
                return new au_0(this);
            }
            if (ConcurrentMap.class.isAssignableFrom(clazz)) {
                return new ai_0(this);
            }
            if (SortedMap.class.isAssignableFrom(clazz)) {
                return new aj_0(this);
            }
            if (type instanceof ParameterizedType && !String.class.isAssignableFrom(cJ.b(((ParameterizedType)type).getActualTypeArguments()[0]).a())) {
                return new ak_0(this);
            }
            return new al_0(this);
        }
        return null;
    }

    private aT b(Type type, Class clazz) {
        return new am_0(this, clazz, type);
    }

    public String toString() {
        return this.a.toString();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field186 = 0x6F0A ^ 0xFFFFAF54;
        field187 = 0xFFFFACA6 ^ 0xFFFFAF54;
        c = new int[1][2];
    }
}

