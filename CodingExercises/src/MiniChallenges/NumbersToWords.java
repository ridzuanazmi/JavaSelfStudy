package MiniChallenges;

/*
Write a method called numberToWords with one int parameter named number.
The method should print out the passed number using words for the digits.
If the number is negative, print "Invalid Value".
To print the number as words, follow these steps:

1) Extract the last digit of the given number using the remainder operator. 
    digit = number % 10

2) Convert the value of the digit found in Step 1 into a word. 
   There are 10 possible values for that digit, those being 0, 1, 2, 3, 4, 5, 6, 7, 8, 9. 
   Print the corresponding word for each digit, e.g. print "Zero" if the digit is 0, "One" if the digit is 1, and so on.
    use switch case block

3) Remove the last digit from the number. 
    number = number /10

4) Repeat Steps 2 through 4 until the number is 0.

The logic above is correct, but in its current state, the words will be printed in reverse order. 
For example, if the number is 234, the logic above will produce the output "Four Three Two" instead of "Two Three Four". 
To overcome this problem, write a second method called reverse.

The method reverse should have one int parameter and return the reversed number (int). 
For example, if the number passed is 234, then the reversed number would be 432. 
The method  reverse should also reverse negative numbers.

Use the method reverse within the method numberToWords in order to print the words in the correct order.

Another thing to keep in mind is any reversed number with leading zeroes (e.g. the reversed number for 100 is 001). \
The logic above for the method numberToWords will print "One", but that is incorrect. 
It should print "One Zero Zero". To solve this problem, write a third method called getDigitCount. 

The method getDigitCount should have one int parameter called number and return the count of the digits in that number. 
If the number is negative, return -1 to indicate an invalid value.
For example, if the number has a value of 100, the method getDigitCount should return 3 since the number 100 has 3 digits (1, 0, 0).
 */

public class NumbersToWords {
    
    public static void main(String[] args) {

        System.out.println(getDigitCount(123)); // Should return 3
        System.out.println(getDigitCount(5200)); // Should return 4

        System.out.println("----------------------------------------------");

        System.out.println(reverse(1212)); // Should return 2121
        System.out.println(reverse(1234)); // Should return 4321

        System.out.println("----------------------------------------------");

        numberToWords(123); // Should show One Two Three
        numberToWords(5682); // Should show Five Six Eight Two
        
    } // End of main

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        number = reverse(number); // number is not the reversed number
        int digitCount = getDigitCount(number);
        while (number > 0) {
            int digit = number % 10;
            switch (digit) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
            }
            number = number / 10;
        }
        System.out.println();
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number = number / 10;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int count = 0;
        while (number != 0) {
            count++;
            number = number / 10;
        }
        return count;
    }
}
