package org.example.hw_14.task_2.entity;

public class Garage<Car> {
    private Car[] carBrand;

    public Garage(Car[] carBrand) {
        this.carBrand = carBrand;
    }

    public Car[] getCarBrand() {
        return carBrand;
    }
}
