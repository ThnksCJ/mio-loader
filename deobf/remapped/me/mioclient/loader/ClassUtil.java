/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package deobf.remapped.me.mioclient.loader;

public class ClassUtil {
    private static int a(byte[] byArray, int n) {
        return byArray[n] & 0xFF | (byArray[n + 1] & 0xFF) << 8 | (byArray[n + 2] & 0xFF) << 16 | (byArray[n + 3] & 0xFF) << 24;
    }

    private static long b(byte[] byArray, int n) {
        return (long)byArray[n] & 0xFFL | ((long)byArray[n + 1] & 0xFFL) << 8 | ((long)byArray[n + 2] & 0xFFL) << 16 | ((long)byArray[n + 3] & 0xFFL) << 24 | ((long)byArray[n + 4] & 0xFFL) << 32 | ((long)byArray[n + 5] & 0xFFL) << 40 | ((long)byArray[n + 6] & 0xFFL) << 48 | ((long)byArray[n + 7] & 0xFFL) << 56;
    }

    public static long a(byte[] byArray, int n, int n2) {
        int n3;
        long l = (long)n2 & 0xFFFFFFFFL ^ (long)n * -4132994306676758123L;
        int n4 = n >> 3;
        for (n3 = 0; n3 < n4; ++n3) {
            int n5 = n3 << 3;
            long l2 = ClassUtil.b(byArray, n5);
            l2 *= -4132994306676758123L;
            l2 ^= l2 >>> 47;
            l ^= (l2 *= -4132994306676758123L);
            l *= -4132994306676758123L;
        }
        n3 = n4 << 3;
        switch (n - n3) {
            case 7: {
                l ^= ((long)byArray[n3 + 6] & 0xFFL) << 48;
            }
            case 6: {
                l ^= ((long)byArray[n3 + 5] & 0xFFL) << 40;
            }
            case 5: {
                l ^= ((long)byArray[n3 + 4] & 0xFFL) << 32;
            }
            case 4: {
                l ^= ((long)byArray[n3 + 3] & 0xFFL) << 24;
            }
            case 3: {
                l ^= ((long)byArray[n3 + 2] & 0xFFL) << 16;
            }
            case 2: {
                l ^= ((long)byArray[n3 + 1] & 0xFFL) << 8;
            }
            case 1: {
                l ^= (long)byArray[n3] & 0xFFL;
                l *= -4132994306676758123L;
            }
        }
        l ^= l >>> 47;
        l *= -4132994306676758123L;
        l ^= l >>> 47;
        return l;
    }

    public static long a(byte[] byArray) {
        return ClassUtil.a(byArray, byArray.length, -512093083);
    }
}

