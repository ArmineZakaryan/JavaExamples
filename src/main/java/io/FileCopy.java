package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\User\\IdeaProjects\\JavaExamples\\src\\main\\java\\io\\source.txt";

        File inputFile = new File(filePath);
        File outputFile = new File("copy.txt");

        try (FileInputStream fileInputStream = new FileInputStream(inputFile);
             FileOutputStream fileOutputStream = new FileOutputStream(outputFile)) {

            int ch;
            while ((ch = fileInputStream.read()) != -1) {
                fileOutputStream.write((char) ch);
            }
            System.out.println("File copied successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}