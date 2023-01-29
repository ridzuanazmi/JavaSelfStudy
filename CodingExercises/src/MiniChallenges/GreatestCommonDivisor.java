package MiniChallenges;

/*
Write a method named getGreatestCommonDivisor with two parameters of type int named first and second. 
If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
The method should return the greatest common divisor of the two numbers (int).
The greatest common divisor is the largest positive integer that can fully divide each of the integers (i.e. without leaving a remainder).

For example 12 and 30:
12 can be divided by 1, 2, 3, 4, 6, 12
30 can be divided by 1, 2, 3, 5, 6, 10, 15, 30
The greatest common divisor is 6 since both 12 and 30 can be divided by 6, and there is no resulting remainder.
 */

public class GreatestCommonDivisor {
    
    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(25, 15)); // Should return 5
        System.out.println(getGreatestCommonDivisor(12, 30)); // Should return 6
        System.out.println(getGreatestCommonDivisor(9, 18)); // Should return -1 as not within range
        System.out.println(getGreatestCommonDivisor(81, 153)); // Should return 9
        
    } // End of main

    public static int getGreatestCommonDivisor(int first, int second) {
        
        if (first < 10 || second < 10) {
            return -1;
        }

        int commonDivisor = 0;
//      reason to compare first and second values is to choose the lower number as the last divisor
        if (first > second) {
            for (int i = 1; i <= second; i++) {
                if ((first % i == 0) && (second % i == 0)) {
                    commonDivisor = i;
                }
            }
        } else {
            for (int i = 1; i <= first; i++) {
                if ((first % i == 0) && (second % i == 0)) {
                    commonDivisor = i;
                }
            }
        }

        return commonDivisor;

    } // End of getGreatestCommonDivisor
}
