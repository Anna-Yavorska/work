package org.example.hw_12.task_3;

import java.util.Scanner;

public class ArrayLengthService {
    private final Scanner scanner = new Scanner(System.in);

    public void writeNumber() throws CheckArrayLengthException {
        ArrayLengthService arrayLengthService = new ArrayLengthService();

        // numericalHighestBorder -> maxArrayLength
        // numericalLowerBorder -> minArrayLength
        int numericalHighestBorder = 67; // это похоже на константу, думаю стоит сделать полем класса
        int numericalLowerBorder = 0; // это похоже на константу, думаю стоит сделать полем класса

        System.out.println("Введите число будущего размера массива, но не больше " + numericalHighestBorder);

        try {
            int futureArrayLength = scanner.nextInt(); // futureArrayLength -> arrayLength
            if (futureArrayLength <= numericalHighestBorder && futureArrayLength > numericalLowerBorder) {
                System.out.println("Длина массива = " + futureArrayLength);
            } else {
                throw new CheckArrayLengthException();
            }
        } catch (CheckArrayLengthException arrayLength) {
            System.out.println("Вы ввели не правильное число. Повторите попытку");
            arrayLengthService.writeNumber(); // на лекции расскажу почему так не стоит делать. А если пользователь еще раз введет неверное число? Думаю нужен цикл
        }
    }

}
