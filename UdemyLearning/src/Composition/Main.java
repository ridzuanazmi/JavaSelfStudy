package Composition;

public class Main {
    
    public static void main(String[] args) {
        
        ComputerCase theCase = new ComputerCase("2208", "Dell",
        "240W");
        Monitor theMonitor = new Monitor("27 inch", "Acer",
        27, "2540 x 1440");
        Motherboard theMotherboard = new Motherboard("Aorus Master x570", 
        "Gigabyte", 4, 6, "v2.44");

        PersonalComputer thePC = new PersonalComputer("2208", 
        "Dell", theCase, theMonitor, theMotherboard);

//      Execute the functionality by using the getter method from PersonalComputer class
//      to get instance of the monitor class. The getter is getting the monitor class 
//      from the PersonalComputer class
        // thePC.getMonitor().drawPixelArt(10, 10, "red");
        // thePC.getMotherboard().loadPrograms("Windows 10 OS");
        // thePC.getComputerCase().pressPowerbutton();
//      Here we are accessin functions in other classes but acessing them through
//      thePC object of the PersonalComputer class

        thePC.powerUp();
        System.out.println(thePC);

    }//End of main
}
