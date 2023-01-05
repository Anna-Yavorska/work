package org.example.hw_11.task_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NewGladiatorMain extends Players {
    public static void main(String[] args) throws IOException {
        Players names = new Players();
        Scanner newPlayer = new Scanner(System.in);
        BufferedReader enter = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, enter your gladiator's name");
        String nameNewGladiator = newPlayer.next();


        System.out.println("Now there will be a battle between " + nameNewGladiator + " vs " + players[numberName]);
        System.out.println(nameNewGladiator + ", are you ready?");

        String enterPress = enter.readLine();

        for (int i = 4; i >= 0; ) {
            int numberProtectionOf = 0;
            int numberAttackOf = 0;


            System.out.println("Select strike number from 0 to 2");
            numberAttackOf = newPlayer.nextInt();
            System.out.println(NewGladiator.attack[numberAttackOf]);
            System.out.println(NewGladiator.protection[NewGladiator.numberProtection]);
            if (!NewGladiator.attack[numberAttackOf].equals(NewGladiator.protection[NewGladiator.numberProtection])) {
                i--;
            }
            System.out.println(NewGladiator.attack[NewGladiator.numberAttack]);
            System.out.println("Select protection number from 0 to 2");
            numberProtectionOf = newPlayer.nextInt();
            System.out.println(NewGladiator.protection[numberProtectionOf]);


            if (!NewGladiator.attack[NewGladiator.numberAttack].equals(NewGladiator.protection[numberProtectionOf])) {
                i--;
            }

        }
        System.out.println("The game is over");
    }
}