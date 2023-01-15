package org.example.hw_13.task_5;

import java.io.*;

public class ProjectStructure {
    private static final String WAY_TO_PROJECT = "src/main/java/org/example";

    public static void main(String[] args) {
        File project = new File(WAY_TO_PROJECT);
        do {
            File[] files = project.listFiles();
            for (int i = 0; i < files.length; i++) {
                System.out.println(files[i].getName());
                if (files[i] == null) {
                    break;
                } else {
                    if (files[i].isDirectory()) {
                        File[] inFiles = files[i].listFiles();

                        for (int j = 0; j < inFiles.length; j++) {
                            File[] inTheFiles = inFiles[j].listFiles();
                            System.out.println("\t" + inFiles[j].getName());
                            if (inFiles[j] != null) {
                            }

                            for (int k = 0; k < inTheFiles.length; k++) {
                                if (inTheFiles[k] != null) {
                                    System.out.println("\t\t" + inTheFiles[k].getName());
                                }
                            }
                        }
                    }

                }
            }
        } while (!project.exists());
    }

}
