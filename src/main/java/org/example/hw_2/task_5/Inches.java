package org.example.task_5;

public class Inches {
    public static void main(String[] args) {
        double a = 2.54;
        double b;
        int i = 1;
        System.out.println("Conversion from inches to centimeters");
        for (b = 1; b <= 20; b++) {
            System.out.print(i++ + " = ");
            System.out.println(b * a);
        }
    }
}
