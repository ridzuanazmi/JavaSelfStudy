package InnerClass;

import java.util.ArrayList;

public class Gearbox {
    // fields of Gearbox outer class 
    private ArrayList<Gear> gears; 
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    // constructor of Gearbox outer class
    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
    }

    // methods of Gearbox outer class
    public void operateClutch(boolean in) {
        this.clutchIsIn = in;

    }

    public void addGear(int number, double ratio) {
        if (number > 0 && number <= maxGears) {
            this.gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int newGear) {
        if (newGear >= 0 && (newGear < this.gears.size() && this.clutchIsIn)) {
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected");
        } else {
            System.out.println("Gear Grind!!");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs) {
        if (clutchIsIn) {
            System.out.println("Scream!!!");
            return 0.0;
        }
        return revs * gears.get(currentGear).getRatio();
    }

    // create a class within a class AKA inner class
    // Instances of an inner class have access to all methods and fields of
    // the outer class, even private ones
    private class Gear {
        private int gearNumber; // shadowing gearNumber of the outer class and not good practise
        private double ratio;

        public double getRatio() {
            return ratio;
        }

        // constructor for Gear inner class
        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber; // this.gearNumber is referring to the inner class
            this.ratio = ratio;
        }

        // method of Gear inner class
        public double driveSpeed(int revs) {
            return revs * (this.ratio);
        }
        
    } // end of Gear inner class
} // end of Gearbox class
