package pl.gda.wsbZaliczenie;

class Car extends Vehicle implements InterfaceClass{
    protected int numberOfDoors;
    public Car(String registrationNumber, String vinNumber, String color, double price, double fuelConsumption,
               double tankCondition, double odometer, double tankCapacity, int numberOfDoors) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, tankCondition, odometer,tankCapacity);
        this.numberOfDoors = numberOfDoors;
    }
}
