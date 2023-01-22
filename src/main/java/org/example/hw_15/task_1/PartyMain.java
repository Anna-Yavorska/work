package org.example.hw_15.task_1;

import java.util.List;
import java.util.Scanner;

public class PartyMain {
    public static void main(String[] args) {
        List<String> invitedNames = List.of("Egorka", "Roman", "Lena", "Marina");

        Scanner checkName = new Scanner(System.in);
        System.out.println("Enter your name, please");
        String name = checkName.next();

        if (invitedNames.contains(name)) {
            System.out.println(name + ", you are welcome");
        } else {
            System.out.println(name + " is not on the list. Sorry, you can't get inside");
        }
    }
}
