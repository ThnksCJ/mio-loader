/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package me.mioclient.loader;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.fabricmc.loader.impl.FabricLoaderImpl;

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

public class AuthHandler {
    public static boolean check() throws Throwable {
        final File file = Jar.getCurrentPath();
        final FileInputStream stream = new FileInputStream(file);
        final byte[] data = stream.readAllBytes();
        stream.close();
        final CRC32 crc = new CRC32();
        crc.update(data);
        final String string = Long.toHexString(crc.getValue()).toUpperCase();
        final HttpRequest request = HttpRequest.newBuilder().uri(new URI("https://mioclient.me/api/check?w=" + string + "&v=" + FabricLoaderImpl.INSTANCE.getGameProvider().getRawGameVersion())).GET().header("User-Agent", "MioClient/2.0").build();
        final HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        int n = response.statusCode();
        if (n != 200) throw new RuntimeException("Invalid request response code (%d)".formatted(n));
        final JsonObject json = new Gson().fromJson(response.body(), JsonObject.class);
        if (!json.has("mods")) throw new NullPointerException("No mods field");
        final JsonObject mods = json.getAsJsonObject("mods");
        if (!mods.has("required")) throw new NullPointerException("No required field");
        if (!mods.has("incompatible")) throw new NullPointerException("No incompatible field");
        final JsonArray required = mods.getAsJsonArray("required");
        final JsonArray incompatible = mods.getAsJsonArray("incompatible");

        for (final JsonElement element : required) {
            if (!element.isJsonObject()) throw new RuntimeException("Required field is not an object");
            final JsonObject obj = element.getAsJsonObject();
            if (!obj.has("internal")) throw new RuntimeException("Required object doesn't have a required property: internal");
            if (!obj.has("name")) throw new RuntimeException("Required object doesn't have a required property: name");
            final String internal = obj.get("internal").getAsString();
            final String name = obj.get("name").getAsString();
            if (FabricLoaderImpl.INSTANCE.isModLoaded(internal)) continue;
            throw new InvalidResponseException("Mod '%s' is required for Mio to work.".formatted(name));
        }

        for (final JsonElement element : incompatible) {
            if (!element.isJsonObject()) throw new RuntimeException("Incompatible field is not an object");
            final JsonObject obj = element.getAsJsonObject();
            if (!obj.has("internal")) throw new RuntimeException("Incompatible object doesn't have a required property: internal");
            if (!obj.has("name")) throw new RuntimeException("Incompatible object doesn't have a required property: name");
            final String internal = obj.get("internal").getAsString();
            final String name = obj.get("name").getAsString();
            if (!FabricLoaderImpl.INSTANCE.isModLoaded(internal)) continue;
            Compatability.verify(name);
        }

        return true;
    }

    public static void update() throws Throwable {
        final  File file = Jar.getCurrentPath();
        final URL url = new URL("https://mioclient.me/files/mioloader.jar");
        final FileOutputStream ostream = new FileOutputStream(file);
        final BufferedInputStream istream = new BufferedInputStream(url.openStream());
        byte[] buf = new byte[1483769];
        int n;
        while (true) {
            n = istream.read(buf, 0, 8192);
            if (n == -1) break;
            ostream.write(buf, 0, n);
        }
        ostream.close();
        istream.close();
    }

    public static int getJdkVersion() {
        String string = System.getProperty("java.version");
        if (string.startsWith("1.8")) string = string.substring(2, 3);
        else {
            int n = string.indexOf(".");
            if (n != -1) string = string.substring(0, n);
        }
        return Integer.parseInt(string);
    }
}

