package org.example.hw_7.task_1;

public class ArrayElements {
    public static void main(String[] args) {
        int[] five = new int[]{10, 20, 30, 40, 50, 60}; // five - почему такое название?
        int index = five.length;
        arrayRecursion(five, index); // arrayRecursion -> printArrayRecursion -> название метода - это глагол
    }

    // твоя функция печатает массив в обратном порядке и немного неправильно написано, ниже оставил пример
    private static int arrayRecursion(int[] five, int index) {
        if (index <= 0) {
            return five[0];
        }
        arrayRecursion(five, --index);
        System.out.println(five[index]);
        return five[index];
    }
    
    /*
        private static int arrayRecursion(int[] five, int index) {
        if (index == five.length - 1) {
            return five[index];
        }
        System.out.println(five[index]);

        return arrayRecursion(five, ++index);
    }
    */
}
