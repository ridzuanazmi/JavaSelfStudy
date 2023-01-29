package Encapsulation;

public class Main {
    
    public static void main(String[] args) {
        //Example of bad encapsulation
        // Player player = new Player();
        // player.name = "Tim";
        // player.health = 20;
        // player.weapon = "Sword";

        // int damage = 10;
        // player.loseHealth(damage);
        // System.out.println("Remaining health = " + player.healthRemaining());
        // player.health = 200; // This code takes control away from the Player class for managing the player's health when the code is not encapsualted properly
        // player.loseHealth(11);
        // System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer tim = new EnhancedPlayer("Tim", 200, "Sword");
        // Even if the health is set at 200, the constructor validation sets it back to 100
        // More control over the code. THIS IS ENCAPSUALTION!
        System.out.println("Initial health = " + tim.healthRemaining());

    }// End of main
}
