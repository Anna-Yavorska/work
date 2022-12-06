package org.example.hw_6.task_4;

public interface CarPlay {
    String playMusic = "La-la";

    default String playMusic() {
        return playMusic();
    }
}
