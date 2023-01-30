package org.example.hw_17.task_4;

import org.example.hw_17.task_3.User;

import java.util.Iterator;
import java.util.List;

public class AcceptanceList {
    public List<User> acceptList(List<User> list) {
        return list;
    } // абзац
    public boolean test(List<User> users) { // test -> remove. Вторым аргументом в метод должен быть Predicate<List<User>>
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next().toString(); // никогда не используй toString для таких целей. Только через метод getName() 
            if (name.startsWith("A", 11) | name.startsWith("P", 11) | name.startsWith("E", 11)) {
                iterator.remove();
            }
        }
        System.out.println(users);
        return true; // если ты всегда возвращаешь true, то return в целом теряет смысл
    }
    
    /*
    Пример как мог выглядеть твой метод
    private static void removeIf(List<String> names) {
        предикат надо передать аргументом в метод
        Predicate<String> predicate = user -> user.getName().startsWith("A") || user.getName().startsWith("P") || user.getName().startsWith("E");
        names.removeIf(predicate);
    }
    */
}
