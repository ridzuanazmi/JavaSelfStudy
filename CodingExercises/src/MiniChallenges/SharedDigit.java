package MiniChallenges;

/*
Write a method named hasSharedDigit with two parameters of type int. 
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.
 */

public class SharedDigit {
    
    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12, 23)); // Return true
        System.out.println(hasSharedDigit(-12, 23)); // Return false
        System.out.println(hasSharedDigit(12, 82)); // Return true
        
    } // End of main

    public static boolean hasSharedDigit(int number1, int number2) {
        
        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {
            return false;
        }

        boolean checkNumber = false;
        while (number1 > 0 ) {
            int digit1 = number1 % 10;

            while (number2 > 0) {

                int digit2 = number2 % 10;
                if (digit1 == digit2) {
                    checkNumber = true;
                } // End if loop
                number2 /= 10;

            } // End while loop 1.1

            number1 /= 10;

        } // End while loop 1

        return checkNumber;

    } // End of hasSharedDigit
}
