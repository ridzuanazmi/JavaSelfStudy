package Arrays;

import java.util.Arrays;

public class Array1 {

    public static void main(String[] args) {
        
        int[] myIntArray = new int[10]; // start 0 end 9
        myIntArray[5] = 50; // It is at index 6

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);

        int[] firstTen = {1, 2, 3, 4, 5, 6, 7,8,9,10};
        System.out.println("First = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("length of array = " + arrayLength);

        int[] newArray;
        newArray = new int[5]; // initialising an array
        // newArray = {5,4,3,2,1}; this is not allowed 
        // newArray = new int[] {5,4,3,2,1};
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray.length - i;
        }
        // display an array using for loop
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println("");
        // Enhanced for loop, the for each loop to print out an array
        for (int element : newArray) {
            System.out.print(element + " ");
        }
        System.out.println("");
        // Using the java.util.Arrays helper class to print out
        System.out.println(Arrays.toString(newArray));

        String[] road = "You are standing at the end of the road".split(" ");
        for (String iString : road) {
            System.out.println(iString);
        }
    }
}
