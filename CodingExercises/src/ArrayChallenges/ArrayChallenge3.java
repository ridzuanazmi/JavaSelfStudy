package ArrayChallenges;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayChallenge3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // prompts the user to enter desired array length and will
        // create a random element of array
        System.out.print("Enter desired array length: ");
        int len = scanner.nextInt();
        scanner.close();

        // prints out the array before reversing order
        int[] array = getArray(len);
        System.out.println("Array before reversing: " + Arrays.toString(array));

        // reverses the array with the reverse() method
        // and stores it in a new array. prints out result
        int[] arrayReverse = reverse(array);
        System.out.println("Array after reversing order: " + 
        Arrays.toString(arrayReverse));

    } // end of main

    private static int[] getArray(int len) {

        Random random = new Random();
        int[] x = new int[len];

        for (int i = 0; i < len; i++) {
            x[i] = random.nextInt(1000);
        }

        return x;

    } // end of getArray method

    private static int[] reverse(int[] array) {
        int temp;
        int maxIndex = array.length - 1;
        /*
         * Have to iterate only half the length
         */
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
            System.out.println("---> " + Arrays.toString(array));
        }

        return array;

    } // end of reverse method
}
