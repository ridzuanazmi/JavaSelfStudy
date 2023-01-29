package MiniChallenges;

/*
 * Converts minutes into years and days
 */

public class MinutesCalculation {
    
    public static void main(String[] args) {

        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        
    } // End of main

    public static void printYearsAndDays(long minutes) {
        
        if (minutes < 0) {
            System.out.println("Invalid number");
            return;
        }

        long year = minutes / 525600; // Calculate the amount of years
        System.out.println("The amount of year is: " + year);
        long remainingDays = (minutes % 525600) / 1440;
        System.out.println("The amount of day is: " + remainingDays);

    } // End of printYearsAndDays
}
