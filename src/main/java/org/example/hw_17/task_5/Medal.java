package org.example.hw_17.task_5;

public enum Medal { // исходя из условия задачи, медаль в качестве enum нам вряд ли подойдет. Это должен быть обычный класс
    GOLD(25, 1),
    SILVER(64, 2),
    BRONZE(2, 3); // абзац
    private Integer raceNumber; // номер забега вряд ли может быть в енам, т.к. это скорее всего число, которое будет часто обновляться
    private Integer place;

    Medal(Integer raceNumber, Integer place) {
        this.raceNumber = raceNumber;
        this.place = place;
    }
}
