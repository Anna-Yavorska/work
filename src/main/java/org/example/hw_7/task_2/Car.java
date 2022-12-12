package org.example.hw_7.task_2;

public class Car {
    private Motor motor;
    private Transmission transmission;
    private boolean gas;

    public Car() {
        this.motor = new Motor();
        this.transmission = new Transmission();
    }

    public void ride() {
        if (motor.isState() && transmission.isFirstGear() && gas) {
            System.out.println("Let's go!");
        } else {
            System.out.println("Something goes wrong!");
        }
    }

    public void enginOn() {
        motor.enginOn();
    }

    public void enginOff() {
        motor.enginOff();
    }

    public int increaseGear() {
        return transmission.increaseGear();
    }

    public int decreaseGear() {
        return transmission.decreaseGear();
    }

    public boolean pressGas() {
        gas = true;
        return gas;
    }

    public void getCurrentSpeed() {
        System.out.println(transmission.getCurrentSpeed());
    }
}
