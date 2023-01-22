package org.example.hw_14.task_2.entity;

import org.example.hw_14.task_2.entity.Car;

public class Lada implements Car {
    private String lada;
    private String type;

    public Lada(String lada, String type) {
        this.lada = lada;
        this.type = type;
    }

    @Override
    public String toString() {
        return lada + " " + type;
    }
}
