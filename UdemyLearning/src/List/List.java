package List;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItems(String name, String type, int count) {

    // CONSTRUCTOR takes 1 field "name"
    public GroceryItems(String name) {
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}

public class List {

    public static void main(String[] args) {

        GroceryItems[] groceryArray = new GroceryItems[3];
        groceryArray[0] = new GroceryItems("milk");
        groceryArray[1] = new GroceryItems("apples", "PRODUCE", 6);
        groceryArray[2] = new GroceryItems("oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArray) + " ");
        System.out.println("");

        ArrayList objecList = new ArrayList();
        objecList.add(new GroceryItems("Butter"));
        objecList.add("Yogurt");

          
        // instantiate ArrayList object/list called groceryList
        ArrayList<GroceryItems> groceryList = new ArrayList<>();

        groceryList.add(new GroceryItems("Butter"));
        groceryList.add(new GroceryItems("Milk"));
        groceryList.add(new GroceryItems("oranges", "PRODUCE", 5));
        groceryList.add(0, new GroceryItems("apples", "PRODUCE", 5));
        // line above ADDS the groceryItem at the first index of the list
        groceryList.set(1, new GroceryItems("kiwi", "PRODUCE", 3)); 
        // line above REPLACES index 1 of the list using set
        groceryList.remove(2);
        // line above REMOVES index 2 from the list
        System.out.println(groceryList);
        
    } // end of main
}
