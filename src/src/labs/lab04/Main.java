package src.labs.lab04;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //Часть 1, задание 1
        System.out.println("---------------------------");
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        //Часть 1, задание 2
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
        //Часть 1, задание 3
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

            boolean result;
            if (number1 + number2 == number3) {
                result = true;
                System.out.println("Результат: " + result);
            } else {
                result = false;
                System.out.println("Результат: " + result);
            }

            System.out.println("Продолжить? (true/false): ");
            String input = scanner.next();
            continueInput = Boolean.parseBoolean(input);
        }
        //Часть 1, задание 4
        System.out.println("---------------------------");
        //Scanner scanner = new Scanner(System.in);
        boolean continueInput1 = true;

        while (continueInput1) {
            System.out.println("Введите первое число: ");
            int number1 = scanner.nextInt();
            System.out.println("Введите второе число: ");
            int number2 = scanner.nextInt();
            System.out.println("Введите третье число: ");
            int number3 = scanner.nextInt();

            boolean result;
            if (number2 > number1 && number3 > number2) {
                result = true;
                System.out.println("Результат: " + result);
            } else {
                result = false;
                System.out.println("Результат: " + result);
            }

            System.out.println("Продолжить? (true/false): ");
            String input = scanner.next();
            continueInput1 = Boolean.parseBoolean(input);
        }
        //Часть 1, задание 5
        System.out.println("---------------------------");
        int[] array1 = {3, -3, 7, 4, 5, 4, 3};
        int[] array2 = {1, 2, 1, 4, 5, 3, 8};

        boolean result1;
        boolean result2;

        if (array1.length >= 2 && (array1[0] == 3 || array1[array1.length - 1] == 3)) {
            result1 = true;
            System.out.println("array1 = " + Arrays.toString(array1) + "\n" + result1);
        } else {
            result1 = false;
            System.out.println("array1 = " + Arrays.toString(array1) + "\n" + result1);
        }

        if (array2.length >= 2 && (array2[0] == 3 || array2[array2.length - 1] == 3)) {
            result2 = true;
            System.out.println("array2 = " + Arrays.toString(array2) + "\n" + result2);
        } else {
            result2 = false;
            System.out.println("array2 = " + Arrays.toString(array2) + "\n" + result2);
        }
        //Часть 1, задание 6
        System.out.println("---------------------------");
        int[] array = {1, -3, 7, 4, 5, 4, 3};
        int[] array3 = {0, -3, 7, 4, 5, 4, 5};
        boolean result = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1 || array[i] == 3) {
                result = true;
                break;
            }
        }
        System.out.println(result);
        result = false;

        for (int i = 0; i < array3.length; i++) {
            if (array3[i] == 1 || array3[i] == 3) {
                result = true;
                break;
            }
        }
        System.out.println(result);
        System.out.println("---------------------------");
    }
}