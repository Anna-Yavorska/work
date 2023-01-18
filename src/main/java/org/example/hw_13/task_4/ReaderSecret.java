package org.example.hw_13.task_4;

import java.io.FileInputStream;
import java.io.IOException;

public class ReaderSecret {
    private static final String WAY_TO_SECRET = "src/main/java/org/example/hw_13/task_4/Picture.png";

    public static void main(String[] args) {
        WriterToPicture write = new WriterToPicture();
        write.writeToPicture();
        int secretMessageLength = "\nLotus always faces the sun!\n".length();

        try (FileInputStream fis = new FileInputStream(WAY_TO_SECRET)) {
            fis.skipNBytes(fis.available() - secretMessageLength);
            byte[] message = fis.readAllBytes();
            for (int i = 0; i < message.length; i++) {
                System.out.print((char) message[i]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
