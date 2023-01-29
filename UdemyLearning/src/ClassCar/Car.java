package ClassCar;

public class Car {

//  Create 5 fields that describes the class. they are not called variables as because they are defined in a class
    private String make = "Tesla";
    private String model = "3 Series";
    private String colour = "White";
    private int door = 4;
    private boolean isConvertable = false ;

    // Setters and getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getDoor() {
        return door;
    }

    public boolean isConvertable() {
        return isConvertable;
    }

/*  Need to be specific to which one to update.
    The setter below, we want to update 'private String make' make with the contents of the parameter that was passed in the setter method
    We use a keyword 'this'. this.make updates the 'make' attributes of a car useing the set method instead of accessing directly. */

    public void setMake(String make) {
//      Let's add some validation on setMake
        if (make == null) {
            make = "Unknown";
        }
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake) {
            case "porche" -> this.make = make;
            case "holden", "tesla" -> this.make = make;            
            default -> {
                this.make = "Unsupported";
            }
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public void setConvertable(boolean isConvertable) {
        this.isConvertable = isConvertable;
    }

    // Method
    public void describeCar() {
        System.out.println(door + "-Door " + colour + " " + make + " " + model + " " + (isConvertable ? "Convertible" : ""));
    }

} // End of Car

