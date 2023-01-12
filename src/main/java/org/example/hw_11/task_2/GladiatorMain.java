package org.example.hw_11.task_2;

import java.util.Random;
import java.util.Scanner;

public class GladiatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GladiatorComputerNameService nameService = new GladiatorComputerNameService();

        System.out.println("Введите имя игрока");
        String gladiatorName = scanner.next();
        String computerName = nameService.generateName();
        System.out.println("Cейчас будет битва между " + gladiatorName + " vs " + computerName);
        System.out.println("Нажмите enter, если готовы играть");
        String enter = scanner.next();

        GladiatorFightService fightService = new GladiatorFightService();
        Gladiator userGladiator = new Gladiator(gladiatorName, 100);
        Gladiator computerGladiator = new Gladiator(computerName, 100);
        Random random = new Random();

        while (true) {
            System.out.println("""
                    Куда бъём?
                    0 - High kick
                    1 - Middle kick
                    2 - Low kick
                    """);
            int attackIndex = scanner.nextInt();
            int injury = fightService.attack(attackIndex, computerGladiator);
            System.out.println("Здоровье комрьютера = " + computerGladiator.getHealth());
            if (computerGladiator.getHealth() <= 0) {
                System.out.println("Битва окончена, вы победили!");
                break;
            }
            int computerAttackIndex = random.nextInt(AttackOption.values().length);
            System.out.println("""
                    Какой блок поставите?
                    0 - High block
                    1 - Middle block
                    2 - Low block
                    """);
            int defendIndex = scanner.nextInt();
            fightService.defend(defendIndex, userGladiator);
            System.out.println("Ваше здоровье = " + userGladiator.getHealth());
            if (userGladiator.getHealth() <= 0) {
                System.out.println("Битва окончена, вы проиграли!");
                break;
            }
        }
    }
}
