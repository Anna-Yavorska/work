package org.example.hw_7.task_2;

public class MotorOff {
    public static void main(String[] args) {
        String off = "Motor is off!";
        int number = 0;
        String result = motor(off, number);
        System.out.println(result);
    }

    private static String motor(String off, int number) { //  в классе с методом main() мы должны просто управлять автомобилем, каких-либо доп методов здесь быть не должно
        if (number >= 1) {
            return off;
        }
        System.out.println(off);
        motor(off, ++number);
        return "Motor is already off!";
    }
}
