package Inheritance;

public class Dog extends Animal {

    // Creating fields of Dog class
    private String earShape;
    private String tailShape;
    
    // Constructo of Dog class with super() keyword at the first line to call the constructor of the parent class, Animal
    public Dog() {
        super("Mutt", "Big", 50); 
    }

    public Dog(String earShape, String tailShape) {
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public Dog (String type, double weight) {
        this(type, weight, "Perky", "Curled"); 
        // "this" keyword indicates it is calling a Dog class constructor instead of Animal class constructor. 'super' keyword is for calling parent class constructor
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight); // Removed size from parameter. derive the size of the Dog object depending on the weight
        this.earShape = earShape;
        this.tailShape = tailShape;
    }


    // Methods/ Behaviours
    public void makeNoise() {
        // This method overrides a superclass method as it has the same signature
        // This change the behavious of all Dog objects
        if (type == "Wolf") {
//          type shows error because type has a private access in Animal class
//          no error after changing fields from private to protected
            System.out.print("OW WOOOOOOOO! ");
        }
        bark();
        System.out.println();
    }

    private void bark() {
        // Set to private as will be called from the move method
        System.out.print("WOOF");
    }   
    
    private void run() {
        // Set to private as will be called from the move method
        System.out.println("Dog running");
    } 

    private void walk() {
        // Set to private as will be called from the move method
        System.out.println("Dog walking");
    } 

    private void wagTail() {
        // Set to private as will be called from the move method
        System.out.println("Dog wags tail");
    } 

    @Override
    public String toString() {
        return "Dog [earShape = " + earShape + ", tailShape = " + tailShape + "] " + super.toString(); // similar to using 'this' keyword and it is for calling super class's method
    }
    
} // End of Dog class
