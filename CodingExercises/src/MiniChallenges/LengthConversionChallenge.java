package MiniChallenges;

/*
 * Converts centimeters into feet and inches 
 */

public class LengthConversionChallenge {

    public static void main(String[] args) {

        System.out.println("5ft, 8inc = " + convertToCentimeters(5, 8) + "cm");
        System.out.println("68in = " + convertToCentimeters(68) + "cm");
        
    } // End of main

    public static double convertToCentimeters(int inches) {
        
        return inches * 2.54;
        
    } // End of convertToCentimeters

    
    public static double convertToCentimeters(int feet, int inches) {
        
        int feetToInches = feet * 12;
        int totalInches = feetToInches + inches;
        return convertToCentimeters(totalInches);
        
    } // End of convertToCentimeters
}