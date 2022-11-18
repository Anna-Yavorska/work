package org.example.hw_2.task_9.triangle;

// а зачем тебе пакет triangle? думаю этот класс можно переместить в task_9
// у тебя первый треугольник немного поехал, но в целом задача была нарисовать не такие же, а два других, они будут как бы отзеркалены от тех, что были в самом задании
public class Triangle {
    public static void main(String[] args) {
        System.out.println("Triangle 1");
        int triangle = 4;
        for (int i = 0; i < triangle; i++) {
            for (int j = 0; j <= triangle - i; j++) { // если ты уберешь этот цикл, то получигт нужный результат
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Triangle 2");
        for (int i = 0; i < triangle; i++) { // если ты уберешь этот цикл, то получигт нужный результат
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < triangle - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
