package org.example.hw_12.task_4;

public class WasherService {
    private boolean electricity = true;

    public void turnOnLaundry() {
        try {
            if (electricity) {
                System.out.println("Процесс запущен");
            } else {
                throw new ElectricityException();
            }
        } catch (ElectricityException electricityOff) {
            System.out.println("Электричества нет, все процессы остановлены!");
        }
    }

    public void drainWater() {
        System.out.println("Сливаем воду");
    }

    public boolean isElectricity() {
        System.out.println("Электричество есть");
        return electricity;
    }

    public void setElectricity(boolean electricity) {
        System.out.println("Эллектричество отключили");
        this.electricity = electricity;
    }

}
