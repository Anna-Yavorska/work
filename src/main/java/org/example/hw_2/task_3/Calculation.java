package org.example.task_3;

public class Calculation {
    public static void main(String[] args) {
        int j = 0; // j - это сумма, название переменной должно быть sum / summary
        for (int i = 0; i <= 8; i++) {
            j += 1 << i;
        }
        System.out.println(j);
    }
}

