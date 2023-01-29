package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class List2 {

    public static void main(String[] args) {

        String[] items = {"Apples", "Kiwis", "Oranges", "Durians", "Eggs"};

        // Add an array into a list
        List<String> list = List.of(items);
        System.out.println(list);
        
        // list.add("fruits"); // could not add this as List is immutable
        // System.out.println(list);

        // start of ArrayList
        ArrayList<String> groceries = new ArrayList<>(list); // pass argument List list
        groceries.add("Yogurt");
        System.out.println("groceries: " + groceries);

        ArrayList<String> groceries2 = new ArrayList<>
        (List.of("pickles", "mustard", "jam")); 
        System.out.println("groceries2: " + groceries2 + "\n");

        // addAll means add list on top of the list in an ArrayList
        groceries.addAll(groceries2);
        System.out.println(groceries + "\n");
        
        // get method retrieves the element in the specified index
        System.out.println("Third items = " + groceries.get(2));
        
        // contains method checks the List if it contains the specified object and returns true if present
        if (groceries.contains("mustard")) {
            System.out.println("List contains mustard");
        }

        groceries.add("Yogurt");
        System.out.println("After adding another Yogurt" + groceries);
        System.out.println("First = " + groceries.indexOf("Yogurt"));
        System.out.println("Last= " + groceries.lastIndexOf("Yogurt"));

        groceries.remove("Yogurt");
        System.out.println("After removing Yogurt = " + groceries); // removes only the single element as it starts from first index to last

        groceries.removeAll(List.of("Apples", "Kiwis")); // need to use List.of to remove elements in an ArrayList
        System.out.println("After removing all Apples and Kiwis = " + groceries);

        // retainall removes all items except for the ones in the argument using List.of
        groceries.retainAll(List.of("Apples", "Durians", "pickles", "mustard"));
        System.out.println("Remove all elements except = " + groceries);

        // removes all elements in the ArrayList and use isEmpty() to check if true or false
        groceries.clear();
        System.out.println(groceries);
        System.out.println("isEmpty = " + groceries.isEmpty());

        groceries.addAll(List.of("Apples", "Milk", "Mustard", "Cheese"));
        groceries.addAll(Arrays.asList("Eggs", "Pickles", "Mustard", "Ham"));

        System.out.println("Before sorting alphabetically" + groceries);
        // using Comparator to sort ArrayList alphabetically using naturalOrder method of Comparator
        groceries.sort(Comparator.naturalOrder());
        System.out.println("After sorting alphabetically" + groceries);
        // using Comparator to sort ArrayList reverse order using reverseOrder method of Comparator
        groceries.sort(Comparator.reverseOrder());
        System.out.println("After sorting in the reverse order" + groceries);

    } // end of main
}
