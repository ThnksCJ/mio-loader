/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package meteordevelopment.discordipc;

import com.google.gson.JsonObject;
import meteordevelopment.discordipc.RichPresence$Assets;
import meteordevelopment.discordipc.RichPresence$Timestamps;

public class RichPresence {
    private String a;
    private String b;
    private RichPresence$Assets Assets;
    private RichPresence$Timestamps d;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(String string) {
        this.a = string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void b(String string) {
        this.b = string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(String string, String string2) {
        if (this.Assets == null) {
            this.Assets = new RichPresence$Assets();
        }
        this.Assets.a = string;
        this.Assets.b = string2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void b(String string, String string2) {
        if (this.Assets == null) {
            this.Assets = new RichPresence$Assets();
        }
        this.Assets.c = string;
        this.Assets.d = string2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(long l) {
        if (this.d == null) {
            this.d = new RichPresence$Timestamps();
        }
        this.d.a = l;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void b(long l) {
        if (this.d == null) {
            this.d = new RichPresence$Timestamps();
        }
        this.d.b = l;
    }

    public JsonObject a() {
        JsonObject jsonObject;
        JsonObject jsonObject2 = new JsonObject();
        if (this.a != null) {
            jsonObject2.a("details", this.a);
        }
        if (this.b != null) {
            jsonObject2.a("state", this.b);
        }
        if (this.Assets != null) {
            jsonObject = new JsonObject();
            if (this.Assets.a != null) {
                jsonObject.a("large_image", this.Assets.a);
            }
            if (this.Assets.b != null) {
                jsonObject.a("large_text", this.Assets.b);
            }
            if (this.Assets.c != null) {
                jsonObject.a("small_image", this.Assets.c);
            }
            if (this.Assets.d != null) {
                jsonObject.a("small_text", this.Assets.d);
            }
            jsonObject2.a("assets", jsonObject);
        }
        if (this.d != null) {
            jsonObject = new JsonObject();
            if (this.d.a != null) {
                jsonObject.a("start", this.d.a);
            }
            if (this.d.b != null) {
                jsonObject.a("end", this.d.b);
            }
            jsonObject2.a("timestamps", jsonObject);
        }
        return jsonObject2;
    }
}

