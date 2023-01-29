package ClassCar;

public class Main {
    
    public static void main(String[] args) {
        // First object of Car class called 'car'
        Car car = new Car();
//      car.make = "Porche";
//      car.model = "911 Turbo";
//      car.colour = "Black";
//      Cannot access to the fields as access modifier is private for the fields. Need to use setter/getters method as below
        // First car object called 'car'
        car.setMake("Porche");
        car.setModel("Carrera 911 Turbo");
        car.setColour("Black");
        car.setDoor(2);
        car.setConvertable(false);
        System.out.println("Door: " + car.getDoor());
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        car.describeCar();

        // Second object of Car called 'targa'
        Car targa = new Car();
        targa.setMake("Porche");
        targa.setModel("Targa");
        targa.setColour("Red");
        targa.setDoor(2);
        targa.setConvertable(false);
        targa.describeCar();
    }
}
