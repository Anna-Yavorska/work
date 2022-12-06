package org.example.hw_6.task_1;

public class Notebook implements Computer {
    private String on;
    private String off;
    private boolean reset;

    @Override
    public String on() {
        return on;
    }

    @Override
    public String off() {
        return off;
    }

    @Override
    public boolean reset() {
        return reset;
    }
}
