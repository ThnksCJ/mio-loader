/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package me.mioclient.loader;

public class ClassUtil {
    private static long hash(byte[] data, int n) {
        return (long)data[n] & 0xFFL | ((long)data[n + 1] & 0xFFL) << 8 | ((long)data[n + 2] & 0xFFL) << 16 | ((long)data[n + 3] & 0xFFL) << 24 | ((long)data[n + 4] & 0xFFL) << 32 | ((long)data[n + 5] & 0xFFL) << 40 | ((long)data[n + 6] & 0xFFL) << 48 | ((long)data[n + 7] & 0xFFL) << 56;
    }

    public static long hash(final byte[] data, int n, int n2) {
        int n3;
        long l = (long)n2 & 0xFFFFFFFFL ^ (long)n * -4132994306676758123L;
        int n4 = n >> 3;
        for (n3 = 0; n3 < n4; ++n3) {
            int n5 = n3 << 3;
            long l2 = ClassUtil.hash(data, n5);
            l2 *= -4132994306676758123L;
            l2 ^= l2 >>> 47;
            l ^= l2 * -4132994306676758123L;
            l *= -4132994306676758123L;
        }
        n3 = n4 << 3;
        switch (n - n3) {
            case 7: {
                l ^= ((long)data[n3 + 6] & 0xFFL) << 48;
            }
            case 6: {
                l ^= ((long)data[n3 + 5] & 0xFFL) << 40;
            }
            case 5: {
                l ^= ((long)data[n3 + 4] & 0xFFL) << 32;
            }
            case 4: {
                l ^= ((long)data[n3 + 3] & 0xFFL) << 24;
            }
            case 3: {
                l ^= ((long)data[n3 + 2] & 0xFFL) << 16;
            }
            case 2: {
                l ^= ((long)data[n3 + 1] & 0xFFL) << 8;
            }
            case 1: {
                l ^= (long)data[n3] & 0xFFL;
                l *= -4132994306676758123L;
            }
        }
        l ^= l >>> 47;
        l *= -4132994306676758123L;
        l ^= l >>> 47;
        return l;
    }

    public static long hash(byte[] data) {
        return ClassUtil.hash(data, data.length, -512093083);
    }
}

