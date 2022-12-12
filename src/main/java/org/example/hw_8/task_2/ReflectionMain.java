package org.example.hw_8.task_2;

import java.lang.reflect.Method;

public class ReflectionMain {
    public static void main(String[] args) throws Exception {
        Reflection reflection = new Reflection();

        Method method = reflection.getClass().getDeclaredMethod("printNameWater");
        method.setAccessible(true);
        method.invoke(reflection);
    }
}
