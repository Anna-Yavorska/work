package org.example.hw_10.task_3;

public class CommaMain {
    public static void main(String[] args) {
        String colours = "Green. red. blue. yellow";
        String separatorSign = ",";
        colours = colours.replace(".", separatorSign);
        System.out.println(colours);
    }
}
