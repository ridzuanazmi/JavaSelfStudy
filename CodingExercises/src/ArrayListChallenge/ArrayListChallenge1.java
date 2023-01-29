package ArrayListChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListChallenge1 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<String> cartItems = new ArrayList<>();
        Boolean shutdown = false;

        while (!shutdown) {
            printBoard();

            switch (Integer.parseInt(scanner.nextLine())) {
                case 0:
                    shutdown = true;
                    System.out.println("Program will close");
                    break;
                case 1:
                    cartItems = addItems(cartItems);
                    System.out.println("Current items after adding = \n" + cartItems);
                    //shutdown = cont(shutdown);
                    break;
                case 2:
                    cartItems = removeItems(cartItems);
                    System.out.println("After romoving items = \n" + cartItems);
                    //shutdown = cont(shutdown);
                    break;
                default:
                    System.out.println("Entered invalid input");
                    break;
            } // end of switch

        } // end of while loop
        scanner.close();
    } // end of main

    private static ArrayList<String> addItems(ArrayList<String> cartItems) {

        System.out.println("Enter items to ADD: ");
        String input = scanner.nextLine();
        String[] items = input.split(","); // stores user input in a String array seperated by comma

        // Check the user input in items if there are any duplicates
        for (String item : items) {
            if (!cartItems.contains(item.trim())) {
                cartItems.add(item.trim().toLowerCase()); // all to lowercase letters
            }
        }

        cartItems.sort(Comparator.naturalOrder());
        return cartItems;

    } // end of addItems method

    private static ArrayList<String> removeItems(ArrayList<String> cartItems) {
      
        System.out.println("Enter items to REMOVE: ");
        String input = scanner.nextLine();
        String[] items = input.split(","); // stores user input in a String array

        cartItems.removeAll(Arrays.asList(items));
        cartItems.sort(Comparator.naturalOrder());
        return cartItems;

    } // end of removeItems

    private static Boolean cont(Boolean shutdown) {

        System.out.println("Do you want to continue (y/n): ");
        if (scanner.nextLine().equals("y")) {
            shutdown = false;
        } else if (scanner.nextLine().equals("n")) {
            shutdown = true;
        }
        return shutdown;
    } // end of cont method

    private static void printBoard() {
        System.out.print("""

            Available actions:

            0 - to shutdown

            1 - to add item(s) to list (comma delimited list) will remove duplicated items in the list

            2 - to remove any items (comma delimited list)

            Enter a number for which action you want to do: """);
    } // end of printBoard method

} // end of ArrayListchallenge1 class
