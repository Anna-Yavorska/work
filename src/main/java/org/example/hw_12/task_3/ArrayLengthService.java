package org.example.hw_12.task_3;

import java.util.Scanner;

public class ArrayLengthService {
    private final Scanner scanner = new Scanner(System.in);

    public void writeNumber() throws CheckArrayLengthException {
        ArrayLengthService arrayLengthService = new ArrayLengthService();

        int numericalHighestBorder = 67;
        int numericalLowerBorder = 0;

        System.out.println("Введите число будущего размера массива, но не больше " + numericalHighestBorder);

        try {
            int futureArrayLength = scanner.nextInt();
            if (futureArrayLength <= numericalHighestBorder && futureArrayLength > numericalLowerBorder) {
                System.out.println("Длина массива = " + futureArrayLength);
            } else {
                throw new CheckArrayLengthException();
            }
        } catch (CheckArrayLengthException arrayLength) {
            System.out.println("Вы ввели не правильное число. Повторите попытку");
            arrayLengthService.writeNumber();
        }
    }

}