package org.example.hw_13.task_4;

import java.io.FileInputStream;
import java.io.IOException;

public class ReaderSecret {
    private static final String WAY_TO_SECRET = "src/main/java/org/example/hw_13/task_4/Picture.png";

    public static void main(String[] args) {
        WriterToPicture write = new WriterToPicture();
        write.writeToPicture();
        try (FileInputStream fis = new FileInputStream(WAY_TO_SECRET)) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
