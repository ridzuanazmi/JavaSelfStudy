package Arrays;

import java.util.Arrays;
import java.util.Random;

public class Arrays2 {
    
    public static void main(String[] args) {

        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));

        Arrays.sort(firstArray); // this method sorts out firstArray
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5); 
        // this method fills the array with 5
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length); 
        // this method makes copies of the array into a new array
        System.out.println(Arrays.toString(fourthArray));

        // binarySearch
        String[] sArray= {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArray); // Sort first
        System.out.println(Arrays.toString(sArray)); // print out sArray
        if (Arrays.binarySearch(sArray, "Mark") >= 0) {
            System.out.println("Found Mark in the list");
        }

        int[] s1 = {1,2,3,4,5};
        int[] s2 = {1,2,3,4,5};

        if (Arrays.equals(s1, s2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are different");
        }

        int[] example = new int[5];
        int[] example2 = example; // will only reference back to example array
        example2[0] = 1;
        System.out.println("After change in example2: " +
        Arrays.toString(example));
        System.out.println("After change in example2: " +
        Arrays.toString(example2));
        // the above example will siplay out changes to BOTH arrays

    }

    private static int[] getRandomArray(int len) {

        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}
