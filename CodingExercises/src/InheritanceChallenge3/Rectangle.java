package InheritanceChallenge3;

public class Rectangle {
    
    //Fields of Rectangle class
    private double width;
    private double length;

    //1st constructor
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    //Getters
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    //Methods of rectangle class
    public double getArea() {
        return length * width;
    }

} // End of Rectangle class
