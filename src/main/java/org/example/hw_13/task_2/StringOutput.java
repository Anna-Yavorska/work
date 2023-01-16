package org.example.hw_13.task_2;

import java.io.*;

public class StringOutput {
    private static final String SETTING_FOR_TODAY = "Я люблю свою работу, я самая счастливая!\n";
    private static final String OUTPUT_FILE_PATH = "src/main/java/org/example/hw_13/task_2/RepeatList";
    private static final int QUANTITY_REPEAT = 1000;

    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter(OUTPUT_FILE_PATH);
             BufferedWriter bw = new BufferedWriter(fw)) {
            for (int i = 0; i < QUANTITY_REPEAT; i++) {
                bw.write(SETTING_FOR_TODAY);
            }
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
