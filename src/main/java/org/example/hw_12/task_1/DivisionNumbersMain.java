package org.example.hw_12.task_1;

import java.util.Scanner;

public class DivisionNumbersMain {
    public static void main(String[] args) {
        DivisionNumbersService divisionNumbers = new DivisionNumbersService();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите делимое:");
            divisionNumbers.setDividend(scanner.nextInt());

            System.out.println("Введите делитель:");
            divisionNumbers.setDivisor(scanner.nextInt());

            divisionNumbers.divideNumbers();
        } catch (ArithmeticException zero) {
            System.out.println("На ноль делить нельзя!");
        }
    }
}
