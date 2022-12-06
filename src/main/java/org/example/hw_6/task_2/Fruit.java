package org.example.hw_6.task_2;

public class Fruit {
    private String name;
    private int weight;

    public Fruit(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Fruit() { // конструктор без аргументов лучше поставить первым. Я думаю в рамках текущего задания его можно удалить
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
