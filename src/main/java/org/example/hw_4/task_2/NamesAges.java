package org.example.hw_4.task_2;

public class NamesAges {
    public static void main(String[] args) {

        NameAge girl = new NameAge();
        System.out.println("Name = " + girl.name);
        System.out.println("Age = " + girl.age);
        NameAge boy = new NameAge("Vlad", 40);
        System.out.println("Name = " + boy.name);
        System.out.println("Age = " + boy.age);
    }
}
