package org.example.hw_10.task_3;

public class CommaMain {
    public static void main(String[] args) {
        String coloursName = "Green. red. blue. yellow"; // coloursName -> colors
        coloursName = coloursName.replace(".", ",");
        System.out.println(coloursName);
    }
}
