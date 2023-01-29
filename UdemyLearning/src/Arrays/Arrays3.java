package Arrays;

import java.util.Arrays;

public class Arrays3 {
    /*
     * Two dimensional array AKA matrix
     */

    public static void main(String[] args) {
        
        // initialize 2-d array
        int[][] array = new int[2][3]; // 2 rows and 3 columns
        /*
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
        */

        Object[] anyArray = new Object[3];
        // System.out.println(Arrays.toString(anyArray));

        anyArray[0] = new String[] {"a", "b", "c"};
        System.out.println(Arrays.deepToString(anyArray)); // use deepToString for multi-dimensional array

        anyArray[1] = new String[][] {
                {"1", "2"},
                {"3", "4", "5"},
                {"6", "7", "8", "9"}
        };
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[2] = new int[2][2][2];
        System.out.println(Arrays.deepToString(anyArray));

        for (Object element : anyArray) {
            System.out.println("Element type: " + element.getClass().getSimpleName());
            System.out.println("Element toString(): " + element);
            System.out.println(Arrays.deepToString((Object[]) element)); // print out each element contained in this multidimensional array
        }


    } // end of main
}
