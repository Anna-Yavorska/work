package org.example.hw_14.task_2;

public class BMW {
    private String letter;
    private int number;

    public BMW(String letter, int number) {
        this.letter = letter;
        this.number = number;
    }

    @Override
    public String toString() {
        return letter + number;
    }
}
