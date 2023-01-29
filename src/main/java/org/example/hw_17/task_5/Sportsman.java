package org.example.hw_17.task_5;

import java.util.List;

public class Sportsman {
    private String name;
    private Integer speed;
    List<Medal> medals;

    public Sportsman(String name, Integer speed, List<Medal> medals) {
        this.name = name;
        this.speed = speed;
        this.medals = medals;
    }

    public Integer getSpeed() {
        return speed;
    }

    public List<Medal> getMedals() {
        return medals;
    }

    @Override
    public String toString() {
        return "Sportsman{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", medals=" + medals +
                '}';
    }
}
