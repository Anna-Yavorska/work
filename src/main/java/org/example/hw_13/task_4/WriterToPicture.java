package org.example.hw_13.task_4;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriterToPicture {
    private static final String WAY_TO_PICTURE = "src/main/java/org/example/hw_13/task_4/Picture.png";
    private static final String SECRET = "\nLotus always faces the sun!\n";

    public void writeToPicture() {
        try (FileOutputStream fos = new FileOutputStream(WAY_TO_PICTURE, true)) {
            fos.write(SECRET.getBytes());
            fos.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
