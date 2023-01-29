package MiniChallenges;

/*
Calculate the sum of all digits in the number
 */

public class DigitSum {
    
    public static void main(String[] args) {

        System.out.println(sumDigits(525));
        System.out.println(sumDigits(1234));
        System.out.println(sumDigits(-989));
        
        
    } // End of main

    public static int sumDigits(int number) {
        
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        while (number > 9) {
            sum += (number % 10);
            number = number / 10;
        }
        sum += number; // Add in the last digit

        return sum;

    } // End of sumDigits
}
