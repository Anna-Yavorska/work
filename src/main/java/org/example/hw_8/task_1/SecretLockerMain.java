package org.example.hw_8.task_1;


import java.lang.reflect.Field;

public class SecretLockerMain {
    public static void main(String[] args) throws Exception {
        SecretLocker mommy = new SecretLocker("Mommy");

        System.out.println(mommy);
        Class<SecretLocker> secretLockerClass = SecretLocker.class;
        Field[] declaredFields = secretLockerClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            if (declaredField.getName().equals("passcode")) {
                declaredField.setAccessible(true);
                declaredField.set(mommy, "Daddy ");
            }
        }
        System.out.println(mommy);
    }
}
