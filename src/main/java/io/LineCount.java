package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineCount {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\User\\IdeaProjects\\JavaExamples\\src\\main\\java\\io\\lines.txt";
        int lineCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
            }
            System.out.println("Line count: " + lineCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}