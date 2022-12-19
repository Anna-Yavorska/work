package org.example.hw_10.task_8;

public class FiveSymbolsMain {
    public static void main(String[] args) {
        String[] animalNames = new String[6];
        animalNames[0] = "Lion";
        animalNames[1] = "Elephant";
        animalNames[2] = "Tiger";
        animalNames[3] = "Crocodile";
        animalNames[4] = "Zebra";
        animalNames[5] = "Giraffe";

        for (int i = 0; i < animalNames.length; i++) {
            if (animalNames[i].length() > 5) {
                System.out.println(animalNames[i]);
            }
        }
    }
}
