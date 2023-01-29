package SuperThis;

public class Main {
    
    public static void main(String[] args) {
        
        Test value = new Test();
        System.out.println("x = " + value.displayX());
        System.out.println("y = " + value.displayY());
        System.out.println("a = " + value.displayA());
        System.out.println("b = " + value.displayB());
        System.out.println("");

        Test value2 = new Test(1, 2, 3, 4);
        System.out.println("x = " + value2.displayX());
        System.out.println("y = " + value2.displayY());
        System.out.println("a = " + value2.displayA());
        System.out.println("b = " + value2.displayB());
        System.out.println("");

        Test value3 = new Test(5, 6);
        System.out.println("x = " + value3.displayX());
        System.out.println("y = " + value3.displayY());
        System.out.println("a = " + value3.displayA());
        System.out.println("b = " + value3.displayB());

    } // End of main
}
