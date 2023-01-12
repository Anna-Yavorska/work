package org.example.hw_12.task_2;

import java.util.Scanner;

public class ConversionStringToNumber {
    public static void main(String[] args) {
        ConversionStringToNumber casting = new ConversionStringToNumber(); // а зачем эта переменная?
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a number, please");
            String numberUserVariant = scanner.nextLine(); // numberUserVariant -> inputNumber
            int conversionUserVariant = Integer.parseInt(numberUserVariant); // conversionUserVariant -> parsedInteger
        } catch (NumberFormatException wrongNumber) { // wrongNumber переменные, которые хранят в себе исключение можно называть просто "е" - это общепринятая норма
            System.out.println("Your variant of number is not correct");
        }
    }
}
