package MiniChallenges;

/*
    Write a method called isPalindrome with one int parameter called number.
    The method needs to return a boolean.
    It should return true if the number is a palindrome number otherwise it should return false. 
 */

public class NumberPalindrome {
    
    public static void main(String[] args) {

        System.out.println(isPalindrome(12321)); // Returns true
        System.out.println(isPalindrome(123)); // Returns false
        
    } // End of main

    public static boolean isPalindrome(int number) {
        
        int copyNumber = number;
        int reverseNumber = 0; // revNumber is to store the reverse of the number
        /*
            Extracts the digit from the number, reverses it and stores in the reverseNumber variable
            Compares the original number and the reverseNumber and return true if they are equal
         */
        while (copyNumber > 0) { // loop repeat the process until copynumber = 0

            int digit = copyNumber % 10; // get the digit in the ones place
            reverseNumber = reverseNumber * 10 + digit; // stores digit in the reverseNumber
            copyNumber /= 10; // divides the number by 10 to get the next digit

        }

        return (number == reverseNumber);

    } // End of isPalindrome
}
