package org.example.task_4;

public class AB {
    public static void main(String[] args) {
        // A*B
        
        // ты в целом уловила суть задачи. Например, я хочу 2*4 (A*B), результат должен быть 8. Но использовать умножение все еще нельзя.
        // Вот такую программу я хочу здесь увидеть, твой вариант пока выполняет другую задачу
        int a = 4;
        int b;
        for (b = 0; b < 100; b = (b + a)) {
            System.out.println(b);
        }
    }
}
