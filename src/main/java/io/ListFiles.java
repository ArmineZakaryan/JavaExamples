package io;

import java.io.File;

public class ListFiles {
    public static void main(String[] args) {

        File folder = new File("C:\\Users\\User\\IdeaProjects\\JavaExamples\\src\\main\\java\\io");

        File[] files = folder.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println(file.getName() + " - " + file.length() + " bytes.");
                }
            }
        }
    }
}