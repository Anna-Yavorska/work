package org.example.task_4;

public class AB {
    public static void main(String[] args) {
        // A*B
        int a = 4;
        int b;
        for (b = 0; b < 100; b = (b + a)) {
            System.out.println(b);
        }
    }
}
