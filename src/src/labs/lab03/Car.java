package src.labs.lab03;

public class Car {
    private String color;
    private String name;
    private double weight;

    public Car() {
    }
    public Car(String color) {
        this.color = color;
    }
    public Car(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }
    public void printCarDetails() {
        System.out.println("Car Name: " + name);
        System.out.println("Car Color: " + color);
        System.out.println("Car Weight: " + weight + " kg");
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

