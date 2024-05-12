package src.labs.lab6;

class Truck extends Car {
    private int numWheels;
    private float maxWeight;

    public void newWheels(int numWheels) {
        this.numWheels = numWheels;
        System.out.println("Количество колес: " + numWheels);
    }

    public Truck(int weight, String model, char color, float speed, int numberOfWheels, float maxWeight) {
        super(weight, model, color, speed);
        this.numWheels = numberOfWheels;
        this.maxWeight = maxWeight;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public float getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(float maxWeight) {
        this.maxWeight = maxWeight;
    }
}
