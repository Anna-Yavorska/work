package org.example.hw_11.task_2;

import java.io.IOException;
import java.util.Scanner;

public class GladiatorMain  {
    public static void main(String[] args) throws IOException {
        Scanner newGladiator = new Scanner(System.in);
        System.out.println("Please, enter your gladiator's name");
        String nameNewGladiator = newGladiator.next();

        ComputerGladiatorName[] opponentName = ComputerGladiatorName.values();
        int numberName = (int) Math.floor(Math.random() * opponentName.length);

        System.out.println("Now there will be a battle between " + nameNewGladiator + " vs " + opponentName[numberName]);
        System.out.println(nameNewGladiator + ", are you ready?");
        String ready = newGladiator.next();

        int lifeComputer = 4;
        int lifeUser = 4;

        for (int i = 0; ; i++) {
            int numberProtectionOf = 0;
            int numberAttackOf = 0;
            if (lifeComputer == 0 || lifeUser == 0) {
                System.out.println("The game is over");
                return;
            }

            System.out.println("Select strike number from 0 to 2");
            numberAttackOf = newGladiator.nextInt();
            System.out.println(UserGladiator.attack[numberAttackOf]);
            System.out.println(UserGladiator.protection[UserGladiator.numberProtection]);

            if (numberAttackOf != UserGladiator.numberProtection) {
                lifeComputer= lifeComputer - 1;
            }

            int attackComputer = UserGladiator.numberAttack;
            System.out.println(UserGladiator.attack[attackComputer]);
            System.out.println("Select protection number from 0 to 2");
            numberProtectionOf = newGladiator.nextInt();
            System.out.println(UserGladiator.protection[numberProtectionOf]);

            if (attackComputer != numberProtectionOf) {
                lifeUser= lifeUser - 1;
            }

        }

    }
}
