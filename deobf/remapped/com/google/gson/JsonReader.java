/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package com.google.gson;

import com.google.gson.JsonToken;
import com.google.gson.az;
import com.google.gson.cL;
import com.google.gson.cP;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class JsonReader
implements Closeable {
    private static final long b;
    private static final int c;
    private static final int d;
    private static final int e;
    private static final int f;
    private static final int g;
    private static final int h;
    private static final int i;
    private static final int j;
    private static final int k;
    private static final int l;
    private static final int m;
    private static final int n;
    private static final int o;
    private static final int p;
    private static final int q;
    private static final int r;
    private static final int s;
    private static final int t;
    private static final int u;
    private static final int v;
    private static final int w;
    private static final int x;
    private static final int y;
    private static final int z;
    private static final int A;
    private static final int B;
    private final Reader C;
    private boolean D = false;
    private final char[] E = new char[1024];
    private int F = 0;
    private int G = 0;
    private int H = 0;
    private int I = 0;
    int a = 0;
    private long J;
    private int K;
    private String L;
    private int[] M = new int[32];
    private int N = 0;
    private String[] O;
    private int[] P;
    private static final String[] Q;
    private static final String[] R;
    private static final long[] U;
    private static final Integer[] V;
    private static final long[] Y;
    private static final Long[] Z;
    public static final int[][] S;
    private static /* synthetic */ int field174;
    private static /* synthetic */ int field175;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public JsonReader(Reader reader) {
        this.M[this.N++] = 6;
        this.O = new String[32];
        this.P = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.C = reader;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void a(boolean bl) {
        this.D = bl;
    }

    public final boolean isLenient() {
        return this.D;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void beginArray() {
        int n = this.a;
        if (n == 0) {
            n = this.s();
        }
        if (n != 3) throw new IllegalStateException("Expected BEGIN_ARRAY but was " + (Object)((Object)this.peek()) + this.t());
        this.a(1);
        this.P[this.N - 1] = 0;
        this.a = 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void endArray() {
        int n = this.a;
        if (n == 0) {
            n = this.s();
        }
        if (n != 4) throw new IllegalStateException("Expected END_ARRAY but was " + (Object)((Object)this.peek()) + this.t());
        --this.N;
        int n2 = this.N - 1;
        this.P[n2] = this.P[n2] + 1;
        this.a = 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void beginObject() {
        int n = this.a;
        if (n == 0) {
            n = this.s();
        }
        if (n != 1) throw new IllegalStateException("Expected BEGIN_OBJECT but was " + (Object)((Object)this.peek()) + this.t());
        this.a(3);
        this.a = 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void endObject() {
        int n = this.a;
        if (n == 0) {
            n = this.s();
        }
        if (n != 2) throw new IllegalStateException("Expected END_OBJECT but was " + (Object)((Object)this.peek()) + this.t());
        --this.N;
        this.O[this.N] = null;
        int n2 = this.N - 1;
        this.P[n2] = this.P[n2] + 1;
        this.a = 0;
    }

    public boolean hasNext() {
        int n = this.a;
        if (n == 0) {
            n = this.s();
        }
        return n != 2 && n != 4;
    }

    public JsonToken peek() {
        int n = this.a;
        if (n == 0) {
            n = this.s();
        }
        switch (n) {
            case 1: {
                return JsonToken.c;
            }
            case 2: {
                return JsonToken.d;
            }
            case 3: {
                return JsonToken.BEGIN_ARRAY;
            }
            case 4: {
                return JsonToken.b;
            }
            case 12: 
            case 13: 
            case 14: {
                return JsonToken.e;
            }
            case 5: 
            case 6: {
                return JsonToken.h;
            }
            case 7: {
                return JsonToken.i;
            }
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                return JsonToken.f;
            }
            case 15: 
            case 16: {
                return JsonToken.g;
            }
            case 17: {
                return JsonToken.END_DOCUMENT;
            }
        }
        throw new AssertionError();
    }

    int s() {
        int n;
        int n2;
        block45: {
            block47: {
                block46: {
                    block44: {
                        n2 = this.M[this.N - 1];
                        if (n2 != 1) break block44;
                        this.M[this.N - 1] = 2;
                        break block45;
                    }
                    if (n2 != 2) break block46;
                    n = this.b(true);
                    switch (n) {
                        case 93: {
                            this.a = 4;
                            return 4;
                        }
                        case 59: {
                            this.w();
                        }
                        case 44: {
                            break;
                        }
                        default: {
                            throw this.b("Unterminated array");
                        }
                    }
                    break block45;
                }
                if (n2 == 3 || n2 == 5) {
                    int n3;
                    this.M[this.N - 1] = 4;
                    if (n2 == 5) {
                        n3 = this.b(true);
                        switch (n3) {
                            case 125: {
                                this.a = 2;
                                return 2;
                            }
                            case 59: {
                                this.w();
                            }
                            case 44: {
                                break;
                            }
                            default: {
                                throw this.b("Unterminated object");
                            }
                        }
                    }
                    n3 = this.b(true);
                    switch (n3) {
                        case 34: {
                            this.a = 13;
                            return 13;
                        }
                        case 39: {
                            this.w();
                            this.a = 12;
                            return 12;
                        }
                        case 125: {
                            if (n2 != 5) {
                                this.a = 2;
                                return 2;
                            }
                            throw this.b("Expected name");
                        }
                    }
                    this.w();
                    --this.F;
                    if (this.a((char)n3)) {
                        this.a = 14;
                        return 14;
                    }
                    throw this.b("Expected name");
                }
                if (n2 != 4) break block47;
                this.M[this.N - 1] = 5;
                n = this.b(true);
                switch (n) {
                    case 58: {
                        break;
                    }
                    case 61: {
                        this.w();
                        if ((this.F < this.G || this.b(1)) && this.E[this.F] == '>') {
                            ++this.F;
                            break;
                        }
                        break block45;
                    }
                    default: {
                        throw this.b("Expected ':'");
                    }
                }
                break block45;
            }
            if (n2 == 6) {
                if (this.D) {
                    this.z();
                }
                this.M[this.N - 1] = 7;
            } else if (n2 == 7) {
                n = this.b(false);
                if (n == -1) {
                    this.a = 17;
                    return 17;
                }
                this.w();
                --this.F;
            } else if (n2 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        n = this.b(true);
        switch (n) {
            case 93: {
                if (n2 == 1) {
                    this.a = 4;
                    return 4;
                }
            }
            case 44: 
            case 59: {
                if (n2 == 1 || n2 == 2) {
                    this.w();
                    --this.F;
                    this.a = 7;
                    return 7;
                }
                throw this.b("Unexpected value");
            }
            case 39: {
                this.w();
                this.a = 8;
                return 8;
            }
            case 34: {
                this.a = 9;
                return 9;
            }
            case 91: {
                this.a = 3;
                return 3;
            }
            case 123: {
                this.a = 1;
                return 1;
            }
        }
        --this.F;
        int n4 = this.n();
        if (n4 != 0) {
            return n4;
        }
        n4 = this.p();
        if (n4 != 0) {
            return n4;
        }
        if (!this.a(this.E[this.F])) {
            throw this.b("Expected value");
        }
        this.w();
        this.a = 10;
        return 10;
    }

    private int n() {
        int n;
        String string;
        String string2;
        char c2 = this.E[this.F];
        if (c2 == 't' || c2 == 'T') {
            string2 = "true";
            string = "TRUE";
            n = 5;
        } else if (c2 == 'f' || c2 == 'F') {
            string2 = "false";
            string = "FALSE";
            n = JsonReader.a((int)7984, (long)5534093187982468819L);
        } else if (c2 == 'n' || c2 == 'N') {
            string2 = "null";
            string = "NULL";
            n = JsonReader.a((int)29831, (long)8908217596988542241L);
        } else {
            return 0;
        }
        int n2 = string2.length();
        for (int i = 1; i < n2; ++i) {
            if (this.F + i >= this.G && !this.b(i + 1)) {
                return 0;
            }
            c2 = this.E[this.F + i];
            if (c2 == string2.charAt(i) || c2 == string.charAt(i)) continue;
            return 0;
        }
        if ((this.F + n2 < this.G || this.b(n2 + 1)) && this.a(this.E[this.F + n2])) {
            return 0;
        }
        this.F += n2;
        this.a = n;
        return this.a;
    }

    private int p() {
        char[] cArray = this.E;
        int n = this.F;
        int n2 = this.G;
        long l = 0L;
        boolean bl = false;
        boolean bl2 = true;
        int n3 = 0;
        int n4 = 0;
        block6: while (true) {
            if (n + n4 == n2) {
                if (n4 == cArray.length) {
                    return 0;
                }
                if (!this.b(n4 + 1)) break;
                n = this.F;
                n2 = this.G;
            }
            char c2 = cArray[n + n4];
            switch (c2) {
                case '-': {
                    if (n3 == 0) {
                        bl = true;
                        n3 = 1;
                        break;
                    }
                    if (n3 == 5) {
                        n3 = 6;
                        break;
                    }
                    return 0;
                }
                case '+': {
                    if (n3 == 5) {
                        n3 = 6;
                        break;
                    }
                    return 0;
                }
                case 'E': 
                case 'e': {
                    if (n3 == 2 || n3 == 4) {
                        n3 = 5;
                        break;
                    }
                    return 0;
                }
                case '.': {
                    if (n3 == 2) {
                        n3 = 3;
                        break;
                    }
                    return 0;
                }
                default: {
                    if (c2 < '0' || c2 > '9') {
                        if (!this.a(c2)) break block6;
                        return 0;
                    }
                    if (n3 == 1 || n3 == 0) {
                        l = -(c2 - 48);
                        n3 = 2;
                        break;
                    }
                    if (n3 == 2) {
                        if (l == 0L) {
                            return 0;
                        }
                        long l2 = l * JsonReader.c(11501, 8871588967825355201L) - (long)(c2 - 48);
                        bl2 &= l > JsonReader.c(1132, 8199310099856791876L) || l == JsonReader.c(3203, 4742079195582697896L) && l2 < l;
                        l = l2;
                        break;
                    }
                    if (n3 == 3) {
                        n3 = 4;
                        break;
                    }
                    if (n3 != 5 && n3 != 6) break;
                    n3 = 7;
                }
            }
            ++n4;
        }
        if (!(n3 != 2 || !bl2 || l == JsonReader.c(7540, 1446814486938222686L) && !bl || l == 0L && bl)) {
            this.J = bl ? l : -l;
            this.F += n4;
            this.a = 15;
            return 15;
        }
        if (n3 == 2 || n3 == 4 || n3 == 7) {
            this.K = n4;
            this.a = 16;
            return 16;
        }
        return 0;
    }

    private boolean a(char c2) {
        switch (c2) {
            case '#': 
            case '/': 
            case ';': 
            case '=': 
            case '\\': {
                this.w();
            }
            case '\t': 
            case '\n': 
            case '\f': 
            case '\r': 
            case ' ': 
            case ',': 
            case ':': 
            case '[': 
            case ']': 
            case '{': 
            case '}': {
                return false;
            }
        }
        return true;
    }

    public String g() {
        String string;
        int n = this.a;
        if (n == 0) {
            n = this.s();
        }
        if (n == 14) {
            string = this.u();
        } else if (n == 12) {
            string = this.b('\'');
        } else if (n == 13) {
            string = this.b('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + (Object)((Object)this.peek()) + this.t());
        }
        this.a = 0;
        this.O[this.N - 1] = string;
        return string;
    }

    public String h() {
        String string;
        int n = this.a;
        if (n == 0) {
            n = this.s();
        }
        if (n == 10) {
            string = this.u();
        } else if (n == 8) {
            string = this.b('\'');
        } else if (n == 9) {
            string = this.b('\"');
        } else if (n == 11) {
            string = this.L;
            this.L = null;
        } else if (n == 15) {
            string = Long.toString(this.J);
        } else if (n == 16) {
            string = new String(this.E, this.F, this.K);
            this.F += this.K;
        } else {
            throw new IllegalStateException("Expected a string but was " + (Object)((Object)this.peek()) + this.t());
        }
        this.a = 0;
        int n2 = this.N - 1;
        this.P[n2] = this.P[n2] + 1;
        return string;
    }

    public boolean i() {
        int n = this.a;
        if (n == 0) {
            n = this.s();
        }
        if (n == 5) {
            this.a = 0;
            int n2 = this.N - 1;
            this.P[n2] = this.P[n2] + 1;
            return true;
        }
        if (n == 6) {
            this.a = 0;
            int n3 = this.N - 1;
            this.P[n3] = this.P[n3] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + (Object)((Object)this.peek()) + this.t());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void j() {
        int n = this.a;
        if (n == 0) {
            n = this.s();
        }
        if (n != 7) throw new IllegalStateException("Expected null but was " + (Object)((Object)this.peek()) + this.t());
        this.a = 0;
        int n2 = this.N - 1;
        this.P[n2] = this.P[n2] + 1;
    }

    public double k() {
        int n = this.a;
        if (n == 0) {
            n = this.s();
        }
        if (n == 15) {
            this.a = 0;
            int n2 = this.N - 1;
            this.P[n2] = this.P[n2] + 1;
            return this.J;
        }
        if (n == 16) {
            this.L = new String(this.E, this.F, this.K);
            this.F += this.K;
        } else if (n == 8 || n == 9) {
            this.L = this.b(n == 8 ? (char)'\'' : '\"');
        } else if (n == 10) {
            this.L = this.u();
        } else if (n != 11) {
            throw new IllegalStateException("Expected a double but was " + (Object)((Object)this.peek()) + this.t());
        }
        this.a = 11;
        double d2 = Double.parseDouble(this.L);
        if (!this.D && (Double.isNaN(d2) || Double.isInfinite(d2))) {
            throw new cP("JSON forbids NaN and infinities: " + d2 + this.t());
        }
        this.L = null;
        this.a = 0;
        int n3 = this.N - 1;
        this.P[n3] = this.P[n3] + 1;
        return d2;
    }

    public long l() {
        int n = this.a;
        if (n == 0) {
            n = this.s();
        }
        if (n == 15) {
            this.a = 0;
            int n2 = this.N - 1;
            this.P[n2] = this.P[n2] + 1;
            return this.J;
        }
        if (n == 16) {
            this.L = new String(this.E, this.F, this.K);
            this.F += this.K;
        } else {
            if (n == 8 || n == 9 || n == 10) {
                this.L = n == 10 ? this.u() : this.b(n == 8 ? (char)'\'' : '\"');
                long l = Long.parseLong(this.L);
                this.a = 0;
                int n3 = this.N - 1;
                this.P[n3] = this.P[n3] + 1;
                return l;
            }
            throw new IllegalStateException("Expected a long but was " + (Object)((Object)this.peek()) + this.t());
        }
        this.a = 11;
        double d2 = Double.parseDouble(this.L);
        long l = (long)d2;
        if ((double)l != d2) {
            throw new NumberFormatException("Expected a long but was " + this.L + this.t());
        }
        this.L = null;
        this.a = 0;
        int n4 = this.N - 1;
        this.P[n4] = this.P[n4] + 1;
        return l;
    }

    private String b(char c2) {
        char[] cArray = this.E;
        StringBuilder stringBuilder = null;
        do {
            int n;
            int n2 = this.F;
            int n3 = this.G;
            int n4 = n2;
            while (n2 < n3) {
                int n5;
                if ((n = cArray[n2++]) == c2) {
                    this.F = n2;
                    n5 = n2 - n4 - 1;
                    if (stringBuilder == null) {
                        return new String(cArray, n4, n5);
                    }
                    stringBuilder.append(cArray, n4, n5);
                    return stringBuilder.toString();
                }
                if (n == 92) {
                    this.F = n2;
                    n5 = n2 - n4 - 1;
                    if (stringBuilder == null) {
                        int n6 = (n5 + 1) * 2;
                        stringBuilder = new StringBuilder(Math.max(n6, 16));
                    }
                    stringBuilder.append(cArray, n4, n5);
                    stringBuilder.append(this.y());
                    n2 = this.F;
                    n3 = this.G;
                    n4 = n2;
                    continue;
                }
                if (n != 10) continue;
                ++this.H;
                this.I = n2;
            }
            if (stringBuilder == null) {
                n = (n2 - n4) * 2;
                stringBuilder = new StringBuilder(Math.max(n, 16));
            }
            stringBuilder.append(cArray, n4, n2 - n4);
            this.F = n2;
        } while (this.b(1));
        throw this.b("Unterminated string");
    }

    private String u() {
        StringBuilder stringBuilder = null;
        int n = 0;
        block4: while (true) {
            if (this.F + n < this.G) {
                switch (this.E[this.F + n]) {
                    case '#': 
                    case '/': 
                    case ';': 
                    case '=': 
                    case '\\': {
                        this.w();
                    }
                    case '\t': 
                    case '\n': 
                    case '\f': 
                    case '\r': 
                    case ' ': 
                    case ',': 
                    case ':': 
                    case '[': 
                    case ']': 
                    case '{': 
                    case '}': {
                        break block4;
                    }
                    default: {
                        ++n;
                        break;
                    }
                }
                continue;
            }
            if (n < this.E.length) {
                if (!this.b(n + 1)) break;
                continue;
            }
            if (stringBuilder == null) {
                stringBuilder = new StringBuilder(Math.max(n, 16));
            }
            stringBuilder.append(this.E, this.F, n);
            this.F += n;
            n = 0;
            if (!this.b(1)) break;
        }
        String string = null == stringBuilder ? new String(this.E, this.F, n) : stringBuilder.append(this.E, this.F, n).toString();
        this.F += n;
        return string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void c(char c2) {
        char[] cArray = this.E;
        do {
            int n = this.F;
            int n2 = this.G;
            while (n < n2) {
                char c3;
                if ((c3 = cArray[n++]) == c2) {
                    this.F = n;
                    return;
                }
                if (c3 == '\\') {
                    this.F = n;
                    this.y();
                    n = this.F;
                    n2 = this.G;
                    continue;
                }
                if (c3 != '\n') continue;
                ++this.H;
                this.I = n;
            }
            this.F = n;
        } while (this.b(1));
        throw this.b("Unterminated string");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void v() {
        do {
            int n = 0;
            while (this.F + n < this.G) {
                switch (this.E[this.F + n]) {
                    case '#': 
                    case '/': 
                    case ';': 
                    case '=': 
                    case '\\': {
                        this.w();
                    }
                    case '\t': 
                    case '\n': 
                    case '\f': 
                    case '\r': 
                    case ' ': 
                    case ',': 
                    case ':': 
                    case '[': 
                    case ']': 
                    case '{': 
                    case '}': {
                        this.F += n;
                        return;
                    }
                }
                ++n;
            }
            this.F += n;
        } while (this.b(1));
    }

    public int m() {
        int n = this.a;
        if (n == 0) {
            n = this.s();
        }
        if (n == 15) {
            int n2 = (int)this.J;
            if (this.J != (long)n2) {
                throw new NumberFormatException("Expected an int but was " + this.J + this.t());
            }
            this.a = 0;
            int n3 = this.N - 1;
            this.P[n3] = this.P[n3] + 1;
            return n2;
        }
        if (n == 16) {
            this.L = new String(this.E, this.F, this.K);
            this.F += this.K;
        } else {
            if (n == 8 || n == 9 || n == 10) {
                this.L = n == 10 ? this.u() : this.b(n == 8 ? (char)'\'' : '\"');
                int n4 = Integer.parseInt(this.L);
                this.a = 0;
                int n5 = this.N - 1;
                this.P[n5] = this.P[n5] + 1;
                return n4;
            }
            throw new IllegalStateException("Expected an int but was " + (Object)((Object)this.peek()) + this.t());
        }
        this.a = 11;
        double d2 = Double.parseDouble(this.L);
        int n6 = (int)d2;
        if ((double)n6 != d2) {
            throw new NumberFormatException("Expected an int but was " + this.L + this.t());
        }
        this.L = null;
        this.a = 0;
        int n7 = this.N - 1;
        this.P[n7] = this.P[n7] + 1;
        return n6;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void close() {
        this.a = 0;
        this.M[0] = 8;
        this.N = 1;
        this.C.close();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void o() {
        int n = 0;
        do {
            int n2;
            if ((n2 = this.a) == 0) {
                n2 = this.s();
            }
            if (n2 == 3) {
                this.a(1);
                ++n;
            } else if (n2 == 1) {
                this.a(3);
                ++n;
            } else if (n2 == 4) {
                --this.N;
                --n;
            } else if (n2 == 2) {
                --this.N;
                --n;
            } else if (n2 == 14 || n2 == 10) {
                this.v();
            } else if (n2 == 8 || n2 == 12) {
                this.c('\'');
            } else if (n2 == 9 || n2 == 13) {
                this.c('\"');
            } else if (n2 == 16) {
                this.F += this.K;
            }
            this.a = 0;
        } while (n != 0);
        int n3 = this.N - 1;
        this.P[n3] = this.P[n3] + 1;
        this.O[this.N - 1] = "null";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void a(int n) {
        if (this.N == this.M.length) {
            int n2 = this.N * 2;
            this.M = Arrays.copyOf(this.M, n2);
            this.P = Arrays.copyOf(this.P, n2);
            this.O = Arrays.copyOf(this.O, n2);
        }
        this.M[this.N++] = n;
    }

    private boolean b(int n) {
        block3: {
            char[] cArray = this.E;
            this.I -= this.F;
            if (this.G != this.F) {
                this.G -= this.F;
                System.arraycopy(cArray, this.F, cArray, 0, this.G);
            } else {
                this.G = 0;
            }
            this.F = 0;
            do {
                int n2 = this.C.read(cArray, this.G, cArray.length - this.G);
                if (n2 == -1) break block3;
                this.G += n2;
                if (this.H != 0 || this.I != 0 || this.G <= 0 || cArray[0] != '\ufeff') continue;
                ++this.F;
                ++this.I;
                ++n;
            } while (this.G < n);
            return true;
        }
        return false;
    }

    private int b(boolean bl) {
        block12: {
            char c2;
            char[] cArray = this.E;
            int n = this.F;
            int n2 = this.G;
            block4: while (true) {
                if (n == n2) {
                    this.F = n;
                    if (!this.b(1)) break block12;
                    n = this.F;
                    n2 = this.G;
                }
                if ((c2 = cArray[n++]) == '\n') {
                    ++this.H;
                    this.I = n;
                    continue;
                }
                if (c2 == ' ' || c2 == '\r' || c2 == '\t') continue;
                if (c2 == '/') {
                    char c3;
                    this.F = n;
                    if (n == n2) {
                        --this.F;
                        c3 = (char)(this.b(2) ? 1 : 0);
                        ++this.F;
                        if (c3 == '\u0000') {
                            return c2;
                        }
                    }
                    this.w();
                    c3 = cArray[this.F];
                    switch (c3) {
                        case '*': {
                            ++this.F;
                            if (!this.a("*/")) {
                                throw this.b("Unterminated comment");
                            }
                            n = this.F + 2;
                            n2 = this.G;
                            continue block4;
                        }
                        case '/': {
                            ++this.F;
                            this.x();
                            n = this.F;
                            n2 = this.G;
                            continue block4;
                        }
                    }
                    return c2;
                }
                if (c2 != '#') break;
                this.F = n;
                this.w();
                this.x();
                n = this.F;
                n2 = this.G;
            }
            this.F = n;
            return c2;
        }
        if (bl) {
            throw new EOFException("End of input" + this.t());
        }
        return -1;
    }

    private void w() {
        if (this.D) {
            return;
        }
        throw this.b("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void x() {
        char c2;
        do {
            if (this.F >= this.G && !this.b(1)) {
                return;
            }
            if ((c2 = this.E[this.F++]) != '\n') continue;
            ++this.H;
            this.I = this.F;
            return;
        } while (c2 != '\r');
    }

    private boolean a(String string) {
        int n = string.length();
        while (this.F + n <= this.G || this.b(n)) {
            block5: {
                if (this.E[this.F] == '\n') {
                    ++this.H;
                    this.I = this.F + 1;
                } else {
                    for (int i = 0; i < n; ++i) {
                        if (this.E[this.F + i] == string.charAt(i)) {
                            continue;
                        }
                        break block5;
                    }
                    return true;
                }
            }
            ++this.F;
        }
        return false;
    }

    public String toString() {
        return this.getClass().getSimpleName() + this.t();
    }

    String t() {
        int n = this.H + 1;
        int n2 = this.F - this.I + 1;
        return " at line " + n + " column " + n2 + " path " + this.q();
    }

    public String q() {
        StringBuilder stringBuilder = new StringBuilder().append('$');
        int n = this.N;
        block4: for (int i = 0; i < n; ++i) {
            switch (this.M[i]) {
                case 1: 
                case 2: {
                    stringBuilder.append('[').append(this.P[i]).append(']');
                    continue block4;
                }
                case 3: 
                case 4: 
                case 5: {
                    stringBuilder.append('.');
                    if (this.O[i] == null) continue block4;
                    stringBuilder.append(this.O[i]);
                    continue block4;
                }
            }
        }
        return stringBuilder.toString();
    }

    private char y() {
        if (this.F == this.G && !this.b(1)) {
            throw this.b("Unterminated escape sequence");
        }
        char c2 = this.E[this.F++];
        switch (c2) {
            case 'u': {
                int n;
                if (this.F + 4 > this.G && !this.b(4)) {
                    throw this.b("Unterminated escape sequence");
                }
                char c3 = '\u0000';
                int n2 = n + 4;
                for (n = this.F; n < n2; ++n) {
                    char c4 = this.E[n];
                    c3 = (char)(c3 << 4);
                    if (c4 >= '0' && c4 <= '9') {
                        c3 = (char)(c3 + (c4 - 48));
                        continue;
                    }
                    if (c4 >= 'a' && c4 <= JsonReader.a((int)95, (long)2173383065210468743L)) {
                        c3 = (char)(c3 + (c4 - 97 + 10));
                        continue;
                    }
                    if (c4 >= 'A' && c4 <= 'F') {
                        c3 = (char)(c3 + (c4 - 65 + 10));
                        continue;
                    }
                    throw new NumberFormatException("\\u" + new String(this.E, this.F, 4));
                }
                this.F += 4;
                return c3;
            }
            case 't': {
                return '\t';
            }
            case 'b': {
                return '\b';
            }
            case 'n': {
                return '\n';
            }
            case 'r': {
                return '\r';
            }
            case 'f': {
                return '\f';
            }
            case '\n': {
                ++this.H;
                this.I = this.F;
            }
            case '\"': 
            case '\'': 
            case '/': 
            case '\\': {
                return c2;
            }
        }
        throw this.b("Invalid escape sequence");
    }

    private IOException b(String string) {
        throw new cP(string + this.t());
    }

    /*
     * Enabled aggressive block sorting
     */
    private void z() {
        this.b(true);
        --this.F;
        int n = this.F;
        if (n + 5 > this.G && !this.b(5)) {
            return;
        }
        char[] cArray = this.E;
        if (cArray[n] != ')') return;
        if (cArray[n + 1] != ']') return;
        if (cArray[n + 2] != '}') return;
        if (cArray[n + 3] != '\'') return;
        if (cArray[n + 4] != '\n') {
            return;
        }
        this.F += 5;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block39: {
            block38: {
                block37: {
                    block36: {
                        block35: {
                            block34: {
                                block40: {
                                    break block40;
lbl1:
                                    // 1 sources

                                    return;
                                }
                                JsonReader.field174 = 19379 ^ -30534;
                                JsonReader.field175 = -3640 ^ -30534;
                                JsonReader.S = new int[3][3];
                                JsonReader.v = 1;
                                JsonReader.u = 0;
                                JsonReader.d = 1;
                                JsonReader.c = 0;
                                var21 = new String[43];
                                var19_1 = 0;
                                var18_2 = "\u00b1\u0018\u00ae\u00f4\u0092c\u00f69]\u00edP\u0003\u0014W\u0006\u0083V\u00faL\u00e8\u00ef_b\u00e7C\u00eb\u00c2\u00c8z|82>\b\u00c6\u00c8\u0096\u009f\u007f?\u0094\u00cc\u001cv\u0082V\u00a7\u008d\t\u0015t!&\u00ab7\u00ed\u00ab\u0080\u00f3Z\u00db\u00a80g\u009c\u00dcm\u00f3\u00b2\u00d4\u00f5\n\u008cQ\u00f0Q]\u00d0\u0091\u0080\u0097\u00a2\u000e\u001cl\u001bz$\u00b2 \u0003\u0087\u00fbP\u00f1rt\u0014\u00e6\u001bR@\u0098\u00ec\u0088\u00f8^\u00cd\u0006}i\u00ea\u00adU_\u00ea\u001f\u00a0\t\u00daQ\u000e\u00a2\rY\u00e0\u00c1\u00f5\u001d\u00f1\u00ed\u00a6J\u0093\u00b4\u00d6\u00c3Y\u00d7\u00af\u00ed\u0011\u0092\u00d6\u00fe9\u0001$!\u0003\u00ff[\u00a0u\u00c3\u00ab\\\u00d3\rZ\u00fb\u00d3\u0088=\u00ec\u0003\u00c8\u00e3\u009a\u00dc\u00c7\u00f38\u00c9\u0013\u00a6\u00ba\r@\u0003\u00b0\u00da\u00d5\u00c7M\u0090\u00fd>\u009aL\u00dfV$\u00af\u00efY\u00d2s\u008b\u00a0\u00e0P/\u00fd\u00e9\u009d6\u00a7\u00ee\u00d9\u00f6\u00b4\u00fbk\u00ef1\u00d2\u008f\u0094%\n\u0085\u00d3~\u0096\u0088\u00ff\u001dF\u001c\n\u0015\u00cf\u0081+\u00d4\u00fe\u00ff\u0090-\u00dfaRo\u00d6-\u00a3?\u0006\u00f9\u00b4\u00b5\u0090\u000f\u00cd\u000eS\u00c9\u0012\u0094\u00e7\u001c\u00dfQ\u001f\u00b1\u0086y\u0002\u00e2\u0084\u00f5\u00d7#\u00af<U\u0018\u00d7\u0087b\u0007\u000b\u001d\u00c5\u00f6;R\u00861\u00dbgU\u0005F\u0014\u00c89Z\u00a9\u00cb]\u0004\u0014\u0019\b\u009f\u0002\u00de\n\u0018\u009b\u00c3\u00eb\u008f:\f\u00e3\u00d4\u00ff\u0016P\u00f5\u0080:\u00eb\u00ae\u00e0a\u001c\u0097\u00c0|\u0098\u00e7\u0013\u0016\u00f5L\u009d[W\u00f0\u008fQ#\u00e7\u00a0U]')\u00aa\u0084\u00b2\u0004\u00d3\u00fb\u00b0-\u0004\u00a7\u00c8z\u00a1\u0002G<\u0006\u00ee\u00c2\u009d\u00b7\u00ccl\u0005\u00b5\u00e5ugp\u0018\u009e\u0094Ke.Qa\u007f\u00afc\u0014\u0015\u0087\u00a2\u0013\u00de\u00cco\u0099VpD\u008e\u00e0\u0005\u00eb\u00b5\u00bai\u008d\fF DbUN\u00c6\u00c1\u00f8\t,q\u0017\u00c0Y\u000b\f\u00ef\u00e5\u00b6\u001310i \u0012\u00e2\u00d7\u008c\u00be\u00181y]N\u0007!\u001f\u00b4\u00aa\u0004\u0089!\u00b47\u001c\u00b6,\u00bb\r\u00ea/\u00fe\u008d\u00dc\u00a1\u00f2y\u0014\u000f\u00a5\u00ce*\u00b4\\p~<\u00d9\u00e0\u001e\u00fa\u00c1\u00c7\u00cf\u00bf\u0004S\u00d5\u00e9\u0015\u00b9\u00b5\u00d3\u0099\u008e\u0091\";Qg],}\u00d1\u0010\u009b\u00cf\u00f8\u00d8\u0018\u0018\u00c4\t\u0000\u00d6G'L\u00b1\n\u00ba\u00ee`W\u0088\u0011\u00f8\u00bf\u00ab\u00f7\u00ce\u00bdW7\u0082\u0004\u00f7\u00a30\"\u001b,\u000f\u001d\u0016\u00e4?8\u00b2\u0084\u00fe\u001f,{\u00c6B\u0089\u0014\u0095\u0091\u00e2\u00ad\u00cd$1$\u0096\u00a9\u0018\u0015?:\u0010\u0000\u00ff\u00a4\u00aa\u0017\u00d9\u0003@kIC\u00c0\u0084\u00ac\u0090.QK\u00aa\u0001\u001b\u00b2\u00ef\u00ce\n\u009e\u00bcw\u00c2m\u00d4L\u00ef\u0082ru\u00c3+:R\u00c6\u00d5I+\u00a1\u00c5\u0084\u0095\u0013\u0089\u00aa\u00bfv%*? \u00a8\u00d6\u00d8\u001e\u00b2\u0096\u00cd\u00d7/M\u009c\u001ce\u00f4\"\u00bd\u0096SI\u000ff3\u0001\u00a2\u0089\u0017\u00ad\"\u00cc\u00de\u00eb\u00c5\t2'\u00ff;\u0010\u008d\n\u0013\u00ee\u0094S\u00b1\u00b8\u00d2\u008c?\u00de5\u0016bk\u0019\u00f6&Hsp\u001aP\u00b7\u0092\u0001\u0015\u00dd\u0006\u00eeCQ\u0089Y:xl\u00d2\u00c3~\u0089\u00de\u00a5\u00ebS=e\u0090\u0010\u0080w\u008f\u00d0\u0012H\u0091\u007f2tJJLSz\u0084\u0016@Q\u0090\u00ddUF\u000e\u009dB0\u00fc\u0093h}E\u0094\u00f7\u008c)\u0094\u00014\u0004@\u00f9\u00c2m";
                                var20_3 = "\u00b1\u0018\u00ae\u00f4\u0092c\u00f69]\u00edP\u0003\u0014W\u0006\u0083V\u00faL\u00e8\u00ef_b\u00e7C\u00eb\u00c2\u00c8z|82>\b\u00c6\u00c8\u0096\u009f\u007f?\u0094\u00cc\u001cv\u0082V\u00a7\u008d\t\u0015t!&\u00ab7\u00ed\u00ab\u0080\u00f3Z\u00db\u00a80g\u009c\u00dcm\u00f3\u00b2\u00d4\u00f5\n\u008cQ\u00f0Q]\u00d0\u0091\u0080\u0097\u00a2\u000e\u001cl\u001bz$\u00b2 \u0003\u0087\u00fbP\u00f1rt\u0014\u00e6\u001bR@\u0098\u00ec\u0088\u00f8^\u00cd\u0006}i\u00ea\u00adU_\u00ea\u001f\u00a0\t\u00daQ\u000e\u00a2\rY\u00e0\u00c1\u00f5\u001d\u00f1\u00ed\u00a6J\u0093\u00b4\u00d6\u00c3Y\u00d7\u00af\u00ed\u0011\u0092\u00d6\u00fe9\u0001$!\u0003\u00ff[\u00a0u\u00c3\u00ab\\\u00d3\rZ\u00fb\u00d3\u0088=\u00ec\u0003\u00c8\u00e3\u009a\u00dc\u00c7\u00f38\u00c9\u0013\u00a6\u00ba\r@\u0003\u00b0\u00da\u00d5\u00c7M\u0090\u00fd>\u009aL\u00dfV$\u00af\u00efY\u00d2s\u008b\u00a0\u00e0P/\u00fd\u00e9\u009d6\u00a7\u00ee\u00d9\u00f6\u00b4\u00fbk\u00ef1\u00d2\u008f\u0094%\n\u0085\u00d3~\u0096\u0088\u00ff\u001dF\u001c\n\u0015\u00cf\u0081+\u00d4\u00fe\u00ff\u0090-\u00dfaRo\u00d6-\u00a3?\u0006\u00f9\u00b4\u00b5\u0090\u000f\u00cd\u000eS\u00c9\u0012\u0094\u00e7\u001c\u00dfQ\u001f\u00b1\u0086y\u0002\u00e2\u0084\u00f5\u00d7#\u00af<U\u0018\u00d7\u0087b\u0007\u000b\u001d\u00c5\u00f6;R\u00861\u00dbgU\u0005F\u0014\u00c89Z\u00a9\u00cb]\u0004\u0014\u0019\b\u009f\u0002\u00de\n\u0018\u009b\u00c3\u00eb\u008f:\f\u00e3\u00d4\u00ff\u0016P\u00f5\u0080:\u00eb\u00ae\u00e0a\u001c\u0097\u00c0|\u0098\u00e7\u0013\u0016\u00f5L\u009d[W\u00f0\u008fQ#\u00e7\u00a0U]')\u00aa\u0084\u00b2\u0004\u00d3\u00fb\u00b0-\u0004\u00a7\u00c8z\u00a1\u0002G<\u0006\u00ee\u00c2\u009d\u00b7\u00ccl\u0005\u00b5\u00e5ugp\u0018\u009e\u0094Ke.Qa\u007f\u00afc\u0014\u0015\u0087\u00a2\u0013\u00de\u00cco\u0099VpD\u008e\u00e0\u0005\u00eb\u00b5\u00bai\u008d\fF DbUN\u00c6\u00c1\u00f8\t,q\u0017\u00c0Y\u000b\f\u00ef\u00e5\u00b6\u001310i \u0012\u00e2\u00d7\u008c\u00be\u00181y]N\u0007!\u001f\u00b4\u00aa\u0004\u0089!\u00b47\u001c\u00b6,\u00bb\r\u00ea/\u00fe\u008d\u00dc\u00a1\u00f2y\u0014\u000f\u00a5\u00ce*\u00b4\\p~<\u00d9\u00e0\u001e\u00fa\u00c1\u00c7\u00cf\u00bf\u0004S\u00d5\u00e9\u0015\u00b9\u00b5\u00d3\u0099\u008e\u0091\";Qg],}\u00d1\u0010\u009b\u00cf\u00f8\u00d8\u0018\u0018\u00c4\t\u0000\u00d6G'L\u00b1\n\u00ba\u00ee`W\u0088\u0011\u00f8\u00bf\u00ab\u00f7\u00ce\u00bdW7\u0082\u0004\u00f7\u00a30\"\u001b,\u000f\u001d\u0016\u00e4?8\u00b2\u0084\u00fe\u001f,{\u00c6B\u0089\u0014\u0095\u0091\u00e2\u00ad\u00cd$1$\u0096\u00a9\u0018\u0015?:\u0010\u0000\u00ff\u00a4\u00aa\u0017\u00d9\u0003@kIC\u00c0\u0084\u00ac\u0090.QK\u00aa\u0001\u001b\u00b2\u00ef\u00ce\n\u009e\u00bcw\u00c2m\u00d4L\u00ef\u0082ru\u00c3+:R\u00c6\u00d5I+\u00a1\u00c5\u0084\u0095\u0013\u0089\u00aa\u00bfv%*? \u00a8\u00d6\u00d8\u001e\u00b2\u0096\u00cd\u00d7/M\u009c\u001ce\u00f4\"\u00bd\u0096SI\u000ff3\u0001\u00a2\u0089\u0017\u00ad\"\u00cc\u00de\u00eb\u00c5\t2'\u00ff;\u0010\u008d\n\u0013\u00ee\u0094S\u00b1\u00b8\u00d2\u008c?\u00de5\u0016bk\u0019\u00f6&Hsp\u001aP\u00b7\u0092\u0001\u0015\u00dd\u0006\u00eeCQ\u0089Y:xl\u00d2\u00c3~\u0089\u00de\u00a5\u00ebS=e\u0090\u0010\u0080w\u008f\u00d0\u0012H\u0091\u007f2tJJLSz\u0084\u0016@Q\u0090\u00ddUF\u000e\u009dB0\u00fc\u0093h}E\u0094\u00f7\u008c)\u0094\u00014\u0004@\u00f9\u00c2m".length();
                                var17_4 = 12;
                                var16_5 = -1;
lbl19:
                                // 2 sources

                                while (true) {
                                    v0 = ++var16_5;
                                    v1 = var18_2.substring(v0, v0 + var17_4);
                                    v2 = -1;
                                    break block34;
                                    break;
                                }
lbl25:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v3.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    var18_2 = "\u00d0\u009d\u0082D\u0017uF\u00fbK\u00fc\u00c9\u000bQ\u001a\u00e6|Dx\u00cf\u00f2]\u000b(\u00ed\u00e4\u00d9\u008c\u009a\u00c9k\u001f\u000bPp\u009e>4\u0087\u0089\u00c7";
                                    var20_3 = "\u00d0\u009d\u0082D\u0017uF\u00fbK\u00fc\u00c9\u000bQ\u001a\u00e6|Dx\u00cf\u00f2]\u000b(\u00ed\u00e4\u00d9\u008c\u009a\u00c9k\u001f\u000bPp\u009e>4\u0087\u0089\u00c7".length();
                                    var17_4 = 13;
                                    var16_5 = -1;
lbl35:
                                    // 2 sources

                                    while (true) {
                                        v4 = ++var16_5;
                                        v1 = var18_2.substring(v4, v4 + var17_4);
                                        v2 = 0;
                                        break block34;
                                        break;
                                    }
                                    break;
                                }
lbl40:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v3.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    break block35;
                                    break;
                                }
                            }
                            v5 = v1.toCharArray();
                            var22_6 = 0;
                            v6 = v5.length;
                            v7 = v5;
                            v8 = v6;
                            if (v6 > 1) ** GOTO lbl90
                            do {
                                v9 = v7;
                                v10 = v7;
                                v11 = var22_6;
                                while (true) {
                                    v12 = v9[v11];
                                    switch (var22_6 % 7) {
                                        case 0: {
                                            v13 = 99;
                                            break;
                                        }
                                        case 1: {
                                            v13 = 110;
                                            break;
                                        }
                                        case 2: {
                                            v13 = 105;
                                            break;
                                        }
                                        case 3: {
                                            v13 = 40;
                                            break;
                                        }
                                        case 4: {
                                            v13 = 119;
                                            break;
                                        }
                                        case 5: {
                                            v13 = 69;
                                            break;
                                        }
                                        default: {
                                            v13 = 32;
                                        }
                                    }
                                    v9[v11] = (char)(v12 ^ v13);
                                    ++var22_6;
                                    v7 = v10;
                                    v8 = v8;
                                    if (v8 != 0) break;
                                    v10 = v7;
                                    v14 = v8;
                                    v11 = v8;
                                    v9 = v7;
                                }
lbl90:
                                // 2 sources

                                v15 = v7;
                                v14 = v8;
                            } while (v8 > var22_6);
                            v3 = new String(v15);
                            switch (v2) {
                                default: {
                                    ** continue;
                                }
                                ** case 0:
lbl99:
                                // 1 sources

                                ** continue;
                            }
                        }
                        JsonReader.Q = var21;
                        JsonReader.R = new String[43];
                        var8_7 = 4684770097078528186L;
                        var14_8 = new long[75];
                        var11_9 = 0;
                        var12_10 = "\u00ceE\u001a\u00b1\u00aa\u00e5\u001f\u00c3[\u00bdS\u00a3\u00a7\u00b3\u00ca\u00b7\\\u00dd\r\u00c9\u00ec\u00a2\u00ccJ\u000f\u0002\u007f\u00cf~*C\u00ea'\u0085>\u00a3mt\u00d4U\u00ab<`\u00b6g=\u0091\u00f9O\fR\u00bf\u00ed&No\u00d3\u00a4\u00db\u00b1\u00df\u00b2\u00c2$\u00b8\u00c4|\u0099\u00db\u009f\u00b2\u0083\u00d1\u00a8\u0017\u00e9\u00ca(Ff\u0082\u00c3\u008c\u00e6\u0090\u00e2\u00a0\u00a9:j\n6\u0011Z\u00c7e\u00a1\u00e4\u001a\\l\u009c\u00a3\u008a\u000f\u0003\u00a6t]OI\u0086\u00dd\u008c\u00c5\u0084\u00e3^Q\u0085b3\u00ca\u001a\u00cf\u00a7\u008e\u0004P+\u0005\u00c9\u00bc|\u00b6\u00d5\u009e\u00db1\f\u00b6\u00dfx\u001f\u00f6\u0011\u00ea\u00e1\u00ac\u0015X\u001bb\t\u00c6\u00ba(\u00cc8\u00b5F\u00ba\u0007\u00d9\u00c4\u00a58Ol\u0086\u00cd\nj\u009aB1g\u00c6xj\u00d4\u00c1u\u00da\u00b0?F\bg\u00ebf\u00cc\u00ab\u00a4\u00af\u00be|\u00a5\\\u0005s\u00ba-A!t\u00f4\u00f2\u0098\u00d9qZh\u0083\u001e\u0095G\u00d0\u00ee$\u00e1\u00d7@\u009b\u001e\u0090\u00ba\u00c2\u00a5\u00aceT4\u009av\u0080g,\u00a9\u00a3a,\u00d1d\u00f7J\u0003\u0001`\u00181[\u0082-2y\u00b0\u0018\u00f2=\u00d7\u00f9\u00fdQ\u00c7]\f2\u0017X\tvXk\u00a7\u00d5\u00e4\u00da\u00cei\u009c\u00c9\u00b4Qw\u00ee\u00d0\u001e\u00cf4\u009dAn\u00f2\u00f1\u0014X\u0095\u0088\u00eeR\u00a2\u00e5\\1\u0097\u00df\u0019\u00aa\u0099e=\u00aa\f\u0016#\u00d4r\u0006\u00eb\u00a6\u00f2\u00c3\u00fd\u00ef{<\u00f5\u0001{\u00b9`\u00e7\u009a$\u001b\u00eb}\u0018\u00f6\u0014\u0084\u00ba\u00b0\u0092q@\u00fa\u007f\u00b6.\u00dd\u00fd\u0010\u000bP\u0007\u00e2:\u00df\u00c6\u00cdTU\u0092\u00ba\u0010}\ta\u00cb8+\u00e1\u00a1\u00dd\u00fd\u009c\u001b\u0000\u0094\u00d2\u00b1\u00db\u00bd\u00e6D'00\u00bd\u00b9\u00d0L\u008c\u00fc@\u00ab\u00ebi?X8\u008c\u00ca\u0090e Nm4\u00eb\u001e0\u00beJ\u00b9<\u00d0|\u009d\u00e7\u00d1\u0089D\u0088\r\u0014b\f\u00e4J\u0089(x\u008b\u00fa\u00a8\u00c1\u001c&\u00f5\u0016>\u001ab\u000b\fD\u00a0\u00d0\u009dK\u00cc\u0080\u0001\u00ca\u00e5\u00e0\u00adp\u00e5T\u009aG?=\u001c\u0085\u009fd\n\u0096\u00e2\u0087\u00a69\u00ac\u0099\u008c\u000f\u001d\u00d6\u00beRWV\u00e6\u00c5\u008e\u00a5\u00cf\u00e8\u0004\u00d1[\u0090e\u00be O$\u0012Nm\u00d5\u00c2\u00e1V\u009fxm\u00a8~\u001a\t\u00e0E\u009c\u0018\u0081\u00ed2|\u00d5d\u00b0\u00c5+\u00b7\u008b*\u00f0\u00f4U\u00ea\u0083\fe\u0092\u00f8\u00de%\u009c\u009e\u00a3\u0007v^\u0097\u00e2\u0003\u0001j\u00fd`2\u00bb\u00a5CIB]Xif\u00ba\u00d2Dq\u00c19'\u00da\u0080t\u00c0\u009b\u001a;\u00f1\u0005\u00af\u00c6";
                        var13_11 = "\u00ceE\u001a\u00b1\u00aa\u00e5\u001f\u00c3[\u00bdS\u00a3\u00a7\u00b3\u00ca\u00b7\\\u00dd\r\u00c9\u00ec\u00a2\u00ccJ\u000f\u0002\u007f\u00cf~*C\u00ea'\u0085>\u00a3mt\u00d4U\u00ab<`\u00b6g=\u0091\u00f9O\fR\u00bf\u00ed&No\u00d3\u00a4\u00db\u00b1\u00df\u00b2\u00c2$\u00b8\u00c4|\u0099\u00db\u009f\u00b2\u0083\u00d1\u00a8\u0017\u00e9\u00ca(Ff\u0082\u00c3\u008c\u00e6\u0090\u00e2\u00a0\u00a9:j\n6\u0011Z\u00c7e\u00a1\u00e4\u001a\\l\u009c\u00a3\u008a\u000f\u0003\u00a6t]OI\u0086\u00dd\u008c\u00c5\u0084\u00e3^Q\u0085b3\u00ca\u001a\u00cf\u00a7\u008e\u0004P+\u0005\u00c9\u00bc|\u00b6\u00d5\u009e\u00db1\f\u00b6\u00dfx\u001f\u00f6\u0011\u00ea\u00e1\u00ac\u0015X\u001bb\t\u00c6\u00ba(\u00cc8\u00b5F\u00ba\u0007\u00d9\u00c4\u00a58Ol\u0086\u00cd\nj\u009aB1g\u00c6xj\u00d4\u00c1u\u00da\u00b0?F\bg\u00ebf\u00cc\u00ab\u00a4\u00af\u00be|\u00a5\\\u0005s\u00ba-A!t\u00f4\u00f2\u0098\u00d9qZh\u0083\u001e\u0095G\u00d0\u00ee$\u00e1\u00d7@\u009b\u001e\u0090\u00ba\u00c2\u00a5\u00aceT4\u009av\u0080g,\u00a9\u00a3a,\u00d1d\u00f7J\u0003\u0001`\u00181[\u0082-2y\u00b0\u0018\u00f2=\u00d7\u00f9\u00fdQ\u00c7]\f2\u0017X\tvXk\u00a7\u00d5\u00e4\u00da\u00cei\u009c\u00c9\u00b4Qw\u00ee\u00d0\u001e\u00cf4\u009dAn\u00f2\u00f1\u0014X\u0095\u0088\u00eeR\u00a2\u00e5\\1\u0097\u00df\u0019\u00aa\u0099e=\u00aa\f\u0016#\u00d4r\u0006\u00eb\u00a6\u00f2\u00c3\u00fd\u00ef{<\u00f5\u0001{\u00b9`\u00e7\u009a$\u001b\u00eb}\u0018\u00f6\u0014\u0084\u00ba\u00b0\u0092q@\u00fa\u007f\u00b6.\u00dd\u00fd\u0010\u000bP\u0007\u00e2:\u00df\u00c6\u00cdTU\u0092\u00ba\u0010}\ta\u00cb8+\u00e1\u00a1\u00dd\u00fd\u009c\u001b\u0000\u0094\u00d2\u00b1\u00db\u00bd\u00e6D'00\u00bd\u00b9\u00d0L\u008c\u00fc@\u00ab\u00ebi?X8\u008c\u00ca\u0090e Nm4\u00eb\u001e0\u00beJ\u00b9<\u00d0|\u009d\u00e7\u00d1\u0089D\u0088\r\u0014b\f\u00e4J\u0089(x\u008b\u00fa\u00a8\u00c1\u001c&\u00f5\u0016>\u001ab\u000b\fD\u00a0\u00d0\u009dK\u00cc\u0080\u0001\u00ca\u00e5\u00e0\u00adp\u00e5T\u009aG?=\u001c\u0085\u009fd\n\u0096\u00e2\u0087\u00a69\u00ac\u0099\u008c\u000f\u001d\u00d6\u00beRWV\u00e6\u00c5\u008e\u00a5\u00cf\u00e8\u0004\u00d1[\u0090e\u00be O$\u0012Nm\u00d5\u00c2\u00e1V\u009fxm\u00a8~\u001a\t\u00e0E\u009c\u0018\u0081\u00ed2|\u00d5d\u00b0\u00c5+\u00b7\u008b*\u00f0\u00f4U\u00ea\u0083\fe\u0092\u00f8\u00de%\u009c\u009e\u00a3\u0007v^\u0097\u00e2\u0003\u0001j\u00fd`2\u00bb\u00a5CIB]Xif\u00ba\u00d2Dq\u00c19'\u00da\u0080t\u00c0\u009b\u001a;\u00f1\u0005\u00af\u00c6".length();
                        var10_12 = 0;
                        while (true) {
                            var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                            v16 = var14_8;
                            v17 = var11_9++;
                            v18 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                            v19 = -1;
                            break block36;
                            break;
                        }
lbl117:
                        // 1 sources

                        while (true) {
                            v16[v17] = v20;
                            if (var10_12 < var13_11) ** continue;
                            var12_10 = "/\u0094\u00bb\u00ee\u00c1-\u0005\u009d\"\u008d\u00e2si\u001bw#";
                            var13_11 = "/\u0094\u00bb\u00ee\u00c1-\u0005\u009d\"\u008d\u00e2si\u001bw#".length();
                            var10_12 = 0;
                            while (true) {
                                var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                                v16 = var14_8;
                                v17 = var11_9++;
                                v18 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                                v19 = 0;
                                break block36;
                                break;
                            }
                            break;
                        }
lbl130:
                        // 1 sources

                        while (true) {
                            v16[v17] = v20;
                            if (var10_12 < var13_11) ** continue;
                            break block37;
                            break;
                        }
                    }
                    v20 = v18 ^ var8_7;
                    switch (v19) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl141:
                        // 1 sources

                        ** continue;
                    }
                }
                JsonReader.U = var14_8;
                JsonReader.V = new Integer[75];
                JsonReader.o = 12;
                JsonReader.g = 4;
                JsonReader.h = 5;
                JsonReader.n = 11;
                JsonReader.B = 7;
                JsonReader.y = 4;
                JsonReader.l = 9;
                JsonReader.k = 8;
                JsonReader.z = 5;
                JsonReader.w = 2;
                JsonReader.i = 6;
                JsonReader.q = 14;
                JsonReader.A = 6;
                JsonReader.t = 17;
                JsonReader.p = 13;
                JsonReader.s = 16;
                JsonReader.r = 15;
                JsonReader.j = 7;
                JsonReader.e = 2;
                JsonReader.f = 3;
                JsonReader.m = 10;
                JsonReader.x = 3;
                var0_14 = 5760204358238045638L;
                var6_15 = new long[5];
                var3_16 = 0;
                var4_17 = "\u00cd\n\u00a5sl`/\u00b6\u00c2\u00c7\u00b5{v\u00a7\u00ba$\u00db\u00e4EDs\u00b8\u0005\u0098";
                var5_18 = "\u00cd\n\u00a5sl`/\u00b6\u00c2\u00c7\u00b5{v\u00a7\u00ba$\u00db\u00e4EDs\u00b8\u0005\u0098".length();
                var2_19 = 0;
                while (true) {
                    var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes("ISO-8859-1");
                    v21 = var6_15;
                    v22 = var3_16++;
                    v23 = ((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L;
                    v24 = -1;
                    break block38;
                    break;
                }
lbl181:
                // 1 sources

                while (true) {
                    v21[v22] = v25;
                    if (var2_19 < var5_18) ** continue;
                    var4_17 = "\u00fd\fW\u008c &\u00a7Z4\u00eelq\u00d2\u00ee\u00b4\r";
                    var5_18 = "\u00fd\fW\u008c &\u00a7Z4\u00eelq\u00d2\u00ee\u00b4\r".length();
                    var2_19 = 0;
                    while (true) {
                        var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes("ISO-8859-1");
                        v21 = var6_15;
                        v22 = var3_16++;
                        v23 = ((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L;
                        v24 = 0;
                        break block38;
                        break;
                    }
                    break;
                }
lbl194:
                // 1 sources

                while (true) {
                    v21[v22] = v25;
                    if (var2_19 < var5_18) ** continue;
                    break block39;
                    break;
                }
            }
            v25 = v23 ^ var0_14;
            switch (v24) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl205:
                // 1 sources

                ** continue;
            }
        }
        JsonReader.Y = var6_15;
        JsonReader.Z = new Long[5];
        JsonReader.b = JsonReader.c(4607, 9080625809675979990L);
        az.a = new cL();
        ** while (true)
    }

    private static long c(int n, long l) {
        int n2 = (n ^ (int)l ^ 0x1D28) & Short.MAX_VALUE;
        if (Z[n2] == null) {
            JsonReader.Z[n2] = Y[n2] ^ l;
        }
        return Z[n2];
    }
}

