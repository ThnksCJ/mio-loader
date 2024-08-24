/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package meteordevelopment.discordipc;

import com.google.gson.JsonObject;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import meteordevelopment.discordipc.Opcode;

public record Packet(Opcode a, JsonObject b) {
    public static final int[][] c;
    private static /* synthetic */ int field274;
    private static /* synthetic */ int field275;

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{Packet.class, "opcode;data", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{Packet.class, "opcode;data", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{Packet.class, "opcode;data", "a", "b"}, this, object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        field274 = 0x6BED ^ 0xFFFFBF3D;
        field275 = 0xFFFF9CD0 ^ 0xFFFFBF3D;
        c = new int[3][3];
    }
}

