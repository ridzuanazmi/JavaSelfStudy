package Inheritance;

/*
A class diagram allows us to to design our classes before we build them
*/

public class Main {
    
    public static void main(String[] args) {
        
        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast"); 
        // Even though object dog is not of Animal class, it is okay as dog inherits from animal. It 'is a' type of animal
        // can pass a dog instance to any methods that takes an animal

        Dog yorkie = new Dog("Yorkie", 15); 
        doAnimalStuff(yorkie, "fast");

        Dog retriever = new Dog("Labrador Retriever", 65, "Floppy" , "Swimmer");
        doAnimalStuff(retriever, "slow");

        Dog wolf = new Dog("Wolf", 40);
        doAnimalStuff(wolf, "slow");

        Fish goldie = new Fish("Goldfish", 0.25, 3, 2);
        doAnimalStuff(goldie, "fast");

    } // End of main

    // Static method doAnimalStuff that passes 2 parameters; animal of Animal class and speed
    public static void doAnimalStuff(Animal animal, String speed) {

        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("- - - - -");

    } // End of doAnimalStuff
}
