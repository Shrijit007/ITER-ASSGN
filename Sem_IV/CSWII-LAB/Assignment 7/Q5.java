// Write a Java program that demonstrates the concept of a function returning another
// function using Java’s Function interface. Define a method that returns a lambda
// function that takes an integer as input and returns its square. In the main method,
// retrieve the returned function and use it to calculate and display the squares of different
// numbers.

import java.util.function.*;
public class Q5 {
    public static Function<Integer,Integer> getSquare(){
        return num -> num*num;
    }
    public static void main(String[] args) {
        Function<Integer,Integer> f=getSquare();
        System.out.println("Square of 4 is: "+f.apply(4));
        System.out.println("Square of 5 is: "+f.apply(5));
    }
}