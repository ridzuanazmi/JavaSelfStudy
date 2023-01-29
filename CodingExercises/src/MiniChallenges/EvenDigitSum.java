package MiniChallenges;

/*
Write a method named getEvenDigitSum with one parameter of type int called number. 
The method should return the sum of the even digits within the number. 
If the number is negative, the method should return -1 to indicate an invalid value.
*/

public class EvenDigitSum {
    
    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(123456789));
        
    } // End of main

    public static int getEvenDigitSum(int number) {
        
        if (number < 0) {
            return -1;
        } 

        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            } // End if loop
            number /= 10;
        } // End while loop

        return sum;

    } // End of getEvenDigitSum
}
