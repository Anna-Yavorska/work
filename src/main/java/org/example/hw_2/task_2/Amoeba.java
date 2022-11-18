package org.example.hw_2.task_2;

//+
public class Amoeba {
    public static void main(String[] args) {
        int amoeba = 1;
        for (int i = 0; i <= 24; i = i + 3) {
            amoeba *= 2;
            System.out.println("In " + i + " hr -" + " " + amoeba);
        }
    }
}
