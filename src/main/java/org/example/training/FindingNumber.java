package org.example.training;

// форматирование кода забыла сделать
public class FindingNumber {
    public static void main(String[] args) {
        int[] array = new int[]{6, 6, 6, 6, 6, 6, 6, 6, 8, 8, 8, 8, 10, 9, 8, 7, 6, 6, 6, 6, 6, 1, 0, -1, -3}; // если я добавлю еще одну 10 в твой массив, то все ломается
        int target = 6;
        int top = findIndexOfTop(array); // findIndexOfTop -> maxNumberIndex
        int firstIndexBeforeTop = findFirstIndexBeforeTop(array, top, target);
        if(firstIndexBeforeTop > -1){
            int lastIndexBeforeTop = findLastIndexBeforeTop(array, top, firstIndexBeforeTop, target);
            System.out.printf("Number %d is on the position from %d to %d", target, firstIndexBeforeTop, lastIndexBeforeTop);
        }else {
            System.out.printf("Number %d is not exist before top", target);
        }

        System.out.println();
        System.out.println("===============High==================");

        int firstIndexAfterTop = findFirstIndexAfterTop(array, top, target);
        if (firstIndexAfterTop > -1){
            int lastIndexAfterTop = findLastIndexAfterTop(array, firstIndexAfterTop, target);
            System.out.printf("Number %d is on the position from %d to %d", target, firstIndexAfterTop, lastIndexAfterTop);
        }else {
            System.out.printf("Number %d is not exist after top", target);
        }
    }
    private static int findIndexOfTop(int[] array) {
        int left = 0;
        int right = (array.length - 1);
        int result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] > array[mid - 1] && array[mid] > array[mid + 1]) {
                return mid;
            } else if (array[mid] >= array[mid - 1] && array[mid] <= array[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    private static int findFirstIndexBeforeTop(int[] array, int high, int target) {
        int left = 0; // вот это очень странно, из-за того что ты ввела конкретное число, а не первое в массиве, то твой алгоритм не нашел -1 в левой части
        int right = (high - 1); // зачем здесь скобки? почему high-1, а не число по индексу топ-1?
        int result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == target) {
                result = mid;
                right = mid - 1;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    private static int findLastIndexBeforeTop(int[] array, int high, int firstIndex, int target) {
        int left = firstIndex;
        int right = high;
        int result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == target) {
                result = mid;
                left = mid + 1;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    private static int findFirstIndexAfterTop(int[] array, int high, int target) {
        int left = high + 1;
        int right = (array.length - 1); // зачем здесь скобки?
        int result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == target) {
                result = mid;
                right = mid - 1;
            } else if (array[mid] > target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    private static int findLastIndexAfterTop(int[] array, int firstIndexAfterHigh, int target) {
        int left = firstIndexAfterHigh;
        int right = array.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == target) {
                result = mid;
                left = mid + 1;
            } else if (array[mid] > target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}
