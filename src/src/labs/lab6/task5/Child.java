package src.labs.lab6.task5;

import java.util.Scanner;

class Child extends Parent {
    @Override
    public String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        return scanner.nextLine();
    }
}
