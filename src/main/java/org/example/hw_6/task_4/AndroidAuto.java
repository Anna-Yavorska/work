package org.example.hw_6.task_4;

public interface AndroidAuto extends CarPlay {
    String playMusic = "Show must go on!";

    default String playMusic() {
        return playMusic;
    }
}
