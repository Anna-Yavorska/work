package org.example.hw_13.task_1;

import java.io.*;
import java.util.Arrays;

public class FileArray {
    private static final String WAY_TO_ARRAY = "src/main/java/org/example/hw_13/task_1/Array"; // WAY_TO_ARRAY -> OUTPUT_FILE_PATH

    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream(WAY_TO_ARRAY, true)) {
            byte[] numbers = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            String nums = Arrays.toString(numbers); // это нам не нужно.
            fos.write(nums.getBytes()); // метод write принимает массив байт. numbers это уже массив байт, преобразований делать не нужно
            fos.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
