package org.example.hw_15.task_7;

public class Shop {
    private String name;
    private long id;

    public Shop(String name, long id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
