package Composition;

/*
Personal computer IS A product and HAS A computer case, monitor and motherboard
*/

public class PersonalComputer extends Product{
    
    //Fields of PersonalComputer class
    private ComputerCase computerCase;
    private Monitor monitor;
    private Motherboard motherboard;

    //1st constructor of PersonalComputer class
    public PersonalComputer(String model, String manufacturer, 
    ComputerCase computerCase, Monitor monitor, Motherboard motherboard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    //Method of PersonalComputer class
    private void drawLogo() {
        monitor.drawPixelArt(1200, 50, "Yellow");
    }

    public void powerUp() {
        computerCase.pressPowerbutton();
        drawLogo();
    }

    @Override
    public String toString() {
        return "PersonalComputer [ computerCase = " + computerCase + ", monitor = " + 
        monitor + ", motherboard = " + motherboard + " ]";
    }

    //Getters
    // public ComputerCase getComputerCase() {
    //     return computerCase;
    // }

    // public Monitor getMonitor() {
    //     return monitor;
    // }

    // public Motherboard getMotherboard() {
    //     return motherboard;
    // }

    
} //End of personalComputer class
