/*
 * Decompiled with CFR 0.152.
 */
package me.mioclient.loader.gson;

import java.io.Reader;
import java.util.HashMap;
import me.mioclient.loader.gson.eD;
import me.mioclient.loader.gson.eG;

public class eK
extends eD {
    public static final HashMap a;
    private static final String[] k;
    private static final String[] l;
    private static final long[] o;
    private static final Integer[] p;
    public static final int[][] b;
    private static /* synthetic */ int field304;
    private static /* synthetic */ int field305;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public eK(Reader reader) {
        super(reader);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public eK(String string) {
        super(string);
    }

    public String a() {
        StringBuilder stringBuilder = new StringBuilder();
        while (this.d()) {
            char c = this.e();
            stringBuilder.append(c);
            int n = stringBuilder.length() - 3;
            if (n < 0 || stringBuilder.charAt(n) != ']' || stringBuilder.charAt(n + 1) != ']' || stringBuilder.charAt(n + 2) != '>') continue;
            stringBuilder.setLength(n);
            return stringBuilder.toString();
        }
        throw this.b("Unclosed CDATA");
    }

    public Object i() {
        char c;
        while (Character.isWhitespace(c = this.e())) {
        }
        if (c == '\u0000') {
            return null;
        }
        if (c == '<') {
            return eG.f;
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (c != '\u0000') {
            if (c == '<') {
                this.b();
                return stringBuilder.toString().trim();
            }
            if (c == '&') {
                stringBuilder.append(this.f(c));
            } else {
                stringBuilder.append(c);
            }
            c = this.e();
        }
        return stringBuilder.toString().trim();
    }

    public Object f(char c) {
        char c2;
        StringBuilder stringBuilder = new StringBuilder();
        while (Character.isLetterOrDigit(c2 = this.e()) || c2 == '#') {
            stringBuilder.append(Character.toLowerCase(c2));
        }
        if (c2 != ';') {
            throw this.b("Missing ';' in XML entity: &" + stringBuilder);
        }
        String string = stringBuilder.toString();
        return eK.c(string);
    }

    static String c(String string) {
        if (string == null || string.isEmpty()) {
            return "";
        }
        if (string.charAt(0) == '#') {
            int n = string.charAt(1) == 'x' || string.charAt(1) == 'X' ? Integer.parseInt(string.substring(2), 16) : Integer.parseInt(string.substring(1));
            return new String(new int[]{n}, 0, 1);
        }
        Character c = (Character)a.get(string);
        if (c == null) {
            return '&' + string + ';';
        }
        return c.toString();
    }

    public Object j() {
        char c;
        while (Character.isWhitespace(c = this.e())) {
        }
        switch (c) {
            case '\u0000': {
                throw this.b("Misshaped meta tag");
            }
            case '<': {
                return eG.f;
            }
            case '>': {
                return eG.e;
            }
            case '/': {
                return eG.i;
            }
            case '=': {
                return eG.d;
            }
            case '!': {
                return eG.c;
            }
            case '?': {
                return eG.g;
            }
            case '\"': 
            case '\'': {
                char c2 = c;
                do {
                    if ((c = this.e()) != '\u0000') continue;
                    throw this.b("Unterminated string");
                } while (c != c2);
                return Boolean.TRUE;
            }
        }
        while (!Character.isWhitespace(c = this.e())) {
            switch (c) {
                case '\u0000': {
                    throw this.b("Unterminated string");
                }
                case '!': 
                case '\"': 
                case '\'': 
                case '/': 
                case '<': 
                case '=': 
                case '>': 
                case '?': {
                    this.b();
                    return Boolean.TRUE;
                }
            }
        }
        return Boolean.TRUE;
    }

    public Object k() {
        char c;
        while (Character.isWhitespace(c = this.e())) {
        }
        switch (c) {
            case '\u0000': {
                throw this.b("Misshaped element");
            }
            case '<': {
                throw this.b("Misplaced '<'");
            }
            case '>': {
                return eG.e;
            }
            case '/': {
                return eG.i;
            }
            case '=': {
                return eG.d;
            }
            case '!': {
                return eG.c;
            }
            case '?': {
                return eG.g;
            }
            case '\"': 
            case '\'': {
                char c2 = c;
                StringBuilder stringBuilder = new StringBuilder();
                while (true) {
                    if ((c = this.e()) == '\u0000') {
                        throw this.b("Unterminated string");
                    }
                    if (c == c2) {
                        return stringBuilder.toString();
                    }
                    if (c == '&') {
                        stringBuilder.append(this.f(c));
                        continue;
                    }
                    stringBuilder.append(c);
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (true) {
            stringBuilder.append(c);
            c = this.e();
            if (Character.isWhitespace(c)) {
                return stringBuilder.toString();
            }
            switch (c) {
                case '\u0000': {
                    return stringBuilder.toString();
                }
                case '!': 
                case '/': 
                case '=': 
                case '>': 
                case '?': 
                case '[': 
                case ']': {
                    this.b();
                    return stringBuilder.toString();
                }
                case '\"': 
                case '\'': 
                case '<': {
                    throw this.b("Bad character in a name");
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void d(String string) {
        char c;
        int n;
        int n2 = 0;
        int n3 = string.length();
        char[] cArray = new char[n3];
        for (n = 0; n < n3; ++n) {
            c = this.e();
            if (c == '\u0000') {
                return;
            }
            cArray[n] = c;
        }
        while (true) {
            int n4 = n2;
            boolean bl2 = true;
            for (n = 0; n < n3; ++n) {
                if (cArray[n4] != string.charAt(n)) {
                    bl2 = false;
                    break;
                }
                if (++n4 < n3) continue;
                n4 -= n3;
            }
            if (bl2) {
                return;
            }
            c = this.e();
            if (c == '\u0000') {
                return;
            }
            cArray[n2] = c;
            if (++n2 < n3) continue;
            n2 -= n3;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block30: {
            block29: {
                block28: {
                    block27: {
                        block31: {
                            break block31;
lbl1:
                            // 1 sources

                            return;
                        }
                        eK.field304 = 11960 ^ -10198;
                        eK.field305 = -30539 ^ -10198;
                        eK.b = new int[2][1];
                        var13 = new String[13];
                        var11_1 = 0;
                        var10_2 = "6A\u00ce\u008bj-'l\u001c\u00d9\u00ce\u009e\u00c8w.\\\u00d5\u00bc\u00a2\u0012\u00f2\u00daJ\t\u0007\u00a5\u00ca\u00fb\u009e\u00153\u00d8*\u008c\u00f8u\u00d9V\u00037qX\r\u001aLW\u00d8\u00a0\u00fc\u00a9\u00d0\u0083p\u00da-G\u0004o\u00d3^\u00b0\u000eA!7\u008e\u00bd\u00bboi\u00d9\u0005>\u00f1\u00a7)\u0011c/x\u00b7Ar\u0002\u0001\u0087J\u0018:W\u00f4!\u00ed\u001a\u001c\b$\u0015\u00d6\u00edQ\u00a1\u00ceEE)\u00efw\u0088\u00ed7W\u009c\u0015\u00cb\u00d7\u00a3\u00edy\u00e5\u00d42\u00fe\u0004i\u00e6\u008c\u00b4\u0002&\t\u0002\u00c3\u00cc";
                        var12_3 = "6A\u00ce\u008bj-'l\u001c\u00d9\u00ce\u009e\u00c8w.\\\u00d5\u00bc\u00a2\u0012\u00f2\u00daJ\t\u0007\u00a5\u00ca\u00fb\u009e\u00153\u00d8*\u008c\u00f8u\u00d9V\u00037qX\r\u001aLW\u00d8\u00a0\u00fc\u00a9\u00d0\u0083p\u00da-G\u0004o\u00d3^\u00b0\u000eA!7\u008e\u00bd\u00bboi\u00d9\u0005>\u00f1\u00a7)\u0011c/x\u00b7Ar\u0002\u0001\u0087J\u0018:W\u00f4!\u00ed\u001a\u001c\b$\u0015\u00d6\u00edQ\u00a1\u00ceEE)\u00efw\u0088\u00ed7W\u009c\u0015\u00cb\u00d7\u00a3\u00edy\u00e5\u00d42\u00fe\u0004i\u00e6\u008c\u00b4\u0002&\t\u0002\u00c3\u00cc".length();
                        var9_4 = 19;
                        var8_5 = -1;
lbl15:
                        // 2 sources

                        while (true) {
                            v0 = ++var8_5;
                            v1 = var10_2.substring(v0, v0 + var9_4);
                            v2 = -1;
                            break block27;
                            break;
                        }
lbl21:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v3.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "\u00f5\u0005S\u00a8\u00da\u00a1\nD\u00b0TJ\u00db9\u00ad\u0015\"E\u00e3\u0097\u00a7\u0088]\u00e4\u0013\u00c8\u00b7\u0011U\u0091\u00f6X\u0017\u00f3\u00b63sw\u00ca\u00d9\u00eb+J}";
                            var12_3 = "\u00f5\u0005S\u00a8\u00da\u00a1\nD\u00b0TJ\u00db9\u00ad\u0015\"E\u00e3\u0097\u00a7\u0088]\u00e4\u0013\u00c8\u00b7\u0011U\u0091\u00f6X\u0017\u00f3\u00b63sw\u00ca\u00d9\u00eb+J}".length();
                            var9_4 = 23;
                            var8_5 = -1;
lbl31:
                            // 2 sources

                            while (true) {
                                v4 = ++var8_5;
                                v1 = var10_2.substring(v4, v4 + var9_4);
                                v2 = 0;
                                break block27;
                                break;
                            }
                            break;
                        }
lbl36:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v3.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            break block28;
                            break;
                        }
                    }
                    v5 = v1.toCharArray();
                    var14_6 = 0;
                    v6 = v5.length;
                    v7 = v5;
                    v8 = v6;
                    if (v6 > 1) ** GOTO lbl86
                    do {
                        v9 = v7;
                        v10 = v7;
                        v11 = var14_6;
                        while (true) {
                            v12 = v9[v11];
                            switch (var14_6 % 7) {
                                case 0: {
                                    v13 = 68;
                                    break;
                                }
                                case 1: {
                                    v13 = 83;
                                    break;
                                }
                                case 2: {
                                    v13 = 11;
                                    break;
                                }
                                case 3: {
                                    v13 = 15;
                                    break;
                                }
                                case 4: {
                                    v13 = 90;
                                    break;
                                }
                                case 5: {
                                    v13 = 25;
                                    break;
                                }
                                default: {
                                    v13 = 116;
                                }
                            }
                            v9[v11] = (char)(v12 ^ v13);
                            ++var14_6;
                            v7 = v10;
                            v8 = v8;
                            if (v8 != 0) break;
                            v10 = v7;
                            v14 = v8;
                            v11 = v8;
                            v9 = v7;
                        }
lbl86:
                        // 2 sources

                        v15 = v7;
                        v14 = v8;
                    } while (v8 > var14_6);
                    v3 = new String(v15);
                    switch (v2) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl95:
                        // 1 sources

                        ** continue;
                    }
                }
                eK.k = var13;
                eK.l = new String[13];
                var0_7 = 8272841351324842753L;
                var6_8 = new long[15];
                var3_9 = 0;
                var4_10 = "\u00d4 |X\t\u0097zm\u00de2\u00deM\u00a3\u00db\u0083\u00d4\u00de\u00a1\u00f7\u008c\u00a3W\u00892\u00b9\u00ed\u00ca\u008c-\u0080%*\u00aeu\u00d7H!\u0004#u@\t\u00f5\u00ca\u00bc;\u0017E\u00bc/e\u0003\u00ea\u000f\u00ce(F\u0016\u00e6\u00c5v\u00da\\.\u0003\b\u00d8\u0087\u00d3\u00a2\u008d\u00dd(Ld\u00d1ke\u009dj\u000e\u0010\u008f\u00d8\u0006\u009f\u0099\r\u00f8\u009f\u00f9\u00b4#\u0084\f?|\f\u009a\u0007\u0012\u007f\u0081\u0014";
                var5_11 = "\u00d4 |X\t\u0097zm\u00de2\u00deM\u00a3\u00db\u0083\u00d4\u00de\u00a1\u00f7\u008c\u00a3W\u00892\u00b9\u00ed\u00ca\u008c-\u0080%*\u00aeu\u00d7H!\u0004#u@\t\u00f5\u00ca\u00bc;\u0017E\u00bc/e\u0003\u00ea\u000f\u00ce(F\u0016\u00e6\u00c5v\u00da\\.\u0003\b\u00d8\u0087\u00d3\u00a2\u008d\u00dd(Ld\u00d1ke\u009dj\u000e\u0010\u008f\u00d8\u0006\u009f\u0099\r\u00f8\u009f\u00f9\u00b4#\u0084\f?|\f\u009a\u0007\u0012\u007f\u0081\u0014".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v16 = var6_8;
                    v17 = var3_9++;
                    v18 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v19 = -1;
                    break block29;
                    break;
                }
lbl113:
                // 1 sources

                while (true) {
                    v16[v17] = v20;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u00a7n\u00dbpb\u00f5\u0015\u0006\u0003\u00ce\u00a2\u009e\u009aw\u000b\u00b7";
                    var5_11 = "\u00a7n\u00dbpb\u00f5\u0015\u0006\u0003\u00ce\u00a2\u009e\u009aw\u000b\u00b7".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v16 = var6_8;
                        v17 = var3_9++;
                        v18 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v19 = 0;
                        break block29;
                        break;
                    }
                    break;
                }
lbl126:
                // 1 sources

                while (true) {
                    v16[v17] = v20;
                    if (var2_12 < var5_11) ** continue;
                    break block30;
                    break;
                }
            }
            v20 = v18 ^ var0_7;
            switch (v19) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl137:
                // 1 sources

                ** continue;
            }
        }
        eK.o = var6_8;
        eK.p = new Integer[15];
        eK.a = new HashMap<K, V>(8);
        eK.a.put("amp", eG.a);
        eK.a.put("apos", eG.b);
        eK.a.put("gt", eG.e);
        eK.a.put("lt", eG.f);
        eK.a.put("quot", eG.h);
        ** while (true)
    }
}

