package MiniChallenges;

/*
Write a method named hasSameLastDigit with three parameters of type int. 

Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return false.

The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.
 */

public class LastDigitChecker {
    
    public static void main(String[] args) {

        System.out.println(hasSameLastDigit (41, 22, 71)); // Return true
        System.out.println(hasSameLastDigit (23, 32, 42)); // return true
        System.out.println(hasSameLastDigit (9, 99, 999)); // Return false
        
    } // End of main

    public static boolean hasSameLastDigit(int x, int y, int z) {
        
        if (x < 10 || x > 1000 || y < 10 || y > 1000 || z < 10 || z > 1000) {
            return false;
        }
        
        int digit1 = x % 10;
        int digit2 = y % 10;
        int digit3 = z % 10;

        boolean checklastDigit = false;
        if (digit1 == digit2 || digit2 == digit3 || digit1 == digit3) {
            checklastDigit = true;
        }

        return checklastDigit;

    } // End of hasSameLastDigit
}
