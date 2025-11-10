package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Count {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\User\\IdeaProjects\\JavaExamples\\src\\main\\java\\io\\lines.txt";
        int lineCount = 0;
        double wordsCount = 0;
        double charCount = 0;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                lineCount++;
                String[] words = line.trim().split("\\s");
                wordsCount += words.length;
                charCount += line.length();
            }

            System.out.println("Line count: " + lineCount);
            System.out.println("Word count: " + wordsCount);
            System.out.println("Char count: " + charCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}