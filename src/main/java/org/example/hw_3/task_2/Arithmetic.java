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
            average = sum / math.length;
        }
        System.out.println(average);
    }
}
