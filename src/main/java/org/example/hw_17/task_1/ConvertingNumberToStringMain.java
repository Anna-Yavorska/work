package org.example.hw_17.task_1;

import java.util.function.Function;

public class ConvertingNumberToStringMain {

    public static void main(String[] args) {
        ConvertingService convertingService = new ConvertingService();
        Function<Integer, String> converting = convertingService::convertToString;
        String result = converting.apply(112);
        System.out.println(result);
    }
}
