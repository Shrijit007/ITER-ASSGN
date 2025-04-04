//Q6

import java.util.Arrays;
import java.util.Scanner;

public class CharacterArraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char[] charArr = str.toCharArray();
        System.out.println("Character Array: "+ Arrays.toString(charArr));

        System.out.print("Enter a character to search: ");
        char ch = sc.next().charAt(0);
        int firstOccurrence = str.indexOf(ch);

        if (firstOccurrence != -1) {
            System.out.println("The character '" + ch + "' found.");
            System.out.println("First occurrence: " + firstOccurrence);
            System.out.println("Last occurrence: " + str.lastIndexOf(ch));
        } else System.out.println("The character '" + ch + "' is not found.");
    }
}

