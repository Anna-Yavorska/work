package org.example.hw_14.task_1;

public class Clipper<T> {
    private String typeOfClipper;

    public <E> Clipper(E[] type) {
        typeOfClipper = type.getClass().getName();
    }

    public String getTypeOfClipper() {
        return typeOfClipper;
    }
}
