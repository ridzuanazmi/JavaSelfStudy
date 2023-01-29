package ConstructorChallenge1;

public class Customer {
    private String name;
    private String email;
    private double creditLimit;
    
    // Getters
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public double getCreditLimit() {
        return creditLimit;
    }
    
    // Constructors
    public Customer () {
        this("Unknown", "Unknown email"); // Will call a constructor with 2 parameters
    }

    public Customer (String name, String email) {
        this(name, email, 1000.0); // Set credit limit default to 1000.0
    }

    public Customer(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

} // End of Customer class
