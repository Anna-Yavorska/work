package org.example.hw_14.task_2;

public class Garage<T> {
    private T[] carBrand;

    public Garage(T[] carBrand) {
        this.carBrand = carBrand;
    }

    public T[] getCarBrand() {
        return carBrand;
    }

}
