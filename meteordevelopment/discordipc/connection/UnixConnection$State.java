/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package meteordevelopment.discordipc.connection;

final class UnixConnection$State
extends Enum {
    public static final /* enum */ UnixConnection$State a;
    public static final /* enum */ UnixConnection$State b;
    public static final /* enum */ UnixConnection$State c;
    private static final /* synthetic */ UnixConnection$State[] d;
    public static final int[][] e;
    private static /* synthetic */ int field70;
    private static /* synthetic */ int field71;

    public static UnixConnection$State[] a() {
        return (UnixConnection$State[])d.clone();
    }

    public static UnixConnection$State a(String string) {
        return Enum.valueOf(UnixConnection$State.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private UnixConnection$State() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ UnixConnection$State[] b() {
        return new UnixConnection$State[]{a, b, c};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block15: {
                break block15;
lbl1:
                // 1 sources

                return;
            }
            UnixConnection$State.field70 = 2573 ^ -24344;
            UnixConnection$State.field71 = -17271 ^ -24344;
            UnixConnection$State.e = new int[4][4];
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "+,Wvv\u0011\u0004 =@x\u0006(9Z~f\u001c";
            var5_3 = "+,Wvv\u0011\u0004 =@x\u0006(9Z~f\u001c".length();
            var2_4 = 6;
            var1_5 = -1;
lbl15:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl17:
            // 1 sources

            while (true) {
                var0[var4_1++] = new String(v0).intern();
                if ((var1_5 += var2_4) < var5_3) {
                    var2_4 = var3_2.charAt(var1_5);
                    ** continue;
                }
                break block14;
                break;
            }
            v1 = ++var1_5;
            v2 = var3_2.substring(v1, v1 + var2_4).toCharArray();
            var6_6 = 0;
            v3 = v2.length;
            v4 = v2;
            v5 = v3;
            if (v3 > 1) ** GOTO lbl68
            do {
                v6 = v4;
                v7 = v4;
                v8 = var6_6;
                while (true) {
                    v9 = v6[v8];
                    switch (var6_6 % 7) {
                        case 0: {
                            v10 = 100;
                            break;
                        }
                        case 1: {
                            v10 = 92;
                            break;
                        }
                        case 2: {
                            v10 = 52;
                            break;
                        }
                        case 3: {
                            v10 = 25;
                            break;
                        }
                        case 4: {
                            v10 = 18;
                            break;
                        }
                        case 5: {
                            v10 = 116;
                            break;
                        }
                        default: {
                            v10 = 16;
                        }
                    }
                    v6[v8] = (char)(v9 ^ v10);
                    ++var6_6;
                    v4 = v7;
                    v5 = v5;
                    if (v5 != 0) break;
                    v7 = v4;
                    v11 = v5;
                    v8 = v5;
                    v6 = v4;
                }
lbl68:
                // 2 sources

                v0 = v4;
                v11 = v5;
            } while (v5 > var6_6);
            ** while (true)
        }
        UnixConnection$State.a = new UnixConnection$State(var0[0], 0);
        UnixConnection$State.b = new UnixConnection$State(var0[2], 1);
        UnixConnection$State.c = new UnixConnection$State(var0[1], 2);
        UnixConnection$State.d = UnixConnection$State.b();
        ** while (true)
    }
}

