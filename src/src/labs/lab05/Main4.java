package src.labs.lab05;
import java.util.Scanner;

public class Main4 {
    //Задание 4
    public static int countOccurrences(String text, String pattern) {
        int count = 0;
        int index = 0;
        while ((index = text.indexOf(pattern, index)) != -1) {
            count++;
            index += pattern.length();
        }
        return count;
    }

    public static void findOccurrences() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку:");
        String text1 = scanner.nextLine();

        System.out.println("Введите вторую строку (подстроку):");
        String text2 = scanner.nextLine();

        int occurrences = countOccurrences(text1, text2);
        System.out.println("Количество вхождений подстроки в строку: " + occurrences);

        scanner.close();
    }

    public static void main(String[] args) {
        findOccurrences();
    }
}
