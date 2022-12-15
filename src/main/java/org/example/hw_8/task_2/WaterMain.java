package org.example.hw_8.task_2;

import java.lang.reflect.Method;

//+
public class WaterMain {
    public static void main(String[] args) throws Exception {
        Water water = new Water();

        Class<?> aClass = water.getClass();

        Method[] declaredMethods = aClass.getDeclaredMethods();

        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.getName().equals("printNameWater")) {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(water, "Borjomi");
            }
        }

    }
}
