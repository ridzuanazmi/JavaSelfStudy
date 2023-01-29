package ArrayChallenges;

import java.io.Console;
import java.util.Arrays;

/*
 * Find the minimum number from user input
 */

public class ArrayChallenge2 {
    
    public static void main(String[] args) {
        
        int[] userInputs = readIntegers();
        System.out.println("User inputs: " + Arrays.toString(userInputs));

        System.out.println("The min value from user input is = " + findMin(userInputs));

    } // end of main

    /*
     * readIntegers reads a comma delimited list of numbers entered entered
     * by users from the console and returns an array containing number entered
     */
    private static int[] readIntegers() {

        Console console = System.console();
        String x = console.readLine("Enter number sperated by comma: ");
        String[] y = x.split(","); // store user inputs into array with element seperated by comma
        int[] inputs = new int[y.length];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = Integer.parseInt(y[i]);
        }
        
        return inputs;

    } // end of readIntegers method

    /*
     * findMin takes array as an argument and returns the min value
     * found in the array
     */
    private static int findMin(int[] array) {

        Arrays.sort(array);

        return array[0];

    } // end of findMin method
}
