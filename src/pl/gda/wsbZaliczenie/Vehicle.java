package pl.gda.wsbZaliczenie;

public abstract class Vehicle {
    protected String registrationNumber;
    protected String vinNumber;
    protected String color;
    protected double price;
    protected double fuelConsumption;
    protected double tankCondition;
    protected double tankCapacity;
    protected double odometer;


    public Vehicle(String registrationNumber, String vinNumber, String color, double price,
                   double fuelConsumption, double tankCondition, double odometer, double tankCapacity) {
        this.registrationNumber = registrationNumber;
        this.vinNumber = vinNumber;
        this.color = color;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.tankCondition = tankCondition;
        this.odometer = odometer;
        this.tankCapacity = tankCapacity;
    }
}