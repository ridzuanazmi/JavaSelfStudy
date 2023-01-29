package InheritanceChallenge3;

public class Cuboid extends Rectangle {
    
    //Field of Cuboid class
    private double height;

    //1st constructor
    public Cuboid(double width, double length, double height) {
        super(width, length);
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return height * super.getArea();
    }

} // End of Cuboid class
