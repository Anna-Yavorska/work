package org.example.hw_4.task_4;

import org.example.hw_4.task_2.Family;

public class TextMain {
    public static void main(String[] args) {
        Family mother = new Family();
        System.out.println(mother.name);
        System.out.println(mother.age);
        System.out.println(mother.getText());

        String text = Family.getText();

        mother.setText("Hello from family");
        System.out.println(mother.getText());

        Family father = new Family("Valerij", 56);
        System.out.println(father.name);
        System.out.println(father.age);
        System.out.println(father.getText());

        Family mothersSister = new Family();
        System.out.println(mothersSister.name);
        System.out.println(mothersSister.age);
        System.out.println(mothersSister.getText());

        Family son = new Family("Aleksej", 4);
        System.out.println(son.name);
        System.out.println(son.age);
        System.out.println(son.getText());
    }
}
