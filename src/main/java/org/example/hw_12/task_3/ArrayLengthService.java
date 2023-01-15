package org.example.hw_12.task_3;

import java.util.Scanner;

public class ArrayLengthService {
    private static final int MAX_ARRAY_LENGTH = 67;
    private static final int MIN_ARRAY_LENGTH = 0;
    private final Scanner scanner = new Scanner(System.in);

    public void writeNumber() throws ArrayLengthException {
        ArrayLengthService arrayLengthService = new ArrayLengthService();

        System.out.println("Введите число будущего размера массива, но не больше " + MAX_ARRAY_LENGTH);

        try {
            int ArrayLength = scanner.nextInt();
            if (ArrayLength <= MAX_ARRAY_LENGTH && ArrayLength > MIN_ARRAY_LENGTH) {
                System.out.println("Длина массива = " + ArrayLength);
            } else {
                throw new ArrayLengthException();
            }
        } catch (ArrayLengthException arrayLength) {
            System.out.println("Вы ввели не правильное число. Повторите попытку");
            arrayLengthService.writeNumber();
        }
    }

}
