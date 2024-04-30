package src.labs.lab05;
import java.util.Scanner;

public class Main5 {
    //Задание 5
    public static String reverseWords(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder reversedSentence = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }

        return reversedSentence.toString().trim();
    }

    public static void inputReverse() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String sentence = scanner.nextLine();

        System.out.println("Инвертированная строка:");
        System.out.println(reverseWords(sentence));

        scanner.close();
    }

    public static void main(String[] args) {
        inputReverse();
    }
}
