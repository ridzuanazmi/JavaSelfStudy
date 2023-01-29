package MiniChallenges;

/*
Write a method called inputThenPrintSumAndAverage that does not have any parameters.

The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.

When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".

XX represents the sum of all entered numbers of type int.
YY represents the calculated average of all numbers of type long.
*/

import java.util.Scanner;

public class UserInputSumAvgCalculator {
    
    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
        
    } // End of main

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, counter = 0;

        while (true) {
            System.out.print("Enter a number or any char to quit: ");
            String input = scanner.nextLine();

            try {
                int num = Integer.parseInt(input);
                sum += num;
                counter++;
                
            } catch (NumberFormatException nfe) {
                // input is not a number
                System.out.println("Entered an invalid number. Program will exit");
                break;
            }
        }
        System.out.println("The sum of numbers entered = " + sum);
        System.out.println("The average of numbers entered =  " + sum / counter);        

    } // End of inputThenPrintSumAndAverage
}
