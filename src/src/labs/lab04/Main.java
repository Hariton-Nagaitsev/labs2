package src.labs.lab04;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Часть 1, задание 1
        printOddNumbers();

        // Часть 1, задание 2
        printDivisibleNumbers();

        // Часть 1, задание 3
        checkSumOfThreeNumbers();

        // Часть 1, задание 4
        checkOrderOfNumbers();

        // Часть 1, задание 5
        checkArrayForThree();

        // Часть 1, задание 6
        checkArrayForOneOrThree();
    }

    // Метод для печати нечетных чисел от 1 до 99
    public static void printOddNumbers() {
        System.out.println("---------------------------");
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    // Метод для печати чисел, которые делятся на 3 или на 5
    public static void printDivisibleNumbers() {
        System.out.println("---------------------------");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Делится на 3 и на 5: " + i);
            } else if (i % 3 == 0) {
                System.out.println("Делится на 3: " + i);
            } else if (i % 5 == 0) {
                System.out.println("Делится на 5: " + i);
            }
        }
    }

    // Метод для проверки суммы трех чисел
    public static void checkSumOfThreeNumbers() {
        System.out.println("---------------------------");
        Scanner scanner = new Scanner(System.in);
        boolean continueInput = true;

        while (continueInput) {
            System.out.println("Введите первое число: ");
            int number1 = scanner.nextInt();
            System.out.println("Введите второе число: ");
            int number2 = scanner.nextInt();
            System.out.println("Введите третье число: ");
            int number3 = scanner.nextInt();

            boolean result = number1 + number2 == number3;
            System.out.println("Результат: " + result);

            System.out.println("Продолжить? (true/false): ");
            String input = scanner.next();
            continueInput = Boolean.parseBoolean(input);
        }
    }

    // Метод для проверки порядка чисел
    public static void checkOrderOfNumbers() {
        System.out.println("---------------------------");
        Scanner scanner = new Scanner(System.in);
        boolean continueInput = true;

        while (continueInput) {
            System.out.println("Введите первое число: ");
            int number1 = scanner.nextInt();
            System.out.println("Введите второе число: ");
            int number2 = scanner.nextInt();
            System.out.println("Введите третье число: ");
            int number3 = scanner.nextInt();

            boolean result = number2 > number1 && number3 > number2;
            System.out.println("Результат: " + result);

            System.out.println("Продолжить? (true/false): ");
            String input = scanner.next();
            continueInput = Boolean.parseBoolean(input);
        }
    }

    // Метод для проверки массива на наличие тройки в начале или конце
    public static void checkArrayForThree() {
        System.out.println("---------------------------");
        int[] array1 = {3, -3, 7, 4, 5, 4, 3};
        int[] array2 = {1, 2, 1, 4, 5, 3, 8};

        boolean result1 = array1.length >= 2 && (array1[0] == 3 || array1[array1.length - 1] == 3);
        System.out.println("array1 = " + Arrays.toString(array1) + "\n" + result1);

        boolean result2 = array2.length >= 2 && (array2[0] == 3 || array2[array2.length - 1] == 3);
        System.out.println("array2 = " + Arrays.toString(array2) + "\n" + result2);
    }

    // Метод для проверки массива на наличие единицы или тройки
    public static void checkArrayForOneOrThree() {
        System.out.println("---------------------------");
        int[] array = {1, -3, 7, 4, 5, 4, 3};
        int[] array3 = {0, -3, 7, 4, 5, 4, 5};

        boolean result = checkArrayForValue(array, 1) || checkArrayForValue(array, 3);
        System.out.println(result);

        result = checkArrayForValue(array3, 1) || checkArrayForValue(array3, 3);
        System.out.println(result);
        System.out.println("---------------------------");
    }

    // Метод для проверки наличия значения в массиве
    public static boolean checkArrayForValue(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }
}