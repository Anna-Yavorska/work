package org.example.Butter;

public class ButterMain {
    public static void main(String[] args) {

        int size = 8;
        int leftBorder = 1;
        int rightBorder = size;
        int mid = size / 2;
        String emptySymbol = " ";
        for (int i = 0; i < mid; i++) {
            int printingIndex = 1;
            for (int j = 0; j < size; j++) {
                if (j < leftBorder) {
                    System.out.print(printingIndex);
                } else {
                    if (j < rightBorder - 1) {
                        System.out.print("0");
                    } else {
                        System.out.print(printingIndex);
                    }
                }
                if (j < mid - 1) {
                    printingIndex++;
                }
                if (j > mid - 1) {
                    printingIndex--;
                }
            }
            System.out.println();
            leftBorder++;
            rightBorder--;
        }
        for (int i = 0; i < mid - 1; i++) {
            int printingIndex = 1;
            for (int j = size; j > i; j--) {
                if (j > rightBorder + 1) {
                    System.out.print(printingIndex++);
                } else {
                    if (j > mid - 1) {
                        System.out.print("0");
                    } else {
                        if (j <= rightBorder) {
                            System.out.print(printingIndex - 1);
                            printingIndex--;
                        }
                    }
                }
            }
            System.out.println();
            rightBorder++;
        }
    }
}

