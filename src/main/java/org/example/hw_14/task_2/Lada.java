package org.example.hw_14.task_2;

public class Lada {
    private String lada;

    public String type;

    public Lada(String lada, String type) {
        this.lada = lada;
        this.type = type;
    }

    @Override
    public String toString() {
        return lada + " " + type;
    }
}
