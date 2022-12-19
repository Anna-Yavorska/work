package org.example.hw_10.task_7;

public class CarWarehouseMain {
    public static void main(String[] args) {
        CarWarehouse[] cars = new CarWarehouse[4];
        cars[0] = new CarWarehouse("Renault", 1.4);
        cars[1] = new CarWarehouse("Renault", 1.8);
        cars[2] = new CarWarehouse("Toyota", 1.6);
        cars[3] = new CarWarehouse("Toyota", 1.8);

        for (int i = 0; i < cars.length; i++) {
            if (cars[i].toString().contains("1.4")) {
                System.out.println(cars[i].toString().replace("1.4", "2.0T"));
            } else {
                if (cars[i].toString().contains("1.8")) {
                    System.out.println(cars[i].toString().replace("1.8", "1.8T"));
                } else {
                    System.out.println(cars[i]);
                }
            }
        }
    }
}