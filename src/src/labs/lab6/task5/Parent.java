package src.labs.lab6.task5;

import java.util.Scanner;

abstract class Parent {
    public int getAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваш возраст: ");
        return scanner.nextInt();
    }

    public abstract String getName();
}
