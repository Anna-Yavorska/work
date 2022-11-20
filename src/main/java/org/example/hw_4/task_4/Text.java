package org.example.hw_4.task_4;

import org.example.hw_4.task_2.NameAge;

public class Text { // Text -> TextMain
    public static void main(String[] args) {
        //идея задания в том, чтобы изменить статик поле у одного класса и посмотреть поменяется ли оно у другого экземпляра. Ты пока просто создала несколько экземпляров класса NameAge
        NameAge mother = new NameAge();
        System.out.println(mother.name);
        System.out.println(mother.age);
        System.out.println(mother.getText());

        NameAge father = new NameAge("Valerij", 56);
        System.out.println(father.name);
        System.out.println(father.age);

        father.setText("Hello from family");
        System.out.println(father.getText());

//лишняя строка
        NameAge mothersSister = new NameAge();
        System.out.println(mothersSister.name);
        System.out.println(mothersSister.age);
        System.out.println(mothersSister.getText());

        NameAge son = new NameAge("Aleksej", 4);
        System.out.println(son.name);
        System.out.println(son.age);
        System.out.println(son.getText());
    }
}
