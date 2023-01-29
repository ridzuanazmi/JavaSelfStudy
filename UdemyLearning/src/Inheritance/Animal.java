package Inheritance;

public class Animal {
    
    // Field instance of Animal class
    protected String type; 
//  protected means any class that is a subclass and in the same package can access this field
    private String size;
    private double weight;

    // Constructors
    public Animal() {

    }

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }
    // toString() method. It will call Dog.toString method when an animal instance of a Dog.
    @Override
    public String toString() {
        return "Animal [type = " + type + ", size = " + size + ", weight = " + weight + "]";
    }

    // Methods of Animal class
    public void move(String speed) {
        System.out.println(type + " moves " + speed);
    }

    public void makeNoise() {
        System.out.println(type + " makes some kind of noise");
    }

}
