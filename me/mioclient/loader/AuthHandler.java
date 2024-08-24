/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 * 
 * Could not load the following classes:
 *  net.fabricmc.loader.impl.FabricLoaderImpl
 */
package me.mioclient.loader;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.zip.CRC32;
import me.mioclient.loader.CompatibilityCheck;
import me.mioclient.loader.InvalidSizeException;
import me.mioclient.loader.MioLoaderJar;
import me.mioclient.loader.cW;
import me.mioclient.loader.cX;
import net.fabricmc.loader.impl.FabricLoaderImpl;

public class AuthHandler {
    private static final String a = "https://mioclient.me/";

    public static boolean a() {
        File file = MioLoaderJar.getCurrentPath();
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] byArray = fileInputStream.readAllBytes();
        fileInputStream.close();
        CRC32 cRC32 = new CRC32();
        cRC32.update(byArray);
        String string = Long.toHexString(cRC32.getValue()).toUpperCase();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(new URI("https://mioclient.me/api/check?w=" + string + "&v=" + FabricLoaderImpl.INSTANCE.getGameProvider().getRawGameVersion())).GET().header("User-Agent", "MioClient/2.0").build();
        HttpResponse<String> httpResponse = HttpClient.newHttpClient().send(httpRequest, HttpResponse.BodyHandlers.ofString());
        int n = httpResponse.statusCode();
        if (n != 200 && n != 205 && n != 409 && n != 503) {
            throw new RuntimeException("Invalid request response code (%d)".formatted(n));
        }
        if (n == 205) {
            throw new cX();
        }
        if (n == 503) {
            throw new cW();
        }
        if (n == 200) {
            String string2;
            String string3;
            JsonObject jsonObject;
            JsonObject jsonObject2 = (JsonObject)new Gson().a(httpResponse.body(), JsonObject.class);
            if (!jsonObject2.b("mods")) {
                throw new NullPointerException("No mods field");
            }
            JsonObject jsonObject3 = jsonObject2.f("mods");
            if (!jsonObject3.b("required")) {
                throw new NullPointerException("No required field");
            }
            if (!jsonObject3.b("incompatible")) {
                throw new NullPointerException("No incompatible field");
            }
            JsonArray jsonArray = jsonObject3.e("required");
            JsonArray jsonArray2 = jsonObject3.e("incompatible");
            for (JsonElement jsonElement : jsonArray) {
                if (!jsonElement.r()) {
                    throw new RuntimeException("Required field is not an object");
                }
                jsonObject = jsonElement.u();
                if (!jsonObject.b("internal")) {
                    throw new RuntimeException("Required object doesn't have a required property: internal");
                }
                if (!jsonObject.b("name")) {
                    throw new RuntimeException("Required object doesn't have a required property: name");
                }
                string3 = jsonObject.c("internal").e();
                string2 = jsonObject.c("name").e();
                if (FabricLoaderImpl.INSTANCE.isModLoaded(string3)) continue;
                throw new InvalidSizeException("Mod '%s' is required for Mio to work.".formatted(string2));
            }
            for (JsonElement jsonElement : jsonArray2) {
                if (!jsonElement.r()) {
                    throw new RuntimeException("Incompatible field is not an object");
                }
                jsonObject = jsonElement.u();
                if (!jsonObject.b("internal")) {
                    throw new RuntimeException("Incompatible object doesn't have a required property: internal");
                }
                if (!jsonObject.b("name")) {
                    throw new RuntimeException("Incompatible object doesn't have a required property: name");
                }
                string3 = jsonObject.c("internal").e();
                string2 = jsonObject.c("name").e();
                if (!FabricLoaderImpl.INSTANCE.isModLoaded(string3)) continue;
                CompatibilityCheck.a(string2);
            }
        }
        return n == 200;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void b() {
        File file = MioLoaderJar.getCurrentPath();
        URL uRL = new URL("https://mioclient.me/files/mioloader.jar");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(uRL.openStream());
        byte[] byArray = new byte[AuthHandler.a((int)8799, (long)935734992844946955L)];
        int n = 0;
        while (true) {
            n = bufferedInputStream.read(byArray, 0, 8192);
            if (n == -1) break;
            fileOutputStream.write(byArray, 0, n);
        }
        fileOutputStream.close();
        bufferedInputStream.close();
    }

    public static int c() {
        String string = System.getProperty("java.version");
        if (string.startsWith("1.8")) {
            string = string.substring(2, 3);
        } else {
            int n = string.indexOf(".");
            if (n != -1) {
                string = string.substring(0, n);
            }
        }
        return Integer.parseInt(string);
    }
}

