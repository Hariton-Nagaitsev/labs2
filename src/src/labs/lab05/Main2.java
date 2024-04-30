package src.labs.lab05;
import java.util.Scanner;

public class Main2 {
    //Задание 2

    public static boolean palindrome(String word) {
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void checkPalindrome() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слово:");
        String word = scanner.nextLine();

        if (palindrome(word)) {
            System.out.println(word + " - это палиндром.");
        } else {
            System.out.println(word + " - это не палиндром.");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        checkPalindrome();
    }
}
