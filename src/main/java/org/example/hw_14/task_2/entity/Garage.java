package org.example.hw_14.task_2.entity;

public class Garage<T extends Car> {
    private T[] tBrand;

    public Garage(T[] tBrand) {
        this.tBrand = tBrand;
    }

    public T[] getCarBrand() {
        return tBrand;
    }
}
