package org.example.hw_7.task_2;

public class Deceleration {
    public static void main(String[] args) {
        String on = "Motor is already on!";
        int speed = 0;
        String gas = "Press";
        int number = 7;
        speed = increaseSpeedRecursion(on, number, gas, speed);
    }

    private static int increaseSpeedRecursion(String on, int number, String gas, int speed) {
        if (number <= 0) {
            return speed;
        }
        System.out.println("result = " + on + " " + gas + " " + number + ", " + number * 20 + "km/h ");
        return increaseSpeedRecursion("Motor is on!", --number, gas, number * 20);
    }
}
