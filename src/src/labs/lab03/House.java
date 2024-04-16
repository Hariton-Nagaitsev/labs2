package src.labs.lab03;

public class House {
    private int floors;
    private int year;
    private String name;

    public void setDetails(int floors, int year, String name) {
        this.floors = floors;
        this.year = year;
        this.name = name;
    }

    public void displayDetails() {
        System.out.println("House Name: " + name);
        System.out.println("Number of Floors: " + floors);
        System.out.println("Year Built: " + year);
        System.out.println("Years since built: " + calculateYearsSinceBuilt());
    }

    private int calculateYearsSinceBuilt() {
        int currentYear = getCurrentYear();
        return currentYear - year;
    }

    private static int getCurrentYear() {
        long millisInSecond = 1000;
        long millisInMinute = 60 * millisInSecond;
        long millisInHour = 60 * millisInMinute;
        long millisInDay = 24 * millisInHour;
        long millisInYear = 365 * millisInDay;

        long currentTimeMillis = System.currentTimeMillis();
        long years = currentTimeMillis / millisInYear;

        return (int) (years + 1970);
    }

    public static void main(String[] args) {

        House house1 = new House();
        House house2 = new House();

        house1.setDetails(2, 2000, "Cozy Cottage");
        house2.setDetails(3, 2015, "Modern Mansion");

        System.out.println("House 1:");
        house1.displayDetails();
        System.out.println();

        System.out.println("House 2:");
        house2.displayDetails();
    }
}

