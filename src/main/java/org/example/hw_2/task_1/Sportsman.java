package org.example.hw_2.task_1;

public class Sportsman {
    public static void main(String[] args) {
        int runDays = 1;
        double persent = 0.1;
        double run = 10;
        double totalRun = 0;
        for (run = 10; runDays <= 7; run = run + (run * persent)) {
            runDays++;
            totalRun += run;
            System.out.println(totalRun);
        }
    }
}

