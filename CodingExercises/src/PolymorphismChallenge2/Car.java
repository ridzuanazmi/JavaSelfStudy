package PolymorphismChallenge2;

public class Car {
    
    // fields
    private boolean engine = true;
    private int cylinders, wheels = 4;
    private String name;

    // constructor
    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }
    
    // methods
    
    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
    
    public void startEngine() {
        System.out.println("Car -> engine is starting");
    }

    public void accelerate() {
        System.out.println("Car -> accelerating");
    }

    public void brake() {
        System.out.println("Car -> braking");
    }

    @Override
    public String toString() {
        return "Car [Name = " + name + " Engine = " + engine + ", Cylinders = " + 
        cylinders + ", Wheels = " + wheels + "]";
    }

} // end of Car class

class Mitsubishi extends Car {
    // constructor
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void accelerate() {
        System.out.println("Mitsubishi -> accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Mitsubishi -> braking");
    }

    @Override
    public void startEngine() {
        System.out.println("Mitsubishi -> engine is starting");
    }    
    
} // end of Mistubishi class

class Holden extends Car {
    // constructor
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void accelerate() {
        System.out.println("Holden -> accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Holden -> braking");
    }

    @Override
    public void startEngine() {
        System.out.println("Holden -> engine is starting");
    }
    
} // end of Mistubishi class

class Ford extends Car {
    // constructor
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void accelerate() {
        System.out.println("Ford -> accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Ford -> braking");
    }

    @Override
    public void startEngine() {
        System.out.println("Ford -> engine is starting");
    }
    
} // end of Mistubishi class
