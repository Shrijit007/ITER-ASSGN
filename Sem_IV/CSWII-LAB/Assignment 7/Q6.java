// Write a Java program that demonstrates the use of a lambda expression with the
// Function functional interface to calculate the factorial of a number. Define a method
// that returns a lambda expression that takes an integer as input and computes its
// Learning factorial using an iterative approach. In the main method,

import java.util.function.Function;
public class Q6 {
    public static Function<Integer,Integer> factorial(){
        return  n ->{
            int result=1;
            for(int i=2;i<=n;i++)
                result *=i;
            return result;
        };
    }
    public static void main(String[] args) {
        Function<Integer,Integer> fact=factorial();
        System.out.println("Factorial of 5: "+fact.apply(5));
    }
}