package org.example.hw_10.task_7;

public class CarWarehouse {
    private String brandCar;
    private String motor;

    public CarWarehouse(String brandCar, String motor) {
        this.brandCar = brandCar;
        this.motor = motor;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
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
