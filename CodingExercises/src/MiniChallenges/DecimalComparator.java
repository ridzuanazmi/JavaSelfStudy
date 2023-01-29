package MiniChallenges;

/*
 * Compare the last 3 decimal places of 2 numbers and outputs findings
 */

public class DecimalComparator {
    
    public static void main(String[] args) {
        
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));

    } // End of main

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        int num1Truncated = (int) (num1 * 1000);
        int num2Truncated = (int) (num2 * 1000);
        return num1Truncated == num2Truncated;
    }
}
