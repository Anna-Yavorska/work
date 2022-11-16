package org.example.hw_3.task_2;

public class Arithmetic {
    public static void main(String[] args) {
        int[] math = new int[]{2, 4, 8, 6, 18, 89};
        int average = 0;
        if (math.length > 0) {
            int sum = 0;
            for (int i = 0; i < math.length; i++) {
                sum += math[i];
            }
            average = sum / math.length; // если взять числа 1,2,2 - то у тебя среднее 1, а должно быть 1,5. Ты близка к успеху, но int здесь не подойдет
        }
        System.out.println(average);
    }
}
