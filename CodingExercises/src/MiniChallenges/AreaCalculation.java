package MiniChallenges;

/*
 * Calculate the area of circle with the radius and area of rectangle with length and breadth input
 */

public class AreaCalculation {
    
    public static void main(String[] args) {
        
        System.out.println("The area is: " + area(-1));
        System.out.println("The area is: " + area(5.0));
        System.out.println("The area is: " + area(5.0, 4.0));
        System.out.println("The area is: " + area(-1, 4.0));
        
    } // End of main

    public static double area(double radius) {

        if (radius < 0) {
            return -1;
        }
        // Calculate area of circle
        double area = 2 * radius * Math.PI;
        
        return area;

    } // End of area

    public static double area(double x, double y) {

        if (x < 0 || y < 0) {
            return -1;
        }
        // Calculate area of rectangle
        double area = x * y;
        
        return area;

    } // End of area
}
