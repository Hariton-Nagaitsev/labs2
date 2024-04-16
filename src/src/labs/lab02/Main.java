package src.labs.lab02;

public class Main {
    public static void main(String[] args) {
        // задание 1
        System.out.println("---------------------------");
        Calculator calc = new Calculator();

        System.out.println("Сумма: " + calc.sum(5, 3));
        System.out.println("Деление: " + calc.divide(15.0, 2.5));
        System.out.println("Умножение: " + calc.multiply(10L, 4L));
        System.out.println("Вычитание: " + calc.subtract(20, 8));
        //задание 2
        System.out.println("---------------------------");

        Table defaultTable = new Table();
        Table customTable = new Table("Стекло", 150, 75, 70, "Прозрачный");

        System.out.println("Стол без параметров: " + defaultTable);
        System.out.println("Стол с параметрами: " + customTable);
        System.out.println("---------------------------");
    }
}

