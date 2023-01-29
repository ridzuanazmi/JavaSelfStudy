package Inheritance;

public class Fish extends Animal {
    
    // Fields
    private int fins;
    private int gills;

    // Constructors
    public Fish(String type, double weight, int fins, int gills) {
        super(type, "small", weight);
        this.fins = fins;
        this.gills = gills;
    }

    // Methods/Behaviours
    private void moveMuscles() {
        System.out.println("Muscles moving");
    }
    
    private void moveBackFin() {
        System.out.println("backfin moving");
    }

    @Override
    public void move(String speed) {
        // TODO Auto-generated method stub
        super.move(speed); // calls the constructor from the Animal class
        moveMuscles();
        if (speed == "fast") {
            moveBackFin();
        }
    }

    @Override
    public String toString() {
        return "Fish [fins=" + fins + ", gills=" + gills + "] " + super.toString();
    }    
    
} // End of Fish class
