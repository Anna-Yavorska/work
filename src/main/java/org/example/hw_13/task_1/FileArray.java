package org.example.hw_13.task_1;

import java.io.*;

public class FileArray {
    private static final String OUTPUT_FILE_PATH = "src/main/java/org/example/hw_13/task_1/Array-output.txt.txt";

    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream(OUTPUT_FILE_PATH, true)) {
            byte[] numbers = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            fos.write(numbers);
            fos.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
