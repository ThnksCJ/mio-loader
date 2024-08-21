/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mc.mioclient.loader.gson.C
 *  mc.mioclient.loader.gson.GSONBuilder
 *  mc.mioclient.loader.gson.JsonArray
 *  mc.mioclient.loader.gson.JsonElement
 *  net.fabricmc.loader.impl.FabricLoaderImpl
 */
package me.mioclient.loader;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.zip.CRC32;
import mc.mioclient.loader.gson.C;
import mc.mioclient.loader.gson.GSONBuilder;
import mc.mioclient.loader.gson.JsonArray;
import mc.mioclient.loader.gson.JsonElement;
import me.mioclient.loader.CompatibilityCheck;
import me.mioclient.loader.Globals;
import me.mioclient.loader.InvalidSizeException;
import me.mioclient.loader.MioLoaderJar;
import me.mioclient.loader.cW;
import me.mioclient.loader.cX;
import me.mioclient.loader.cY;
import net.fabricmc.loader.impl.FabricLoaderImpl;

public class SocketConnection {
    private static final String service = "auth.mioclient.me";
    private static /* synthetic */ int ez;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void startConnection() {
        Socket socket = null;
        String string = null;
        int n = 0;
        if (n < 3) {
            socket = new Socket("auth.mioclient.me", 25598);
            socket.setSoTimeout(7000);
            SocketConnection.packetChecker(socket);
        }
        if (socket == null) {
            throw string;
        }
        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        string = SocketConnection.getNativeChecksum();
        String string2 = SocketConnection.getLoaderChecksum();
        dataOutputStream.writeUTF(FabricLoaderImpl.INSTANCE.getGameProvider().getRawGameVersion());
        dataOutputStream.writeUTF(string2);
        dataOutputStream.writeUTF(string);
        dataOutputStream.flush();
        int n2 = dataInputStream.readInt();
        if (n2 != -4004 && n2 != -257 && n2 != -9 && n2 != -500 && n2 != 5000022) {
            throw new InvalidSizeException("Invalid server response (%d). Please try again or contact support: https://mioclient.me/support".formatted(n2));
        }
        if (n2 == -4004) {
            throw new cW();
        }
        if (n2 == -257) {
            throw new cX();
        }
        if (n2 == -9) {
            Globals.printMessage("Updating the loader, please wait...");
            int n3 = dataInputStream.readInt();
            if (n3 < 100 || n3 > 0x3200000) {
                throw new InvalidSizeException("Invalid loader jar size (%d). Please try again or contact support: https://mioclient.me/support".formatted(n3));
            }
            byte[] byArray = new byte[n3];
            dataInputStream.readFully(byArray);
            FileOutputStream fileOutputStream = new FileOutputStream(MioLoaderJar.getCurrentPath());
            fileOutputStream.write(byArray);
            fileOutputStream.close();
            throw new cY();
        }
        if (n2 == -500 || n2 == 5000022) {
            String string3;
            String string4;
            C c;
            Object object;
            Object object2;
            byte[] byArray;
            int n4;
            if (n2 == -500) {
                n4 = dataInputStream.readInt();
                if (n4 < 100 || n4 > 0x3200000) {
                    throw new InvalidSizeException("Invalid packet/2 size (%d). Please try again or contact support: https://mioclient.me/support".formatted(n4));
                }
                byArray = new byte[n4];
                dataInputStream.readFully(byArray);
                object2 = new File("mio-fabric" + File.separator + "turbonative.dll");
                object = new FileOutputStream((File)object2);
                ((FileOutputStream)object).write(byArray);
                ((FileOutputStream)object).close();
            }
            if ((n4 = dataInputStream.readInt()) <= 0 || n4 > 100000) {
                throw new InvalidSizeException("Invalid validation response size (%d). Please try again or contact support: https://mioclient.me/support".formatted(n4));
            }
            byArray = new byte[n4];
            dataInputStream.readFully(byArray);
            object2 = new String(byArray, StandardCharsets.UTF_8);
            object = (C)new GSONBuilder().a((String)object2, C.class);
            if (!object.b("mods")) {
                throw new NullPointerException("No mods field");
            }
            C c2 = object.f("mods");
            if (!c2.b("required")) {
                throw new NullPointerException("No required field");
            }
            if (!c2.b("incompatible")) {
                throw new NullPointerException("No incompatible field");
            }
            JsonArray jsonArray = c2.e("required");
            JsonArray jsonArray2 = c2.e("incompatible");
            for (JsonElement jsonElement : jsonArray) {
                if (!jsonElement.r()) {
                    throw new RuntimeException("Required field is not an object");
                }
                c = jsonElement.u();
                if (!c.b(SocketConnection.a((int)-17575, (int)-22))) {
                    throw new RuntimeException("Required object doesn't have a required property: internal");
                }
                if (!c.b("name")) {
                    throw new RuntimeException("Required object doesn't have a required property: name");
                }
                string4 = c.c("internal").e();
                string3 = c.c("name").e();
                if (FabricLoaderImpl.INSTANCE.isModLoaded(string4)) continue;
                throw new InvalidSizeException("Mod '%s' is required for Mio to work.".formatted(string3));
            }
            for (JsonElement jsonElement : jsonArray2) {
                if (!jsonElement.r()) {
                    throw new RuntimeException("Incompatible field is not an object");
                }
                c = jsonElement.u();
                if (!c.b("internal")) {
                    throw new RuntimeException("Incompatible object doesn't have a required property: internal");
                }
                if (!c.b("name")) {
                    throw new RuntimeException("Incompatible object doesn't have a required property: name");
                }
                string4 = c.c("internal").e();
                string3 = c.c("name").e();
                if (!FabricLoaderImpl.INSTANCE.isModLoaded(string4)) continue;
                CompatibilityCheck.a(string3);
            }
        }
        socket.close();
    }

    private static String getNativeChecksum() {
        File file = new File("mio-fabric" + File.separator + "turbonative.dll");
        if (!file.exists()) {
            return "0092CDEF";
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] byArray = fileInputStream.readAllBytes();
        fileInputStream.close();
        CRC32 cRC32 = new CRC32();
        cRC32.update(byArray);
        return Long.toHexString(cRC32.getValue()).toUpperCase();
    }

    private static String getLoaderChecksum() {
        File file = MioLoaderJar.getCurrentPath();
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] byArray = fileInputStream.readAllBytes();
        fileInputStream.close();
        CRC32 cRC32 = new CRC32();
        cRC32.update(byArray);
        return Long.toHexString(cRC32.getValue()).toUpperCase();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void packetChecker(Socket socket) {
        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        int n = 0;
        while (n < 15) {
            int n2 = dataInputStream.readInt();
            if (n2 < 10 || n2 > 100) {
                throw new InvalidSizeException("Invalid packet size (%d). Check your internet connection.");
            }
            byte[] byArray = new byte[n2];
            dataInputStream.readFully(byArray);
            ++n;
        }
        return;
    }
}

