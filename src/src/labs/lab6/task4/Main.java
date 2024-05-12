package src.labs.lab6.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите возраст: ");
        int ageInput = scanner.nextInt();
        Cat cat = new Cat();
        cat.age = ageInput;
        cat.printAgeCat();
    }
}
