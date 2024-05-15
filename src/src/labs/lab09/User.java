package src.labs.lab09;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return name.toLowerCase().hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return name.equalsIgnoreCase(user.name);
    }

    private static int generateRandomScore() {
        Random random = new Random();
        return random.nextInt(100000);
    }

    private static User findUser(Map<User, Integer> scoresMap, String name) {
        for (User user : scoresMap.keySet()) {
            if (user.getName().equalsIgnoreCase(name)) {
                return user;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        Map<User, Integer> scoresMap = new HashMap<>();
        scoresMap.put(new User("Name1"), generateRandomScore());
        scoresMap.put(new User("Name2"), generateRandomScore());
        scoresMap.put(new User("Name3"), generateRandomScore());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        User user = findUser(scoresMap, name);
        if (user != null) {
            System.out.println("User " + name + " has " + scoresMap.get(user) + " points.");
        } else {
            System.out.println("User with name " + name + " not found.");
        }
        scanner.close();
    }
}
