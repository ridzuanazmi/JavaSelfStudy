package Composition;

public class Product {

    //Fields of Product class
    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;

    //1st constructor of Product class
    public Product (String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Product [model=" + model + ", manufacturer=" + manufacturer + ", width=" + width + ", height=" + height
                + ", depth=" + depth + "]";
    }

    
    
} // End of product class

class Monitor extends Product {

    //Fields of Monitor class
    private int size;
    private String resolution;

    //1st constructor of Monitor class
    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }

    //2nd constructor of Monitor class
    public Monitor(String model, String manufacturer, int size, String resolution) {
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }

    //Method of Monitor class
    public void drawPixelArt(int x, int y, String colour) {
        System.out.println(String.format(
            "Drawing pixel at %d,%d in colour %s", x, y, colour));
    }
    
    
} // End of Monitor class

class Motherboard extends Product {

    //Fields of Motherboard
    private int ramSlots;
    private int cardSlots;
    private String bios;

    //1st Constructor of Motherboard class
    public Motherboard(String model, String manufacturer) {
        super(model, manufacturer);
    }

    //2nd constructor of Motherboard class
    public Motherboard(String model, String manufacturer, int ramSlots, 
                    int cardSlots, String bios) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    //Method of Motherboard
    public void loadPrograms(String programName) {
        System.out.println("Program" + programName +" is now loading");
    }

    
} // End of Motherboard class

class ComputerCase extends Product {

    //Field of ComputerCase class
    private String powerSupply;

    //1st constructor of Computercase class
    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }
    //2nd constructor of Computercase class
    public ComputerCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }   
    
    //Method of ComputerCase class
    public void pressPowerbutton() {
        System.out.println("Power button pressed");
    }
    
} // End of Computercase class