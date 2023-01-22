package org.example.hw_14.task_2.entity;

public class Mazda implements Car {
    private String name;
    private String serial;
    private int serialNumber;

    public Mazda(String name, String serial, int serialNumber) {
        this.name = name;
        this.serial = serial;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return name + " " + serial + "-" + serialNumber;
    }
}
