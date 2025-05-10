// Create a functional interface Calculator with methods for addition, subtraction,
// multiplication, and division. Implement these methods using lambda expressions.
// Define the Calculator functional interface with methods for arithmetic operations.
// Implement the interface methods using lambda expressions for basic arithmetic
// operations.
interface Calculator{
    double operation(double a,double b);
}

public class Q2 {
    public static void main(String[] args) {
        Calculator add=(a,b) -> a+b;
        Calculator sub=(a,b) -> a-b;
        Calculator mul=(a,b) -> a*b;
        Calculator div=(a,b) -> a/b;

        System.out.println("Addition:"+add.operation(10,5));
        System.out.println("Subtraction:"+sub.operation(10,5));
        System.out.println("Multiplication:"+mul.operation(10,5));
        System.out.println("Division:"+div.operation(10,5));
    }
}