package SuperThis;

public class Test {
    
    //Fields of Test class
    private int x;
    private int y;
    private int a;
    private int b;

    //1st Constructor
    public Test () {
        this(2, 0); // calls 2nd constructor
        // if this constructor is called, values of x = 2 and y = 0
    }

    //2nd Constructor
    public Test (int x, int y) {
        this(x, y, 8, 0); // calls 3rd constructor
        // if this constructor is called, value of a = 8
    }

    //3rd Contructor
    public Test (int x, int y, int a, int b) {
        this.x = x;
        this.y = y;
        this.a = a;
        this.b = b;
    }

    //Methods of test class
    public int displayX () {
        return x;
    }

    public int displayY () {
        return y;
    }
    public int displayA () {
        return a;
    }
    public int displayB () {
        return b;
    }
} // End of Test class
