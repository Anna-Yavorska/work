package org.example.hw_11.task_2;

public enum DefendOption {
    HIGH_BLOCK(0),
    MIDDLE_BLOCK(1),
    LOW_BLOCK(2);
    private int index;

    DefendOption(int index) {
        this.index = index;
    }
}
