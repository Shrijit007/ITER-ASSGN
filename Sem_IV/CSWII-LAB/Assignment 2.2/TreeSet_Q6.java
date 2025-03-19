//Q6

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSet_Q6 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Adding some elements to the TreeSet
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        // (a) Display the elements of the TreeSet
        System.out.println("Elements of the TreeSet:");
        for (Integer element : treeSet) {
            System.out.println(element);
        }

        Scanner scanner = new Scanner(System.in);

        // (b) Prompt the user to enter a number and check whether the number is present in the TreeSet
        System.out.print("\nEnter a number to check its presence in the TreeSet: ");
        int number = scanner.nextInt();
        if (treeSet.contains(number)) {
            System.out.println("The number " + number + " is present in the TreeSet.");
        } else {
            System.out.println("The number " + number + " is not present in the TreeSet.");
        }

        // (c) Remove a specified element from the TreeSet
        System.out.print("\nEnter a number to remove from the TreeSet: ");
        int numberToRemove = scanner.nextInt();
        if (treeSet.remove(numberToRemove)) {
            System.out.println("The number " + numberToRemove + " has been removed from the TreeSet.");
        } else {
            System.out.println("The number " + numberToRemove + " was not found in the TreeSet.");
        }

        scanner.close();
    }
}