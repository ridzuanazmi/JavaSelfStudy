package MiniChallenges;

/*
 * Checks if the number is odd and add all the odd number from a range specified
 */

public class SumOdd {
    
    public static void main(String[] args) {

        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        
    } // End of main

    public static boolean isOdd(int number) {

        if (number < 1) {
            return false;
        }

        if ((number % 2 == 1)) {
            return true; // if number is odd, the remainder is 1 if divided by 2
        }else {
            return false;
        }
        
    } // End of isOdd

    public static int sumOdd(int start, int end) {

        if (end < start || start < 1 || end < 1) {
            System.out.println("Invalid start and/or end value");
            return -1;
        }
        
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }

        return sum;
        
    } // End of sumOdd
    
}
