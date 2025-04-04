//Q8

import java.util.Scanner;

public class InteractiveStringExplorer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        while (true) {
            System.out.println("\n--- String Explorer Menu ---");
            System.out.println("1. Convert to Lowercase");
            System.out.println("2. Convert to Uppercase");
            System.out.println("3. Search for a Character");
            System.out.println("4. Search for an Index");
            System.out.println("5. Concatenate with Another String");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Lowercase: " + str.toLowerCase());
                    break;

                case 2:
                    System.out.println("Uppercase: " + str.toUpperCase());
                    break;

                case 3:
                    System.out.print("Enter the char to search: ");
                    char ch = sc.next().charAt(0);
                    int ind = str.indexOf(ch);
                    if (ind != -1) System.out.println("'" + ch + "' found at index: " + ind);
                    else System.out.println("'" + ch + "' not found.");
                    break;

                case 4:
                    System.out.print("Enter the index to search for: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < str.length()) System.out.println("Character at " + index + ": " + str.charAt(index));
                    else System.out.println("Invalid index. Index should be between 0 and " + (str.length() - 1));
                    break;

                case 5:
                    System.out.print("Enter the string to concatenate: ");
                    String concatString = sc.nextLine();
                    str += concatString;
                    System.out.println("Concatenated String: " + str);
                    break;

                case 6:
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
