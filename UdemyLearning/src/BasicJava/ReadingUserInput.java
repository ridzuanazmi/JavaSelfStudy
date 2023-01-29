package BasicJava;

import java.util.Scanner;

public class ReadingUserInput {
    
    public static void main(String[] args) {
        
        int currentYear = 2023;
        getInputFromConsole(currentYear);
        System.out.println(getinputFromScanner(currentYear));
        
        /* String userDateOfBirth = "1994";

        int dateOfBirth = Integer.parseInt(userDateOfBirth); // Static method: ClassName.methodName Converts int into String
        System.out.println("Age = " + (currentYear - dateOfBirth));

        String userPartialAge = "28.5";
        double partialAge = Double.parseDouble(userPartialAge);
        System.out.println("The age is " + partialAge); */

    } // End of main

    public static String getInputFromConsole(int currentYear) {
        
        String name = System.console().readLine("Hi! What is your name? ");
        System.out.println("Hi " + name + " Thanks for taking the course");
        int age = currentYear - 2023;

        return "So you are" + name + " and your age is " + age + " years old";
        /*
        try {
            // Codes that might get the errors
        } catch (Exception e) {
            // code to 'handle' the exception
        } */

    } // End of getInputFromConsole

    public static String getinputFromScanner(int currentYear) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Hi! What is your name? ");
            String name = scanner.nextLine();
            System.out.println("What year are you born in? ");
    //      int bornYear = scanner.nextLine(); <- Reads String so must convert String into int
            String bornYear = scanner.nextLine();
            int year = Integer.parseInt(bornYear);
            int age = currentYear - year;

            return "So you are" + name + " and your age is " + age + " years old";
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "";
        }

    } // End of getInputFromScanner
}
