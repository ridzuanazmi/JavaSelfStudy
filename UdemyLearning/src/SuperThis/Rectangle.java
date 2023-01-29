package SuperThis;

public class Rectangle extends Shape {
    
    // Fields of Rectangle class
    private int length;
    private int breadth;

    // Constructors of Rectangle class
    public Rectangle (int x, int y) {
        this(x, y, 0, 0); // calls the Rectangle constructor with 4 parameteres
    }
    public Rectangle(int x, int y, int length, int breadth) {
        super(x, y); // calls constructor from parent class, Shape
        this.length = length;
        this.breadth = breadth;
    }


} // End of Rectangle class
