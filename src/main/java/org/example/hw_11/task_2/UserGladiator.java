package org.example.hw_11.task_2;

public class UserGladiator {
    public static String[] attack = new String[]{"Strike in the head", "Strike in the body", "Strike in the legs"};
    public static String[] protection = new String[]{"Put the head block", "Put the body block", "Put the legs block"};
    static int numberAttack = (int) Math.floor(Math.random() * attack.length);
    public static int numberProtection = (int) Math.floor(Math.random() * protection.length);
}
