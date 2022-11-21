package org.example.hw_4.task_2;

public class Family {

    public String name = "Viktoria";
    public Integer age = 32;
    private static String text = "Hello from static";

    public static String getText() {

        return text;
    }

    public void setText(String text) {

        Family.text = text;
    }

    public Family(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Family() {

    }

    static {
        System.out.println("Create a new class instance");
    }

    public String toString() {
        String nameAge = "[ Name = " + name + "; " + "age = " + age + "]";
        return nameAge;
    }
}
