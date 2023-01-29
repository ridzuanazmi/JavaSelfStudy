package InheritanceChallenge2;

public class Cylinder extends Circle{
    
    // Field of Cylinder class
    private double height;

    //1st constructor
    public Cylinder(double radius, double height) {
        super(radius); // Call from the parent class: Circle
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }
    
    //Methods of Cylinder class
    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return height * super.getArea();
    }

} // End of Cylinder class
