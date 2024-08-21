/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.honestlyidfk;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import me.mioclient.loader.honestlyidfk.dv;
import me.mioclient.loader.honestlyidfk.eb;

public class Math {
    private static final Random c;
    public static final SimpleDateFormat a;
    public static final SimpleDateFormat b;
    private static /* synthetic */ int field292;
    private static /* synthetic */ int field293;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void a(dv dv2) {
        dv2.a("PI", java.lang.Math.PI);
        dv2.a("time", () -> eb.a(a.format(new Date())));
        dv2.a("date", () -> eb.a(b.format(new Date())));
        dv2.a("round", Math::a);
        dv2.a("roundToString", Math::b);
        dv2.a("floor", Math::c);
        dv2.a("ceil", Math::d);
        dv2.a("abs", Math::e);
        dv2.a("random", Math::f);
        dv2.a("string", Math::l);
        dv2.a("toUpper", Math::g);
        dv2.a("toLower", Math::h);
        dv2.a("contains", Math::contains);
        dv2.a("replace", Math::replace);
        dv2.a("pad", Math::k);
    }

    public static eb a(dv dv2, int n) {
        if (n == 1) {
            double d2 = dv2.b("Argument to round() needs to be a number.");
            return eb.a(java.lang.Math.round(d2));
        }
        if (n == 2) {
            double d3 = dv2.b("Second argument to round() needs to be a number.");
            double d4 = dv2.b("First argument to round() needs to be a number.");
            double d5 = java.lang.Math.pow(10.0, (int)d3);
            return eb.a((double)java.lang.Math.round(d4 * d5) / d5);
        }
        dv2.a("round() requires 1 or 2 arguments, got %d.", new Object[]{n});
        return null;
    }

    public static eb b(dv dv2, int n) {
        if (n == 1) {
            double d2 = dv2.b("Argument to round() needs to be a number.");
            return eb.a(Double.toString(java.lang.Math.round(d2)));
        }
        if (n == 2) {
            double d3 = dv2.b("Second argument to round() needs to be a number.");
            double d4 = dv2.b("First argument to round() needs to be a number.");
            double d5 = java.lang.Math.pow(10.0, (int)d3);
            return eb.a(Double.toString((double)java.lang.Math.round(d4 * d5) / d5));
        }
        dv2.a("round() requires 1 or 2 arguments, got %d.", new Object[]{n});
        return null;
    }

    public static eb c(dv dv2, int n) {
        if (n != 1) {
            dv2.a("floor() requires 1 argument, got %d.", new Object[]{n});
        }
        double d2 = dv2.b("Argument to floor() needs to be a number.");
        return eb.a(java.lang.Math.floor(d2));
    }

    public static eb d(dv dv2, int n) {
        if (n != 1) {
            dv2.a("ceil() requires 1 argument, got %d.", new Object[]{n});
        }
        double d2 = dv2.b("Argument to ceil() needs to be a number.");
        return eb.a(java.lang.Math.ceil(d2));
    }

    public static eb e(dv dv2, int n) {
        if (n != 1) {
            dv2.a("abs() requires 1 argument, got %d.", new Object[]{n});
        }
        double d2 = dv2.b("Argument to abs() needs to be a number.");
        return eb.a(java.lang.Math.abs(d2));
    }

    public static eb f(dv dv2, int n) {
        if (n == 0) {
            return eb.a(c.nextDouble());
        }
        if (n == 2) {
            double d2 = dv2.b("Second argument to random() needs to be a number.");
            double d3 = dv2.b("First argument to random() needs to be a number.");
            return eb.a(d3 + (d2 - d3) * c.nextDouble());
        }
        dv2.a("random() requires 0 or 2 arguments, got %d.", new Object[]{n});
        return eb.a();
    }

    private static eb l(dv dv2, int n) {
        block0: {
            if (n == 1) break block0;
            dv2.a("string() requires 1 argument, got %d.", new Object[]{n});
        }
        return eb.a(dv2.a().toString());
    }

    public static eb g(dv dv2, int n) {
        if (n != 1) {
            dv2.a("toUpper() requires 1 argument, got %d.", new Object[]{n});
        }
        String string = dv2.c("Argument to toUpper() needs to be a string.");
        return eb.a(string.toUpperCase());
    }

    public static eb h(dv dv2, int n) {
        if (n != 1) {
            dv2.a("toLower() requires 1 argument, got %d.", new Object[]{n});
        }
        String string = dv2.c("Argument to toLower() needs to be a string.");
        return eb.a(string.toLowerCase());
    }

    public static eb contains(dv dv2, int n) {
        if (n != 2) {
            dv2.a("replace() requires 2 arguments, got %d.", new Object[]{n});
        }
        String string = dv2.c("Second argument to contains() needs to be a string.");
        String string2 = dv2.c("First argument to contains() needs to be a string.");
        return eb.a(string2.contains(string));
    }

    public static eb replace(dv dv2, int n) {
        if (n != 3) {
            dv2.a("replace() requires 3 arguments, got %d.", new Object[]{n});
        }
        String string = dv2.c("Third argument to replace() needs to be a string.");
        String string2 = dv2.c("Second argument to replace() needs to be a string.");
        String string3 = dv2.c("First argument to replace() needs to be a string.");
        return eb.a(string3.replace(string2, string));
    }

    public static eb k(dv dv2, int n) {
        if (n != 2) {
            dv2.a("pad() requires 2 arguments, got %d.", new Object[]{n});
        }
        int n2 = (int)dv2.b("Second argument to pad() needs to be a number.");
        String string = dv2.a().toString();
        if (string.length() >= java.lang.Math.abs(n2)) {
            return eb.a(string);
        }
        char[] cArray = new char[java.lang.Math.max(string.length(), java.lang.Math.abs(n2))];
        if (n2 >= 0) {
            int n3;
            int n4 = n2 - string.length();
            for (n3 = 0; n3 < n4; ++n3) {
                cArray[n3] = 32;
            }
            for (n3 = 0; n3 < string.length(); ++n3) {
                cArray[n4 + n3] = string.charAt(n3);
            }
        } else {
            int n5;
            for (n5 = 0; n5 < string.length(); ++n5) {
                cArray[n5] = string.charAt(n5);
            }
            for (n5 = 0; n5 < java.lang.Math.abs(n2) - string.length(); ++n5) {
                cArray[string.length() + n5] = 32;
            }
        }
        return eb.a(new String(cArray));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field292 = 0x53E3 ^ 0xFFFFE9B0;
        field293 = 0xFFFFD29E ^ 0xFFFFE9B0;
        c = new Random();
        a = new SimpleDateFormat("HH:mm");
        b = new SimpleDateFormat("dd. MM. yyyy");
    }
}

