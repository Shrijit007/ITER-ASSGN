//Q4

import java.util.Scanner;

public class StringBuilderManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the initial string: ");
        StringBuilder text = new StringBuilder(sc.nextLine());

        while (true) {
            System.out.println("\n--- Text Manipulation Menu ---");
            System.out.println("1. Add a substring at a specified position");
            System.out.println("2. Remove a range of characters");
            System.out.println("3. Modify a character at a specified index");
            System.out.println("4. Concatenate another string at the end");
            System.out.println("5. Display the current string");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter position & substring to add: ");
                    int pos = sc.nextInt();
                    String substr = sc.nextLine();
                    if (pos >= 0 && pos <= text.length()) text.insert(pos, substr);
                    else System.out.println("Invalid position.");
                    break;

                case 2:
                    System.out.print("Enter the starting & ending index: ");
                    int start = sc.nextInt(), end = sc.nextInt();
                    if (start >= 0 && end <= text.length() && start < end) text.delete(start, end);
                    else System.out.println("Invalid indices.");
                    break;

                case 3:
                    System.out.print("Enter the index & char to modify: ");
                    int ind = sc.nextInt();
                    char newChar = sc.nextLine().charAt(0);
                    if (ind >= 0 && ind < text.length()) text.setCharAt(ind, newChar);
                    else System.out.println("Invalid index.");
                    break;

                case 4:
                    System.out.print("Enter the string to concatenate: ");
                    String concatString = sc.nextLine();
                    text.append(concatString);
                    break;

                case 5:
                    System.out.println("Current String: " + text);
                    break;

                case 6:
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println("\nModified String: " + text);
        }
    }
}
