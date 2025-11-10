package io;

import java.io.*;

public class ReplaceWord {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\User\\IdeaProjects\\JavaExamples\\src\\main\\java\\io\\file3.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("replaced.txt"))) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains("Java")) {
                    line = line.replace("Java", "Spring");
                }
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            System.out.println("File successfully replaced.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}