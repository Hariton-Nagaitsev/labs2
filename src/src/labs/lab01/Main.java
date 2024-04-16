package src.labs.lab01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //задание 1
        System.out.println("---------------------------");
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");
        //задание 2
        System.out.println("---------------------------");
        double result1 = (46 + 10) * (10 / 3.0);
        double result2 = (29) * (4) * (-15);
        System.out.println("Результат 1 выражения: " + result1 + "\nРезультат 2 выражения: " + result2);
        //задание 3
        System.out.println("---------------------------");
        int number = 100500;
        double result = ((double) number / 10) / 10;
        System.out.println("Значение выражения : " + result);
        //задание 4
        System.out.println("---------------------------");
        double num1 = 3.6;
        double num2 = 4.1;
        double num3 = 5.9;
        double result3 = (num1 * num2 * num3);
        System.out.println("Значение выражения : " + result3);
        //задание 5
        System.out.println("---------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа через пробел");
        String line = scanner.nextLine();
        Scanner lineScanner = new Scanner(line);
        while (lineScanner.hasNext()) {
            if (lineScanner.hasNextInt()) {
                int numbers = lineScanner.nextInt();
                System.out.println(numbers);
            } else {
                System.out.println("Введено не целое число.");
                break;
            }
        }
        lineScanner.close();
        //задание 6
        System.out.println("---------------------------");
        System.out.println("Введите целое число:");
        int b = scanner.nextInt();
        if (b < 0) {
            System.out.println("Отрицательное");
        } else if (b % 2 != 0) {
            System.out.println("Нечетное");
        } else if (b > 100) {
            System.out.println("Выход за пределы диапазона");
        } else {
            System.out.println("Четное");
        }
        System.out.println("---------------------------");
    }
}


