package CompositionChallenge2;

class Lamp {
    
    // fields of Lamp class
    private String style;
    private boolean battery;
    private int globRating;

    // constructor
    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    // method of Lamp class
    public void turnOn() {
        System.out.println("Lamp -> Turning on");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
    
} // End Lamp class

class Bed {
    
    // fields of Bed class
    private String style;
    private int pillows, height, sheets, quilt;

    // constructor
    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    // methods
    public void make() {
        System.out.println("Bed -> Making | ");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }
    
} // End of Bed class

class Ceiling {

    // fields
    private int height, printedColor;

    // constructor
    public Ceiling(int height, int printedColor) {
        this.height = height;
        this.printedColor = printedColor;
    }

    // getters method
    public int getHeight() {
        return height;
    }

    public int getPrintedColor() {
        return printedColor;
    }

} // end of Ceiling class

class Wall {

    // field
    private String direction;

    // constructor
    public Wall(String direction) {
        this.direction = direction;
    }

    // getter method
    public String getDirection() {
        return direction;
    }
    
} // end of Wall class

class Bedroom {

    // field of Bedroom class
    private String name;
    private Wall wall1, wall2, wall3, wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    // constructor
    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, 
                   Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    // methods
    public Lamp getLamp() {
        return lamp;
    }

    public void makeBed() {
        System.out.println("Bedroom -> Making bed | ");
        bed.make();
    }

} // end of Bedroom class
