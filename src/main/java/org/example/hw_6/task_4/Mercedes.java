package org.example.hw_6.task_4;


public class Mercedes implements AndroidAuto, CarPlay {
    @Override
    public String playMusic() {
        return AndroidAuto.super.playMusic();
    }
}
