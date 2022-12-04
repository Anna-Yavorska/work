package org.example.hw_6.task_1;

public interface Computer {
    default void On() { // название методов с маленькой буквы, дефолтные методы в интерфейсе это больше лайв хак, чем хорошая практика, а поэтому лучше их всегда делать абстрактными
        System.out.println("Welcome!");
    }

    default void Off() { // название методов с маленькой буквы,
        System.out.println("Good bye!");
    }

    default void Reset() { // название методов с маленькой буквы,
        System.out.println("Do you really want it?");
    }
}
