package org.example.hw_4.task_2;

public class NameAge {

    public String name = "Viktoria";
    public Integer age = 32;
    private static String text = "Hello from static";

    public static String getText() {
        return text;
    }

    public void setText(String text) {
        text = text;
    }

    public NameAge(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public NameAge() {
    }

    static {
        System.out.println("Create a new class instance");
    }
}
