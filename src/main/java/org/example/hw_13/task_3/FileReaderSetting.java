package org.example.hw_13.task_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderSetting {
    private static final String WAY_FOR_SETTING = "src/main/java/org/example/hw_13/task_2/RepeatList";

    public static void main(String[] args) {
        try (FileReader fr = new FileReader(WAY_FOR_SETTING);
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
