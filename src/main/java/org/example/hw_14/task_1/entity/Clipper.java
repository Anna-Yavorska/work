package org.example.hw_14.task_1.entity;

public class Clipper<T> {
    private T typeOfClipper;

    public Clipper(T typeOfClipper) {
        this.typeOfClipper = typeOfClipper;
    }

    public String getTypeOfClipper() {
        String type = typeOfClipper.getClass().getName();
        return type;
    }
}
