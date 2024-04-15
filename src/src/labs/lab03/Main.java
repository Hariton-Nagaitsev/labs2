package src.labs.lab03;

public class Main {
    public static void main(String[] args) {
        //задание 2

        Car car1 = new Car("Red");
        car1.setName("Toyota");
        car1.setWeight(1200);

        Car car2 = new Car("Blue", 1500);
        car2.setName("BMW");

        System.out.println("Car 1 Details:");
        car1.printCarDetails();
        System.out.println();
        System.out.println("Car 2 Details:");
        car2.printCarDetails();
    }
}
