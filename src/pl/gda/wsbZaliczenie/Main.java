package pl.gda.wsbZaliczenie;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("GKW 50012","KL1Y12574UH33","Black",10000,7.5,70,210000,90,5);
        Car car2 = new Car("GD 50014","B1U339447481J","Blue",20099,10.5,90,180000,120,2);

        Truck truck1 = new Truck("WWE 48722","V5H935377348", "Silver", 90000,35,1000,1400000,2000,4000);
        Truck truck2 = new Truck("WWE 66321","WH1UW9839238","Yellow",450000,24,1200,540000,1500,8000);

        Motorcycle motorcycle1 = new Motorcycle("GLS 30234","KD0234109WW3", "Black",14000,6,24,44000,40);
        Motorcycle motorcycle2 = new Motorcycle("GKW 333233","FJ95679J493","Yellow",55000,3,35,56700,50);

        System.out.println("-----------Zadanie 6 Jedz i tankuj-----------");
        car1.drive();
        car1.refuel();
    }
}
