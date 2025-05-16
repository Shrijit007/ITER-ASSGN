/* Rewrite the multithreading calculator program from Q1 using lambda expressions.
Each arithmetic operation (addition, subtraction, multiplication, division) should still
be handled by a separate thread, but this time, define the behavior of each thread using
Java lambda expressions. */

package Assignment_8;

public class Q3  {
    public static void main(String[] args) {
        int a = 10, b = 20;

        Thread addThread = new Thread(() -> 
            System.out.println(a + " + " + b + " = " + (a + b))
        );

        Thread subThread = new Thread(() -> 
            System.out.println(b + " - " + a + " = " + (b - a))
        );

        Thread mulThread = new Thread(() -> 
            System.out.println(a + " * " + b + " = " + (a * b))
        );

        Thread divThread = new Thread(() -> {
            if (a != 0) {
                System.out.println(b + " / " + a + " = " + (b / a));
            } else {
                System.out.println("Division by zero is not allowed.");
            }
        });

        addThread.start();
        subThread.start();
        mulThread.start();
        divThread.start();
    }
}