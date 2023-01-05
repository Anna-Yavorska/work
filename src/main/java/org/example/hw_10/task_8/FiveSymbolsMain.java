package org.example.hw_10.task_8;

//+
public class FiveSymbolsMain {
    public static void main(String[] args) {
        String[] animals = new String[6];
        animals[0] = "Lion";
        animals[1] = "Elephant";
        animals[2] = "Tiger";
        animals[3] = "Crocodile";
        animals[4] = "Zebra";
        animals[5] = "Giraffe";

        int stringLength = 5;

        for (int i = 0; i < animals.length; i++) {
            if (animals[i].length() > stringLength) {
                System.out.println(animals[i]);
            }
        }
    }
}
