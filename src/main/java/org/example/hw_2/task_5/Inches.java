package org.example.hw_2.task_5;

//+
public class Inches {
    public static void main(String[] args) {
        double coefficient = 2.54;
        int i = 1;
        System.out.println("Conversion from inches to centimeters");
        for (int b = 1; b <= 20; b++) {
            System.out.print(i++ + " = ");
            System.out.println(b * coefficient);
        }
    }
}
