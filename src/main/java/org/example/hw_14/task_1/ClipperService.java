package org.example.hw_14.task_1;

public class ClipperService<T> {
    private T typeOfClipper;

    public ClipperService(T typeOfClipper) {
        this.typeOfClipper = typeOfClipper;
    }

    public String getTypeOfClipper() {
        return typeOfClipper.getClass().getName();
    }
}
