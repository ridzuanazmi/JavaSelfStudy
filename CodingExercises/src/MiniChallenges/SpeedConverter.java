package MiniChallenges;

/*
 * Converts km/h into mph and prints out results
 */

import java.io.Console;

public class SpeedConverter {
    
    public static void main(String[] args) {

        Console cons = System.console();
        String value = cons.readLine("What is the speed in km/h? ");
        Double kmh = Double.parseDouble(value);
        
        printConversion(kmh);
        
    } // End of main

    public static long toMilesPerHour (double kilometersPerHour) {

        long mph = 0;
        if (kilometersPerHour < 0) {
            mph = -1;
        } else {
            mph = (long)(kilometersPerHour * 0.6215); // Casting double to long
        }

        return mph;

    } // End of toMilesPerHour

    public static void printConversion (double kilometersPerHour) {

        double mph = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + " km/h = " + Math.round(mph) + " mi/h");
        /*
        double mph;
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            mph = kilometersPerHour * 0.6214; 
            System.out.println(kilometersPerHour + " km/h = " + Math.round(mph) + " mi/h");
        }
        */

    }// End of printConversion
}
