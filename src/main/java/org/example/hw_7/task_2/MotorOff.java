package org.example.hw_7.task_2;

public class MotorOff {
    public static void main(String[] args) {
        String off = "Motor is off!";
        int number = 0;
        String result = motor(off, number);
        System.out.println(result);
    }

    private static String motor(String off, int number) {
        if (number >= 1) {
            return off;
        }
        System.out.println(off);
        motor(off, ++number);
        return "Motor is already off!";
    }
}
