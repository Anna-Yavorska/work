package org.example.hw_12.task_2;

import java.util.Scanner;

public class ConversionStringToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a number, please");
            String inputNumber = scanner.nextLine();
            int parsedInteger = Integer.parseInt(inputNumber);
        } catch (NumberFormatException e) {
            System.out.println("Your variant of number is not correct");
        }
    }
}
