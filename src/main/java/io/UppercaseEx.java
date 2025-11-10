package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class UppercaseEx {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\User\\IdeaProjects\\JavaExamples\\src\\main\\java\\io\\lines.txt";
        File inputFile = new File(filePath);
        File outputFile = new File("uppercase.txt");

        try (FileInputStream fileInputStream = new FileInputStream(inputFile);
             FileOutputStream fileOutputStream = new FileOutputStream(outputFile)) {

            int ch;
            while ((ch = fileInputStream.read()) != -1) {
                char upperCh = Character.toUpperCase((char) ch);
                fileOutputStream.write(upperCh);
            }
            System.out.println("Text successfully updated:");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}