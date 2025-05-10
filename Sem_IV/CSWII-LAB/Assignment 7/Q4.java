// Create a functional interface Shape with a method double area() and a default method
// void printArea(). Implement the interface using lambda expressions for different
// shapes. Define the Shape functional interface with an area method. Implement the
// interface for shapes like circle, square, and rectangle using lambda expressions. Use the
// default method to print the area of each shape.

interface Shape {
    double area();
    default void printArea() {
        System.out.println("Area: " + area());
    }
}
public class Q4 {
    public static void main(String[] args) {
        Shape circle=() -> Math.PI*3*3;
        Shape square=() -> 4*4;
        Shape rectangle=() ->4*6;

        circle.printArea();
        square.printArea();
        rectangle.printArea();
    }
}
