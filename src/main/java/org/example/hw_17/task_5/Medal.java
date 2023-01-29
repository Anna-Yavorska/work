package org.example.hw_17.task_5;

public enum Medal {
    GOLD(25, 1),
    SILVER(64, 2),
    BRONZE(2, 3);
    private Integer raceNumber;
    private Integer place;

    Medal(Integer raceNumber, Integer place) {
        this.raceNumber = raceNumber;
        this.place = place;
    }
}
