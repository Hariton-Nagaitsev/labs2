package src.labs.lab03;

public class Tree {
    private int age;
    private boolean isAlive;
    private String name;

    public Tree(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tree(int age, boolean isAlive, String name) {
        this.age = age;
        this.isAlive = isAlive;
        this.name = name;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Tree name: " + name);
        System.out.println("Tree age: " + age);
        System.out.println("Is tree alive: " + isAlive);
    }

    public static void main(String[] args) {

        Tree tree1 = new Tree(10, "Oak");
        Tree tree2 = new Tree(20, true, "Pine");
        Tree tree3 = new Tree();

        // Вывод информации о деревьях
        tree1.displayInfo();
        System.out.println();
        tree2.displayInfo();
    }
}
