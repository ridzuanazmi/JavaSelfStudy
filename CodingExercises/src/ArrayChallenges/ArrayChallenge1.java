package ArrayChallenges;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/*
 * Write a program that sorts the arrays in a descending order
 */

public class ArrayChallenge1 {

    public static void main(String[] args) {

        int[] intRandomArray = getRandomIntArray(5);
        Integer[] integerRandomArray = getRandomIntegerArray(5);

        // sorting int array in descending order
        int[] intDescending = sortIntDescending(intRandomArray);
        System.out.println("Int array after sorting in descending: " + 
        Arrays.toString(intDescending) + "\n");

        // Sorting integer array using comparator in descending order
        Integer[] integerDescending = sortIntegerDescending(integerRandomArray);
        System.out.println("Integer array after sorting in descending: " +
        Arrays.toString(integerDescending));

    } // end of main

    public static int[] getRandomIntArray(int len) {

        Random random = new Random();
        int[] s1 = new int[len];

        for (int i = 0; i < len; i++) {
            s1[i] = random.nextInt(1000);
        }
        return s1;
    } // end of getrandomArray

    public static Integer[] getRandomIntegerArray(int len) {

        Random random = new Random();
        Integer[] s1 = new Integer[len];

        for (int i = 0; i < len; i++) {
            s1[i] = random.nextInt(1000);
        }
        return s1;
    } // end of getRandomIntegerArray

    private static int[] sortIntDescending(int[] intRandomArray) {

        System.out.println("int array before sorting: " + 
        Arrays.toString(intRandomArray));
        int[] intSorted = Arrays.copyOf(intRandomArray, intRandomArray.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < intSorted.length - 1; i++) {
                if (intSorted[i] < intSorted[i + 1]) {
                    temp = intSorted[i]; // remove int[i]
                    intSorted[i] = intSorted[i + 1]; // replace int[i] with int [i+1]
                    intSorted[i + 1] = temp; // remove int[i+1] temporary
                    flag = true;
                }
            }
        }

        return intSorted;

    } // end of sortInt method

    private static Integer[] sortIntegerDescending(Integer[] integerRandomArray) {

        System.out.println("Integer array before sorting: " + 
        Arrays.toString(integerRandomArray));
        // Sort the array in a descending order using java.util.comparator
        Arrays.sort(integerRandomArray, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return b.compareTo(a);
            }
        });

        return integerRandomArray;

    } // end of sortIntegers method

}
