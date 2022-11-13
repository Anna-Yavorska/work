package org.example.task_9.triangle;

public class Triangle {
    public static void main(String[] args) {
        int i = 4; // в строке 7 ты присваиваешь такое же значение
        int j = 4;
        for (i = 4; i > 0; i--) {
            if (i == j) {
                System.out.println("   *");
                if (i == j--) {
                    System.out.println("  **");
                    if (i != j) {
                        System.out.println(" ***");
                        break;
                    }
                }
            }
        }
        System.out.println("****");
        
        
        /* суть задачи в том, чтобы можно было изменить размер пирамиды не меняя код, т.е. было
        ****
        ***
        **
        *
        
        затем я менял 4 на 8 и программа без дополнительных изменений вывела на экран
        ********
        *******
        ******
        *****
        ****
        ***
        **
        *
        
        надеюсь понятно объяснил
        */
    }
}


