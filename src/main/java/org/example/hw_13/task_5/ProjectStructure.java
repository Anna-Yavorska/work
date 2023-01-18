package org.example.hw_13.task_5;

import java.io.*;

public class ProjectStructure {
    private static final String WAY_TO_PROJECT = "src/main/java/org/example";
    public static void main(String[] args) {
        File project = new File(WAY_TO_PROJECT);
        printCatalogs(new File[]{project}, "");
    }
    private static void printCatalogs(File[] files, String margin) {
        for (int i = 0; i < files.length; i++) {
            File file = files[i];
            if (file.isDirectory()) {
                System.out.println(margin + file.getName());
                margin = "";
            }
            if (file.isFile()) {
                System.out.println(margin + " " + file.getName());
                margin += " ";
            } else {
                File[] directoryFiles = file.listFiles();
                printCatalogs(directoryFiles, margin);
                System.out.print(margin);
            }
        }
    }
}
