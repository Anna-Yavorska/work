package org.example.hw_10.task_7;

public class CarWarehouse {
    private String brandCar;
    private double motor;

    public CarWarehouse(String brandCar, double motor) {
        this.brandCar = brandCar;
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "CarWarehouse{" +
                "brandCar='" + brandCar + '\'' +
                ", motor=" + motor +
                '}';
    }
}
