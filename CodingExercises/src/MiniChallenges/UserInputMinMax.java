package MiniChallenges;

import java.util.Scanner;

/*
Create an endless loop which exits when user inputs a char
1) Prompts user to enter a number, or any char to quit
2) Validates if the user input is a number; int or double
3) If it's not a number then exits the loop
4) Keep track of min and max value entered
*/

public class UserInputMinMax {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0, max = 0;
        
        while (true) {
            System.out.print("Enter a number or any char to quit: ");
            String input = scanner.nextLine();

            try {
                int num = Integer.parseInt(input);
                if (num < min) {
                    min = num;
                } else if (num > max) {
                    max = num;
                }
            } catch (NumberFormatException nfe) {
                // input is not a number
                System.out.println("Entered an invalid number. Program will exit");
                break;
            }
        }
        System.out.println("Minimum value entered: " + min);
        System.out.println("Maximum value entered: " + max);

    } // End of main
}
