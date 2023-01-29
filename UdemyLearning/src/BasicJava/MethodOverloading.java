package BasicJava;

public class MethodOverloading {
    
    /*
     * Method Overlaoding occurs when a class has multiple methods with the same name but delcared with different arguments
     * Method type, order and number of parameters, in conjunction with the name makes a method signature unique
     */

     public static void main(String[] args) {

        System.out.println("Player has earned "+ calculatePoint(5) + " points");
        System.out.println("Player has earned "+ calculatePoint("steve", 5) + " points");
        
        
     } // End of main

     public static int calculatePoint(int goal) {
        
        System.out.println("Player has scored " + goal + " goals");
        return goal * 1000;


     } // End of calculateScore

     public static int calculatePoint(String name, int goal) {
        
        System.out.println("Player " + name + " has scored " + goal + " goals");
        return goal * 1000;


     } // End of calculateScore
}
