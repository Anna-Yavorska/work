package org.example.hw_17.task_4;

import org.example.hw_17.task_3.User;

import java.util.Iterator;
import java.util.List;

public class AcceptanceList {
    public List<User> acceptList(List<User> list) {
        return list;
    }
    public boolean test(List<User> users) {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next().toString();
            if (name.startsWith("A", 11) | name.startsWith("P", 11) | name.startsWith("E", 11)) {
                iterator.remove();
            }
        }
        System.out.println(users);
        return true;
    }
}
