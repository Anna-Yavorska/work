package org.example.hw_14.task_1.entity;

public class Clipper<T> { // этот класс не подходит под понятие сущность (entity). Это скорее класс Service, который выполняет какую-либо логику.
    // Думаю даже можно его переименовать в ClipperService
    private T typeOfClipper;

    public Clipper(T typeOfClipper) {
        this.typeOfClipper = typeOfClipper;
    }

    public String getTypeOfClipper() {
        String type = typeOfClipper.getClass().getName(); // можно сократить до return typeOfClipper.getClass().getName();
        return type;
    }
}
