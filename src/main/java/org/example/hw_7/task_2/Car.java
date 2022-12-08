package org.example.hw_7.task_2;

public class Car {
    private boolean transmission;
    private boolean motor;

    public boolean increase() {
        return true;
    }

    public boolean decrease() {
        return true;
    }

    public boolean onMotor() {
        return true; // состаяние true надо бы сохранить в поле класса, иначе как ты узнаешь работает сейчас мотор или нет?
    }

    public boolean offMotor() {
        return true;
    }
}
