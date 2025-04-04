//Q5

import java.util.Scanner;

public class CaseConversionComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String s2 = sc.nextLine();

        String lS1 = s1.toLowerCase();
        String lS2 = s2.toLowerCase();

        String uS1 = s1.toUpperCase();
        String uS2 = s2.toUpperCase();

        System.out.println("Original String 1: " + s1);
        System.out.println("Original String 2: " + s2);
        System.out.println("Lowercase String 1: " + lS1);
        System.out.println("Lowercase String 2: " + lS2);
        System.out.println("Uppercase String 1: " + uS1);
        System.out.println("Uppercase String 2: " + uS2);
        System.out.println("Are the strings equal (case-insensitive)? " + s1.equalsIgnoreCase(s2));
    }
}
