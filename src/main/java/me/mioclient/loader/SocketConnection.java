/*
 * Decompiled by jadyen.dev. With love from nick and thnkscj
 */
package me.mioclient.loader;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.fabricmc.loader.impl.FabricLoaderImpl;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.zip.CRC32;

public class SocketConnection {
    public static void start() throws Throwable {
        final Socket socket = new Socket("auth.mioclient.me", 25598);
        final String checksum = SocketConnection.checksum();
        final String nchecksum = SocketConnection.nativeChecksum();
        socket.setSoTimeout(7000);
        SocketConnection.verify_packet(socket);
        DataInputStream istream = new DataInputStream(socket.getInputStream());
        DataOutputStream ostream = new DataOutputStream(socket.getOutputStream());
        ostream.writeUTF(FabricLoaderImpl.INSTANCE.getGameProvider().getRawGameVersion());
        ostream.writeUTF(checksum);
        ostream.writeUTF(nchecksum);
        ostream.flush();
        int response = istream.readInt();
        if (response != -4004 && response != -257 && response != -9 && response != -500 && response != 5000022) throw new InvalidResponseException("Invalid server response (%d). Please try again or contact support: https://mioclient.me/support".formatted(response));

        if (response == -9) {
            Globals.printMessage("Updating the loader, please wait...");
            int size = istream.readInt();
            if (size < 100 || size > 0x3200000) throw new InvalidResponseException("Invalid loader jar size (%d). Please try again or contact support: https://mioclient.me/support".formatted(size));
            final byte[] data = new byte[size];
            istream.readFully(data);
            FileOutputStream fostream = new FileOutputStream(Jar.getCurrentPath());
            fostream.write(data);
            fostream.close();
            throw new RuntimeException();
        }

        if (response == -500 || response == 5000022) {
            byte[] data;
            int n4;
            if (response == -500) {
                n4 = istream.readInt();
                if (n4 < 100 || n4 > 0x3200000) throw new InvalidResponseException("Invalid packet/2 size (%d). Please try again or contact support: https://mioclient.me/support".formatted(n4));
                data = new byte[n4];
                istream.readFully(data);
                final FileOutputStream fostream = new FileOutputStream("mio-fabric" + File.separator + "turbonative.dll");
                fostream.write(data);
                fostream.close();
            }
            if ((n4 = istream.readInt()) <= 0 || n4 > 100000) throw new InvalidResponseException("Invalid validation response size (%d). Please try again or contact support: https://mioclient.me/support".formatted(n4));
            data = new byte[n4];
            istream.readFully(data);
            final JsonObject json = new Gson().fromJson(new String(data, StandardCharsets.UTF_8), JsonObject.class);
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
        }

        socket.close();
    }

    private static String nativeChecksum() throws Throwable {
        final File file = new File("mio-fabric" + File.separator + "turbonative.dll");
        if (!file.exists()) return "0092CDEF";
        final FileInputStream stream = new FileInputStream(file);
        final byte[] data = stream.readAllBytes();
        stream.close();
        final CRC32 crc = new CRC32();
        crc.update(data);
        return Long.toHexString(crc.getValue()).toUpperCase();
    }

    private static String checksum() throws Throwable {
        final File file = Jar.getCurrentPath();
        final FileInputStream stream = new FileInputStream(file);
        final byte[] data = stream.readAllBytes();
        stream.close();
        final CRC32 crc = new CRC32();
        crc.update(data);
        return Long.toHexString(crc.getValue()).toUpperCase();
    }

    private static void verify_packet(final Socket socket) throws Throwable {
        final DataInputStream stream = new DataInputStream(socket.getInputStream());
        int n = 0;
        while (n < 15) {
            int size = stream.readInt();
            if (size < 10 || size > 100) throw new InvalidResponseException("Invalid packet size (%d). Check your internet connection.");
            final byte[] data = new byte[size];
            stream.readFully(data);
            ++n;
        }
    }
}

