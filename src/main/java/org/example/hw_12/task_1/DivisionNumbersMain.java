package org.example.hw_12.task_1;

import java.util.Scanner;

public class DivisionNumbersMain {
    public static void main(String[] args) {

        try {
            DivisionNumbersService divisionNumbers = new DivisionNumbersService();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите делимое:");
            int dividend = scanner.nextInt();
            System.out.println("Введите делитель:");
            int divisor = scanner.nextInt();
            divisionNumbers.divideNumbers(dividend, divisor);
        } catch (ArithmeticException zero) {
            System.out.println("На ноль делить нельзя!");
        }
    }
}
