package com.company;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\output.txt"))) {
            String line;
            StringBuilder code = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                code.append(line).append("\n");
            }
            String codeWithoutComments = code.toString().replaceAll("//.*|(\"(?:\\\\[^\"]|\\\\\"|.)*?\")|(?s)/\\*.*?\\*/", "");
            writer.write(codeWithoutComments);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
