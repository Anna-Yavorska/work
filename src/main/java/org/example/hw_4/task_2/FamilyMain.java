package org.example.hw_4.task_2;

public class FamilyMain {
    public static void main(String[] args) {
        Family girl = new Family();
        System.out.println("Name = " + girl.name);
        System.out.println("Age = " + girl.age);

        Family boy = new Family("Vlad", 40);
        System.out.println("Name = " + boy.name);
        System.out.println("Age = " + boy.age);
    }
}
