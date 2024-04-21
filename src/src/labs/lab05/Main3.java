package src.labs.lab05;
import java.util.Scanner;

public class Main3 {
    //Задание 3

    public static String censorText(String text) {
        return text.replaceAll("\\bбяка\\b", "[вырезано цензурой]");
    }

    public static void censor() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст:");
        String text = scanner.nextLine();

        String censoredText = censorText(text);
        System.out.println("Отредактированный текст:");
        System.out.println(censoredText);

        scanner.close();
    }

    public static void main(String[] args) {
        censor();
    }
}
