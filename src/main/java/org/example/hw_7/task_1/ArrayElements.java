package org.example.hw_7.task_1;

public class ArrayElements {
    public static void main(String[] args) {
        int[] five = new int[]{10, 20, 30, 40, 50, 60};
        int index = five.length;
        arrayRecursion(five, index);
    }

    private static int arrayRecursion(int[] five, int index) {
        if (index <= 0) {
            return five[0];
        }
        arrayRecursion(five, --index);
        System.out.println(five[index]);
        return five[index];
    }
}
