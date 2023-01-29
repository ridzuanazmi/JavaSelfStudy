package PolymorphismChallenge1;

public class Car {
    // field
    private String description;

    // constructor
    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Car -> start engine");
    }

    public void drive() {
        this.runEngine();
        System.out.println("Car -> driving type is " + getClass().getSimpleName());
    }

    protected void runEngine() {
        System.out.println("car -> run engine");
    }

} // end of Car class

class GasPoweredCar extends Car {
    // field
    private double avgKmPerLitre;
    private int cylinders;

    // constructor
    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, ready!%n",
        cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n", 
        avgKmPerLitre);
    }    
    
} // end of GasPoweredcar class


class ElectricCar extends Car {
    // fields
    private double avgKmperCharge;
    private int batterySize;

    // constructor
    public ElectricCar(String description, int avgKmperCharge, int batterySize) {
        super(description);
        this.avgKmperCharge = avgKmperCharge;
        batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf(" BEV -> switch %d kWh battery on, Ready! %n", 
        batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("BEV -> usage under the average: %.2f %n",
        avgKmperCharge);
    }   

} // end of ElectricCar class

class Hybridcar extends Car {
    // fields
    private double avgKmPerLitre; 
    private int batterySize;
    private int cylinders;

    // constructor
    public Hybridcar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("HybridCar -> All %d cylinders are fired up and %d" +
        "kWh battery on, ready!%n",cylinders, batterySize);
    }

    @Override
    protected void runEngine() {
         System.out.printf("HybridCar -> usage exceeds the average: %.2f %n", 
        avgKmPerLitre);
    }   
    
} // end of Hybridcar class

