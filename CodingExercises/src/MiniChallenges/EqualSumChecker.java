package MiniChallenges;

/*
 * Compares 3 inputs and outputs the findings
 */

public class EqualSumChecker {
    
    public static void main(String[] args) {

        System.out.println(hasEqualSum(1, 1, 1));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, -1, 0));
        
    }// End of main

    public static boolean hasEqualSum(int num1, int num2, int num3) {
        
        int sum = num1 + num2;
        boolean check = sum == num3 ? true : false; // Ternary operator

        return check;

    } // End of hasEqualSum
}
