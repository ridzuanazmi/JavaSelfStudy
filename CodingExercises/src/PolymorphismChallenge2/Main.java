package PolymorphismChallenge2;

public class Main {
    
    public static void main(String[] args) {
        
        Car honda = new Car(6, "Honda Civic");
        raceMode(honda);

        Mitsubishi lancer = new Mitsubishi(6, "Outlander VRX 4WD");
        raceMode(lancer);

        Holden tera = new Holden(6, "Holden Commodore");
        raceMode(tera);

        Ford mustang = new Ford(8, "Ford Falcon");
        raceMode(mustang);
        
    } // end of main
    
    public static void raceMode(Car car) {
        System.out.println(car);
        car.startEngine();
        car.accelerate();
        car.brake();
    } // end of raceMode

    /*
        Car car = new Car(8, "Base car");
        car.startEngine();
        car.accelerate();
        car.brake();
        
        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        mitsubishi.startEngine();
        mitsubishi.accelerate();
        mitsubishi.brake();
        
        Ford ford = new Ford(6, "Ford Falcon");
        ford.startEngine();
        ford.accelerate();
        ford.brake();
        
        Holden holden = new Holden(6, "Holden Commodore");
        holden.startEngine();
        holden.accelerate();
        holden.brake();
        */
        // this is same as above but add in main method
}
