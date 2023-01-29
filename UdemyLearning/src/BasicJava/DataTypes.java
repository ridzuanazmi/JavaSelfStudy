package BasicJava;

public class DataTypes {

    public static void main(String[] args) {

        /* int is a primitive data type
         * Integer is a wrapper class of int and it has elements such as MIN_VALUE which shows the minimum value
         * that can be stored in an int
         */
        int minIntValue = Integer.MIN_VALUE;
        System.out.println(minIntValue);

        int maxIntValue = Integer.MAX_VALUE;
        System.out.println(maxIntValue);

        System.out.printf("the sum of the min and max value: %d\n", minIntValue + maxIntValue);
        /* We can declare multiple variables in one line with the same data type as demostrated below
         * seperated by comma and end the line with a ;
         */
        int testValue = Integer.MAX_VALUE, testvalue2 = Integer.MIN_VALUE , testValue3 = 45896;
        System.out.printf("Max value is: %d and min value is: %d\n", testValue, testvalue2, testValue3 );

        System.out.println("----------- Exercise 1 -----------");
        
        byte byte1 = 10;
        short short1 = 20;
        int int1 = 50;
        long long1 = 50000 + 10 * (byte1 + short1 + int1);

        System.out.printf("The value of long is: %s\n", long1);
        System.out.println("-------------- End ---------------");

        /* Float is used to use exact/real numbers with decimal points
         * Int is more for whole numbers
         * Double data types are java's default type for real numbers
         * best to stick to double than a float if you dont want too exact
        */
        // float float1 = 5.0; <- will cause an error as java could not convert double to a float with this
        float float1 = 5.0f; // <- Insert 'f' at the end
        double double1 = 5.0;

        float myFloatvalue = (float) 5.25; // Casting myFloatValue from a double into a float
        float myFloatValue1 = 5.25f; // This is a better way instead of explicitly cast it
        float myFloatValue2 = 5.26962121f;

        char myChar1 = 'D'; // <- char data types must be used with '_'
        char myChar2 = '\u6088'; // <- Using a code from unicode table assigned to a character with a "\ u"

    }
}