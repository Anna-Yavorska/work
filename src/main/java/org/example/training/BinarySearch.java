package org.example.training;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arrayWithFewNumbers = new int[]{1, 2, 6, 6, 9, 11, 12, 15, 18, 20, 22};

        int target = 6;

        int firstIndex = findFirstIndex(arrayWithFewNumbers, target);
        int lastIndex = findLastIndex(arrayWithFewNumbers, target);

        if (firstIndex != -1 && lastIndex != -1) {
            System.out.printf("Number %d is on the position from %d to %d", target, firstIndex, lastIndex);
        } else {
            System.out.printf("Number %d is not exist in the array", target);
        }
    }

    private static int findFirstIndex(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
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

    private static int findLastIndex(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
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
}
