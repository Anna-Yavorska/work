package org.example.hw_2.task_1;

public class Sportsman {
    public static void main(String[] args) {
        double km = 10;
        System.out.println(km);
        for (int j = 1; j < 7; j++) { // 7 - это кол-во дней, вынеси в отдельную переменную и назови ее, наприер, runDays
            km += km * 0.1; //  0.1 - вынеси в отдельную переменную
            System.out.println(km);
        }
        
        // после цикла стоит распечатать конечный результат забега
        // если спортсмен в первый день пробежал 10км, а во второй 11км, то за два он пробежал 21км, а это скорее всего больше твоего результата за 7 дней
    }
}
