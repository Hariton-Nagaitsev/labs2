package src.labs.lab6;

class Client extends Person implements BankEntity {
    private String bankName;

    public Client(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public void displayInfo() {
        System.out.println("Client Name: " + firstName + " " + lastName);
        System.out.println("Bank Name: " + bankName);
    }
}
