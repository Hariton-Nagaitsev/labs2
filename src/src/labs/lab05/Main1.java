package src.labs.lab05;

import java.util.Scanner;

public class Main1 {
    //Задание 1

    public static String longWordSearch(String text) {
        String[] words = text.split("\\s+");
        String longWord = "";

        for (String word : words) {
            if (word.length() > longWord.length()) {
                longWord = word;
            }
        }

        return longWord;
    }

    public static void findLongestWord() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст:");
        String text = scanner.nextLine();

        String longestWord = longWordSearch(text);
        System.out.println("Самое длинное слово в тексте: " + longestWord);

        scanner.close();
    }

    public static void main(String[] args) {
        findLongestWord();
    }
}
