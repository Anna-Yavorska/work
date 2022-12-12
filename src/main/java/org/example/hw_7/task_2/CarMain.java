package org.example.hw_7.task_2;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();
        car.enginOn();
        car.increaseGear();
        car.pressGas();

        car.ride();
        car.getCurrentSpeed();
        car.enginOn();
        car.increaseGear();
        car.getCurrentSpeed();

        System.out.println("=======");
        car.decreaseGear();
        car.getCurrentSpeed();

        System.out.println("=======");
        car.decreaseGear();
        car.getCurrentSpeed();
        car.decreaseGear();
    }
}
