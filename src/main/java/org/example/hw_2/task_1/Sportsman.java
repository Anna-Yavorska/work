package org.example.hw_2.task_1;

public class Sportsman {
    public static void main(String[] args) {
        int runDays = 7;
        double persent = 0.1;
        double run = 10;
        double totalRun = 0;
        for (int i = 1; i < runDays; i++) {
            run = run + (run * persent);
            totalRun += run;
            System.out.println(totalRun);
        }
    }
}

