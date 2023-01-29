package CompositionChallenge1;

public class SmartKitchen {

    // Fields of SmartKitchen class
    private Refrigerator fridge;
    private DishWasher dishWasher;
    private CoffeeMaker coffeeMaker;

    public SmartKitchen() {
        fridge = new Refrigerator();
        dishWasher = new DishWasher();
        coffeeMaker = new CoffeeMaker(); 
    }

    // getters
    public Refrigerator getFridge() {
        return fridge;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public CoffeeMaker getCoffeemaker() {
        return coffeeMaker;
    } 
    
    //Methods of SmartKitchen class
    public void pourMilk() {
        fridge.hasWorkToDo = true;
    }
    
    public void addWater() {
        coffeeMaker.hasWorkToDo = true;
    }

    public void loadDishWasher() {
        dishWasher.hasWorkToDo = true;
    }

    public void doKitchenWork() {
        fridge.orderFood();
        dishWasher.doDishes();
        coffeeMaker.brewCoffee();
    }

} // End of SmartKitchen

class Refrigerator {

    //Field of Refrigerator class
    protected boolean hasWorkToDo;
    
    // Method of Refrigerator
    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Ordering food");
            hasWorkToDo = false;
        } else {
            System.out.println("Not ordering food");
        }
    }

} // End of Refrigerator class

class DishWasher {

    //Field of DishWasher class
    protected boolean hasWorkToDo;
    
    // Method of DishWasher class
    protected void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Dish washer washing dishes");
            hasWorkToDo = false;
        } else {
            System.out.println("Not washing dishes");
        }
    }


} // end of DishWasher class

class CoffeeMaker {

    //Field of Coffeemaker class
    protected boolean hasWorkToDo;

    //Method of CoffeeMaker class
    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("Brewing coffee. Please stand by");
            hasWorkToDo = false;
        } else {
            System.out.println("Not brewing coffee");
        }
    }

} // End of Coffeemaker