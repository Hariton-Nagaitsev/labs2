package src.labs.lab6.task5;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();

        System.out.println("Имя пользователя: " + child.getName());

        int age = child.getAge();
        System.out.println("Возраст пользователя: " + age);
    }
}
