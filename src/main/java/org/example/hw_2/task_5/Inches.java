package org.example.task_5;

public class Inches {
    public static void main(String[] args) {
        double a = 2.54; // 2.54 - это коэффициент перевода дюймов в сантиметры. Назови переменную в соответствии с тем, что в ней хранится. Название "а" не подходит
        double b; // перенеси в 9 строку в скобки инициализации цикла
        int i = 1;
        System.out.println("Conversion from inches to centimeters");
        for (b = 1; b <= 20; b++) {
            System.out.print(i++ + " = ");
            System.out.println(b * a);
        }
    }
    
    // на выходе не совсем таблица получилось, но в целом ок, а другие комментарии надо поправить
}
