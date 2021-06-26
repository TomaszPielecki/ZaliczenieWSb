package pl.gda.wsbZaliczenie;

public class Truck extends Vehicle{
    protected double capacity;
    public Truck(String registrationNumber, String vinNumber, String color, double price, double fuelConsumption, double tankCondition, double odometer, double tankCapacity,double capacity) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, tankCondition, odometer,tankCapacity);
        this.capacity = capacity;

    }
}
