package org.example.hw_3.task_2;

public class Arithmetic {
    public static void main(String[] args) {
        double[] math = new double[]{1, 2, 2, 5, 20.8};
        double average = 0;
        if (math.length > 0) {
            double sum = 0.0;
            for (int i = 0; i < math.length; i++) {
                sum += math[i];
            }
            average = sum / math.length;
            System.out.println(average);
        }
    }
}