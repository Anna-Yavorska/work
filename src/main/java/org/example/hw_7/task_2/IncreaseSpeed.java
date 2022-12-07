package org.example.hw_7.task_2;

public class IncreaseSpeed {
    public static void main(String[] args) {
        String on = "Motor is on!";
        int speed = 20;
        String gas = "Press";
        int number = 1;
        speed = increaseSpeedRecursion(on, number, gas, speed);
    }

    private static int increaseSpeedRecursion(String on, int number, String gas, int speed) {
        if (number >= 8) {
            return speed;
        }
        System.out.println("result = " + on + " " + gas + " " + number + ", " + speed + "km/h ");
        return increaseSpeedRecursion("Motor is already on!", ++number, gas, speed + 20);
    }
}
