package PolymorphismChallenge1;

public class Main {
    
    public static void main(String[] args) {
        Car car = new Car("Skyline GTR-34");
        runRace(car);
        System.out.println(" ");
        Car car2 = new GasPoweredCar("Porsche 911", 
        15, 6);
        runRace(car2);
    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }
}
