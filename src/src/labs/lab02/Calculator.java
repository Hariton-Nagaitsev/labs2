package src.labs.lab02;

public class Calculator {
    //Сумма
    public int sum(int a, int b){
        return a + b;
    }
    public double sum(double a, double b){
        return a + b;
    }
    public long sum(long a, long b){
        return a + b;
    }
    // Деление
    public double divide(double a, double b) {
        if (b == 0) throw new IllegalArgumentException("Делитель не может быть равен нулю");
        return a / b;
    }

    public long divide(long a, long b) {
        if (b == 0) throw new IllegalArgumentException("Делитель не может быть равен нулю");
        return a / b;
    }

    public int divide(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Делитель не может быть равен нулю");
        return a / b;
    }

    // Умножение
    public double multiply(double a, double b) {
        return a * b;
    }

    public long multiply(long a, long b) {
        return a * b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    // Вычитание
    public double subtract(double a, double b) {
        return a - b;
    }

    public long subtract(long a, long b) {
        return a - b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}
