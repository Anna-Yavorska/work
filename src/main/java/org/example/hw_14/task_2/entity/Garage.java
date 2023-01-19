package org.example.hw_14.task_2.entity;

public class Garage<Car> { // у тебя Car - это название интерфейса, лучше не использовать одинаковые названия. 
    // Тем более по факту с таким generic у тебя в гараже может быть абсолютно любой класс
    private Car[] carBrand;

    public Garage(Car[] carBrand) {
        this.carBrand = carBrand;
    }

    public Car[] getCarBrand() {
        return carBrand;
    }
}
