package src.labs.lab6;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Name1", "LastName1", "Bank1");
        BankEmployee employee = new BankEmployee("Name2", "LastName2", "Bank2");

        System.out.println("Client Information:");
        client.displayInfo();

        System.out.println("\nEmployee Information:");
        employee.displayInfo();
    }
}
