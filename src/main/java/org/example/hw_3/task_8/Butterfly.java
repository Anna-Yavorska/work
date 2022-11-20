package org.example.hw_3.task_8;

public class Butterfly {
    public static void main(String[] args) {
        int size = 10;
        int leftBorder = 1;
        int rightBorder = size;
        int mid = size / 2;
        String emptySymbol = " ";
        for (int i = 0; i < mid; i++) {
            int printingIndex = 1;
            for (int j = 1; j < size + 1; j++) {
                if (j <= leftBorder) {
                    System.out.print(printingIndex);
                } else {
                    if (j < mid) {
                        System.out.print(emptySymbol);
                    } else {
                        if (j < rightBorder) {
                            System.out.print(emptySymbol);
                        } else {
                            System.out.print(printingIndex);
                        }
                    }
                }
                if (j < mid) {
                    printingIndex++;
                }
                if (j > mid) {
                    printingIndex--;
                }
            }
            System.out.println();
            leftBorder++;
            rightBorder--;
        }

        for (int i = 0; i < mid - 1; i++) {
            int printingIndex = 1;
            for (int j = 1; j < size + 1; j++) {
                if (j < mid) {
                    System.out.print(printingIndex);
                } else {
                    if (j > leftBorder) {
                        System.out.print(printingIndex);
                    } else {
                        System.out.print("0");
                    }
                }
                if (j < mid) {
                    printingIndex++;
                }
                if (j > mid) {
                    printingIndex--;
                }
            }
            System.out.println();
        }
    }
}