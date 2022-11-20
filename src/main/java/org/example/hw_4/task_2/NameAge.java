package org.example.hw_4.task_2;

public class NameAge { // а если в класс добавить еще поля, то придется менять название? Придумай какое-нибудь другое, вариантов тонна: Рысь, Машина, Дерево...

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

    public NameAge() { // в задании сказано, что внутри конструктора должы присваиваться значения по умолчанию, твой вариант в целом тоже подходит
    }

    static {
        System.out.println("Create a new class instance");
    }
}
