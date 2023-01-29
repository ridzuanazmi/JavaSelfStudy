package MiniChallenges;

/*
Write a method named sumFirstAndLastDigit with one parameter of type int called number. 
The method needs to find the first and the last digit of the parameter number passed to the method,
using a loop and return the sum of the first and the last digit of that number.
If the number is negative then the method needs to return -1 to indicate an invalid value.
 */

public class FirstAndLastDigitSum {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(252)); // Return 4
        System.out.println(sumFirstAndLastDigit(-6589)); // Return -1
        System.out.println(sumFirstAndLastDigit(5698)); // Return 13
        
    } // End of main

    public static int sumFirstAndLastDigit(int number) {
        
        if (number < 0) {
            return -1;
        }

        int firstDigit = 0;
        int lastDigit = number % 10;

//      Similar to the number palindrome, we edit the while block abit as the last digit is at the iteration where the number / 10 = 0
        while (number > 0) {

            if (number / 10 == 0) {

                lastDigit = number % 10;

            } // End of if loop

            number /= 10;

        } // End of while

        return firstDigit + lastDigit;

    } // End of sumFirstAndLastDigit
}
