package org.example.hw_12.task_2;

import java.util.Scanner;

public class ConversionStringToNumber {
    public static void main(String[] args) {
        ConversionStringToNumber casting = new ConversionStringToNumber();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a number, please");
            String numberUserVariant = scanner.nextLine();
            int conversionUserVariant = Integer.parseInt(numberUserVariant);
        } catch (NumberFormatException wrongNumber) {
            System.out.println("Your variant of number is not correct");
        }
    }
}
