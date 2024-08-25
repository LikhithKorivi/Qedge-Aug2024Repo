public class RectangleAreaCalculator {

    // User-defined method to calculate the area of a rectangle
    public static double calculateRectangleArea(double length, double width) {
        double area = length * width;
        return area;
    }
    
#feature201 changes by developer vivek for module paymentgateway oct2023
public class MathOperations {
    // Static method
    public static int add(int a, int b) {
        return a + b;
    }

    // Static method
    public static int multiply(int a, int b) {
        return a * b;
    }
}
#end of feature201 code

    public static void main(String[] args) {
        // Example of using the method
        double length = 5.0;
        double width = 3.0;

        // Calling the method
        double result = calculateRectangleArea(length, width);

        // Displaying the result
        System.out.println("The area of the rectangle with length " + length + " and width " + width + " is: " + result);
    }
}