package MiniChallenges;

import java.util.Scanner;

/*
Read 5 inputs from the console/terminal, entered by the user and print the sum of those numbers
*/

public class InputReader {
    
    public static void main(String[] args) {        
        /*
        The reason why the counter variable is still incrementing is because 
        the counter variable is defined and initialized outside of the try-catch block,
        and is incremented within the for loop, regardless of whether an exception is thrown or not.
         */
        Scanner scanner = new Scanner(System.in); // Instantiate scanner object from Scanner class
//      int sum = 0;
        double sum = 0.0;
        int counter = 1;
        do {
            System.out.println("Enter the number #" + counter + ":");
            String s = scanner.nextLine();
            try {
//              int num = Integer.parseInt(s);
                double num = Double.parseDouble(s);
                sum += num;
                counter++;
            } catch (NumberFormatException nfe) {
                // TODO: handle exception
                System.out.println("Invalid number. Re-enter a valid number please");
            } 
        } while (counter <= 5); // End of do-while loop

        System.out.println("The sum of 5 numbers is: " + sum);

    } // End of main


}
