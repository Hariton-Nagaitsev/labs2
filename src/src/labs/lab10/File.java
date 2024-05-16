package src.labs.lab10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class File {

    public static ArrayList<String> readTxt(String file) {
        ArrayList<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }
        return list;
    }

    public static void writeTxt(String file, String text) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(text);
        } catch (IOException ex) {
            System.err.println("Ошибка записи файла: " + ex.getMessage());
        }
    }

    public static void mergeFiles(String file1, String file2, String outputFile) {
        ArrayList<String> linesFile1 = readTxt(file1);
        ArrayList<String> linesFile2 = readTxt(file2);

        ArrayList<String> mergedLines = new ArrayList<>();

        mergedLines.addAll(linesFile1);
        mergedLines.addAll(linesFile2);

        StringBuilder mergedText = new StringBuilder();

        for (String line : mergedLines) {
            mergedText.append(line).append("\n");
        }

        writeTxt(outputFile, mergedText.toString());
    }

    public static void replaceTxt(String file) {
        ArrayList<String> lines = readTxt(file);
        StringBuilder modifiedText = new StringBuilder();

        for (String line : lines) {
            String modifiedLine = line.replaceAll("[^a-zA-Z0-9]", "\\$");
            modifiedText.append(modifiedLine).append("\n");
        }
        writeTxt(file, modifiedText.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] prompts = {
                "Введите имя файла для чтения: ",
                "Введите имя файла для записи: ",
                "Введите имя первого файла для объединения: ",
                "Введите имя второго файла для объединения: ",
                "Введите имя выходного файла для объединения: ",
                "Введите имя файла для замены спец символов: "
        };

        String[] inputs = new String[prompts.length];

        for (int i = 0; i < prompts.length; i++) {
            inputs[i] = getUserInput(scanner, prompts[i]);
        }

        File.readTxt(inputs[0]).forEach(System.out::println);
        File.writeTxt(inputs[1], getUserInput(scanner, "Введите текст для записи: "));
        File.mergeFiles(inputs[2], inputs[3], inputs[4]);
        File.replaceTxt(inputs[5]);

        scanner.close();
    }

    private static String getUserInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
