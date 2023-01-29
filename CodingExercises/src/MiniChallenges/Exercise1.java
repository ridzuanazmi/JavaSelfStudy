package MiniChallenges;

/*
 * Check if the number is a positive, negative or zero
 */

import java.io.Console;

public class Exercise1 {
    
    public static void main(String[] args) {

        Console cons = System.console();
        String s = cons.readLine("Enter any number: ");
        Integer num = Integer.parseInt(s);
        
        // Call method with argument to be passed to the method
        checkNumber(num);

    }// End of main

    public static void checkNumber(int number) {

        if (number > 0) {
            System.out.println(number + " is positive");
        } else if (number < 0){
            System.out.println(number + " is negative");
        } else {
            System.out.println(number + " is equal to 0");
        }

    }// End of checkNumber

}
