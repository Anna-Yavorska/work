package org.example.hw_17.task_1;

public class ConvertingNumberToStringMain {

    public static void main(String[] args) {
        ConvertingService convertingService = new ConvertingService();
        Converting converting = convertingService::convertToString;

        String convertingResult = converting.converting(1100);  // convertingResult -> result будет достаточно в данном случае
        System.out.println(convertingResult);
    }
}
