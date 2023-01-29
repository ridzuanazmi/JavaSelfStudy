package InheritanceChallenge2;

public class Circle {
    
    //Field of Circle class
    private double radius;

    //1st Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    //Methods of Circle Class
    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
    
} // End of circle class
