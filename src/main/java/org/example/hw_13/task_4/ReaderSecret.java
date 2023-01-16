package org.example.hw_13.task_4;

import java.io.FileInputStream;
import java.io.IOException;

public class ReaderSecret {
    private static final String WAY_TO_SECRET = "src/main/java/org/example/hw_13/task_4/Picture.png";

    public static void main(String[] args) {
        WriterToPicture write = new WriterToPicture();
        write.writeToPicture();
        
        // При помощи WriterToPicture ты записала предложение в конец файла. Сейчас тебе не надо читать весь файл, надо прочитать именно с того места, куда ты записала
        // Для этого надо узнать сколько информации было в файле до этого, это можно сделать при помощи метода fis.available() - это будет твоя стартовая
        // точка для чтения после того как ты запишешь сообщение в картинку
        
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
