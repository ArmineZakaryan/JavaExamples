package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MergeFiles {
    public static void main(String[] args) {
        String filePath1 = "C:\\Users\\User\\IdeaProjects\\JavaExamples\\src\\main\\java\\io\\file1.txt";
        String filePath2 = "C:\\Users\\User\\IdeaProjects\\JavaExamples\\src\\main\\java\\io\\file2.txt";

        File inputFile1 = new File(filePath1);
        File inputFile2 = new File(filePath2);
        File commonFile = new File("merged.txt");

        try (FileInputStream fileInputStream1 = new FileInputStream(inputFile1);
             FileInputStream fileInputStream2 = new FileInputStream(inputFile2);
             FileOutputStream fileOutputStream = new FileOutputStream(commonFile)) {

            int ch;
            while ((ch = fileInputStream1.read()) != -1) {
                fileOutputStream.write(ch);
            }

            while ((ch = fileInputStream2.read()) != -1) {
                fileOutputStream.write(ch);
            }

            System.out.println("Files merged successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}