package org.example.task_9.triangle;

public class MirrorTriangle {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        for (i = 0; i < 4; i++) {
            if (i == j) {
                System.out.println("****");
                if (i == j++) {
                    System.out.println(" ***");
                    if (i != j) {
                        System.out.println("  **");
                        break;
                    }
                }
            }
        }
        System.out.println("   *");
    }
}
