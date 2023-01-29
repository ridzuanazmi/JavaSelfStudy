package BasicJava;

public class TernaryOperator {
    
    public static void main(String[] args) {
        /* Ternary operator
         * Structure is
         * operand1 ? operand2 : operand3 | question mark appears in between operand1 and operand2 and colon appear between operand2 and operand3
         * Test if operand1 is true and if it is it will return operand2, otherwise operand3
         * First condition is always a boolean test but the other operand does not have to be boolean values
         * Think of it as a shortcut to if-else loop
         */

         String makeOfCar = "Volkswagon";
         boolean isDomestic = makeOfCar == "Volkswagon" ? false : true; // If makeOfCar is Volkswagon, it is not domestic
         
         /*
         if (isDomestic) {
            System.out.println("The car is domestic to our country");
         } else {
            System.out.println("The car is not domestic to our country");
         }
         */

         String s = (isDomestic) ? "The car is domestic" : "The car is not domestic"; // Another way ternary operator can be used 
         System.out.println(s);
    }
}
