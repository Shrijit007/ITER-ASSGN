// You are required to create a Java program that uses a functional interface to process
// strings. Define a functional interface named StringProcessor with a method that takes
// a string as input and returns an integer. Within the main method of a class, use a
// lambda expression to implement this method such that it returns the length of the given
// string.

interface StringProcessor {
    int process(String input);
}

public class Q1 {
    public static void main(String[] args) {
        StringProcessor f = str-> str.length();
        System.out.println("ITER contains "+f.process("ITER")+" characters");
    }
}