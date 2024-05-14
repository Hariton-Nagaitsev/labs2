package src.labs.lab07;

public class Airplane {
    public static class Wing {
        private double wingWeight; // Поле для хранения веса крыла

        public Wing(double wingWeight) {
            this.wingWeight = wingWeight;
        }

        public void showWingWeight() {
            System.out.println("Wing weight is " + wingWeight + " kg");
        }
    }

    public static void main(String[] args) {

        Wing wing1 = new Wing(440.1);
        Wing wing2 = new Wing(500.4);

        wing1.showWingWeight();
        wing2.showWingWeight();
    }
}