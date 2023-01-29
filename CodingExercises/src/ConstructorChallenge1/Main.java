package ConstructorChallenge1;

/*
Tinkering with this() in constructor
 */

public class Main {
    
    public static void main(String[] args) {

        Customer firstCustomer = new Customer(); // Calls the constructor with no parameters set
        System.out.println(firstCustomer.getEmail());
        System.out.println(firstCustomer.getName());    
        System.out.println(firstCustomer.getCreditLimit());
        System.out.println("----------------------------------------------------------------");        

        Customer secondCustomer = new Customer("Tim Cook", "tim@cook.com", 50000.0); // Calls the constructor with 3 parameters
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getEmail());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println("----------------------------------------------------------------");

        Customer thirdCustomer = new Customer("Bill Gates", "bill@gates.com"); // Calls the constructor with 2 parameters
        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getEmail());
        System.out.println(thirdCustomer.getCreditLimit());
        
        
    } // End of main
}
