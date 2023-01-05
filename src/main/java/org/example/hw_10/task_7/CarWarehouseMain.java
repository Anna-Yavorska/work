package org.example.hw_10.task_7;

import java.util.Arrays;

public class CarWarehouseMain {
    public static void main(String[] args) {
        CarWarehouse[] cars = new CarWarehouse[4];
        cars[0] = new CarWarehouse("Renault", "1.4");
        cars[1] = new CarWarehouse("Renault", "1.8");
        cars[2] = new CarWarehouse("Toyota", "1.6");
        cars[3] = new CarWarehouse("Toyota", "1.8");

        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getMotor().contains("1.4")) {
                cars[i].setMotor("2.0T");
            } else {
                if (cars[i].getMotor().contains("1.8")) {
                    cars[i].setMotor("1.8T");
                }
            }
        }

        for (CarWarehouse carWarehouse : cars) {
            System.out.println(carWarehouse);
        }
    }
}
