package org.example.hw_11.task_2;

public enum AttackOption {
    HIGH_KICK(0),
    MIDDLE_KICK(1),
    LOW_KICK(2);
    private int index;

    AttackOption(int index) {
        this.index = index;
    }
}
