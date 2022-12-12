package org.example.hw_8.task_2;

import java.lang.reflect.Method;

//+
public class WaterMain {
    public static void main(String[] args) throws Exception {
        Water water = new Water();

        Method method = water.getClass().getDeclaredMethod("printNameWater", String.class);
        method.setAccessible(true);
        method.invoke(water, "Coca-cola");
    }
}
