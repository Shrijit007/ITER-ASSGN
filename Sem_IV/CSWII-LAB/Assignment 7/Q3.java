// Write a program that sorts a list of strings based on their lengths in descending order.
// Define a custom comparator using a lambda expression that compares strings based on
// their lengths. Use the custom comparator to sort the list of strings in descending order
// of length.

import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        List<String> s=new ArrayList<>();
        s.add("Banana");
        s.add("Apple");
        s.add("mango");
        s.add("chiku");
        s.sort((s1, s2) -> s2.length() - s1.length());

        System.out.println("Sorted strings by length (descending):");
        System.out.println(s);


    }
}