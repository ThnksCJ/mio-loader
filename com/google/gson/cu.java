/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.JsonReader;
import com.google.gson.JsonToken;
import com.google.gson.T;
import com.google.gson.Y;
import com.google.gson.cO;
import com.google.gson.cv;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.util.HashMap;
import java.util.Map;

final class cu
extends T {
    private final Map a = new HashMap();
    private final Map b = new HashMap();
    public static final int[][] c;
    private static /* synthetic */ int field74;
    private static /* synthetic */ int field75;

    /*
     * Enabled aggressive block sorting
     */
    public cu(Class clazz) {
        Field[] fieldArray = clazz.getDeclaredFields();
        int n = fieldArray.length;
        int n2 = 0;
        while (n2 < n) {
            Field field = fieldArray[n2];
            if (field.isEnumConstant()) {
                AccessController.doPrivileged(new cv(this, field));
                Enum enum_ = (Enum)field.get(null);
                String string = enum_.name();
                Y y = field.getAnnotation(Y.class);
                if (y != null) {
                    string = y.a();
                    for (String string2 : y.b()) {
                        this.a.put(string2, enum_);
                    }
                }
                this.a.put(string, enum_);
                this.b.put(enum_, string);
            }
            ++n2;
        }
        return;
    }

    public Enum a(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.i) {
            jsonReader.j();
            return null;
        }
        return (Enum)this.a.get(jsonReader.h());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(cO cO2, Enum enum_) {
        cO2.b(enum_ == null ? null : (String)this.b.get(enum_));
    }

    @Override
    public /* synthetic */ Object b(JsonReader jsonReader) {
        return this.a(jsonReader);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field74 = 0x10CC ^ 0xFFFF9757;
        field75 = 0xFFFF86C7 ^ 0xFFFF9757;
        c = new int[1][2];
    }
}

