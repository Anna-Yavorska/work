package org.example.hw_12.task_3;

public class ArrayLengthMain {
    public static void main(String[] args) throws ArrayLengthException {
        ArrayLengthService arrayLengthService = new ArrayLengthService();

        try {
            arrayLengthService.writeNumber();
        } finally {
            System.out.println("Вы справились, продолжаем работу.");
        }
    }
}