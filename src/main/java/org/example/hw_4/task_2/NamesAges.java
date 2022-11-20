package org.example.hw_4.task_2;

public class NamesAges { // я бы предложил класс с методом main() назвать, например, NameAgeMain, но сначала придумать другое название для MainAge
    public static void main(String[] args) {
// здесь пустая строка не нужна
        NameAge girl = new NameAge();
        System.out.println("Name = " + girl.name);
        System.out.println("Age = " + girl.age); // после этой строки предлагаю сделать абзац
        NameAge boy = new NameAge("Vlad", 40);
        System.out.println("Name = " + boy.name);
        System.out.println("Age = " + boy.age);
    }
}
